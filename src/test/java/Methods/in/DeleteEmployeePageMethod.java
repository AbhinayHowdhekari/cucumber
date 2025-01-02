package Methods.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.in.DeleteEmpLocators;
import utilityPackage.SeleniumHelpersMethods;

public class DeleteEmployeePageMethod extends DeleteEmpLocators {
	WebDriver driver;
	SeleniumHelpersMethods helperMethod;
	EmployeeFilterMethod filtervalue = new EmployeeFilterMethod(driver);

	public DeleteEmployeePageMethod(WebDriver driver) {
		this.driver = driver;
		helperMethod = new SeleniumHelpersMethods(this.driver);
	}

	public void clickCheckBox(String value) throws InterruptedException {

		By locator = searchCheckBox(value);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		helperMethod.clickAction(locator);
//		helperMethod.explicitWaitMethod(deleteCheckBox);
//		helperMethod.explicitWaitMethod(filtervalue.empIdFilter);
//		helperMethod.checkbox(deleteCheckBox);
//	    helperMethod.clickAction(deleteCheckBox);
	}

	public void deleteEmp() {
		helperMethod.explicitWaitMethod(deleteButton);
		helperMethod.clickAction(deleteButton);
	}
}
