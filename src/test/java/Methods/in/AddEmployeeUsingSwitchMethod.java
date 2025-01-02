//package Methods.in;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import test.BrowserBaseClass;
//import utilityPackage.UtilesMethods;
//
//public class AddEmployeeUsingSwitchMethod {
//	
//	WebDriver driver = BrowserBaseClass.getDriver();
//	
//	AddEmployeePageMethod empMethods=new AddEmployeePageMethod(driver);
//	
//	UtilesMethods randomData = new UtilesMethods();
//	public String randomEmployeeid = randomData.employeeid();
//	public String randomEmailId = randomData.emailId();
//	
//	public String getRandomEmployeeid() {
//		return randomEmployeeid;
//	}
//
//	public void setRandomEmployeeid(String randomEmployeeid) {
//		this.randomEmployeeid = randomEmployeeid;
//	}
//
//	public String getRandomEmailId() {
//		return randomEmailId;
//	}
//
//	public void setRandomEmailId(String randomEmailId) {
//		this.randomEmailId = randomEmailId;
//	}
//
//	public void addEmployeedetails(String key, String value) throws InterruptedException {
//		switch (key) {
//		case "firstName":
//			empMethods.enterFirstName(value);
//			break;
//		case "empLastName":
//			empMethods.enterLastName(value);
//			break;
//		case "employeeid":
//			if (value.equals("randomEmployeeId")) {
//				System.out.println(randomEmployeeid);
//				empMethods.enterId(randomEmployeeid);
//			} else {
//				empMethods.enterId(value);
//			}
//			break;
//		case "emailId":
//			if (value.equals("randomEmail")) {
//				System.out.println(randomEmailId);
//				empMethods.enterEmailId(randomEmailId);
//			} else {
//				empMethods.enterEmailId(value);
//			}
//			break;
//		case "Role":
//			empMethods.selectRole(value);
//			break;
//		case "password":
//			empMethods.enterPassword(value);
//			break;
//		case "dob":
//			empMethods.enterDateOfBirth(value);
//			break;
//		case "JOD":
//			empMethods.enterJoiningDate(value);
//			break;
//		case "Qualification":
//			empMethods.selectQualification(value);
//			break;
//		case "department":
//			empMethods.enterDepartment(value);
//			break;
//		case "gender":
//			empMethods.selectGender(value);
//			break;
//		case "PhoneNo":
//			empMethods.enterMobileNo(value);
//			break;
//		case "BloodGroup":
//			empMethods.selectBloodGroup(value);
//			break;
//		case "designation":
//			empMethods.enterdesgnation(value);
//			break;
//		case "salary":
//			empMethods.enterSalary(value);
//			break;
//		case "location":
//			empMethods.enterLocation(value);
//			break;
//		case "reportingTo":
//			empMethods.selectReportingTo(value);
//			break;
//		default:
//			Assert.fail("Incorrect field: '" + key + "' is used.");
//			break;
//		}
//	}
//}
