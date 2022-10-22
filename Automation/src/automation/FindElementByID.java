package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
  driver.get("https://www.youtube.com/");
  //driver.get("https://wac.das.myatos.net/portal/pki.jsp");
//  driver.findElement(By.id("container")).sendKeys("Chants");
  Thread.sleep(5000);
   // driver.findElement(By.id("formTotp")).click();
    
   // Thread.sleep(2000);
    //driver.findElement(By.id("username")).sendKeys("A713618");
  driver.findElement(By.id("newness-dot")).click();
  
    //DXATargetUrl
  
	}}
 
 
   
  