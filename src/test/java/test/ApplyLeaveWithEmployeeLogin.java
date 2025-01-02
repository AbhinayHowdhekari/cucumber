package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import Locators.in.ApplyLeaveLocators;
import Methods.in.AddEmployeePageMethod;
import Methods.in.ApplyLeaveMethods;
import Methods.in.LoginPageMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityPackage.PropertiesFileReaderClass;
import utilityPackage.SeleniumHelpersMethods;

public class ApplyLeaveWithEmployeeLogin {
	WebDriver driver = BrowserBaseClass.getDriver();
	LoginParalelClass loginclass = new LoginParalelClass();

	
	LoginPageMethods login;
	AddEmployeePageMethod addemployee;
	AddEmployeeClass addEmployee = new AddEmployeeClass();
	PropertiesFileReaderClass propertiesData = new PropertiesFileReaderClass();
	SeleniumHelpersMethods utilmethods=new SeleniumHelpersMethods(driver);
	ApplyLeaveLocators applyleavelocators=new ApplyLeaveLocators();
	ExtentTest test;
	ApplyLeaveMethods leave;

	@When("login with created employee username and password")
	public void loginWithEmployeeUsernameAndPswd() throws IOException {
		login = new LoginPageMethods(driver);

		String randomEmail = addEmployee.getRandomEmailId();
		System.out.println("Random Email for Login: " + randomEmail);

		login.enterUserName(randomEmail);
		login.enterUserPassword(propertiesData.getPropertyValue("password"));
		login.clickLoginButton();
	}

	@When("employee will Apply for the leave")
	public void applyLeave() throws InterruptedException {
		leave = new ApplyLeaveMethods(driver);
		leave.clickLeveManagement();
		leave.clickApplyLeaveButton();

		if (leave.lopWarning()) {
			leave.clickOkButton();
		}

		leave.selectFromDate("02/01/2025");
		leave.selectToDate("02/01/2025");
		leave.enterSubject("Application for Leave");
		leave.enterReason("I am requesting leave to attend a family function that requires my presence.");
		leave.selectLeaveType();
		Thread.sleep(2000);
		leave.clickLeaveSubmitButton();
	}

	@Then("click on the LeaveManagent to approve the LeaveRequest")
	public void approveLeaveByLead() throws InterruptedException {
		leave = new ApplyLeaveMethods(driver);
		leave.clickLeveManagement();
		leave.clickRequestButton();
		Assert.assertEquals(utilmethods.assertionWithGetTextMethod(applyleavelocators.empIdText),"EMP ID");
		System.out.println("ABC954");
		leave.scrollAndClickApprove("ABC954");
		leave.clickApproveButton();
	}
}
