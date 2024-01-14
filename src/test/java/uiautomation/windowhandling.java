package uiautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		Thread.sleep(3000);
		
		String parent=driver.getWindowHandle();
		
		Set<String> childs=driver.getWindowHandles();
		
		for(String child:childs)
		{
			
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println("child title is : "+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent title is : "+driver.getTitle());

	}

}
