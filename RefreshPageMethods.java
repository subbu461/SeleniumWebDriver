package NavigationMethods;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPageMethods {

	public static void main(String arg[]) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Training\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  

		// Launching Sample site
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");  
		driver.manage().deleteAllCookies();
		// Create Object of Dimmenssion class : resize window

		// driver.manage().window().maximize();
		Dimension dim = new Dimension(480, 620);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		try {
			// Printing Current URL
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			Thread.sleep(4000L);
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

		// Refresh the page With different Syntaxes

		// 1. navigate() method
		driver.navigate().refresh();
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);

		// 2 . driver.getCurrentUrl() 

		driver.get(driver.getCurrentUrl());
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);
  
		// 3. using naviagte through method 

		driver.navigate().to(driver.getCurrentUrl());
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);
  
		// 4 .SendKeys   : ASCII Value of F5 to refreh browser Is uE035

		driver.findElement(By.name("txtUserName")).sendKeys("\uE035");
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);

		// 4 .SendKeys.Functions

		driver.findElement(By.name("txtUserName")).sendKeys(Keys.F5);
		System.out.println("REFRESH The Page");
		Thread.sleep(4000L);

		// close the Browser 
		
		driver.quit();
		System.out.println("Close Browser");
	}
}
