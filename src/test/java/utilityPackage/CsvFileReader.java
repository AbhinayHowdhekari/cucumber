package utilityPackage;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class CsvFileReader {
	private Properties properties;

	public CsvFileReader() {
		properties = new Properties();
	}

//	public String getPropertyValue(String key) throws IOException {
//		@DataProvider(name = "csvData")
//	    public Object[][] getCSVData() throws IOException {
//	        String filePath = "D:\\JavaProject\\urBuddi\\abhi2\\src\\test\\resources\\urBuddi.csv";
//	        Reader reader = new FileReader(filePath);
//	        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(reader);
//	        List<Object[]> data = new ArrayList<>();
//	        
//	        for (CSVRecord record : records) {
//	            // Collect username and password or other necessary fields for each row
//	            String username = record.get("userName");
//	            String password = record.get("password");
//	            data.add(new Object[]{username, password});
//	        }
//	        
//	        return data.toArray(new Object[0][0]); // Convert list to 2D array
//	    }
		
		
		
		
	
//		String file = "D:\\JavaProject\\urBuddi\\abhi2\\src\\test\\resources\\urBuddi.csv";
////		String file = System.getProperty("user.dir") + "\\target\\urbuddi.properties"
//		String value = null;
//		Reader reader = new FileReader(file);
//		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(reader);
//		
//		for (CSVRecord record : records) {
//			value=record.get(key);
//		}
//   return value;
//	}
}
