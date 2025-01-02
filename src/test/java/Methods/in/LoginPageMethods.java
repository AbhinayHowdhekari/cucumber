package Methods.in;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.in.LoginAndLogoutPageLocators;
import utilityPackage.SeleniumHelpersMethods;

public class LoginPageMethods extends LoginAndLogoutPageLocators {
	WebDriver driver;
	SeleniumHelpersMethods helperMethod;
	
	public LoginPageMethods(WebDriver driver) {
//		System.out.println(driver);
		this.driver = driver;
		helperMethod =new SeleniumHelpersMethods(this.driver);
	}
	public void enterUserName(String value) {
		helperMethod.sendTextData(Emailid, value);
	}

	public void enterUserPassword(String pwd) {
		helperMethod.sendTextData(password, pwd);
	}

	public void clickLoginButton() {
		helperMethod.clickAction(loginButton);
		helperMethod.explicitWaitMethod(loginButton);
	}
	public boolean verifyProfile() {
	    try {
	    	helperMethod.explicitWaitMethod(profilevefication);
	        return driver.findElement(profilevefication).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	public boolean invaliddata() {
	    try {
	        return driver.findElement(invalidcredential).isDisplayed();
	    } catch (Exception e) {
	    	System.out.println("Entered exception");
	        return false;
	    }
	}
	public void clickLogOutButton() {
		helperMethod.scrollToElementUsingActions(LogoutButton);
		helperMethod.clickAction(LogoutButton);
		helperMethod.explicitWaitMethod(LogoutConformationHeading);
		helperMethod.clickAction(LogoutConformationButton);
	}
	public String verifyLoginpage() {
		helperMethod.explicitWaitMethod(verifyPageNavigatedToLoginpage);
		WebElement element = driver.findElement(verifyPageNavigatedToLoginpage);
		return element.getText();
	}

}
