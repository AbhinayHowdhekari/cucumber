package utilityPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import Locators.in.LoginAndLogoutPageLocators;

public class SeleniumHelpersMethods extends LoginAndLogoutPageLocators {
	WebDriver driver;

	public SeleniumHelpersMethods(WebDriver driver) {
		this.driver = driver;
	}

	Assertion assertion = new Assertion();

	public void sendTextData(By locator, String value) {
		WebElement field = driver.findElement(locator);
		field.isDisplayed();
		field.clear();
		field.sendKeys(value);
	}

	public void clickAction(By locator) {
		WebElement clickbutton = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		clickbutton.click();
	}

	public void dropDownSelectionByText(By dropDownID, String dropDownValue) {

		WebElement element = driver.findElement(dropDownID);
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(dropDownValue);
	}

	public void dropDownSelectionByValue(By dropDownID, String dropDownValue) {
		WebElement element = driver.findElement(dropDownID);
		Select dropDown = new Select(element);
		dropDown.selectByValue(dropDownValue);
	}

	public void explicitWaitMethod(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public boolean elementIsDisabled(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void getTextMethod(By locator, String expectedValue) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedValue));
		WebElement element = driver.findElement(locator);
		String actualText = element.getText().trim();
		assertion.assertEquals(actualText, expectedValue);
	}

	public void Scrolldown(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0], arguments[1])", x, y);
	}

	public void scrollToElementUsingActions(By element) {
		WebElement element2 = driver.findElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element2).perform();
	}

	public void BootstrapSelectorMethod(By locator, By dropLocator) {
		driver.findElement(dropLocator).click();
		List<WebElement> options = driver.findElements(locator);

		for (WebElement option : options) {
			if (option.getText().equals("PG")) {
				option.click();
				break;
			}
		}

//		List<String> list=new ArrayList<String>();
//		for (WebElement option : options) {
//			list.add(option.getText());
//		}
//		for(int i=0;i<options.size();i++) {
//			for(int j=i;j<list.size();j++) {
//				if(options.get(i).equals(list.get(j))) {
//				}
//			}
//		}

	}

	public void clickUsingJavaScript(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public boolean addEventAssertion(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void checkbox(By locator) {
		List<WebElement> list = driver.findElements(locator);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isDisplayed() || list.get(i).isEnabled() || list.get(i).isSelected()) {
				list.get(i).click();
			}
		}
	}

	public void scrollHorizontal(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll the parent container horizontally to 300 pixels
		js.executeScript("arguments[0].parentNode.scrollLeft = 300;", element);

		// Wait for the element to be clickable
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));

//	    element.click();
	}

	public String assertionWithGetTextMethod(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		String actualText = element.getText().trim();
		return actualText;
	}

	public void DragAndDrop(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Actions actions = new Actions(driver);
        actions.clickAndHold(until)
               .moveByOffset(400, 0) // Adjust the offset for the desired scroll
               .build()
               .perform();
	}

}
