package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class try_catch_handson {

	public static void main(String[] args) {

		try {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.highradius.com/");
			
			WebElement product= driver.findElement(By.xpath("//a[text()='Prod']"));
			product.click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
