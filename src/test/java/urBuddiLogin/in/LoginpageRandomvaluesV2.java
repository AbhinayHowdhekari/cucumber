package urBuddiLogin.in;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginpageRandomvaluesV2 {
	public void login() throws InterruptedException, IOException {
		
		PropertiesClass p=new PropertiesClass();
		p.properties();
		String employeeId = p.idfield1;
		String empFirstName  = p.fnamefiled2;
		String empLastName = p.lnamefield3;
		String employeeEmailId  = p.emailfield4;
		String empDOB = p.year;
		String userId=p.userLoginId;
		String userloginPassword=p.userPassword;
		String updatedName=p.rename;
		String empJOD = p.userJOD;
		
		String fullName=empFirstName+" "+empLastName;
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://dev.urbuddi.com/login");

		driver.findElement(By.id("userEmail")).sendKeys(userId);
		driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys(userloginPassword);
		driver.findElement(By.cssSelector("button.sc-dcJsrY[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Employees']/ancestor::a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"firstName\"]")).sendKeys(empFirstName);
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"lastName\"]")).sendKeys(empLastName);
		driver.findElement(By.cssSelector("input.sc-imWYAI[id=\"employeeID\"]")).sendKeys(employeeId);
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"email\"]")).sendKeys(employeeEmailId);
		WebElement role = driver.findElement(By.cssSelector("select[id=\"role\"]"));
		Select dropdownselectrole = new Select(role);
		dropdownselectrole.selectByVisibleText("Employee");
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"password\"]")).sendKeys(userloginPassword);
		driver.findElement(By.cssSelector(".sc-imWYAI[name=\"dob\"]")).sendKeys(empDOB);
		driver.findElement(By.cssSelector(".sc-imWYAI[name=\"joiningDate\"]")).sendKeys(empJOD);
		WebElement qualification = driver.findElement(By.cssSelector("select[id=\"qualifications\"]"));
		Select dropdownqualification = new Select(qualification);
		dropdownqualification.selectByValue("B.Tech");
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"department\"]")).sendKeys("Testing");
		WebElement gender = driver.findElement(By.cssSelector("select[id=\"gender\"]"));
		Select dropdowngender = new Select(gender);
		dropdowngender.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"mobileNumber\"]")).sendKeys("1234567890");
		WebElement bloodgroup = driver.findElement(By.cssSelector("select[id=\"bloodGroup\"]"));
		Select dropdownbloodgroup = new Select(bloodgroup);
		dropdownbloodgroup.selectByValue("A+");
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"designation\"]")).sendKeys("Intern");
		driver.findElement(By.cssSelector("input[id=\"salary\"]")).sendKeys("30000");
		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"location\"]")).sendKeys("Hyderabad");
		WebElement reporting = driver.findElement(By.cssSelector("select.sc-dAlyuH[id=\"reportingTo\"]"));
		Select dropdownreporting = new Select(reporting);
		dropdownreporting.selectByVisibleText("nikhil.pachipala@optimworks.com");
		driver.findElement(By.cssSelector("button.dropdown-btn")).click();
		List<WebElement> list = driver.findElements(By.cssSelector(".certificates-dropdown label"));

		for (WebElement op : list) {
		    String text = op.getText(); 
		    
		    if (text.equals("10th") || text.equals("Intermediate") || text.equals("Degree")) {
		        op.click(); 
		    }
		}
		driver.findElement(By.xpath("//button[text()='Add']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[aria-label='EMP ID Filter Input']")).sendKeys(employeeId);
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("((//*[text()='" + fullName + "']/../..//div[contains(@class,'ag-cell-not-inline-editing')])[2]//*)[1]")).click();
		Thread.sleep(5000);
		WebElement editdetails = driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"firstName\"]"));
		editdetails.clear();
		editdetails.sendKeys(updatedName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).submit();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[aria-label=\"EMP ID Filter Input\"]")).click();
		driver.findElement(By.cssSelector("[aria-label='EMP ID Filter Input']")).sendKeys(employeeId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"ag-cell-wrapper\"]//input")).click();
		driver.findElement(By.xpath("//button[@class=\"deleteIcon\"]")).click();
	}
}
