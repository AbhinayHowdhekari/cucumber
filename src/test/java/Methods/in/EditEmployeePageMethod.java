package Methods.in;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.in.EditPageLocators;
import utilityPackage.SeleniumHelpersMethods;

public class EditEmployeePageMethod extends EditPageLocators {
	WebDriver driver;

	SeleniumHelpersMethods helperMethod;

	public EditEmployeePageMethod(WebDriver driver) {
		this.driver = driver;
		helperMethod = new SeleniumHelpersMethods(this.driver);
	}

//	public void clickEdit(String empID) {
//
//	}

	public void clickEditButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(editButton)).click();
	}

	public void changeName(String name) {
//		helperMethod.addEventAssertion(updatename);
		helperMethod.explicitWaitMethod(updatename);
		helperMethod.sendTextData(updatename, name);
	}

	public void submitButton() {
		helperMethod.explicitWaitMethod(clickButton);
		helperMethod.clickAction(clickButton);
		helperMethod.elementIsDisabled(editEmployeeHeader);
	}

	public boolean editHeader() {
		helperMethod.explicitWaitMethod(editEmployeeHeader);
		return helperMethod.addEventAssertion(editEmployeeHeader);
	}

	public String searchValuemethod() {
		helperMethod.explicitWaitMethod(searchValue);
		helperMethod.Scrolldown(100, 100);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(searchValue, "1 to 1 of 1"));
		String text = driver.findElement(searchValue).getText();
		return text;
	}

}
