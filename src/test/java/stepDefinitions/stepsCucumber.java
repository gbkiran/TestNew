package stepDefinitions;

import io.cucumber.java.en.*;
import pageObject.HomePage;
import pageObject.LoginCred_FormPage;
import utilities.BaseClass1;

public class stepsCucumber extends BaseClass1 {

	@Given("I am testing Form Page")
	public void i_am_testing_form_page() {
	    openBrowser("Chrome", 30);
	    openUrl();
	    HomePage.ClickingTestingPage();

	}

	@When("I interact with Form Elements")
	public void i_interact_with_form_elements() {
		LoginCred_FormPage.loginCred("Kiran", "GB", "Bangalore", "India", "Male", "Cricket");
	}

	@Then("I get to see the Alert showing sucess")
	public void i_get_to_see_the_alert_showing_sucess() {
	    alertAction("ok");
	}

}
