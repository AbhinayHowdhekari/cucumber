package Locators.in;

import org.openqa.selenium.By;

public class LoginAndLogoutPageLocators {

	public By Emailid = By.id("userEmail");
	public By password = By.xpath("//*[@id='userPassword']");
	public By loginButton = By.cssSelector("button.sc-dcJsrY[type='submit']");
	public By profilevefication = By.xpath("//img[@class=\"profile-icon-container\"]");
	public By invalidcredential = By.xpath("//*[@class=\"err-msg-display mt-3\"]");
	public By LogoutButton = By.xpath("//p[@class='logout-btn-nav']");
	public By LogoutConformationHeading = By.xpath("//p[@class='modal-heading']");
	public By LogoutConformationButton = By.xpath("//button[text()='Yes']");
	public By verifyPageNavigatedToLoginpage = By.xpath("//p[@class=\"welcomeMessage\"]//child::span");
}
