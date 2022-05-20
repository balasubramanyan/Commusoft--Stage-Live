package utility;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import io.testproject.sdk.drivers.ReportType;
//import io.testproject.sdk.drivers.web.ChromeDriver;
//import io.testproject.sdk.internal.exceptions.AgentConnectException;
//import io.testproject.sdk.internal.exceptions.InvalidTokenException;
//import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;

public class Browsers {

	
	public static WebDriver startapplication(WebDriver driver,String browser, String URL) throws InvalidTokenException, AgentConnectException, IOException, ObsoleteVersionException
	{
		if(browser.contains("chrome"))
		{
//			WebDriverManager.chromiumdriver().setup();
//			driver = new ChromeDriver("ADyTKoTTMsKCn689r5CRlRkeBTXfyI9o_bvsCufZOfQ1",new ChromeOptions(),ReportType.CLOUD_AND_LOCAL);

//		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
		
		//linux
		
			 driver = WebDriverManager.chromedriver().create();
		
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
