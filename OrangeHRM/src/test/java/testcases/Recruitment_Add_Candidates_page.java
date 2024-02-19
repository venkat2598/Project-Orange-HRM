package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.Candidates_Page_Object;

public class Recruitment_Add_Candidates_page extends BaseTest {

	@Test
	public  void movetoRecruitment() {

		PageFactory.initElements(driver, Candidates_Page_Object.class);
		Candidates_Page_Object.recruitmentlink.click();
		Candidates_Page_Object.addbtn.click();
	}

	@Test(priority = 1)
	public void Add_candidatesName() {
		Candidates_Page_Object.firstname.sendKeys("suresh");
		Candidates_Page_Object.lastname.sendKeys("kumar");	
	}

	@Test(priority = 2)
	public void selectvacancy() {
		Candidates_Page_Object.vacancybox.click();

		for(int i=0;i<Candidates_Page_Object.vacancylist.size();i++)

		{
			String vacancyname =Candidates_Page_Object.vacancylist.get(i).getText();
			if(vacancyname.equalsIgnoreCase("senior qa lead")) {
				Candidates_Page_Object.vacancylist.get(i).click();
				break;
			}

		}
	}
	@Test(priority = 3)
	public void candidates_details() {
		Candidates_Page_Object.email.sendKeys("venkat57@gmail.com");
		Candidates_Page_Object.contactno.sendKeys("9876543210");
		Candidates_Page_Object.keywords.sendKeys("manual & automation testing , testng ");
		Candidates_Page_Object.savebtn.click();

	}

}
