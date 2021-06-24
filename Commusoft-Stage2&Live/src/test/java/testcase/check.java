package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Browsers;

public class check extends Browsers {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ranjit-316\\eclipse-workspace\\RanjitCommu\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://stage.commusoft.net/");
		driver.findElement(By.id("logintype_clientid")).sendKeys("16008");
		driver.findElement(By.id("logintype_username")).sendKeys("ranjit");
		driver.findElement(By.id("logintype_password")).sendKeys("welcome123");
		driver.findElement(By.xpath("//button[@id='successful-login']")).click();
		
		
	}

}
