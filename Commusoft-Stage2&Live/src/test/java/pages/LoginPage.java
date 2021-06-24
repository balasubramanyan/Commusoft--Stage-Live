package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import action.Baseclass;


public class LoginPage extends Baseclass {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver =ldriver;
	}
	
	@FindBy(id="logintype_clientid") WebElement clientid;
	@FindBy(id="logintype_username") WebElement clientusername;
	@FindBy(id="logintype_password") WebElement clientpassword;
	@FindBy(xpath="//button[@id='successful-login']") WebElement submit;


	
	public void login(String id,String username,String pass ) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clientid.sendKeys(id);
		clientusername.sendKeys(username);
		clientpassword.sendKeys(pass);
		submit.click();
	}
	
	
	
}
