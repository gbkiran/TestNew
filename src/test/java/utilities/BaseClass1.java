package utilities;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {

public static WebDriver driver;

	
	public static void openBrowser(String browserName, int waitTimeValue) {
	
		try 
		{
			if (browserName.equalsIgnoreCase("Chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println(browserName + " browser is up and running");
				
			}
			else if (browserName.equalsIgnoreCase("Edge")) 
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
				driver = new EdgeDriver();
				System.out.println(browserName + " browser is up and running");
			}
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTimeValue));
	
	
} 
		catch (Exception e)
		{
	System.out.println("Unable to launch " + browserName + " browser" + " Invalid input!");
}
	}
		
		public static void openUrl()
		{
		try {
			driver.get("https://seleniumautomationpractice.blogspot.com/");
			
			System.out.println("Application is Up and Running");
		} catch (Exception e) {
			System.out.println("Unable to open URL" + e.getMessage());
		}
		}


		public static void enterTxt(By locValue, String data) {
		try {
			driver.findElement(locValue).clear();
			driver.findElement(locValue).sendKeys(data);
			System.out.println("Entered the - " + data + " - into the textbox having locValueator:- " + locValue);
		} catch (Exception e) {
			System.out.println("Unable to Entered the value into the textbox having locValueator:-" + locValue);
		}
		}

		public static void click(By locValue) {
		try {
			driver.findElement(locValue).click();
			System.out.println("Clicked on the element having locValueator:- " + locValue);
		} catch (Exception e) {
			System.out.println("Unable to click on the element having locValueator:- " + locValue);
		}
		}

		public static void select(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(data);
			System.out.println("Select the " + data + " using:- " + locName);
		} catch (Exception e) {
			System.out.println("Unable to select the " + data + " using:- " + locName);
		}
		}

		public static void select(By locName, int no) {
		try {
			new Select(driver.findElement(locName)).selectByIndex(no);
			System.out.println("Select the option having index position" + no + " using:- " + locName);
		} catch (Exception e) {
			System.out.println("Unable to select the option having index position" + no + " using:- " + locName);
		}
		}

		public static void alertAction(String action) {
		try {
			if (action.equalsIgnoreCase("ok")) {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			} else if (action.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on Alert box:" + action + "Fail");
		}
		}

		public static void shutdown() {
		driver.quit();
		System.out.println("Shutting Down the Driver");
		}

		}
			