package RobotAPI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAPIDemo {
	
	  
	public static void main(String arg []) throws AWTException, InterruptedException  {
		
		  
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-Training\\Drivers\\chromedriver.exe");	
		
		   
		WebDriver driver = new ChromeDriver();
		
		
	//	Steps : 1. open URL   2. click 3 . down arrow   4 . three time   tab key   5. enter 
		
		//1
		String URL = "http://spreadsheetpage.com/index.php/file/C35/P10/";
		
		driver.get(URL); 
		
		 
			 // 2
	    driver.findElement(By.xpath("//a[@href=contains(text(),’yearly-calendar.xls’)]")).click();
		Robot robot = new Robot();
		  
		//3
		robot.keyPress(KeyEvent.VK_DOWN);  
		Thread.sleep(4000L);  
		
		//4    
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		 
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
		
		
// 5
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
