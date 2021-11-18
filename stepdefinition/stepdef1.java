package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef1 {


	@Given("^user is on home page of application$")
	public void user_is_on_home_page_of_application() throws Throwable {
	System.out.println("User is on home page of application");

	}



	@When("^user enters credentials$")
	public void user_enters_credentials() throws Throwable {
	System.out.println("User enters credentials");

	}



	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	System.out.println("User clicked on login button");

	}



	@Then("^user should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable {
	System.out.println("User logged in successfully");

	}
	

}





