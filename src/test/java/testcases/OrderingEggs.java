package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.DriverSetup;

public class OrderingEggs extends DriverSetup {
public static String baseurl = "https://chaldal.com/";
	
	@Test(priority=2)
	
	public void SignInBtnFromHomePage() throws InterruptedException {
		
		driver.get(baseurl);
		
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='signInBtn']")).click();
		Thread.sleep(500);
//		driver.findElement(By.xpath("1")).click();
//		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(500);
//		driver.findElement(By.xpath("//input[@type='tel']")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("01631820558");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(), 'Fruits and Vegetables')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//img[@alt='Fresh Vegetables']")).click();
		Thread.sleep(500);

			
		for(int i = 1; i < 5; i++) {
			WebElement ele = driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div["+Integer.toString(i)+"]/div[1]/div[1]"));
			Actions a = new Actions(driver);
//			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			Thread.sleep(1000);
//			ele.click();
		}
		
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]
		
		driver.switchTo().defaultContent();
	}
	@Test(priority=1)
	public void ScrollingWebsite() throws InterruptedException{
//		String baseurl = "https://chaldal.com/";
		
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		driver.switchTo().defaultContent();
	}
	
	@Test(priority=3)
	public void HoveringOverLanguageOptions() throws InterruptedException{
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(), বাং)]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void ChangeLanguageOption() throws InterruptedException{
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[contains(text(),'বাং')]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void SearchBox() throws InterruptedException{
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("mainSearch")).sendKeys("egg");
		Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void ChangeLocation() throws InterruptedException{
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Change City')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")).click();
	}
	
	@Test(priority=7)
	public void OrderTesting() throws InterruptedException{
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/p[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/p[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/section[1]/p[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/p[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/p[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
		
		//placing order
		driver.findElement(By.xpath("//button[@id='placeOrderButton']")).click();
		
		//today's deal add to cart
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[2]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add to cart')]")).click();
		
	
		
		//		for(int i = 1; i < 5; i++) {
//			WebElement ele = 
//			driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div["+Integer.toString(i)+"]/div[1]/section[1]")).click();
//			Actions a = new Actions(driver);
//			Actions a = new Actions(driver);
			
//			a.moveToElement(ele).perform();
//			ele.click();
//		}
		
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/section[1]
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/section[1]
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/section[1]
		
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]
		//body/div[@id='page']/div[1]/div[6]/section[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/p[1]
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/section[1]
		//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/p[1]
		
		//		driver.findElement(By.className("itemCount")).click();
		
//		driver.switchTo().defaultContent();
	}
}
