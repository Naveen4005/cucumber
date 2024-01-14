package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;
import excelutilities.ExcelUtils;
import pages.bootstrap.app.RegistrationPage_BA;
import pages.magneto.create_new_account;
import pages.magneto.magneto_homepage;

public class magneto_createaccount_test extends BaseTest {
		WebDriver driver;
		ExcelUtils excelutil=new ExcelUtils();
		
		@Parameters("tc")
		@Test
		
		public void test(String tc) throws InterruptedException, AWTException, IOException
		{

			int rownumber=excelutil.getrownumber("data", tc);
			System.out.println("Rownumber is :"+rownumber);
			test=report.startTest("Maneto create account test","Test to verify user is able to create magneto account");
			driver=launchBrowser();
			Thread.sleep(5000);
			magneto_homepage home=new magneto_homepage(driver);
			home.clickcreateaccount();
			create_new_account account=new create_new_account(driver);
			account.create_account(rownumber);
			report.endTest(test);
			report.flush();
	}
}
