package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;

public class Checking extends Baseclass {
	
	String homepage;
   
	
	
//	@Test(priority = 0)
//	public void login() throws InterruptedException
//	{
//		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
//		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
//		Thread.sleep(1000);
//		homepage = driver.getCurrentUrl();
//	}
//	@Test(priority = 1)
//	public void Addpayment_job() throws InterruptedException
//	{
//		driver.get("https://app.commusoft.co.uk/customers/customer/1045/view/property/view");
//		Thread.sleep(4000);
//		CreateJob job = new CreateJob(driver);
//		job.addjob();
//		job.JobDescription("No Rules");
//		job.createjob();
//		Thread.sleep(4000);
//		Invoice invoice = new Invoice(driver);
//		invoice.InvoiceTab();
//		invoice.addinvoice();
//		invoice.Pre_Final_invoice();
//		invoice.Invoice_Breakdown_Full_breakdown();
//		invoice.invoice_description();
//		invoice.Full_Breakdown_des("Price 1");
//		invoice.invoice_UserGroup();
//		invoice.invoice_Category();
//		invoice.save_invoice();
//		NotesandCommunication communication = new NotesandCommunication(driver);
//		communication.emailinvoice();
//		communication.printinvoice();
//		invoice.invoice_AddnewPayment();
//		invoice.invoice_payment_AddDescription();
//		invoice.invoice_payment_method();
//		invoice.invoice_payment_nominalcode();
//		invoice.invoice_payment_amount();
//		invoice.invoice_paymeny_save();
//	}
	@Test
	public void SlackCommusoft() throws IOException {
		// TODO Auto-generated method stub
		super.SlackCommusoft();
	}
		
}



