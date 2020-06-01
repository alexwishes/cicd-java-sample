package com.alexwishes;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class TestngListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		BaseTest bt = (BaseTest) tr.getInstance();
		WebDriver driver = bt.getDriver();
		takePhoto(driver);
		logCaseStep(tr);
		exceptedResult(tr);
	}
	
	@Attachment(value = "失败截图如下：",type = "image/png")
	public byte[]  takePhoto(WebDriver driver){
		byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
	
	/**
	 * 打印测试步骤
	 * @param tr
	 */
	@Attachment(value = "操作步骤如下：")
	public String logCaseStep(ITestResult tr){
		String step = "1、打开浏览器  2、输入百度地址";
		return step;
	}

	/**
	 * 打印测试步骤
	 * @param tr
	 */
	@Attachment(value = "期望结果如下：")
	public String exceptedResult(ITestResult tr){
		String result = "显示查询结果";
		return result;
	}
}
