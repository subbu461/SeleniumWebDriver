package SelectDropDownMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
	
	public static void main(String arg[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		
		driver.get("D:\\Selenium-Training\\HtmlFiles\\multiselectdropdown.html");
	 
		WebElement  ele = driver.findElement(By.id("tools"));
		
		
	    	Select  dropDownBox = new Select(ele);
	    	 
	    	// Option1: SelectByVisibleText
	    	
	    	dropDownBox.selectByVisibleText("Selenium RC");
	    	System.out.println("Selected Value  - Selenium RC");
	    	Thread.sleep(5000L);
	    	
	    	// Option2 : SelectByIndex
	    	
	    	dropDownBox.selectByIndex(3);
	    	System.out.println("Selected Value- SElenium Grid");
	    	Thread.sleep(5000L);
	    	
	    	// Option3 : SelectByValue
	    	dropDownBox.selectByValue("components");
	    	System.out.println("Selected all values ");        // because value name is same for all.
	    	Thread.sleep(5000L);
	    	
	    	
	    	
	    	
	    	
	    
	   
 
		
		
		
	}

}
