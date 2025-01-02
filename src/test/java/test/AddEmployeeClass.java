package test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import Locators.in.EditPageLocators;
import Methods.in.AddEmployeePageMethod;
import Methods.in.DeleteEmployeePageMethod;
import Methods.in.EditEmployeePageMethod;
import Methods.in.EmployeeFilterMethod;
import Methods.in.LoginPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityPackage.CsvFileReader;
import utilityPackage.PropertiesFileReaderClass;
import utilityPackage.ReportClass;
import utilityPackage.SeleniumHelpersMethods;
import utilityPackage.UtilesMethods;

public class AddEmployeeClass {

	WebDriver driver = BrowserBaseClass.getDriver();
	AddEmployeePageMethod addemployee = new AddEmployeePageMethod(driver);
	PropertiesFileReaderClass propertiesData = new PropertiesFileReaderClass();
	static UtilesMethods randomData = new UtilesMethods();
	EmployeeFilterMethod filter;
	EditEmployeePageMethod editemp = new EditEmployeePageMethod(driver);
	SeleniumHelpersMethods helperMethod = new SeleniumHelpersMethods(driver);
	EditPageLocators locators = new EditPageLocators();
	DeleteEmployeePageMethod delete;
	static final String randomEmailId = randomData.emailId();
	static final String randomEmployeeid = randomData.employeeid();

	String Key = null, Value = null;
	ExtentTest test;
	CsvFileReader csvData = new CsvFileReader();
	LoginPageMethods login = new LoginPageMethods(driver);

	public String getRandomEmployeeid() {
		return randomEmployeeid;
	}

	public String getRandomEmailId() {

		System.out.println(randomEmailId + "  Addempllllll");
		return randomEmailId;
	}

	@Then("check navigated to dashboard")
	public void check_application_navigated_to_dashboard() {
		Assert.assertTrue(login.verifyProfile());
	}

	@And("click to add the employee details")
	public void addemployee() throws IOException, InterruptedException {
		String empLastName = randomData.randomString();
//		empFullName = propertiesData.getPropertyValue("firstName") + " " + empLastName;
		test = ReportClass.createReportInstance().createTest("Click employee button on dashboard");
		addemployee.clickEmployeesButton();
		test.pass("Sucessfully navigate to employee");
		test = ReportClass.createReportInstance().createTest("Click Add-employee button");
		addemployee.clickAddEmployeeButton();
		test.info("Navigating to Add Employee page");
//        Capture a screenshot for success step
//       String screenshotPath = ScreenShort.captureScreenshot(driver, "AddEmployeeStep");
//       test.addScreenCaptureFromPath(screenshotPath, "Add Employee Page");
		test.pass("Sucessfully navigate to Add-employee");

//		Reporter.log("Add employee page opened and started entering emp data ");

		test = ReportClass.createReportInstance().createTest("Add employee page opened and started entering emp data");
//		addemployee.enterFirstName(propertiesData.getPropertyValue("firstName"));
		addemployee.enterFirstName(propertiesData.getPropertyValue("firstName"));
		addemployee.enterLastName(empLastName);
		System.out.println();
		addemployee.enterId(getRandomEmployeeid());
		addemployee.enterEmailId(getRandomEmailId());
		addemployee.selectRole(propertiesData.getPropertyValue("Role"));
		addemployee.enterPassword(propertiesData.getPropertyValue("password"));
		addemployee.enterDateOfBirth(propertiesData.getPropertyValue("dob"));
		addemployee.enterJoiningDate(randomData.setJOD());
		addemployee.selectQualification(propertiesData.getPropertyValue("Qualification"));
		addemployee.enterDepartment(propertiesData.getPropertyValue("department"));
		addemployee.selectGender(propertiesData.getPropertyValue("gender"));
		addemployee.enterMobileNo(propertiesData.getPropertyValue("PhoneNo"));
		addemployee.selectBloodGroup(propertiesData.getPropertyValue("BloodGroup"));
		addemployee.enterdesgnation(propertiesData.getPropertyValue("designation"));
		addemployee.enterSalary(propertiesData.getPropertyValue("salary"));
		addemployee.enterLocation(propertiesData.getPropertyValue("location"));
		addemployee.selectReportingTo(propertiesData.getPropertyValue("reportingTo"));
		addemployee.selectCertificates();
		addemployee.clickEmpSubmitButton();
		test.pass("Add employee successful");
		ReportClass.createReportInstance().flush();
//		Reporter.log("Add employee sucessful");
	}

