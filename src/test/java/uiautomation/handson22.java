package uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handson22 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		WebElement text=driver.findElement(By.xpath("//*[contains(text(), 'Please enter two digits')]"));
		String expected="Please enter two digits as displayed in Example *";
		if(text.getText().equals(expected)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		System.out.println("text is : " + text.getText());

	}

}
