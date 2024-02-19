package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Claim_page_objects {


	@FindBy(linkText = "Claim")
	public static WebElement claimlink;
	
	@FindBy(linkText = "My Claims")
	public static WebElement myclaimlink;
	
	@FindBy(linkText = "Assign Claim")
	public static WebElement Assignclaimlink;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement employeename;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	public static WebElement refid;
		
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	public static WebElement event;

	@FindBy(xpath = "/div[@role='listbox']/div")
	public static List<WebElement> eventlist;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
	public static WebElement status;

	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> statuslist;

	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button[2]")
	public static WebElement searchbtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div/div[2]/div/span")
	public static WebElement eventnamevalue;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div/div[6]/div")
	public static WebElement statusvalue;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button")
	public static WebElement viewbtn;
	
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/button")
	public static WebElement addbtn;
	//
	@FindBy(xpath = " /html/body/div/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[1]/div/div/div/div[2]/div/div")
	public static WebElement expensetype;
	
	@FindBy(xpath = "//div[@role='listbox']/div")
	public static List<WebElement> expencelist;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement date;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	public static WebElement amount;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[4]/button[2]")
	public static WebElement savenbtn;
	
	// 
	
	
}
