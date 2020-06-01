package com.alexwishes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

@Listeners({TestngListener.class})
public class BaseTest {
    public WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

	@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/var/jenkins_home/tools/chromedriver");
        driver = new ChromeDriver();
    }


	@AfterClass
    public void tearDown(){
        driver.quit();
    }
}
