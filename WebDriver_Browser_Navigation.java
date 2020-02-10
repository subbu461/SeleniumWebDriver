package NavigationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Browser_Navigation {
	

	public static void main (String arg[])    throws Exception {
		
	
System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
      
       //Launching Sample site
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   // click on link 
	   WebElement clckLink= driver.findElement(By.linkText("Interview Prep"));
	   clckLink.click();
	   System.out.println("TITLE OF THE PAGE IS ::"+ driver.getTitle());
	   Thread.sleep(4000L);			 
    
	  //  navigate to back 
	   
	   driver.navigate().back();     // navigate back  
	   Thread.sleep(4000L);
	   System.out.println("Navigate to Back Page:");
	   
	  
	   // Navigate to refresh 
	   
	   driver.navigate().refresh();
	   Thread.sleep(4000L);
	   System.out.println( "Navigate to Refresh " + driver.getCurrentUrl());
	   
	    // navigate to forward   
	   
	   driver.navigate().forward();
	   Thread.sleep(5000L);
	   System.out.println("Navigate to Forward ::");
	   
	  // Close Browser 	
        driver.quit();
        System.out.println("Close the Browser");
	}
	

}
