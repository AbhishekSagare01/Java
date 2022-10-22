package automation;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyClass {
	
	    public static void main(String[] args) throws Exception {
	        // declaration and instantiation of objects/variables
	    	                  //******IEBrowser****//
	    	System.setProperty("webdriver.IE.driver", "C:\\IEDriverServer.exe");
	    	WebDriver driver = new InternetExplorerDriver();
	    	
	    	                 //******FireFOXBrowser****//
	    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	    	//WebDriver driver = new FirefoxDriver();
			
	    	                //******ChromeBrowser****//
			//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			// WebDriver driver = new ChromeDriver();
	    	//Thread.sleep(10000);
	        
	    	
	    	String baseUrl = "https://www.softwaretestingmaterial.com/";
	       // String expectedTitle = "Welcome: Mercury Tours";
	        String expectedTitle =  "Home";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
System.out.println(actualTitle);
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        Thread.sleep(5000);
	        //close Fire fox
	        driver.close();
	       
	    }

	}

