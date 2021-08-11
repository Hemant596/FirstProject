package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtils;

public class GetInvolvedPage {
	
	private WebDriver driver;
	private ElementUtils elementUtils;
	
	public GetInvolvedPage(WebDriver driver) {
		this.driver=driver;
		 elementUtils= new ElementUtils(driver) ;
	}
	
	public void getInvolveClick() {
		WebElement clickon =elementUtils.getElement("xpath", "//*[contains(text(),'Get Involved          ')]");
		clickon.click();
	}
	
	private WebElement getHeaderElement(String headerValue) {
		String head = ".col-md-6.col-sm-12.topmargin.bottommargin>p:nth-of-type(1)";
		return elementUtils.getElement("css",head);
	}
	
	public boolean getHeaderExist(String headerValue) {
		String textget =getHeaderElement(headerValue).getText();
		System.out.println(textget);
		
		return getHeaderElement(headerValue).isDisplayed();
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Get Involved | United Nations")) {
			System.out.println("Title is absolutely right");
		} else{
			System.out.println("Not matching title");	
	}
	
	}
	
}
