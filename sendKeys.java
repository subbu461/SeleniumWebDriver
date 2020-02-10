package RobotAPI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class sendKeys {
	public static void main(String arg[])  throws Exception {
		String searchname= "venkat";
		
		// Open Browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 System.out.println("Open Chrome browser ");
		 
		 // Enter URL  
		 driver.navigate().to("https://www.google.com/");  
		 Thread.sleep(5000);
		 System.out.println ("Open Google Webpage ");
		 
		
	 	 driver.findElement(By.name("q")).sendKeys(searchname); 
	       Thread.sleep(3000);
	       
	       System.out.println("Search name as per Variable");
		
	       // First Down Arrow
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("First  Down  Arrow Pressed ");
	
		//Second Down Arrow
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("Second  Down  Arrow Pressed ");
		
		// Press ENTER KeyWord 
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		System.out.println("Press ENTER Key");
		
		// Close Browser 
		
		driver.quit();
		System.out.println("Browser Closed");
	}

}
