package testcases;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.Add_Employees_page_objects;

public class PIM_AddEmployee_Page  extends BaseTest{


	
	/*
	 * public void movetoPIMPage() {
	 * 
	 * PageFactory.initElements(driver, Add_Employees_page_objects.class);
	 * Add_Employees_page_objects.PIMlink.click();
	 * 
	 * }
	 */

	@Test
	public void AddEmployee() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, Add_Employees_page_objects.class);
		Add_Employees_page_objects.AddEmployeelink.click();
		Add_Employees_page_objects.Firstname.sendKeys("sriganesh");
		Add_Employees_page_objects.Lastname.sendKeys("mk");

	}

	@Test(dependsOnMethods = "AddEmployee")
	public void CreateLoginDetails() {

		Add_Employees_page_objects.CreateLoginDetails.click();
		Add_Employees_page_objects.username.sendKeys("mohan2");
		Add_Employees_page_objects.enablebtn.click();
		Add_Employees_page_objects.password.sendKeys("Venkat@124");
		Add_Employees_page_objects.confirmpassword.sendKeys("Venkat@124");
	}

	@Test(dependsOnMethods = "CreateLoginDetails")
	public void submit() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		Add_Employees_page_objects.SaveButton.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


	}



}
