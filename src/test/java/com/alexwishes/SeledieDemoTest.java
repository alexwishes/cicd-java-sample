package com.alexwishes;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeledieDemoTest extends BaseTest{
	String url = "http://10.100.218.26:8090/";
	@Test(description = "登录测试")
    public void LoginTest(){
        try {
        	pageLogin(url);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Test(description = "会议室查询测试")
    public void meetingTest() throws InterruptedException{       
		driver.findElement(By.xpath("//div/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/ul/li[2]/ul/li")).click();
		Thread.sleep(2000);
    }
	
	@Test(description = "会议室预订测试")
    public void updateTest() throws InterruptedException{
		//选择会议室
		driver.findElement(By.xpath("//div/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/ul/li[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/div/div/div[2]/ul[2]/li[3]")).click();
		Thread.sleep(1000);
		
		//录入会议主题
		driver.findElement(By.xpath("//form/div[2]/div/div/input")).sendKeys("会议测试");
		Thread.sleep(1000);
		
		//确定
		driver.findElement(By.xpath("//form/div/div/button")).click();
		Thread.sleep(1000);
    }
	
	private void pageLogin(String url) {
		driver.get(url);
        driver.findElement(By.xpath("//div/form/div/div/div/input")).sendKeys("chenh009");
        driver.findElement(By.xpath("//div/form/div[2]/div/div/input")).sendKeys("hebjzG.8520");
        driver.findElement(By.xpath("//button")).click();
	}
}
