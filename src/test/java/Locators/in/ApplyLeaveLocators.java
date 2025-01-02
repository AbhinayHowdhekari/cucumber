package Locators.in;

import org.openqa.selenium.By;

public class ApplyLeaveLocators {
	public By leaveManagement = By
			.xpath("//div[@class=\"nav-item-icon\"]//following-sibling::p[text()=\"Leave Management\"]");
	public By applyLeaveButton = By.xpath("//button[@class=\"sc-iGgWBj kDWecC\"]");
	public By fromDate = By.xpath("//input[@id='fromDate']");
	public By toDate = By.xpath("//input[@id='toDate']");
	public By subject = By.xpath("//input[@name='subject']");
	public By reason = By.xpath("//textarea[@class=\"sc-jEACwC brTKNx\"]");
	public By selectRequestType = By.xpath("//input[@id=\"leave\"]");
	public By submitButton = By.xpath("//button[text()=\"Submit\"]");
	public By lopWarning = By.xpath("//p[text()=\"LOP Warning\"]");
	public By okButton = By.xpath("//p[text()='LOP Warning']/../..//descendant::button[text()='Ok']");
	public By selectLead = By.xpath("//select[@class=\"sc-dAlyuH kYRLWl\"]");
	public By RequestButton = By.xpath("//button[text()=\"Requests\"]");

	public By ApproveRequest(String employeeId) {
		return By.xpath("//*[text()='" + employeeId + "']");
	}
//	public By ScrollBar = By.xpath("//div[@class=\"ag-center-cols-viewport\"]");
	public By employeeSearchBox = By.xpath("//input[@aria-label=\"EMP ID Filter Input\"]");
	public By empIdText = By.xpath("//span[text()=\"EMP ID\"]");
	public By approveButton = By.xpath("//button[text()=\"Approve\"]");
	public By ScrollBar = By.xpath("//div[@class=\"ag-body-horizontal-scroll-viewport\"]");
}
