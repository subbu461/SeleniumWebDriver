package SelectDropDownMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class getOptions {
	 
	  
	public static void main (String [] arg)  throws Exception  {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		      
		WebElement dropdown =driver.findElement(By.name("country"));
		 
		Select select = new Select(dropdown); 
		   
		List<WebElement> options = select .getOptions(); 
		
		Thread.sleep(5000L); 
		 
		for (WebElement item:options)  { 
			
			System.out.println ("dropdownvalues are " + item.getText());
			
			 
			  
		} 
		
		
		
	}
	

	
		
	

}
