package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnLocators {

	public static void main(String[] args) {


		// Initialize browser

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Access URL

		driver.get("http://newtours.demoaut.com/");

		// Click on Register

		driver.findElement(By.linkText("REGISTER")).click();

		// Fill the Contact information : By Relative XPATH

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harry");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Potter");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9836456878");

		// Using ID

		driver.findElement(By.id("username")).sendKeys("harry@gmail.com");

		// Fill Mailing Information Using NAME

		driver.findElement(By.name("address1")).sendKeys("24 Street");
		driver.findElement(By.name("address2")).sendKeys("Saint Mery");
		driver.findElement(By.name("city")).sendKeys("NewYork");
		driver.findElement(By.name("state")).sendKeys("New York");
		driver.findElement(By.name("postalCode")).sendKeys("425155");

		// Select Country from DropDown

		Select select = new Select(driver.findElement(By.name("country")));
		
		List<WebElement> elementCount = select.getOptions();
		System.out.println(elementCount.size());

		select.selectByVisibleText("MONTENEGRO ");

		// Enter User Information

		driver.findElement(By.cssSelector("#email")).sendKeys("HarryP");
		driver.findElement(By.name("password")).sendKeys("HP123");
		driver.findElement(By.name("confirmPassword")).sendKeys("HP123");

		// Click on submit button
		driver.findElement(By.name("register")).click();

	}

}
