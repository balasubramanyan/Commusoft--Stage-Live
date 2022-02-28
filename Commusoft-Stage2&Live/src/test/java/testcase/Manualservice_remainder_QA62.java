package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.LoginPage;
import pages.QA62_Serviceremainder;

public class Manualservice_remainder_QA62 extends Baseclass{
	
	public String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl(); 
	}
	@Test(priority = 1)
	public void ser_remainder() throws InterruptedException
	{
		driver.get(homepage);
		QA62_Serviceremainder Service_remainder =new QA62_Serviceremainder(driver);
		Service_remainder.view_all_serviceremainder();
		Service_remainder.enable_checkbox();
		Service_remainder.process_remainder_btn();
		Service_remainder.print_icon();
		Service_remainder.notification();
		Service_remainder.assertion_serviceremain();	
	}
}