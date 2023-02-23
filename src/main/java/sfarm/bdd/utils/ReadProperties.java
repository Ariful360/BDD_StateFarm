package sfarm.bdd.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
Properties properties;
	
	public ReadProperties() {
		loadProperties();
	}
	
	private void loadProperties() {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("environment.properties");
		properties = new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperties(String key) {
		if (key != null) {
			return properties.getProperty(key);
		} else {
			return null;
		}

	}

	public long getNumProperties(String key) {
		String value = getProperties(key);
		if (value != null) {
			String refinedValue = value.trim().replaceAll("[^0-9]", "");
			return Long.parseLong(refinedValue);
		} else {
			return 0;
		}

	}

	// Unit test of my code

//	public static void main(String[] args) {
//		ReadProperties readProperties = new ReadProperties();
//		String url = readProperties.getProperties("url");
//		System.out.println(url);
//		String url1 = readProperties.getProperties(null);
//		System.out.println(url1);
//		String url2 = readProperties.getProperties("pageloadtime");
//		System.out.println(url2);
//		String url3 = readProperties.getProperties("browser");
//		System.out.println(url3);
//	}
}
