package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> print1=driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		for(WebElement pr:print1) {
			if(pr.getText().equals("Google") || pr.getText().equals("Italy") ) {
				System.out.println(pr.getText());
			}
		}
		WebElement print2=driver.findElement(By.xpath("(//table)[2]/tfoot/tr"));
		
			
				System.out.println(print2.getText());
			
		
		
	}

}
