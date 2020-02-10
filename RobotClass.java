package RobotAPI;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;




public class RobotClass {

	public static  void main (String arg[]) throws Exception {
		
	 	//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");
		
		
	   WebDriver driver= new ChromeDriver();  
	   
	   // enter URL address into Browser
	   driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	   driver.manage().window().maximize();
		
	   // enter username and password
	   driver.findElement(By.name("txtUserName")).sendKeys("admin");
	   System.out.println("Enter USERNAME::");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin");
	   System.out.println("Enter PASSWORD::");
		 
	   
	   
	   // Perform TAB and ENTER KeyBoard Actions 
	   
	   // creating Object of KeyBoard 
	   Robot rbt= new Robot(); 
	    
	  
	  // Press and Release ENTER
	   
	   rbt.keyPress(KeyEvent.VK_ENTER);
	   rbt.keyRelease(KeyEvent.VK_ENTER);
	   System.out.println("Enter ENTER Using robot class to Perform click on LOGIN Button to the flow of automation ::");
	   System.out.println("Login Successfully ::");
	   Thread.sleep(5000);
	   
	   // Logout the Application 
	   
	   driver.findElement(By.linkText("Logout")).click();
	   System.out.println("Logout Successfully ::");
	    
	   // Close Application 
	  driver.close(); 
	  
	  //close Browser
	  driver.quit();
	   
		
		
		
	}
	
	
	
	
	
}
