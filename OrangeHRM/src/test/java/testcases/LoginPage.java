package testcases;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.Login_page_objects;

public class LoginPage extends BaseTest {

	@Test
	public void loginHRM() {
		
		PageFactory.initElements(driver, Login_page_objects.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Login_page_objects.username.sendKeys(prop.getProperty("Username"));
		Login_page_objects.password.sendKeys(prop.getProperty("Password"));
		Login_page_objects.login.click();
		
	}

}
