package Methods.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.in.EmpSearchLocators;
import utilityPackage.SeleniumHelpersMethods;

public class EmployeeFilterMethod extends EmpSearchLocators {
	WebDriver driver;
	SeleniumHelpersMethods helperMethod;
	public EmployeeFilterMethod(WebDriver driver) {
		this.driver=driver;
		helperMethod=new SeleniumHelpersMethods(driver);
	}
	
	public void empFilter(String filterValue) {
		helperMethod.explicitWaitMethod(empIdFilter);
		helperMethod.clickAction(empIdFilter);
		helperMethod.sendTextData(empIdFilter, filterValue);
	}
	
	public void searchEmpFilter(String fullName) throws InterruptedException {
//		helperMethod.explicitWaitMethod(getSearchNameLocator(fullName));
		helperMethod.getTextMethod(getSearchNameLocator(fullName),fullName);
	}
	public String getempIdAsText() {
		WebElement element = driver.findElement(getIdasText);
		String text = element.getText();
		return text;
	}
}
