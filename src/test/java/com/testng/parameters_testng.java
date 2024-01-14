package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters_testng {

	
	@Parameters({"url","username"})
	@Test
	public void launchurl(String URL,String username)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(username);
	}
}
