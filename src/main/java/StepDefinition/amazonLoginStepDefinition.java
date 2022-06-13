package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageFactory.amazonHomePage;
//import Pages.amazonLoginPage;
import PageFactory.amazonLoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class amazonLoginStepDefinition{
	
	public static WebDriver driver = WebDriverManager.chromedriver().create();
	
	
	amazonLoginPage lgnPG = null;
	amazonHomePage lgoutPG = null;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() throws InterruptedException {
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	   
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys(password);
		
		lgnPG = new amazonLoginPage(driver);
		lgnPG.enterUsername(username);
		lgnPG.clickContinue();
		lgnPG.enterPassword(password);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {		
	//	driver.findElement(By.id("signInSubmit")).click();	    
		
		lgnPG.clickSignin();
	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() throws InterruptedException {
		System.out.println(driver.getTitle());
		lgoutPG = new amazonHomePage(driver);
		lgoutPG.menuNavigaion();
		lgoutPG.logout();
	}

}
