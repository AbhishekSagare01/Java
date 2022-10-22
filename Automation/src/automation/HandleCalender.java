package automation;

//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalender {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		// Enter user name and Password
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Click on Submit Button
	 
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnLogin")).click();
		
		//Error : If it gives error of Csrf token validation failed : you can comment deletecookies in the code.
		
		//Click on the Leave
		
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click(); 
		
		// Click on the Calender Symbol
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		String Date= "27-Feb-2020";
		
	    String D[]= Date.split("-"); // 18 June 2020
	    
	    String Day= D[0];
	    String Month=D[1];
	    String Year=D[2];
	    
	    //Select Month
	    
	    Select select = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	    
	    select.selectByVisibleText(Month);
	    
		//Select Year
		
	    Select select1 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	    
	    select1.selectByVisibleText(Year);
		
	  //div[@id='ui-datepicker-div']//tr[1]//td[1]    
	  //div[@id='ui-datepicker-div']//tbody//tr[6]
	    
	   // Break xpath into to strings
	    
	    String Beforxpath = "//div[@id='ui-datepicker-div']//tr[" ;
	    String Afterxpath = "]//td[";
	    
	    final int weekdays=7;
	    boolean flag= false;
	    String DayVal=null;
	   
	    // For loop for selecting exact Date
	    
	    for(int rownum=1;rownum<=6;rownum++) {
	    	for(int colnum=1;colnum<=weekdays;colnum++)
	    	{
	    		try {
	    			DayVal= driver.findElement(By.xpath(Beforxpath+rownum+Afterxpath+colnum+"]")).getText();
	    		}catch(NoSuchElementException e){  //Handle if you give incorrect day
	    			System.out.println("Please enter correct date");
	    			flag=false;
	    			break;
	    			
	    		}
	    		System.out.println(DayVal); 
	    		if(DayVal.equals(Day)) {
	    			driver.findElement(By.xpath(Beforxpath+rownum+Afterxpath+colnum+"]")).click();
	    			flag=true;
	    			break;
	    		}

	    	}
	    	
	    	if(flag) {
	    		break;
	    	}
	    }
	}	
}
