package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("https://www.nirmalbang.com/static/stock-market-holidays.aspx");
		
		List<WebElement> rows=driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		
//		for(WebElement ele:rows)
//		{
//			if(ele.getText().contains("Holi"))
//			{
//			System.out.println(ele.getText());
//			}
//		}
		
		for(int i=0;i<rows.size();i++)
		{
			System.out.println(rows.get(i).getText());
		}
		
		


	}

}
