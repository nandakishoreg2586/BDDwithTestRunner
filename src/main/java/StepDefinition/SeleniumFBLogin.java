package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFBLogin extends BasePage{
	
	WebDriver driver = WebDriverManager.chromedriver().create();
	
	@Given("user opens chrome")
	public void user_opens_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user launches the (.*)$")
	public void user_launches_the_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}
	

	@Then("user keys in text to search")
	public void user_keys_in_text_to_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Wipro");
	}

	@Then("user clicks on search")
	public void user_clicks_on_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("User is directed to the search results page")
	public void user_is_directed_to_the_search_results_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
	}


}
