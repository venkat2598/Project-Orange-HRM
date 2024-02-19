package testcases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.User_Role_page_Objects;

public class Admin_User_RolePage extends BaseTest {

	@Test
	public void movetouserrole() {
		
		PageFactory.initElements(driver, User_Role_page_Objects.class);
		
		User_Role_page_Objects.AdminLink.click();
		
	}

	@Test
	public void selectuserrole() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		User_Role_page_Objects.UserRole.click();

		for(int i=0;i<User_Role_page_Objects.UserRolelist.size();i++) {
			String role =	User_Role_page_Objects.UserRolelist.get(i).getText();
			if(role.equals("Admin")) {
				User_Role_page_Objects.UserRolelist.get(i).click();
				break;
			}
		}
	}


	@Test 
	public void selectuserstatus() { 
		User_Role_page_Objects.UserStatus.click();	

		for(int i=0;i<User_Role_page_Objects.UserStatuslist.size();i++) {
			String role =	User_Role_page_Objects.UserStatuslist.get(i).getText();
			if(role.equalsIgnoreCase("enabled")) {
				User_Role_page_Objects.UserStatuslist.get(i).click();
				break;
			}
		}
	}

	@Test 
	public void verifyUsers() {
		User_Role_page_Objects.SearchButton.click(); 
		
		String actualrole = User_Role_page_Objects.UserRoleValue.getText(); 
		String actualstatus = User_Role_page_Objects.StatusValue.getText(); 
		Assert.assertEquals(actualrole,"Admin");
		Assert.assertEquals(actualstatus,"Enabled"); 
	}

}
