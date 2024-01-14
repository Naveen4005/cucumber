package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		Thread.sleep(10000);
		
		List<WebElement> tbl=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement table:tbl) {
			System.out.println(table.getText());
		}
		for(WebElement table2:tbl) {
			if(table2.getText().equals("English") || table2.getText().equals("Euro")) {
				System.out.println(table2.getText());
			}
		}
		List<WebElement> tbl1=driver.findElements(By.xpath("//table/tbody/tr"));
		for(WebElement table1:tbl1) {
			if(table1.getText().contains("India") || table1.getText().contains("Nepal")) {
				System.out.println(table1.getText());
			}
		}
	}

}
