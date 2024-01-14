package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.Common;
import pages.createaccountpage;

public class createaccounttest {
	WebDriver driver;

	@Test

	public void test() throws InterruptedException
	{
		Common comn=new Common();


		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createaccbtn=driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));

		createaccbtn.click();

		Thread.sleep(10000);

		createaccountpage createacc=new createaccountpage(driver);
		createacc.createaccount();

	}
}
