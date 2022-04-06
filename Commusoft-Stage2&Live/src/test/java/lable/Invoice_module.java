package lable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.Invoice;
import pages.LoginPage;

public class Invoice_module extends Baseclass
{
String invoicepage;
String editpage="https://app.commusoft.co.uk/customers/customer/1635/jobs/1669/invoices/537/view";

	@Test(priority = 1)
	public void add_invoice() throws InterruptedException
	{
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_Landline();
	    invoice.Customer_Mobile();
	    invoice.Customer_AddressLine1();
	    invoice.Customer_AddressLine2();
	    invoice.Customer_AddressLine3();
	    invoice.Customer_town();
	    invoice.Customer_Save();
	    Thread.sleep(4000);
	    customerpage=driver.getCurrentUrl();
	    driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");
	    Invoice adding_invoice =new Invoice(driver);
	    adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.sub_total("150.84");
	    adding_invoice.save_invoice();
	    invoicepage=driver.getCurrentUrl();
	}
	@Test(priority=2)
	public void edit_invoice() throws InterruptedException
	{
	    Invoice Edit_invoice =new Invoice(driver);
        //driver.get(editpage);
        Edit_invoice.editinvoice();
        Edit_invoice.Interim_invoice();
        Edit_invoice.clear_invoice_description();
        Edit_invoice.edit_invoice_description("Edited invoice");
        Edit_invoice.invoice_notes();
        //Edit_invoice.customerreference();
        Edit_invoice.editinvoice_Category();
        Edit_invoice.editinvoice_UserGroup();
        Edit_invoice.Invoice_Breakdown_Breakdown_by_category();
        Edit_invoice.Confirm_box();
        Edit_invoice.BreakdownByCategory_des("Parts");
        Edit_invoice.unitprice("100");
        Edit_invoice.save_invoice();  
	}
	@Test(priority=3)
	public void delete_invoice()	
	{
		Invoice Delete_invoice =new Invoice(driver);
		Delete_invoice.delete_inv();	
	}
	@Test(priority=4)
	public void adding_additional_invoice_nobreakdown() throws InterruptedException
	{
		driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_Landline();
	    invoice.Customer_Mobile();
	    invoice.Customer_AddressLine1();
	    invoice.Customer_AddressLine2();
	    invoice.Customer_AddressLine3();
	    invoice.Customer_town();
	    invoice.Customer_Save();
	    Thread.sleep(4000);
	    customerpage=driver.getCurrentUrl();
	    driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");
	    Invoice adding_invoice =new Invoice(driver);
	    adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Additional_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.sub_total("800.96");
	    adding_invoice.save_invoice();
	}
	
	
}
