package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonHomePage {
	
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement menuItems;
	
	@FindBy(id="nav-item-signout")
	WebElement logout;
	
	public amazonHomePage(WebDriver driver) {
		this.driver = driver;
		// we can use either of the below way to initialize the elements
	//	PageFactory.initElements(driver, Pages.amazonLoginPage.class);
		PageFactory.initElements(driver, this);

	}
	
	public void menuNavigaion()
	{
		//Performing a mouse action on the element 
		Actions action = new Actions(driver);
		action.moveToElement(menuItems).perform();
		//menuItems.click();
	}
	
	
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(10000);
		logout.click();
	}
}
