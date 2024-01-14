package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		String alerttext = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		System.out.println(alerttext);
		
		driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		String alerttext2 = driver.switchTo().alert().getText();
		System.out.println(alerttext2);
		driver.switchTo().alert().sendKeys("Enter Data");
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
