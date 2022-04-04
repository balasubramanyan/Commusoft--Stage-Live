package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Customer;
import pages.LoginPage;

public class Karna_Customer extends Baseclass{
	
	public String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority=1)
	public void add() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Add_Customer();
		customer.Edit_Customers();
		customer.Delete_Customers();
		
		
		
		
		
		
		
		
	}
	
	
	

}