	@And("click to add the employee details with following datails")
	public void addemployee(DataTable datatable) throws IOException, InterruptedException {
		addemployee = new AddEmployeePageMethod(driver);
//		empFullName = propertiesData.getPropertyValue("firstName") + " " + empLastName;
		test = ReportClass.createReportInstance().createTest("Click employee button on dashboard");
		addemployee.clickEmployeesButton();
		test.pass("Sucessfully navigate to employee");
		test = ReportClass.createReportInstance().createTest("Click Add-employee button");
		addemployee.clickAddEmployeeButton();
		test.info("Navigating to Add Employee page");
//        Capture a screenshot for success step
//       String screenshotPath = ScreenShort.captureScreenshot(driver, "AddEmployeeStep");
//       test.addScreenCaptureFromPath(screenshotPath, "Add Employee Page");
		test.pass("Sucessfully navigate to Add-employee");

//		Reporter.log("Add employee page opened and started entering emp data ");

		test = ReportClass.createReportInstance().createTest("Add employee page opened and started entering emp data");
//		addemployee.enterFirstName(propertiesData.getPropertyValue("firstName"));

		List<Map<String, String>> userList = datatable.asMaps(String.class, String.class);
		for (Map<String, String> user : userList) {
			addemployee.enterFirstName(user.get("firstName"));
			addemployee.enterLastName(user.get("empLastName"));
			if (user.get("employeeid").equals("randomEmployeeId")) {
				addemployee.enterId(randomEmployeeid);
			} else {
				System.out.println(user.get("employeeid"));
				addemployee.enterId(user.get("employeeid"));
			}

			if (user.get("emailId").equals("randomEmail")) {
				addemployee.enterEmailId(randomEmailId);
			} else {
				System.out.println(user.get("emailId"));
				addemployee.enterEmailId(user.get("emailId"));
			}
			addemployee.selectRole(user.get("Role"));
			addemployee.enterPassword(user.get("password"));
			addemployee.enterDateOfBirth(user.get("dob"));
			addemployee.enterJoiningDate(user.get("JOD"));
			addemployee.selectQualification(user.get("Qualification"));
			addemployee.enterDepartment(user.get("department"));
			addemployee.selectGender(user.get("gender"));
			addemployee.enterMobileNo(user.get("PhoneNo"));
			addemployee.selectBloodGroup(user.get("BloodGroup"));
			addemployee.enterdesgnation(user.get("designation"));
			addemployee.enterSalary(user.get("salary"));
			addemployee.enterLocation(user.get("location"));
			addemployee.selectReportingTo(user.get("reportingTo"));
			addemployee.selectCertificates();
			addemployee.clickEmpSubmitButton();
			addemployee.clickEmployeesButton();
			addemployee.clickAddEmployeeButton();
		}
		test.pass("Add employee successful");
		ReportClass.createReportInstance().flush();
//		Reporter.log("Add employee sucessful");
	}

	@When("click to add the employee details with switch case operation")
	public void user_fills_general_setting_details_for_chan_spy(DataTable datatable) throws InterruptedException {
		addemployee.clickEmployeesButton();
		addemployee.clickAddEmployeeButton();
		List<Map<String, String>> rows = datatable.asMaps(String.class, String.class);
		for (Map<String, String> columns : rows) {
			Key = columns.get("key");
			Value = columns.get("value");
			addemployee.addEmpUsingSwitch(Key, Value);
		}
		addemployee.selectCertificates();
		addemployee.clickEmpSubmitButton();
	}

	@Then("verify the user can search with the employeeid for edit")
	public void employeeFilterForEdit(DataTable datatable) throws IOException {

		filter = new EmployeeFilterMethod(driver);
		List<String> asList = datatable.asList();
		for (int i = 0; i < asList.size(); i++) {
			String empId = asList.get(0);
			filter.empFilter(empId);
//			Assert.assertEquals(filter.getempIdAsText(), empId);
		}
	}

	@Then("employee edit their name with the newName {string} and dob as {string}")
	public void editEmployee(String newName, String dob) throws InterruptedException, IOException {
		Thread.sleep(2000);
		Assert.assertEquals(editemp.searchValuemethod(), "1 to 1 of 1");
		editemp.clickEditButton();
		Assert.assertTrue(editemp.editHeader());
		editemp.changeName(newName);
		addemployee.enterDateOfBirth(dob);
		editemp.submitButton();
		Assert.assertTrue(helperMethod.elementIsDisabled(locators.editEmployeeHeader));
	}

	@Then("verify the user can search with the employeeid for delete")
	public void employeeFilterForDelete(DataTable datatable) throws IOException, InterruptedException {
		filter = new EmployeeFilterMethod(driver);
		List<String> asList = datatable.asList();
		for (int i = 0; i < asList.size(); i++) {
			String empId = asList.get(0);
			filter.empFilter(empId);
			delete = new DeleteEmployeePageMethod(driver);
			delete.clickCheckBox(empId);
			delete.deleteEmp();
		}
	}
}
