package test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import Methods.in.LoginPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityPackage.PropertiesFileReaderClass;
import utilityPackage.ReportClass;

public class LoginParalelClass {
	WebDriver driver = BrowserBaseClass.getDriver();
	PropertiesFileReaderClass propertiesData = new PropertiesFileReaderClass();
	LoginPageMethods login= new LoginPageMethods(driver);
	SoftAssert softassert = new SoftAssert();
	ExtentTest test;

	
	@When("user logs in with username {string} and password {string}")
	public void login(String username, String password) throws IOException, InterruptedException {
		test = ReportClass.createReportInstance().createTest("Login Started");
		login.enterUserName(username);
		login.enterUserPassword(password);
		login.clickLoginButton();
		test.pass("Login Successful");
		ReportClass.createReportInstance().flush();
	}

	@When("user logs in with valid username and password credentials")
	public void login(DataTable datatable) throws IOException, InterruptedException {
		test = ReportClass.createReportInstance().createTest("Login Started");
		List<Map<String, String>> userList = datatable.asMaps(String.class, String.class);
		for (Map<String, String> user : userList) {
			login.enterUserName(user.get("username"));
			login.enterUserPassword(user.get("password"));
		}
		login.clickLoginButton();
		test.pass("Login Successful");
		ReportClass.createReportInstance().flush();
	}

	@Then("verify that the application navigates to the dashboard")
	public void check_application_navigated_to_dashboard() {
		Assert.assertTrue(login.verifyProfile());
	}

	@Then("ensure that the user is able to log out successfully")
	public void applicationLogout() {
		login.clickLogOutButton();
	}

	@Then("confirm that the user is redirected back to the login page")
	public void user_navigate_to_login_page() {
		Assert.assertEquals(login.verifyLoginpage(), "urBuddi");
	}
}
