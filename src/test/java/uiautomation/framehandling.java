package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		//WebElement xpath=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		//driver.switchTo().frame(xpath);
		driver.switchTo().frame("frame2");
		Select animals=new Select(driver.findElement(By.id("animals")));
		animals.selectByVisibleText("Avatar");
        //driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();		
		driver.switchTo().frame("iamframe");
		System.out.println("switched to frame");
		WebElement textbox=driver.findElement(By.xpath("//*[@type='text']"));
		textbox.sendKeys("data");
		driver.switchTo().frame("frame3");
		WebElement checkbox=driver.findElement(By.id("a"));
		checkbox.click();
       // driver.switchTo().parentFrame();  // switched to frame1
        //driver.switchTo().parentFrame();  // will come outside
		driver.switchTo().defaultContent();
		
		
	}
}
