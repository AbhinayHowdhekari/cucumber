package utilityPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportClass {
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static ExtentReports createReportInstance() {
		if (extent == null) {
			String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
			sparkReporter.config().setReportName("Automation Test Report");
			sparkReporter.config().setDocumentTitle("Extent Report");
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			extent.setSystemInfo("Tester", "Abhinay");
			extent.setSystemInfo("Environment", "QA");
//			extent.setSystemInfo("Browser", "Chrome");
		}
		return extent;
}
	public static String captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
		File destFile = new File(destPath);
		destFile.getParentFile().mkdirs();
		Files.copy(srcFile.toPath(), destFile.toPath());
		return destPath;
	}	
	
}
