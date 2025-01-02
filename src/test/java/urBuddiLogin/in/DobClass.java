package urBuddiLogin.in;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DobClass {
	String formattedDob;
	String formattedjod;
	public String getYear(int num) {
		LocalDate dob = LocalDate.now().minusYears(num);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedDob = dob.format(formatter);
	    return formattedDob;
	}
	public String setJOD() {
		LocalDate jod = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedjod = jod.format(formatter);
	    return formattedjod;
	}
	
	
}
