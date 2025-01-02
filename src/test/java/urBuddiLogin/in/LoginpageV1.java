package urBuddiLogin.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageV1 {
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://dev.urbuddi.com/login");

		driver.findElement(By.id("userEmail")).sendKeys("nikhil.pachipala@optimworks.com");
		driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button.sc-dcJsrY[type='submit']")).click();
//		System.out.println("Login sucessfully");
//		Thread.sleep(5000);
//		WebElement element = drive.findElement(By.xpath("//button[text()='Add Holidays']"));
//		//Assert.assert("Element is not displayed on the page", element.isDisplayed());
//		Thread.sleep(3000);
//		boolean displayed = driver.findElement(By.cssSelector(".expand-menu")).isDisplayed();
//		driver.findElement(By.className("hamburger-icon")).click();
//		Thread.sleep(3000);
//		boolean dis = driver.findElement(By.cssSelector(".collapse-menu")).isDisplayed();
//		driver.findElement(By.className("hamburger-icon")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Employees']/ancestor::a")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"firstName\"]")).sendKeys("Abhi");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"lastName\"]")).sendKeys("Howdhekai");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[id=\"employeeID\"]")).sendKeys("1011");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"email\"]")).sendKeys("Aabb@gmail.com");
//		WebElement role = driver.findElement(By.cssSelector("select[id=\"role\"]"));
//		Select dropdownselectrole = new Select(role);
//		dropdownselectrole.selectByVisibleText("Employee");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"password\"]")).sendKeys("1234567890");
//		driver.findElement(By.cssSelector(".sc-imWYAI[name=\"dob\"]")).sendKeys("15-11-2001");
//		driver.findElement(By.cssSelector(".sc-imWYAI[name=\"joiningDate\"]")).sendKeys("15-10-2024");
//		WebElement qualification = driver.findElement(By.cssSelector("select[id=\"qualifications\"]"));
//		Select dropdownqualification = new Select(qualification);
//		dropdownqualification.selectByValue("B.Tech");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"department\"]")).sendKeys("Testing");
//		WebElement gender = driver.findElement(By.cssSelector("select[id=\"gender\"]"));
//		Select dropdowngender = new Select(gender);
//		dropdowngender.selectByVisibleText("Male");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"mobileNumber\"]")).sendKeys("1234567890");
//		WebElement bloodgroup = driver.findElement(By.cssSelector("select[id=\"bloodGroup\"]"));
//		Select dropdownbloodgroup = new Select(bloodgroup);
//		dropdownbloodgroup.selectByValue("A+");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"designation\"]")).sendKeys("Intern");
//		driver.findElement(By.cssSelector("input[id=\"salary\"]")).sendKeys("30000");
//		driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"location\"]")).sendKeys("Hyderabad");
//		WebElement reporting = driver.findElement(By.cssSelector("select.sc-dAlyuH[id=\"reportingTo\"]"));
//		Select dropdownreporting = new Select(reporting);
//		dropdownreporting.selectByVisibleText("nikhil.pachipala@optimworks.com");
//		driver.findElement(By.cssSelector("button.dropdown-btn")).click();
//		List<WebElement> list = driver.findElements(By.cssSelector(".certificates-dropdown label"));
//
//		for (WebElement op : list) {
//		    String text = op.getText(); 
//		    
//		    if (text.equals("10th") || text.equals("Intermediate") || text.equals("Degree")) {
//		        op.click(); 
//		    }
//		}
//		driver.findElement(By.xpath("//button[text()='Add']")).submit();
//		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("[aria-label=\"EMP ID Filter Input\"]")).click();
		driver.findElement(By.cssSelector("[aria-label='EMP ID Filter Input']")).sendKeys("10111");
		Thread.sleep(3000);
//		String text = driver.findElement(By.xpath("(//div[@col-id=\"id\"])[2]")).getText();
//		System.out.println(text);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.ag-cell[col-id=\"1\"]")).click();
		Thread.sleep(3000);
		WebElement editdetails = driver.findElement(By.cssSelector("input.sc-imWYAI[name=\"firstName\"]"));
		editdetails.clear();
		editdetails.sendKeys("Ramu");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).submit();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[aria-label=\"EMP ID Filter Input\"]")).click();
		driver.findElement(By.cssSelector("[aria-label='EMP ID Filter Input']")).sendKeys("10111");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"ag-cell-wrapper\"]//input")).click();
		driver.findElement(By.xpath("//button[@class=\"deleteIcon\"]")).click();
	}
}
