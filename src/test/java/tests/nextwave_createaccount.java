package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import excelutilities.ExcelUtils;
import pages.magneto.create_new_account;
import pages.magneto.magneto_homepage;
import pages.nextwave.homepage;
import pages.nextwave.signup_page;

public class nextwave_createaccount extends BaseTest{
	WebDriver driver;
	ExcelUtils excelutil=new ExcelUtils();
	
	@Parameters("tc")
	@Test
	
	public void test(String tc) throws InterruptedException, AWTException, IOException
	{

		int rownumber=excelutil.getrownumber("data", tc);
		System.out.println("Rownumber is :"+rownumber);
		test=report.startTest("nextwave create account test","Test to verify user is able to create nextwave account");
		driver=launchBrowser();
		Thread.sleep(5000);
		homepage home=new homepage(driver);
		home.clickcreateaccount();
		signup_page signup=new signup_page(driver);
		signup.sign_up(rownumber);
	//	signup.validateUITex
		report.endTest(test);
		report.flush();
		report.close();
		}
}
