package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		String title=driver.getTitle();  // to get title of a page
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		String alerttext=driver.switchTo().alert().getText();

		//Thread.sleep(10000);
		driver.switchTo().alert().accept(); //to accept the alert
		System.out.println(alerttext);
		
		driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//Thread.sleep(10000);
		driver.switchTo().alert().dismiss(); //to dismiss the alert
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Givingdata");
		Thread.sleep(15000);
		driver.switchTo().alert().accept();
		
		//driver.close(); // to close the current browser window
		
		driver.quit();   // to close all the browser windows
		
		

	}

}
