package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover_mouseactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement ele=driver.findElement(By.linkText("SIGN-ON"));
		
		Actions act=new Actions(driver);
        
		act.moveToElement(ele).perform();
		Thread.sleep(3000);

	}

}
