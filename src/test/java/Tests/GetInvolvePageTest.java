package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ConfigPropReader;
import DriverFactory.DriverFactory;
import Pages.GetInvolvedPage;

public class GetInvolvePageTest {
	
	WebDriver driver;
	Properties prop;
	DriverFactory df;
	ConfigPropReader cp;
	GetInvolvedPage pagetest;
		
	
	@BeforeTest
	public void setUp() {
		prop = new Properties();
		cp =new ConfigPropReader();
		prop =cp.initLangProp("english");
		df= new DriverFactory();
		driver =df.initDriver("chrome", prop);
		pagetest= new GetInvolvedPage(driver);
		
	}
	
	@Test
	public void test1() {
		
		pagetest.getInvolveClick();
		pagetest.getHeaderExist(prop.getProperty("getheader"));
	}

	@Test
	public void test2() {
		pagetest.getTitle();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
