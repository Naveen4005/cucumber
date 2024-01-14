package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hyrtutorials {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys("Naveen");
		Thread.sleep(5000);
		
		WebElement lastname=driver.findElement(By.id("lastName"));
		Actions act=new Actions(driver);
		act.sendKeys(lastname, "Reddy").perform();
		
		WebElement gender=driver.findElement(By.id("femalerb"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", gender);
		
		WebElement english=driver.findElement(By.id("englishchbx"));
		WebElement hindi=driver.findElement(By.id("hindichbx"));
		WebElement chinese=driver.findElement(By.id("chinesechbx"));
		WebElement spanish=driver.findElement(By.id("spanishchbx"));
		WebElement latin=driver.findElement(By.id("latinchbx"));
		WebElement french=driver.findElement(By.id("frenchchbx"));
		
		english.click();
		act.click(hindi).perform();
		js.executeScript("arguments[0].click();", chinese);
		spanish.click();
		latin.click();
		french.click();
		
		WebElement email=driver.findElement(By.id("email"));
		act.sendKeys(email, "abc@gmail.com").perform();
		
		WebElement password=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='123456';", password);

	}

}
