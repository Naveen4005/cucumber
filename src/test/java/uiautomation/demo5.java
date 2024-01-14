package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//*[text()='All'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Echo')]/parent::a/i")).click();
		
		Thread.sleep(10000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Meet Alexa']")));
		
		WebElement heading=driver.findElement(By.xpath("//*[text()='Alexa Hub']"));
		
		if(heading.getText().equals("Alexa Hub")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
	}

}
