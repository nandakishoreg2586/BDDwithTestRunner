//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class amazonLoginPage {
//	
//	WebDriver driver;
//	
//	
//	By username_txt = By.name("email");
//	By continute_btn = By.id("continue");
//	By password_txt = By.id("ap_password");
//	By signin_btn = By.id("signInSubmit");
//	
//	
//	public amazonLoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void enterUsername(String username)
//	{
//		driver.findElement(username_txt).sendKeys(username);
//	}
//	
//	public void clickContinue()
//	{
//		driver.findElement(continute_btn).click();
//	}
//	
//	
//	public void enterPassword(String password)
//	{
//		driver.findElement(password_txt).sendKeys(password);
//	}
//	
//	public void clickSignin()
//	{
//		driver.findElement(signin_btn).click();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
