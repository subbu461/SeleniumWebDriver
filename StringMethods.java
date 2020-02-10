package RobotAPI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringMethods {
	
	public static void main (String arg [])
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 
	
		WebElement email = 	driver.findElement(By.id("username"));
	
		//option:1 - > Using String
		
		//email.sendKeys("m.venky461@gmail.com");
		
		// options : 2  -> using String Buffer
		
	/*  StringBuffer username= new StringBuffer ()
		
		.append("venkat")
		.append("raina")
		.append("subbu");
		
		email.sendKeys(username);
		
		*/ 
		// options : 3  -> using String Buffer
		
				StringBuilder username1= new StringBuilder ()
				
				.append("venkat")
				.append("raina")
				.append("subbu");
				
				email.sendKeys(username1);
		
	}

	
	}

	
	
	
	
	


