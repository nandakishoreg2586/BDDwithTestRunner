package StepDefinition;

import io.cucumber.java.en.*;

public class FBLoginSteps {
	
	@Given("user launches fb home page")
	public void user_launches_fb_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1");

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2");

	}

	@Then("error is displayed to enter username and password")
	public void error_is_displayed_to_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");

	}


}
