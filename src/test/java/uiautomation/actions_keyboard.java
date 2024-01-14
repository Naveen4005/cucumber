package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		driver.findElement(By.name("firstName")).sendKeys("test");
		
		Actions act=new Actions(driver);
		// CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CTRL+X
		act.keyDown(Keys.CONTROL);
		act.sendKeys("X");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		act.perform();
		
		//CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		
		
		
		


	}

}
