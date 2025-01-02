package Locators.in;

import org.openqa.selenium.By;

public class EmpSearchLocators {
	public By empIdFilter = By.cssSelector("[aria-label*='EMP ID Filter']");

	public By getSearchNameLocator(String fullName) {
		return By.xpath("((//*[text()='" + fullName + "']/../..//div[contains(@class,'ag-cell-not-inline-editing')])[2]//*)[1]");
	}
	public By getIdasText=By.xpath("//div[@class=\"ag-pinned-left-cols-container\"]//div[@class=\"ag-cell ag-cell-not-inline-editing ag-cell-normal-height ag-cell-value\"][3]");
}
