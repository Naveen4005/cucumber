package uiautomation;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import common.Common;
import excelutilities.ExcelUtils;
import pages.bootstrap.app.RegistrationPage_BA;

public class demo11 extends BaseTest {
	WebDriver driver;
	ExcelUtils excelutil=new ExcelUtils();
	
	@Parameters("tc")
	@Test
	
	public void test(String tc) throws InterruptedException, AWTException, IOException
	{

		int rownumber=excelutil.getrownumber("data", tc);
		System.out.println("Rownumber is :"+rownumber);
		test=report.startTest("Logintest","Test to verify user is able to login");
		driver=launchBrowser();
		Thread.sleep(5000);
		RegistrationPage_BA reg=new RegistrationPage_BA(driver);
		reg.createregistration(rownumber);
		report.endTest(test);
		report.flush();
}
	@Parameters("tc")
	@Test
	
	public void test1(String tc) throws InterruptedException, AWTException, IOException
	{

		int rownumber=excelutil.getrownumber("data", tc);
		System.out.println("Rownumber is :"+rownumber);
		test=report.startTest("Logintest1","Test to verify user is able to login1");
		driver=launchBrowser();
		Thread.sleep(5000);
		RegistrationPage_BA reg=new RegistrationPage_BA(driver);
		reg.createregistration(rownumber);
		report.endTest(test);
		report.flush();
}
}
