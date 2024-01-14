package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele= driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", ele);


	}

}
