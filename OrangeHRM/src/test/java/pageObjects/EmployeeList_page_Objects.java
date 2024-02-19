package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList_page_Objects {

	
	@FindBy(linkText = "Employee List")
	public static WebElement employeelist;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement employee_name;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement searchButton;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]")
	public static WebElement namevalue;

	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	public static WebElement editButton;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div")
	public static WebElement Nationality;

	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> Nationalitylist; //indian

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div")
	public static WebElement Maritalstatus;

	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> Maritallist; //single

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
	public static WebElement DOB; //yyyy-dd-mm

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
	public static WebElement genderMale;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
	public static WebElement savebutton;

	@FindBy(linkText = "Contact Details")
	public static WebElement CondactDetails;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	public static WebElement Street1;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	public static WebElement city;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	public static WebElement state;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	public static WebElement zipcode;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div")
	public static WebElement Country;
	
	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> Countrylist;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
	public static WebElement Mobile;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")
	public static WebElement Email;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")
	public static WebElement AddFile;
	
	@FindBy(xpath = "//div[@class='oxd-file-button']")
	public static WebElement Browse;
	
	@FindBy(xpath = "//*[@placeholder='Type comment here']")
	public static WebElement CommentBox;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
	public static WebElement ContactSaveBtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")
	public static WebElement filesavebtn;
	
	
	






}
