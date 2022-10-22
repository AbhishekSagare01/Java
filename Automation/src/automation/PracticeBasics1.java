package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeBasics1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		//get url
				  drive.get("https://naveenautomationlabs.com/");
				  
				  drive.manage().window().maximize();
				  
				  drive.manage().deleteAllCookies();
				  
				  drive.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);
				  
				  drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				 
				  Thread.sleep(5000);
				  
				 
				  Actions action=new Actions(drive);
				  
		 			//action.moveToElement(drive.findElement(By.linkText("Buy & Grab It~~"))).build().perform();
				  
				 // action.contextClick(drive.findElement(By.xpath("//div[contains(@class,'Button__Block-sc-1c0eo6i-0 bhCgZe ModalControl__Control-sc-1dl29es-0 cLmiHt jsx-2881417189 eapp-popup-control-close-component transition-exited')]"))).build().perform();
				  
				action.click(drive.findElement(By.xpath("//div[contains(@class,'ModalControl__Control-sc-1dl29es-0')]"))).build().perform();

}
}