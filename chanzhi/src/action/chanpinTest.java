package action;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class chanpinTest extends BaseTest{

	@Test
	public void one() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'维护类目')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,' 返回产品列表')]")).click();
		assertTrue(driver.getPageSource().contains("维护类目"));
	}
	@Test
	public void two() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='searchWord']")).sendKeys("aaa");
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    assertTrue(driver.getPageSource().contains("aaa"));
	}
	@Test
	public void three() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("chosen-choices")).click();
	    driver.findElement(By.className("active-result")).click();;
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("王静楠");
	    
//	    driver.switchTo().frame("ke-edit-iframe");  //???
//	    Actions action = new Actions(driver);
//	    for(int i = 0;i<9;i++){
//	    	action.sendKeys(Keys.TAB);
//	    }
//	    action.sendKeys("这是一件").perform();
//	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    Thread.sleep(3000);
//	    assertTrue(driver.getPageSource().contains("详情不能为空"));   ？？？
	}
}
