package Locators.in;

import org.openqa.selenium.By;

public class EditPageLocators {

	public By updatename = By.name("firstName");
	public By clickButton = By.xpath("//button[text()=\"Submit\"]");
	public By editButton = By.xpath("//div[@class='table-container']//*[@fill=\"currentColor\"]");

	public By getSearchNameLocator(String EmployeeId) {
		return By.xpath(
				"//div[text()='" + EmployeeId + "']/../..//div[contains(@class,'ag-cell-not-inline-editing')][4]");
	}
	// *((//div[@class='ag-pinned-left-cols-container']//*[contains(@class,'ag-cell-focus')]))

	public By editEmployeeHeader = By.xpath("//p[@class=\"modal-heading\"]");
	public By searchValue = By.xpath("//span[@class=\"ag-paging-row-summary-panel\"]");
}
