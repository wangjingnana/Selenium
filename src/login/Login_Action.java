package login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class Login_Action extends BaseTest{
	
	public void login(String name,String password) throws InterruptedException{
//		driver.findElement(By.xpath("//input[@id='account']"));
		driver.findElement(By.id("account")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
//	@Test
//	public void test() throws InterruptedException{
//		login("admin","admin");
//	}
}
