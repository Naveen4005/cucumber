package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import excelutilities.ExcelUtils;
import pages.wpeverest.account_signup;
import pages.wpeverest.signup_text_fields;

public class wpeverest_testing extends BaseTest{
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
		account_signup page_signup=new account_signup(driver);
		page_signup.create_account_button();
		signup_text_fields page_inputs=new signup_text_fields(driver);
		page_inputs.text_inputs(rownumber);
		report.endTest(test);
		report.flush();
}
}