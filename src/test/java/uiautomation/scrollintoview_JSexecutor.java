package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoview_JSexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Help']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true);",ele);

	}

}
