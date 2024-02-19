package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.Candidates_Page_Object;

public class Recruitment_candidates_page extends BaseTest {

	@Test
	public void movetoCandidate() {

		PageFactory.initElements(driver, Candidates_Page_Object.class);
		Candidates_Page_Object.recruitmentlink.click();
		Candidates_Page_Object.candidatelink.click();
	}

	@Test(priority = 1)
	public void Select_can_Vacancy() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(Candidates_Page_Object.can_vacancybox)).click();
		for(int i=0;i<Candidates_Page_Object.Can_vacancylist.size();i++)

		{
			String vacancyname =Candidates_Page_Object.Can_vacancylist.get(i).getText();
			if(vacancyname.equalsIgnoreCase("senior qa lead")) {
				Candidates_Page_Object.Can_vacancylist.get(i).click();
				break;
			}

		}

	}

	@Test(priority = 2)
	public void select_date() {

		Candidates_Page_Object.datepick.sendKeys("2024-17-02");
		Candidates_Page_Object.searchbtn.click();

	}

	@Test(priority = 3)
	public void view_row() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Candidates_Page_Object.viewbtn.click();	
	}

	@Test(priority = 4)
	public void verify_vacancyname() {

		String actualname=	Candidates_Page_Object.jobtitlevalue.getText();
		String expectname= "Senior QA Lead";

		Assert.assertEquals(actualname, expectname);

	}

	@Test(priority = 5)
	public void delete_Candidatescell() {

		Candidates_Page_Object.Deletebtn.click();
		//Alert alert =	driver.switchTo().alert();
		Candidates_Page_Object.confDeletebtn.click();
		
	}



}
