package testcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.tools.Tool;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.Add_Employees_page_objects;
import pageObjects.EmployeeList_page_Objects;

public class PIM_EmployeeList_Page extends BaseTest {

	@Test
	public void movetoPIM_Employeelist() {
		
		
		PageFactory.initElements(driver, Add_Employees_page_objects.class);
		Add_Employees_page_objects.PIMlink.click();
		
		
	}

	@Test(priority = 1)
	public void EmployeeInformation() {
		PageFactory.initElements(driver, EmployeeList_page_Objects.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		EmployeeList_page_Objects.employee_name.click();
		EmployeeList_page_Objects.employee_name.sendKeys("mohan");
		
		EmployeeList_page_Objects.searchButton.click();
	}

	@Test(priority = 2)
	public void Verify_Name() {

		
		String actualnamevalue = EmployeeList_page_Objects.namevalue.getText();
		String expectednamevalue= "mohan";

		Assert.assertEquals(actualnamevalue, expectednamevalue);


	}

	@Test(priority = 3)
	public void Editoption() {

		EmployeeList_page_Objects.editButton.click();

	}

	@Test(priority = 4)
	public void PersonalDetails_Nationality() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(EmployeeList_page_Objects.Nationality)).click();;


		for(int i=0;i<EmployeeList_page_Objects.Nationalitylist.size();i++)
		{
			String Nataionlitytext = EmployeeList_page_Objects.Nationalitylist.get(i).getText();
			if(Nataionlitytext.equalsIgnoreCase("indian")) {
				EmployeeList_page_Objects.Nationalitylist.get(i).click();
				break;
			}
		}

	}

	@Test(priority = 5)
	public void MaritalStatus() {

		EmployeeList_page_Objects.Maritalstatus.click();
		for(int i=0;i<EmployeeList_page_Objects.Maritallist.size();i++)
		{
			String Maritaltext = EmployeeList_page_Objects.Maritallist.get(i).getText();
			if(Maritaltext.equalsIgnoreCase("single")) {
				EmployeeList_page_Objects.Maritallist.get(i).click();
				break;
			}
		}
	}

	@Test(priority = 6)
	public void EmpDetails() {
	
		EmployeeList_page_Objects.DOB.sendKeys("1998-12-15");
		EmployeeList_page_Objects.genderMale.click();
		
		EmployeeList_page_Objects.savebutton.click();

	}

	@Test(priority = 7)
	public void ContactDetails() {

		EmployeeList_page_Objects.CondactDetails.click();

		EmployeeList_page_Objects.Street1.sendKeys("CR Dass");
		EmployeeList_page_Objects.city.sendKeys("madurai");
		EmployeeList_page_Objects.state.sendKeys("Tamilnadu");
		EmployeeList_page_Objects.zipcode.click();
		EmployeeList_page_Objects.zipcode.clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		EmployeeList_page_Objects.zipcode.sendKeys("656 972");
	}

	@Test(priority = 8)
	public void SelectCountry() {

		EmployeeList_page_Objects.Country.click();

		for(int i=0;i<EmployeeList_page_Objects.Countrylist.size();i++)
		{
			String countryname = EmployeeList_page_Objects.Countrylist.get(i).getText();
			if(countryname.equalsIgnoreCase("india")) {
				EmployeeList_page_Objects.Countrylist.get(i).click();
				break;
			}
		}
	}

	@Test(priority = 9)
	public void Mob_And_Email() {

		EmployeeList_page_Objects.Mobile.sendKeys("9876543210");
		
		EmployeeList_page_Objects.ContactSaveBtn.click();

	}


}
