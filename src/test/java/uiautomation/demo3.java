package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bqprime.com/markets/equities/stocks-in-indices");
		Thread.sleep(10000);
		List<WebElement> table=driver.findElements(By.xpath("//table/tbody/tr"));
		for(WebElement tbl:table) {
			if(tbl.getText().contains("TATA MOTORS")) {
				System.out.println(tbl.getText());
			}
		}
		List<WebElement> table1=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement tbl1:table1) {
			if(tbl1.getText().equals("HDFC BANK")) {
				System.out.println(tbl1.getText());
			}
		}
	}

}
