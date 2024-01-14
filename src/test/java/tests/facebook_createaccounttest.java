package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import excelutilities.ExcelUtils;
import pages.facebook.homepage;
import pages.facebook.signup_page;
import pages.magneto.create_new_account;
import pages.magneto.magneto_homepage;

public class facebook_createaccounttest extends BaseTest {
	WebDriver driver;
	ExcelUtils excelutil=new ExcelUtils();
	
	@Parameters("tc")
	@Test
	
	public void test(String tc) throws InterruptedException, AWTException, IOException
	{

		int rownumber=excelutil.getrownumber("data", tc);
		System.out.println("Rownumber is :"+rownumber);
		test=report.startTest("facebook create account test","Test to verify user is able to create facebook account");
		driver=launchBrowser();
		Thread.sleep(5000);
		homepage home=new homepage(driver);
		home.clickcreateaccount();
		signup_page signup=new signup_page(driver);
		signup.signup_account(rownumber);
		signup.validateUIText(rownumber);
		report.endTest(test);
		report.flush();
}
}
