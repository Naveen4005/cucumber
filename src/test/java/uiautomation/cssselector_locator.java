package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector_locator {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.cssSelector("#vfb-5")).sendKeys("Naveen");
		driver.findElement(By.cssSelector("input[name='vfb-7']")).sendKeys("Reddy");
		
		
	}

}
