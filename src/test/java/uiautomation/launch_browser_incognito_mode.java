package uiautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class launch_browser_incognito_mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("incognito");
	    WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize(); // to maximize the browser window 
		driver.get("https://demo.guru99.com/test/newtours/register.php");

	}

}
