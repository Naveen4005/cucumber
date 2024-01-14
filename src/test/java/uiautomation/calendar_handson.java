package uiautomation;

import java.util.List;

import org.apache.poi.ss.formula.functions.MultiOperandNumericFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar_handson {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(10000);
		WebElement sixthdatecalendaricon=driver.findElement(By.xpath("//*[@title='Calendar-icon']"));
		sixthdatecalendaricon.click();
		WebElement prev_button;
		WebElement month_yearheader;
		
		String sp_date="December 2022";
		for(int i=0;i<100;i++)
		{
			try {
				prev_button=driver.findElement(By.xpath("//a[@title='Prev']"));
				month_yearheader=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div"));
				} catch (StaleElementReferenceException e) {
				  // Refresh the page
				  driver.navigate().refresh();

				  // Try to locate the element again
				  prev_button = driver.findElement(By.xpath("//a[@title='Prev']"));
				  month_yearheader=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div"));
				}

			
			
			if(!month_yearheader.getText().equals(sp_date))
			{
				prev_button.click();
				Thread.sleep(2000);
			}
		}
		
		
		
		List<WebElement> date=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement ele:date)
		{
			if(ele.getText().equals("30"))
			{
				ele.click();
			}
		}
              }
}
