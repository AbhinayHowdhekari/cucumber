package urBuddiLogin.in;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	String idfield1;
	String fnamefiled2;
	String lnamefield3;
	String emailfield4;
	String empdob5;
	String num;
	String year;
	String userLoginId;
	String userPassword;
	String rename;
	String userJOD;
	
	public void properties() throws IOException {
		RandomClass c = new RandomClass();
		String id = c.employeeid();
		String mailId = RandomClass.emailId();
		String Lname = RandomClass.empLastName();
		String fullName = fnamefiled2 + " " + Lname;

		DobClass dob = new DobClass();
		String setJOD = dob.setJOD();
		
		String propertiesFilePath = "D:\\OPTIMWORKS_INTERN\\abhi\\target\\Propertiesfile\\urbuddi.properties";
		Properties p = new Properties();
		FileReader fis = new FileReader(propertiesFilePath);
		p.load(fis);

		p.setProperty("empId", id);
		p.setProperty("empLastName", Lname);
		p.setProperty("empEmailId", mailId);
		p.setProperty("joiningDate", setJOD);

		FileWriter writer = new FileWriter(propertiesFilePath);
		p.store(writer, "Updated Employee Details");
		writer.close();

		Properties updatedProps = new Properties();
		FileReader updatedFis = new FileReader(propertiesFilePath);
		updatedProps.load(updatedFis);

		this.idfield1 = updatedProps.getProperty("empId");
		this.fnamefiled2 = updatedProps.getProperty("empFirstName");
		this.lnamefield3 = updatedProps.getProperty("empLastName");
		this.emailfield4 = updatedProps.getProperty("empEmailId");
		this.num = updatedProps.getProperty("dob");
		int number = Integer.parseInt(num);
		year = dob.getYear(number);
		this.userLoginId=updatedProps.getProperty("userName");
		this.userPassword=updatedProps.getProperty("password");
		this.rename = updatedProps.getProperty("newName");
		this.userJOD=updatedProps.getProperty("joiningDate");
	}

}
