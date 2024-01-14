package uiautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileuploadusingrobotclass{

	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/seeker/registration" );
		
		WebElement upload=driver.findElement(By.xpath("//*[@class='uploadResumeContent']/i"));
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", upload);
		
		Actions act=new Actions(driver);
		act.click(upload).perform();
		
		String text = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\uploadfile.docx";
	       StringSelection stringSelection = new StringSelection(text);
	       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	       clipboard.setContents(stringSelection, stringSelection);
	       
	       Robot r=new Robot();
	       r.keyPress(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_V);
	       r.keyRelease(KeyEvent.VK_CONTROL);
	       r.keyRelease(KeyEvent.VK_V);
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	}

}
