package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	
	WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	Properties prop=new Properties();
	
	@BeforeMethod
	public void config() throws IOException
	{
		File directory =new File(".");
		String configfilepath=directory.getCanonicalPath();
		FileInputStream fis=new FileInputStream(configfilepath +"/config/property.properties");
		System.out.println(fis);
		prop.load(fis);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String dst1="report"+timeStamp;
		report= new ExtentReports(System.getProperty("user.dir")+"\\ExtentTestReports\\"+dst1+"\\ExtentReportResults.html");
	}
	
	public WebDriver launchBrowser() throws IOException, InterruptedException
	{
		String url= prop.getProperty("url");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get(url);
		Thread.sleep(5000);
		if(driver.getCurrentUrl().equals(url))
		{
			reportInfo(test, "User Should launch the url "+url+"", "User is able to launch the url "+url+"", driver);
		}
		else
		{
			reportfail(test, "User should launch the url "+url+"", "User is not able to launch the url "+url+"", driver);
		}
		
		return driver;
	}

	
	public void reportInfo(ExtentTest test,String expected,String actual,WebDriver driver)
	{
        test.log(LogStatus.INFO, expected+ ", Actual result :   " +actual  );
	}
	public void reportpass(ExtentTest test,String expected,String actual,WebDriver driver)
	{
		test.log(LogStatus.PASS, expected+  ", Actual result: "  +actual);
	}
	public void reportfail(ExtentTest test,String expected,String actual,WebDriver driver)
	{
		test.log(LogStatus.FAIL, expected+  ", Actual result: "  +actual);
	}
	
	
	
	
	@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}

}
