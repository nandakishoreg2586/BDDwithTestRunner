package BasePage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	protected static WebDriver  driver = WebDriverManager.chromedriver().create();
	
//	 public BasePage(WebDriver driver) {
//		this.driver = driver; 
//	 }

	//protected ReadConfig config = new ReadConfig();
	
//	protected static Logger logger = LogManager.getLogger(Log4j2.class);


//	@BeforeSuite
	public void InitializeBrowser() throws IOException { 	
		
		//In webdrivermanager version 5 and above the below approach is used
	//	 driver = WebDriverManager.chromedriver().create();
		
		 //headless mode
		/*	
	 	ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		driver = WebDriverManager.chromedriver().capabilities(co).create();
		*/
	 
		// In webdrivermanager less than version 4 we were using this approach
		//	WebDriverManager.chromedriver().setup();
		//	driver = new ChromeDriver();
	//	logger.info("Initializing Browser");
		
		
		// reading data from config file
//		driver.get(config.getProperties("url"));
		
//		logger.info("Launching Browser");
		
	}

	
//	
//	@AfterSuite
//	public void closeBrowser() { 
//
//		driver.close();	
//		logger.info("Closing Browser");

	}
	
	
	
	
	
	
//}
