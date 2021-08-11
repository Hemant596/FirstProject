package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	
	private WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public WebElement getElement(String locatortype, String locatorValue ) {
		return driver.findElement(getBy(locatortype, locatorValue));
		
	}
	
	public By getBy(String locatortype, String locatorValue ) {
		
		By locator =null;
		
		switch (locatortype.toLowerCase()) {
		case "id":
			locator =By.id(locatorValue);
			break;
			
		case "name":
			locator =By.name(locatorValue);
			break;
			
		case "xpath":
			locator =By.xpath(locatorValue);
			break;
			
		case "css":
			locator =By.cssSelector(locatorValue);
			break;
			
		case "linktext":
			locator =By.linkText(locatorValue);
			break;

		default:
			break;
		}
		return locator;
	}

}
