package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login_page_objects {
	
	@FindBy(name="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type=\'submit\']")
	public static WebElement login;

}
