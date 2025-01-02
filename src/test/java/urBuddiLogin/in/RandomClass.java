package urBuddiLogin.in;

import java.util.Random;

public class RandomClass {
	public String employeeid() {
		String str = "OWI";
		Random r = new Random();
		int number = r.nextInt(1000);
		String empId = str + number;
		return empId;
	}

	public static String empLastName() {
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
		String letters="@gmail.com";
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
		return randomString+letters;
	}
}
