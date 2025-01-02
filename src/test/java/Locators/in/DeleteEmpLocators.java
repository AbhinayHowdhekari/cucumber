package Locators.in;

import org.openqa.selenium.By;

public class DeleteEmpLocators {

	public By searchCheckBox(String EmployeeId) {
		return By.xpath("//*[text()='" + EmployeeId + "']/..//div[@class='ag-selection-checkbox']");
	}

	public By deleteButton = By.xpath("//button[@class=\"deleteIcon\"]");

	// div[@class=\"ag-cell-wrapper\"]//input/..
	public By getSearchNameLocator(String EmployeeId) {
		return By.xpath(
				"//div[text()='" + EmployeeId + "']/../..//div[contains(@class,'ag-cell-not-inline-editing')][1]");
	}

	public By deleteCheckBox = By.xpath("//div[@class='ag-cell-wrapper']//child::input");
}
