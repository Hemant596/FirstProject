package ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigPropReader {
	
	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLangProp(String language) {
		System.out.println("languagae is :"+language);
		
		prop=new Properties();
		
		switch (language.toLowerCase()) {
		case "english":
			try {
				ip = new FileInputStream("./src/main/resources/lang.eng.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case "french":
			try {
				ip = new FileInputStream("./src/main/resources/lang.french.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case "russian":
			try {
				ip = new FileInputStream("./src/main/resources/lang.russian.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;

		default:
			System.out.println("Please enter a correct language");
			break;
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
