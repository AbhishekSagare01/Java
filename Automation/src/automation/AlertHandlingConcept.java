package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize browser

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		//driver.get("http://the-internet.herokuapp.com/javascript_alerts"); // Get URL
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.manage().window().maximize(); // Maximize Browser Window
		
		driver.manage().deleteAllCookies(); //to delete cookies from browser
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); // Dynamic Wait
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Dynamic Wait
		
		
		
		//Handling Alert
		
		
		driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		

	}

}
