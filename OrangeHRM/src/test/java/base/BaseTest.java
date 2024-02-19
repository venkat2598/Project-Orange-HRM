package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  {

	public static WebDriver driver;
	public static Properties prop;


	
	public Properties LoadProperty() {

		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			prop = new Properties();
			prop.load(input);
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		return prop;


	}
	@BeforeSuite
	public void  launchBrowser() {

		LoadProperty();
		
		String Browser = prop.getProperty("browser");
		String BaseUrl = prop.getProperty("url");

		if(Browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(BaseUrl);

	}

	@AfterSuite
	public void TearDown() {

		//driver.quit();
	}

}
