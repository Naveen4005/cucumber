package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import excelutilities.ExcelUtils;
import pages.amazon.account_create;
import pages.amazon.signuppage;

public class amazon_create_account extends BaseTest{
	
	WebDriver driver;
	ExcelUtils excelutil=new ExcelUtils();
	
	@Parameters("tc")
	@Test
	
	public void test(String tc) throws InterruptedException, AWTException, IOException
	{

		int rownumber=excelutil.getrownumber("data", tc);
		System.out.println("Rownumber is :"+rownumber);
		test=report.startTest("Amazon create account test","Test to verify user is able to create Amazon account");
		driver=launchBrowser();
		Thread.sleep(5000);
		signuppage signup=new signuppage(driver);
		signup.clickcreateaccount();
		account_create creating=new account_create(driver);
		creating.giving_data(rownumber);
		report.endTest(test);
		report.flush();
}
}
