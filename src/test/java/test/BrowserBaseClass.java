package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilityPackage.PropertiesFileReaderClass;

public class BrowserBaseClass {
	private static WebDriver driver;
	private final PropertiesFileReaderClass propertiesData = new PropertiesFileReaderClass();

	@Before
	public void initializeDriver() throws IOException {
		if (driver == null) {
			String browserName = System.getProperty("browser", "chrome");
			if (browserName == null || browserName.isEmpty()) {
				browserName = propertiesData.getPropertyValue("chromebrowser");
			}
			
//			boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "true"));

			switch (browserName.toLowerCase()) {
			case "chrome":
				ChromeOptions chromeOptions = new ChromeOptions();
//				if (isHeadless) {
//					chromeOptions.addArguments("--headless");
//					chromeOptions.addArguments("--disable-gpu");
//					chromeOptions.addArguments("--window-size=1920,1080");
//				}
				driver = new ChromeDriver(chromeOptions);
				break;
			case "firefox":
				FirefoxOptions firefoxOptions = new FirefoxOptions();
//				if (isHeadless) {
//					firefoxOptions.addArguments("--headless");
//				}
				driver = new FirefoxDriver(firefoxOptions);
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browserName);
			}

			// Launch the application
			driver.get(propertiesData.getPropertyValue("applicationURL"));
			driver.manage().window().maximize();
		}
	}

//	@After
//	public void closeBrowser() {
//		if (driver != null) {
//			driver.quit();
//			driver = null;
//		}
//	}

	public static WebDriver getDriver() {
		if (driver == null) {
			throw new IllegalStateException("WebDriver is not initialized. Call initializeDriver() first.");
		}
		return driver;
	}
}
