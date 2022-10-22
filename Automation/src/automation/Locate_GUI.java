package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Locate_GUI {

	    public static void main(String[] args) {
	    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    	//WebDriver driver = new FirefoxDriver();
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	        String baseUrl = "http://www.facebook.com";
	        String tagName = "";
	      //  String tagName1=""; 
	        
	        
	       
	        driver.get(baseUrl);
	        tagName = driver.findElement(By.id("reg")).getTagName();
	        System.out.println(tagName);
	        String tagName1=driver.getTitle();
	        System.out.println(tagName1);
	        driver.findElement(By.id("email")).sendKeys("Ab");
	      //  driver.close();
	    //    System.exit(0);
	    }
	    }
	

