package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHandlingGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java"); // Enter keyword under Google search box
		
		// sbl1 sbl1p
		//This xpath is dynamic and is used for getting list of ids
		
		List<WebElement> list=  driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println("Total number of suggestions are ===>>" + list.size());
		
		// For printing list of all suggestions 
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText()); // for printing name : gettext is used
	         
			if (list.get(i).getText().contains("java interview questions"))  //For checking and selecting particular input
			{
				list.get(i).click();
			break;
			}
		}
	}
}
	


