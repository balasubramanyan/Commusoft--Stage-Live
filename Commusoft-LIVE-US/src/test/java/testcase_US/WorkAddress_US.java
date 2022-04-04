package testcase_US;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import action_US.Baseclass_US;
import pages.CreateJob;
import pages.Customer;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;
import pages_US.CreateJob_US;
import pages_US.Customer_US;
import pages_US.Estimate_US;
import pages_US.Invoice_US;
import pages_US.NotesandCommunication_US;

public class WorkAddress_US extends Baseclass_US {
	
	public String WA;
	public String homepage;

	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(15000);
		homepage = driver.getCurrentUrl();
	}
@Test(priority = 1)
	public void Add_Customer() throws InterruptedException
	{
		Customer_US customer = new Customer_US(driver);
		customer.Customer_create();
		customer.Customer_title();
		customer.Customer_Name();
		customer.Customer_SurName();
		customer.Customer_Mobile();
		customer.Customer_email();
		customer.Customer_AddressLine1();
		customer.Customer_Save();
		Thread.sleep(20000);
		customerpage = driver.getCurrentUrl();
	}
@Test(priority = 2)
	public void Workaddress_Add() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(5000);
		Customer_US customer = new Customer_US(driver);
		customer.workaddress_tab();
		customer.workaddress_addnewWorkaddress();
		customer.Workaddress_create();
		Thread.sleep(6000);
		WA = driver.getCurrentUrl();
		
	}
@Test(priority = 3)
	public void WA_Add_job_Prefinal() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(4000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("PreFinal");
		//job.createjob();
	}
@Test(priority = 4)
	public void WA_Addpayment_job() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(4000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(4000);
		Invoice_US invoice = new Invoice_US(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Pre_Final_invoice();
		invoice.Invoice_Breakdown_Full_breakdown();
		invoice.invoice_description();
		invoice.Full_Breakdown_des("Price one");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.save_invoice();
		NotesandCommunication_US communication = new NotesandCommunication_US(driver);
		communication.emailinvoice();
		communication.printinvoice();
		invoice.invoice_AddnewPayment();
		invoice.invoice_payment_AddDescription();
		invoice.invoice_payment_method();
		invoice.invoice_payment_nominalcode();
		invoice.invoice_payment_amount();
		invoice.invoice_paymeny_save();
	}
@Test(priority = 5)
	public void WA_Estimate_Accept() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(5000);
		Estimate_US estimate = new Estimate_US(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		Thread.sleep(3000);
		estimate.Estimate_Price_tab();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
		Thread.sleep(6000);
	}
}
