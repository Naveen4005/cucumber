package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import excelutilities.ExcelUtils;
import pages.codebox.button_to_forms;
import pages.codebox.register_form;

public class codebox_register_form extends BaseTest{
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
		button_to_forms clickto_forms=new button_to_forms(driver);
		clickto_forms.towards_register();
		register_form register_page=new register_form(driver);
		register_page.signup_page(rownumber);
		report.endTest(test);
		report.flush();
}
}
