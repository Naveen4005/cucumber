package uiautomation;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("xyz");
		
		driver.findElement(By.name("lastName")).sendKeys("abc");
		
		driver.findElement(By.name("phone")).sendKeys("123456789");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement mail=driver.findElement(By.id("userName"));
		js.executeScript("arguments[0].value='abc@gmail.com'", mail);
		
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("0-00-0");
		
		driver.findElement(By.name("city")).sendKeys("asdf;lkj");
		
		driver.findElement(By.name("state")).sendKeys("where");
		
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByValue("CANADA");
		
		driver.navigate().back();
		
		List<WebElement> rows=driver.findElements(By.xpath("((//table)[10]/tbody/tr)[3]/td/table/tbody/tr"));
		
		for(WebElement d1:rows) {
			System.out.println(d1.getText());
		}
	}

}
