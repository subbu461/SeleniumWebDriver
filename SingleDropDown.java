package SelectDropDownMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
	
	
	
	
	
public static void main(String arg[]) throws Exception {
	 	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver(); 
    
    driver.get("file:///D:/Selenium-Training/HtmlFiles/dropdownNavigate.html");
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	System.out.println("URL Entered:");
	
	// Selecting Single Value Form DropDownList
	
	Select drpdwn = new Select ( driver.findElement(By.name("OptWeb")));
	
     drpdwn.selectByVisibleText("Google");      //  selctByvisibleText 
     Thread.sleep(2000L);
     
     driver.findElement(By.xpath("//input[@type='button']")).click();
     Thread.sleep(4000L);
   
     String pageTitle= driver.getTitle();
     
     System.out.println("Page Title is" + "                   "+  pageTitle);
     
     driver.quit();
	
	
}
	

}
