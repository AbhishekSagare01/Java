package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptCalenderSimple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

	
		
		// driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Since the driver can execute only selenium commands so we need to typecast driver as a JavascriptExecutor 
		//so that Javascript commands can be run from Selenium script.  
				
				JavascriptExecutor js =(JavascriptExecutor)driver;
				
				Thread.sleep(5000);
				
				//Putting date to the the selected date picker.  
		        
				js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='30/08'");

	}

}
