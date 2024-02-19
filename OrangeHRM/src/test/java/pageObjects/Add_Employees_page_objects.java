package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Employees_page_objects {

	@FindBy(linkText = "PIM")
	public static WebElement PIMlink;
	
	@FindBy(linkText = "Add Employee")
	public static WebElement AddEmployeelink;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
	public static WebElement CreateLoginDetails;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	public static WebElement username;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
	public static WebElement enablebtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")
	public static WebElement password; 
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
	public static WebElement confirmpassword;
	
	@FindBy(name = "firstName")
	public static WebElement Firstname;
	
	@FindBy(name="lastName")
	public static WebElement Lastname;
	
	@FindBy(xpath = "//button[@type=\'submit\']")
	public static WebElement SaveButton;
}
