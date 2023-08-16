package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC_002_ScrollingWebsite extends DriverSetup {
	
	@Test
	public void ScrollingWebsite() throws InterruptedException{
		String baseurl = "https://chaldal.com/";
		
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
}
