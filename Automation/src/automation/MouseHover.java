package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize browser

				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();


				//driver.get("http://the-internet.herokuapp.com/javascript_alerts"); // Get URL
				
				driver.get("https://www.toolsqa.com/");
				
				//driver.get("https://www.makemytrip.com/");
				
				driver.manage().window().maximize(); // Maximize Browser Window
				
				driver.manage().deleteAllCookies(); //to delete cookies from browser
				
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); // Dynamic Wait
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Dynamic Wait
				
				
				//Actions Class Object
				
				Actions action = new Actions(driver);
				
			//	action.moveToElement(driver.findElement(By.xpath("/html//ul[@id='primary-menu']/li[2]/a/span[@class='menu-item-text']/span[@class='menu-text']"))).build().perform();
				
				//action.moveToElement(driver.findElement(By.xpath("//div[@id='SW']/div[@class='landingContainer']//nav/ul/li[10]/a/span[1]"))).build().perform();
			   
				//action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
				
				//Thread.sleep(3000);
				
			//	driver.findElement(By.linkText("International Flights")).click();
				
				//action.moveToElement(driver.findElement(By.xpath("/html//ul[@id='primary-menu']/li[2]/ul/li[2]/a/span[@class='menu-item-text']/span[@class='menu-text']"))).build().perform();
				
				action.moveToElement(driver.findElement(By.xpath("//*[@id='primary-menu']/li[2]"))).build().perform();
				
				//action.moveToElement(driver.findElement(By.linkText("Tutorial"))).build().perform();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("/html//ul[@id='primary-menu']/li[2]/ul/li[2]/ul//a[@href='https://www.toolsqa.com/selenium-tutorial/']//span[@class='menu-text']")).click();
				
				//action.moveToElement(driver.findElement(By.xpath("//*[@id='primary-menu']/li[2]/ul/li[2]/a/span"))).build().perform();
				
				action.moveToElement(driver.findElement(By.linkText("Front-End Testing Automation"))).build().perform();
				Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//*[@id='primary-menu']/li[2]/ul/li[2]/li[5]/a/span/span")).click();
			driver.findElement(By.linkText("Selenium in Java")).click();
				
				
	}

}
