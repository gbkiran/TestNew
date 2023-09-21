package pageObject;

import org.openqa.selenium.By;

import utilities.BaseClass1;

public class HomePage extends BaseClass1{

	public static By TestingFormPage = By.xpath("//a[contains(text(), \"Testing Form Page\")]");
	
	
	public static void ClickingTestingPage()
	{
	
	click(TestingFormPage);
	
	
	}
}
