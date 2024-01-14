package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);

		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();



	}

}
