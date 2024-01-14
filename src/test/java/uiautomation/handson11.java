package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handson11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		String text=driver.getPageSource();
		if(text.contains("Copyright"))
		{
			System.out.println("line is : "+ text);
		}
		
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'2018-2023')]"));
		if(ele.isDisplayed())
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		System.out.println(ele.getText());
		

	}

}
