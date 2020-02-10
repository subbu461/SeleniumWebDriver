package RobotAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyPressEvent {
	
	
	public static void main (String arg [])   throws Exception {
		
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		 
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().deleteAllCookies();
		
		// Option 1 :  
		
		 //driver.findElement(By.id("target")).sendKeys(Keys.ALT);
		Thread.sleep(4000L);
		
		//option 2
		
		Actions action = new Actions (driver);
		action.sendKeys(Keys.ALT).build().perform();
		
	   String Outputtext=	driver.findElement(By.id("result")).getText();
		 
		System.out.println("Output is ::" +  Outputtext);
		
		if (Outputtext.equalsIgnoreCase("You entered: ALT"))
		 
		{
			System.out.println("test case passed");
		} 
		else 
		{
			
			System.out.println("test case failed");	
		}
	 
	driver.close();
		
	}

}
 