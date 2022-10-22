package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize browser

				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
 

				driver.get("http://demo.guru99.com/test/facebook.html");
       
				
	   // CheckBox
				
				System.out.println(driver.findElement(By.id("persist_box")).isSelected());	// To check weather the check box is selected or not
				driver.findElement(By.id("persist_box")).click();
				Thread.sleep(3000);
				driver.close();
				
				
	  //Radio Button
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver2 = new ChromeDriver();
				
				driver2.get("http://demo.guru99.com/test/radio.html");
				
				
				driver2.findElement(By.id("vfb-7-1")).click();
				
				driver2.findElement(By.xpath("//*[@id=\"vfb-7-3\"]")).click();
				
				
				driver2.findElement(By.id("vfb-6-1")).click();
				
							
				
	}

}
