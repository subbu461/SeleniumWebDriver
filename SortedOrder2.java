package SelectDropDownMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedOrder2 {
	
	
public static void main (String arg [])  
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		  
		
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 
		  WebElement ele = driver.findElement(By.id("animals"));
		   
		     Select slct = new Select (ele) ;
		  
		   List  originalOrder= new ArrayList();
		   List  tempOrder= new ArrayList();
		
		   List<WebElement>  options =  slct.getOptions();
		
		    for ( WebElement  order:options)
		{ 
			  
	    originalOrder.add(order.getText() );
	    tempOrder.add(order.getText() );
	       
		} 
		   
		
		// Before Sorting   
		
		System.out.println("Before Sorting original  Order is :::"+ originalOrder);
		System.out.println("Before Sorting  tempOrder  is :::"+ tempOrder);
		
		Collections.sort(tempOrder);
		
		System.out.println("After Sorting  temp Order is :::"+ tempOrder);
		System.out.println("After Sorting Original Order is :::"+ originalOrder);
	
		 if (originalOrder==tempOrder)   
		 {
			   
			 System.out.println("Order is Sorted::");
		 }
		       
		 else   
		 { 
			 
			 System.out.println("Order is not  Sorted::"); 
		 }
		

	driver.close();
	}

}
