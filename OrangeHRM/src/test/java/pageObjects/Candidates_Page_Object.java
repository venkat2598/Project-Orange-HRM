package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Candidates_Page_Object {
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	public  static WebElement addbtn;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[5]")
	public static WebElement recruitmentlink;
	
	@FindBy(linkText = "Candidates")
	public static WebElement candidatelink;
	
	@FindBy(name = "firstName")
	public static WebElement firstname;
	
	@FindBy(name = "lastName")
	public static WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div")
	public static WebElement vacancybox;
	
	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> vacancylist;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
	public static WebElement email;
	
	@FindBy(xpath ="//input[@placeholder='Enter comma seperated words...']")
	public static WebElement keywords;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
	public static WebElement contactno;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement savebtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	public static WebElement can_vacancybox;
	
	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> Can_vacancylist;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input")
	public static WebElement datepick;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")
	public static WebElement searchbtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]")
	public static WebElement jobtitlevalue;
	
	@FindBy(className  = "oxd-icon bi-trash")
	public static WebElement Deletebtn;
	
	@FindBy(xpath = "/html/body/div/div[3]/div/div/div/div[3]/button[2]")
	public static WebElement confDeletebtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[7]/div/button[1]")
	public static WebElement viewbtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]")
	public static WebElement shortlistbtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	public static WebElement Applicantsavebtn;
	

}
