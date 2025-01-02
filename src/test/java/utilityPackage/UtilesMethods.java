package utilityPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilesMethods {
	String formattedDob;
	String formattedjod;

	public String employeeid() {
		String str = "ABC";
		Random r = new Random();
		int number = r.nextInt(1000);
		String empId = str + number;
		
		return empId;
	}

	public String randomString() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 7;
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		return randomString;
	}

	public static String emailId() {
		String letters = "@gmail.com";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 10;
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		return randomString + letters;
	}

	public String randomDOB(int num) {
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

	public String generateMobileNo() {
		Random ran = new Random();
		int nextInt = ran.nextInt(1000000000);
		String randomNum = String.valueOf(nextInt);
		return randomNum;
	}

//	public String random() {
//		Random ran = new Random();
//		int nextInt = ran.nextInt(0, 1000000);
//		String randomNum = String.valueOf(nextInt);
//		return randomNum;
//	}
}
