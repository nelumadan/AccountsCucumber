package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalitySteps
{
	@Given("The user is in whitebox login page")
	public void the_user_is_in_whitebox_login_page() {
		 System.out.println("The user is in whitebox login page");
	}

	@When("The user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
		 System.out.println("The user enters valid username and password");
	}

	@And("He clicks login button")
	public void he_clicks_login_button() {
		 System.out.println("He clicks login button");
	}

	@Then("The login successfully is displayed")
	public void the_login_successfully_is_displayed() {
		 System.out.println("The login successfully is displayed");
	}
}
