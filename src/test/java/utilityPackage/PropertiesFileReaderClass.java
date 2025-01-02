package utilityPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReaderClass {

	private Properties properties;

	public PropertiesFileReaderClass() {
		properties = new Properties();
	}

	public String getPropertyValue(String key) throws IOException {
		String file = "D:\\JavaProject\\urBuddi\\abhi2\\src\\test\\resources\\urbuddi.properties";
//		String file = System.getProperty("user.dir") + "\\target\\urbuddi.properties";
		FileReader fis = new FileReader(file);
		properties.load(fis);
		return properties.getProperty(key);
	}
}
