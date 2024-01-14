package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class differentmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// Get Title
		String title=driver.getTitle();
		System.out.println("Title of page is: "+title);
		
		// Get Page Source
		String pagesource=driver.getPageSource();
		System.out.println("Page source of page is : "+pagesource);
		if(pagesource.contains("for a celebrity, brand or business."))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		WebElement ele= driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a"));
		// Get Text
		String str=ele.getText();
		System.out.println("text is: "+str);
		WebElement username=driver.findElement(By.xpath("//*[@name='email']"));
		String expected="Naveen";
		username.sendKeys(expected);
		
		//GET Attribute
		String val=username.getAttribute("value");
		System.out.println(val);
		if(expected.equals(val))
		{
			System.out.println("user is able to enter the data into textbox");
		}
		else
		{
			System.out.println("user is not able to enter the data into textbox");
		}
		String str1=username.getAttribute("name");
		System.out.println(str1);
		
		boolean flag=username.isDisplayed();
		boolean flag1=username.isEnabled();
		System.out.println(flag);
		System.out.println(flag1);
		
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(5000);
		
		WebElement femaleradiobtn=driver.findElement(By.xpath("//input[@value='1']"));
		boolean flag2=femaleradiobtn.isSelected();
		System.out.println("status of checkbox before click :"+flag2);
		femaleradiobtn.click();
		boolean flag3=femaleradiobtn.isSelected();
		System.out.println("status of checkbox after click :"+flag3);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current URL is :"+currenturl);

		
	}
	
	

}
