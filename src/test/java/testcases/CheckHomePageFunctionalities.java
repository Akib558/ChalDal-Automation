package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.DriverSetup;
//import java.awt.Desktop.Action;


public class CheckHomePageFunctionalities extends DriverSetup {
	
	public static String baseurl = "https://chaldal.com/";
	
	@Test
	public void CheckHomePageRefresh() throws InterruptedException {	
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	@Test
	public void CheckHomePageMenuToggle() throws InterruptedException {	
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='noun_menu_1119465']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='noun_menu_1119465']")).click();
	}
	
	@Test
	public void CheckLiveChat() throws InterruptedException {	
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.className("chat_area"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.findElement(By.className("chat_launcher2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='page']/div[1]/span[1]/div[1]/button[1]")).click();
	}
	
	@Test
	public void CheckLocationOption() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		ele.click();
	}
	
	@Test
	public void CheckLanguageOption() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'বাং')]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//p[contains(text(),'EN')]"));
//		a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		ele.click();
	}
	
	@Test
	public void CheckCommonQuestionsDropDowns() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[5]/section[1]/div[1]/div[1]/section[8]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.click();
		ele = driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[5]/section[1]/div[1]/div[1]/section[8]/div[1]/div[2]/div[1]/div[2]/div[1]"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.click();
		ele = driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[5]/section[1]/div[1]/div[1]/section[8]/div[1]/div[2]/div[1]/div[3]/div[1]"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.click();
		ele = driver.findElement(By.xpath("//body/div[@id='page']/div[1]/div[5]/section[1]/div[1]/div[1]/section[8]/div[1]/div[2]/div[1]/div[4]/div[1]"));
		Thread.sleep(2000);
		ele.click();
	}
}
