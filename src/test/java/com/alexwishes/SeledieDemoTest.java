package com.alexwishes;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeledieDemoTest extends BaseTest{
	@Test(description = "百度搜索")
    public void baiduSearchTest(){
        String url = "http://www.baidu.com";
        System.out.println("url:"+url);
        driver.get(url);
        driver.findElement(By.id("kw")).sendKeys("galen2016");
        driver.findElement(By.id("s11")).click();
    }

    @Test(description = "搜狗搜索")
    public void sougouSearchTest(){
        driver.get("https://www.sogou.com");
        driver.findElement(By.id("query1")).sendKeys("galen2016");
    }
}
