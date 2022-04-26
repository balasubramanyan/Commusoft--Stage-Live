package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.Changeinvoice;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Download_excel_print_reports;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;
import pages.Reporting;

public class Checking extends Baseclass {
	
	String homepage;
	String customerpage ="https://stage2.commusoft.net/customers/customer/1980/view/property/view";
   String Customersreport ;
	
	
//	@Test(priority = 0)
//	public void login() throws InterruptedException
//	{
//		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
//		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
//		Thread.sleep(1000);
//		homepage = driver.getCurrentUrl();
//	}
   @Test(priority=35)
	public void changesinvoicetype() throws InterruptedException
	{
		driver.get(customerpage);
		Changeinvoice changeinvoices=new Changeinvoice(driver);
		//changeinvoices.addcustomer();
		changeinvoices.addjob();
		changeinvoices.adddiary();
		changeinvoices.add_additionalinvoice();
		changeinvoices.addfinalinvoice();
		changeinvoices.editinvoicetype();
	}	
}




