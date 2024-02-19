package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_page_Objects {

	@FindBy(linkText="Admin")
	public static WebElement AdminLink;
	
	@FindBy(linkText = "User Management")
	public static WebElement UserManagementLink;
	
	@FindBy(linkText = "Users")
	public static WebElement UsersLink;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	public static WebElement UserRole;
	
	@FindBy(xpath ="//div[@role='listbox']/div")
	public static List<WebElement> UserRolelist;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
	public static WebElement UserStatus;
	
	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> UserStatuslist;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public static WebElement SearchButton;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div")
	public static WebElement UserRoleValue;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[5]/div")
	public static WebElement StatusValue;
	
}
