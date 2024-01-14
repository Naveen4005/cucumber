package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(5000);
//		String text=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]")).getText();
//		System.out.println(text);
		
		List<WebElement> rows=driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		for(WebElement ele:rows)
		{
			if(ele.getText().contains("Austria"))
			{
				System.out.println(ele.getText());
			}
		}
		
	}

}
