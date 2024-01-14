package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.highradius.com/");
		
		WebElement product= driver.findElement(By.xpath("//a[text()='Products']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(product).perform();
		
		WebElement treasury=driver.findElement(By.xpath("//h3/span[contains(text(),'Treasury')]"));

		act.moveToElement(treasury).perform();
		
		WebElement link3=driver.findElement(By.xpath("//*[@data-sub=\"Forecasting-tab\"]"));
		
		act.moveToElement(link3).perform();
		Thread.sleep(20000);
		
		String expected="An advanced system with self-service modules and Al to provide accurate cash flow forecasts";

		
		String str=driver.getPageSource();
		if(str.trim().contains("advanced system"))
		{
			System.out.println("passed via pagesource");
		}
		else
		{
			System.out.println("failed");
		}

		
		
		WebElement text=driver.findElement(By.xpath("//*[contains(text(),' modules and Al to provide')]"));
		String actualtext=text.getText();
		Thread.sleep(10000);
		System.out.println(actualtext);
		if(expected.equals(actualtext.trim()))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
	}

}
