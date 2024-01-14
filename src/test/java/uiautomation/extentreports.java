package uiautomation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common.Common;

public class extentreports extends Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String dst1="report"+timeStamp;
		
		ExtentReports report= new ExtentReports(System.getProperty("user.dir")+"\\ExtentTestReports\\"+dst1+"\\ExtentReportResults.html");
		
		ExtentTest test=report.startTest("Logintest","Test to verify user is able to login");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 test.log(LogStatus.INFO, "User should maximize browser"+ ", Actual result :   " +"User is able to maximize"  );
		driver.get("https://www.facebook.com/");
		test.log(LogStatus.PASS, "User should LAUNCH browser"+ ", Actual result :   " +"User is able to LAUNCH BROWSER"  );
		
		
		WebElement createaccbtn=driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
		
//		click(createaccbtn,driver,"Create Account Button");
		report.endTest(test);
		report.flush();
		

	}

}
