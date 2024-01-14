package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement button=driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
		
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(10000);
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
		js.executeScript("arguments[0].value='xyz';", firstname);
		
		WebElement lastname=driver.findElement(By.xpath("//*[@name='lastname']"));
		js.executeScript("arguments[0].value='abc';", lastname);
		
		WebElement regmail=driver.findElement(By.xpath("//*[@name='reg_email__']"));
		js.executeScript("arguments[0].value='abc@gmail.com';", regmail);
		
		WebElement password=driver.findElement(By.id("password_step_input"));
		js.executeScript("arguments[0].value='123456';", password);
		
		Select date=new Select(driver.findElement(By.id("day")));
		
		date.selectByIndex(14);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("4");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click();", gender);
		
		
	}

}
