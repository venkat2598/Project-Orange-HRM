package testcases;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.Claim_page_objects;

public class Claim_Employeeclaim_page extends BaseTest {

	@Test
	public void movetoclaimlink() {

		PageFactory.initElements(driver, Claim_page_objects.class);
		Claim_page_objects.claimlink.click();

	}

	@Test(dependsOnMethods = "movetoclaimlink" )
	public void select_refid() {

		Claim_page_objects.refid.sendKeys("202307180000001");
	}

	@Test(dependsOnMethods ="select_refid")
	public void select_Status() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(Claim_page_objects.status)).click();

		for(int i=0;i<Claim_page_objects.statuslist.size();i++)

		{
			String eventname =Claim_page_objects.statuslist.get(i).getText();
			if(eventname.equalsIgnoreCase("initiated")) {
				Claim_page_objects.statuslist.get(i).click();
				break;
			}
		}
		Claim_page_objects.searchbtn.click();
	}

	@Test(dependsOnMethods ="select_Status")
	public void view() {

		Claim_page_objects.viewbtn.click();
	}

	@Test(dependsOnMethods ="view")
	public void addclaimtype() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Claim_page_objects.addbtn.click();
		Claim_page_objects.expensetype.click();

		for(int i=0;i<Claim_page_objects.statuslist.size();i++)

		{
			String eventname =Claim_page_objects.statuslist.get(i).getText();
			if(eventname.equalsIgnoreCase("accommodation")) {
				Claim_page_objects.statuslist.get(i).click();
				break;
			}

		}
		
	Claim_page_objects.date.sendKeys("2024-12-02");
	Claim_page_objects.amount.sendKeys("10000");
	Claim_page_objects.savenbtn.click();
	}
	
	
}
