package SelectDropDownMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	
public static void main (String arg [] ) throws InterruptedException
	
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	
	driver.get("http://jsbin.com/osebed/2");
	
	 
	WebElement  fruit = driver.findElement(By.id("fruits"));
	
	       Select  value = new Select(fruit);
	       
	           value.selectByValue("grape");
	       System.out.println("Selected Fruit - Grape");
	       Thread.sleep(4000L);
	       value.deselectByValue("grape");
	       
	       
	       value .selectByIndex(2);
	       System.out.println("Selected Fruit - Orange");
	       Thread.sleep(4000L);
	       value.deselectByIndex(2);
	       
	       
	       value.selectByVisibleText("Banana");
	       System.out.println("Selected  Fruit - Banana");
	       Thread.sleep(4000L);
	       value.deselectByVisibleText("Banana");
	 
	       
	       //Deselect All values
	       value.deselectAll();
	       System.out.println("Deselect all values:::");
	     

}


}
