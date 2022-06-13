package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonLoginPage {
	
	WebDriver driver;
	
	@FindBy(name="email")
	// For basic web sites not used in ajax applications 
	@CacheLookup
	WebElement username_txt;
	
	@FindBy(id="continue")
	WebElement continute_btn;
	
	@FindBy(id="ap_password")
	WebElement password_txt;
	
	@FindBy(id="signInSubmit")
	WebElement signin_btn;

	
	public amazonLoginPage(WebDriver driver) {
		this.driver = driver;
		// we can use either of the below way to initialize the elements
	//	PageFactory.initElements(driver, Pages.amazonLoginPage.class);
		PageFactory.initElements(driver, this);

	}
	
	public void enterUsername(String username)
	{
		username_txt.sendKeys(username);
	}
	
	public void clickContinue()
	{
		continute_btn.click();
	}
	
	
	public void enterPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	
	public void clickSignin()
	{
		signin_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
