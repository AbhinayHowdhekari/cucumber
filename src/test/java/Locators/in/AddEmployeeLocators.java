package Locators.in;

import org.openqa.selenium.By;

public class AddEmployeeLocators {
	
	public By employee = By.xpath("//*[text()='Employees']/ancestor::a");
	public By addEmployee = By.xpath("//*[text()='Add Employee']");
	public By firtName = By.cssSelector("input[name='firstName']");
	public By lastName = By.cssSelector("input.sc-imWYAI[name=\"lastName\"]");
	public By employeeId = By.cssSelector("input.sc-imWYAI[id=\"employeeID\"]");
	public By employeeEmail = By.cssSelector("input.sc-imWYAI[name=\"email\"]");
	public By empRole = By.cssSelector("select[id=\"role\"]");
	public By emplPswd = By.cssSelector("input.sc-imWYAI[name=\"password\"]");
	public By empDOB = By.cssSelector(".sc-imWYAI[name=\"dob\"]");
	public By empJOD = By.cssSelector(".sc-imWYAI[name=\"joiningDate\"]");
	public By empQualification = By.cssSelector("select[id=\"qualifications\"]");
	public By empdept = By.cssSelector("input.sc-imWYAI[name=\"department\"]");
	public By empMobileNo = By.cssSelector("input.sc-imWYAI[name=\"mobileNumber\"]");
	public By empGender = By.cssSelector("select[id=\"gender\"]");
	public By empBloodGroup = By.cssSelector("select[id=\"bloodGroup\"]");
	public By designation = By.cssSelector("input.sc-imWYAI[name=\"designation\"]");
	public By empSalary = By.cssSelector("input[id=\"salary\"]");
	public By empLocation = By.cssSelector("input.sc-imWYAI[name=\"location\"]");
	public By reprtingTo = By.xpath("//*[@id='reportingTo']");
	public By certificateButton=By.xpath("//button[@class=\"dropdown-btn\"]");
	public By selectCertificate=By.xpath("//input[@type=\"checkbox\"]//parent::label");
//	public By certificates = By.xpath("//*[text()='Certificates ']");
	
	public By addButton = By.xpath("//button[@type=\"submit\"]");
	public By addEmployeeHeader=By.cssSelector(".modal-heading");
}
