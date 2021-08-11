package Pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetInvolveScreenshot {
	
	private WebDriver driver;
	public GetInvolveScreenshot(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getScreen() {
		
		Date date = new Date();
		String setdate =date.toString().replace(" ", "-").replace(":", "-");
		File screenshotfile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotfile, new File(".//screenshot//"+setdate+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
