package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	
	public static WebDriver startapplication(WebDriver driver,String browser, String URL)
	{
		if(browser.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}else
			if(browser.contains("firefox"))
			{
			//	System.setProperty("webdriver.","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else
				if(browser.contains("Edge"))
				{
					System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
					driver = new EdgeDriver();
				}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}
	
}
