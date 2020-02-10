package RobotAPI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main (String arg[] ) throws AWTException, InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver() ;
	  
	
	    driver.get("http://demo.guru99.com/selenium/upload/");
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
	    
	    // Click on Upload or Choose File 
	    
	    driver.findElement(By.id("uploadfile_0")).click();
	    
	    // Copy the path to your clip board :
	    
	  //   StringSelection Class is used to copy and paste the data into Clipboard //
		 
	    StringSelection  data = new  StringSelection("C:\\Users\\M V SUBBAREDDY\\Desktop\\ChromePath.txt");
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(data, null);
		
	      // imitate the mouse actions key Events - CLTRL C CTRL V
	    
	             Robot rbt = new Robot (); 
	             rbt.delay(40); 
	             rbt.keyPress(KeyEvent.VK_ENTER);
	             rbt.keyRelease(KeyEvent.VK_ENTER);
	             
	   // Paste the path into text box 
	             
	             rbt.keyPress(KeyEvent.VK_CONTROL); 
	             
	             rbt.keyPress(KeyEvent.VK_V); 
	             rbt.keyRelease(KeyEvent.VK_V);
	             
	             rbt.keyRelease(KeyEvent.VK_CONTROL); 
	              
	              
	             rbt.keyPress(KeyEvent.VK_ENTER); 
	             rbt.delay(30); 
	             rbt.keyPress(KeyEvent.VK_ENTER);
	             
	             rbt.keyPress(KeyEvent.VK_ENTER);
	             rbt.delay(30);
	             rbt.keyPress(KeyEvent.VK_ENTER);
	           
	          // Click on Terms  
	               
	              
	             driver.findElement(By.id("terms")).click();
	            Thread.sleep(3000L);
	             
	         // click on Submit Button 
	             
	             driver.findElement(By.id("submitbutton")).click();
	             Thread.sleep(3000L);
	             
	        String   textProof =    driver.findElement(By.xpath("//*[@id='res']/center")).getText();
	           System.out.println( textProof)  ;
	            
	           // close browser 
	           
	           driver.close();
	

}

}
