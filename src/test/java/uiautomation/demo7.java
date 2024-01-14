package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("abcd");
		
		WebElement lastname=driver.findElement(By.name("RESULT_TextField-2"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='xyz';", lastname);
		
		WebElement phone=driver.findElement(By.id("RESULT_TextField-3"));
		js.executeScript("arguments[0].style.border='3px solid red';", phone);
		js.executeScript("arguments[0].style.background='yellow'", phone);
		js.executeScript("arguments[0].value='123456789'", phone);
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		
		WebElement city=driver.findElement(By.id("RESULT_TextField-5"));
		
		Actions act=new Actions(driver);
		act.sendKeys(city, "Hyderabad").perform();
		
		WebElement Email=driver.findElement(By.id("RESULT_TextField-6"));
		
		act.sendKeys(Email, "xyz@gmail.com").perform();
		
		WebElement gender=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		
		act.click(gender).perform();
		Thread.sleep(5000);
		
		WebElement week1=driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_0\"]"));
		js.executeScript("arguments[0].click();", week1);
		
		WebElement week=driver.findElement(By.xpath("//input[@value='CheckBox-6']"));
		
		js.executeScript("arguments[0].click();", week);
		
		WebElement week2=driver.findElement(By.xpath("//input[@value='CheckBox-5']"));
		act.click(week2).perform();
		
		Select time=new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
		time.selectByValue("Radio-2");
		
		Thread.sleep(10000);
		time.selectByIndex(2);
		
		Thread.sleep(5000);
		time.selectByVisibleText("Morning");
	}

}
