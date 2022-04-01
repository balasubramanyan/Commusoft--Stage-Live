package testcase_US;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action_US.Baseclass_US;
import pages.LoginPage;
import pages_US.Changeinvoice_US;

public class Changeinvoicetype_US extends Baseclass_US
{

	public String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl(); 
	}
	//@Test(priority=1)
	public void changesinvoicetype() throws InterruptedException
	{
		//driver.get(customerpage);
		Changeinvoice_US changeinvoices=new Changeinvoice_US(driver);
		changeinvoices.addcustomer();
		changeinvoices.addjob();
		changeinvoices.adddiary();
		changeinvoices.add_additionalinvoice();
		changeinvoices.addfinalinvoice();
		changeinvoices.editinvoicetype();
	}
	
}
