package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandleByJscript {

	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();

		// driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       // store locator value in WebElement
	
	WebElement date= driver.findElement(By.id("ctl00_mainContent_view_date1"));
	
	String dateValue="30-08-2020";
	
	selectDateByJS(driver,date,dateValue);
	
	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue) {
		
		//Since the driver can execute only selenium commands so we need to typecast driver as a JavascriptExecutor 
		//so that Javascript commands can be run from Selenium script.  
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//Putting date to the the selected date picker.  
        js.executeScript("document.getElementById('BE_flight_origin_date').value='30/08'");
		js.executeScript("arguments[0].setAttribute('value',"+dateValue+"');", element);
		
	}
	
}
	

