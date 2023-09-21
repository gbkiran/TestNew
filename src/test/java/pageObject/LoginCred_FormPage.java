package pageObject;

import org.openqa.selenium.By;

import utilities.BaseClass1;



public class LoginCred_FormPage extends BaseClass1 {

	
	public static By Fname = By.xpath("//input[@id=\"ts_first_name\"]");
	public static By Lname = By.xpath("//input[@id=\"ts_last_name\"]");
	public static By Address = By.xpath("//textarea[@id=\"ts_address\"]");
	public static By Nationality = By.xpath("//select[@id=\"ts_country\"]");
	public static By Male = By.xpath("//input[@value=\"male\"]");
	public static By FeMale = By.xpath("//input[@value=\"female\"]");
	public static By Cricket = By.xpath("//input[@value=\"cricket\"]");
	public static By FootBall = By.xpath("//input[@value=\"football\"]");
	public static By Hockey = By.xpath("//input[@value=\"Hockey\"]");
	public static By Submit = By.xpath("//input[@value=\"submit\"]");

	public static void loginCred(String firstName, String lastName, String add, String nationalityCitizen, String gender, String interest) 
	{

		enterTxt(Fname, firstName);
		enterTxt(Lname, lastName);
		enterTxt(Address, add);
		select(Nationality, nationalityCitizen);

		// Gender RADIO BUTTON Clicking
		if (gender.equalsIgnoreCase("Male")) {
			click(Male);
		} else if (gender.equalsIgnoreCase("FeMale")) {
			click(FeMale);
		} else {
			System.out.println("invlaid input" + gender);
		}

		// Interest CHECKBOX Clicking
		if (interest.equalsIgnoreCase("Cricket")) 
		{
			click(Cricket);
		} 
		else if (interest.equalsIgnoreCase("FootBall")) 
		{
			click(FootBall);
		}
		else if (interest.equalsIgnoreCase("Hockey")) 
		{
			click(Hockey);
		}

		//Submit registration
		click(Submit);
		
		
	}
}
