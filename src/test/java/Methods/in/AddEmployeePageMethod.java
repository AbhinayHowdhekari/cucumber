package Methods.in;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.in.AddEmployeeLocators;
import utilityPackage.SeleniumHelpersMethods;
import utilityPackage.UtilesMethods;

public class AddEmployeePageMethod extends AddEmployeeLocators {
	WebDriver driver;
	SeleniumHelpersMethods helperMethod;
	UtilesMethods randomData = new UtilesMethods();
	private String randomEmployeeid = randomData.employeeid();
	private String randomEmailId = randomData.emailId();

	public AddEmployeePageMethod(WebDriver driver) {
		this.driver = driver;
		helperMethod = new SeleniumHelpersMethods(this.driver);
	}

	public void clickEmployeesButton() {
		helperMethod.explicitWaitMethod(employee);
		helperMethod.clickAction(employee);
	}

	public void clickAddEmployeeButton() {
		helperMethod.clickAction(addEmployee);
	}

	public void enterFirstName(String empFirstName) {
		helperMethod.explicitWaitMethod(firtName);
		helperMethod.sendTextData(firtName, empFirstName);
	}

	public void enterLastName(String empLastName) {
		helperMethod.explicitWaitMethod(lastName);
		helperMethod.sendTextData(lastName, empLastName);
	}

	public void enterId(String empId) {
		helperMethod.sendTextData(employeeId, empId);
	}

	public void enterEmailId(String empEmail) {
		helperMethod.sendTextData(employeeEmail, empEmail);
	}

	public void selectRole(String text) {
		helperMethod.dropDownSelectionByText(empRole, text);
	}

	public void enterPassword(String empPswd) {
		helperMethod.sendTextData(emplPswd, empPswd);
	}

	public void enterDateOfBirth(String empDDateOfBirth) {
		helperMethod.sendTextData(empDOB, empDDateOfBirth);
	}

	public void enterJoiningDate(String empJoining) {
		helperMethod.sendTextData(empJOD, empJoining);
	}

	public void selectQualification(String text) {
		helperMethod.dropDownSelectionByValue(empQualification, text);
	}

	public void enterDepartment(String empdepartement) {
		helperMethod.sendTextData(empdept, empdepartement);
	}

	public void enterMobileNo(String empNO) {
		helperMethod.sendTextData(empMobileNo, empNO);
	}

	public void selectGender(String text) {
		helperMethod.dropDownSelectionByText(empGender, text);
	}

	public void selectBloodGroup(String text) {
		helperMethod.dropDownSelectionByValue(empBloodGroup, text);
	}

	public void enterdesgnation(String empdesigntion) {
		helperMethod.sendTextData(designation, empdesigntion);
	}

	public void enterSalary(String salary) {
		helperMethod.sendTextData(empSalary, salary);
	}

	public void enterLocation(String location) {
		helperMethod.sendTextData(empLocation, location);
	}

	public void selectReportingTo(String text) {
		helperMethod.explicitWaitMethod(reprtingTo);
		helperMethod.dropDownSelectionByText(reprtingTo, text);
	}

	public void selectCertificates() {
		helperMethod.BootstrapSelectorMethod(selectCertificate, certificateButton);
	}

	public void clickEmpSubmitButton() throws InterruptedException {
		helperMethod.scrollToElementUsingActions(addButton);
		helperMethod.clickUsingJavaScript(addButton);
		helperMethod.elementIsDisabled(addEmployeeHeader);
	}

	public void addEmpUsingSwitch(String key, String value) throws InterruptedException {
		switch (key) {
		case "firstName":
			enterFirstName(value);
			break;
		case "empLastName":
			enterLastName(value);
			break;
		case "employeeid":
			if (value.equals("randomEmployeeId")) {
				enterId(randomEmployeeid);
			} else {
				enterId(value);
			}
			break;

		case "emailId":
			if (value.equals("randomEmail")) {
				enterEmailId(randomEmailId);
			} else {
				enterEmailId(value);
			}
			break;
		case "Role":
			selectRole(value);
			break;
		case "password":
			enterPassword(value);
			break;
		case "dob":
			enterDateOfBirth(value);
			break;
		case "JOD":
			enterJoiningDate(value);
			break;
		case "Qualification":
			selectQualification(value);
			break;
		case "department":
			enterDepartment(value);
			break;
		case "gender":
			selectGender(value);
			break;
		case "PhoneNo":
			enterMobileNo(value);
			break;
		case "BloodGroup":
			selectBloodGroup(value);
			break;
		case "designation":
			enterdesgnation(value);
			break;
		case "salary":
			enterSalary(value);
			break;
		case "location":
			enterLocation(value);
			break;
		case "reportingTo":
			selectReportingTo(value);
			break;
		default:
			Assert.fail("Incorrect field: '" + key + "' is used.");
			break;
		}
	}

}
