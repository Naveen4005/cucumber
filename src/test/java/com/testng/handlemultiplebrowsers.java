package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class handlemultiplebrowsers {
	WebDriver driver;
	@Parameters({"browsername","url"})
	@Test
	public void multiplebrowsertest(String browser,String url)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get(url);
System.out.println("chrome launched");

		}
			
		else if(browser.equals("edge"))
		{
		     driver=new EdgeDriver();
		     driver.get(url);
		     System.out.println("edge launched");

		}
	}

}
