package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chromebrowserlaunchtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//for chrome
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstName']"));
		firstname.sendKeys("Naveen");
		driver.findElement(By.name("lastName")).sendKeys("Reddy");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("userName")).sendKeys("test@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("4567");
//		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("01234");
		//driver.findElement(By.linkText("SUPPORT")).click();
		//driver.findElement(By.partialLinkText("PPORT")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		sel.selectByVisibleText("ZAMBIA");
		
		Thread.sleep(5000);
		sel.selectByValue("ANDORRA");
		
		Thread.sleep(5000);
		sel.selectByIndex(0);
		
		Thread.sleep(5000);
		
		Select aus=new Select(driver.findElement(By.name("country")));
		aus.selectByValue("AUSTRALIA");
		
		Thread.sleep(5000);
		aus.selectByIndex(18);
		
		Thread.sleep(5000);
		aus.selectByVisibleText("CANADA");

		
		
		
		
		

		//driver.findElement(By.xpath("(//a[@href='support.php'])[5]")).click();

		
		

	}

}
