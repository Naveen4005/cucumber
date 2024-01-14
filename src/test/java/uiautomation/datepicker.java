package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement firstdate=driver.findElement(By.xpath("//input[@id='first_date_picker']"));
		firstdate.click();
		
		//WebElement datepicker=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]"));
		WebElement prev_button;
		WebElement month_yearheader;
		
		String sp_date="January 2022";
		for(int i=0;i<400;i++)
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
		List<WebElement> date=driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for(WebElement ele:date)
		{
			if(ele.getText().equals("30"))
			{
				ele.click();
			}
		}
	}

}
