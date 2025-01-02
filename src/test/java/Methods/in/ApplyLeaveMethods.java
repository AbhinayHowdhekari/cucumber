package Methods.in;

import org.openqa.selenium.WebDriver;

import Locators.in.ApplyLeaveLocators;
import utilityPackage.SeleniumHelpersMethods;

public class ApplyLeaveMethods extends ApplyLeaveLocators {

	WebDriver driver;
	SeleniumHelpersMethods helperMethod;
	ApplyLeaveLocators applyleavelocator = new ApplyLeaveLocators();

	public ApplyLeaveMethods(WebDriver driver) {
		this.driver = driver;
		helperMethod = new SeleniumHelpersMethods(this.driver);
	}

	public void clickLeveManagement() {
		helperMethod.explicitWaitMethod(leaveManagement);
		helperMethod.clickAction(leaveManagement);
	}

	public void clickApplyLeaveButton() {
		helperMethod.clickAction(applyLeaveButton);
	}

	public void selectFromDate(String value) {
		helperMethod.explicitWaitMethod(fromDate);
		helperMethod.sendTextData(fromDate, value);
	}

	public void selectToDate(String value) {
		helperMethod.sendTextData(toDate, value);
	}

	public void enterSubject(String value) {
		helperMethod.sendTextData(subject, value);
	}

	public void enterReason(String value) {
		helperMethod.sendTextData(reason, value);
	}

	public void selectLeaveType() {
		helperMethod.clickUsingJavaScript(selectRequestType);
	}

	public void clickLeaveSubmitButton() {
		helperMethod.scrollToElementUsingActions(submitButton);
		helperMethod.explicitWaitMethod(submitButton);
		helperMethod.clickAction(submitButton);
	}

	public boolean lopWarning() {
		return helperMethod.addEventAssertion(lopWarning);
	}

	public void clickOkButton() {
		helperMethod.clickAction(okButton);
	}

	public void selectLeadEmail(String value) {
		helperMethod.explicitWaitMethod(selectLead);
		helperMethod.dropDownSelectionByText(selectLead, value);
	}

	public void clickRequestButton() {
		helperMethod.clickAction(RequestButton);
	}

	public void scrollAndClickApprove(String employeeId) throws InterruptedException {
		helperMethod.sendTextData(employeeSearchBox, employeeId);
		helperMethod.explicitWaitMethod(applyleavelocator.ApproveRequest(employeeId));
		helperMethod.getTextMethod(applyleavelocator.ApproveRequest(employeeId), employeeId);
		helperMethod.Scrolldown(600, 600);
		helperMethod.DragAndDrop(ScrollBar);
	}
	public void clickApproveButton() {
		helperMethod.clickAction(approveButton);
	}
}
