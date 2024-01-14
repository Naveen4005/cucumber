package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import common.Common;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Common comn=new Common();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createaccbtn=driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
		
		comn.click(createaccbtn,driver,"createAccount Button");
		
		Thread.sleep(3000);
		
		WebElement firstname=driver.findElement(By.xpath("//*[@aria-label=\"First name\"]"));
		
		comn.entertext(firstname, "ABCD",driver,"firstname");
		
		
//		driver.findElement(By.xpath("//*[@aria-label=\"First name\"]")).sendKeys("ABCD");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@name='lastname']"));
		
		comn.entertext(firstname, "EFGH",driver,"firstname");
//		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("EFGH");
		
		WebElement email=driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
		
		comn.entertext(email, "abc@email.com",driver,"email");
				
//		driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("123456789");
		
		WebElement password=driver.findElement(By.xpath("(//*[@type='password'])[2]"));
		
		comn.entertext(password, "123456789",driver,"password");
		
//		driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("00112233");
		
		Select date=new Select(driver.findElement(By.xpath("//*[@title='Day']")));
		
		date.selectByIndex(14);
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		month.selectByVisibleText("Apr");
		
		Select year=new Select(driver.findElement(By.id("year")));
		
		year.selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}

}
