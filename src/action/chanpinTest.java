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
	//��¼�����̳ǣ���Ʒ��ά����Ŀ�����ز�Ʒ�б�
	public void one() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'ά����Ŀ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,' ���ز�Ʒ�б�')]")).click();
		assertTrue(driver.getPageSource().contains("ά����Ŀ"));
	}
	@Test
	//��Ʒ�б�ҳ����������У��
	public void two() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='searchWord']")).sendKeys("aaa");
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    assertTrue(driver.getPageSource().contains("aaa"));
	}
	@Test
	//��Ӳ�Ʒ��У��
	public void three() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("chosen-choices")).click();
	    driver.findElement(By.className("active-result")).click();;
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("�����");
//	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    driver.findElement(By.xpath(".//*[@id='submit']")).click();
	    Thread.sleep(3000);
//	    assertTrue(driver.getPageSource().contains("���鲻��Ϊ��"));  
	}
}
