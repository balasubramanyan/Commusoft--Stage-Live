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
String editpage; //="https://app.commusoft.co.uk/customers/customer/1635/jobs/1669/invoices/537/view";
String jobpage; //="https://app.commusoft.co.uk/customers/customer_list/1726/jobs/1733/details/view";

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
		job.JobDescription("INVOICE");
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
		jobpage=driver.getCurrentUrl();
	    Invoice adding_invoice =new Invoice(driver);
	    adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Additional_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("No breakdown additional invoice");
	    //adding_invoice.customerreference("No breakdown");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.sub_total("800.96");
	    adding_invoice.save_invoice();
	}
	@Test(priority=5)
	public void adding_additional_invoice_breakdownbycategory() throws InterruptedException
	{
		driver.get(jobpage);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Additional_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Breakdownbycategory additional invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Breakdown_by_category();
	    adding_invoice.BreakdownByCategory_des("Labour");
	    adding_invoice.unitprice("1000");
	    adding_invoice.save_invoice();	    
	}
	@Test(priority=6)
	public void adding_additional_invoice_Fullbreakdown() throws InterruptedException
	{
		driver.get(jobpage);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Additional_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdown additional invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown();
	    adding_invoice.Full_Breakdown_des("Test1");
	    adding_invoice.unitprice_fullbreakdown("1000.653");
	    adding_invoice.save_invoice();
	    
	}	
	@Test(priority=7)
	public void adding_additional_invoice_Fullbreakdownbycategory() throws InterruptedException
	{
		driver.get(jobpage);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Additional_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdownbycategory additional invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown_by_category();
	    adding_invoice.Full_Breakdown_ByCategory_Labour_Description("Azarudeen");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Labour("1111");
	    adding_invoice.Full_Breakdown_ByCategory_Parts_Description("parts test");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Parts1("789.05");
	    adding_invoice.save_invoice();
    }
	@Test(priority=8)
	public void adding_interiminvoice_nobreakdown() throws InterruptedException
	{
		driver.get(jobpage);
	    Invoice adding_invoice =new Invoice(driver);
	    adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Interim_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("No breakdown interim invoice");
	    //adding_invoice.customerreference("No breakdown");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.sub_total("80.96");
	    adding_invoice.save_invoice();
	}
	@Test(priority=9)
	public void adding_interiminvoice_breakdownbycategory() throws InterruptedException
	{
		driver.get(jobpage);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Interim_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Breakdownbycategory interim invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Breakdown_by_category();
	    adding_invoice.BreakdownByCategory_des("Labour");
	    adding_invoice.unitprice("880.45");
	    adding_invoice.save_invoice();	     
	}
	@Test(priority=10)
	public void adding_interiminvoice_Fullbreakdown() throws InterruptedException
	{
		driver.get(jobpage);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Interim_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdown interim invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown();
	    adding_invoice.Full_Breakdown_des("Test1");
	    adding_invoice.unitprice_fullbreakdown("2000.653");
	    adding_invoice.save_invoice();
	    
	    
	}	
	@Test(priority=11)
	public void adding_interiminvoice_Fullbreakdownbycategory() throws InterruptedException
	{
		driver.get(jobpage);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Interim_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdownbycategory interim invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown_by_category();
	    adding_invoice.Full_Breakdown_ByCategory_Labour_Description("Azarudeen");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Labour("1252");
	    adding_invoice.Full_Breakdown_ByCategory_Parts_Description("parts test");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Parts1("689.05");
	    adding_invoice.save_invoice();
    }
	@Test(priority=12)
	public void adding_prefinalinvoice_nobreakdown() throws InterruptedException
	{
		driver.get(jobpage);
	    Invoice adding_invoice =new Invoice(driver);
	    adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Pre_Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("No breakdown prefinal invoice");
	    //adding_invoice.customerreference("No breakdown");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.sub_total("80.96");
	    adding_invoice.save_invoice();
	}
	@Test(priority=13)
	public void adding_prefinalinvoice_breakdownbycategory() throws InterruptedException
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
	    adding_invoice.Pre_Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Breakdownbycategory prefinal invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Breakdown_by_category();
	    adding_invoice.BreakdownByCategory_des("Labour");
	    adding_invoice.unitprice("2006");
	    adding_invoice.save_invoice();	    
	}
	@Test(priority=14)
	public void adding_prefinalinvoice_Fullbreakdown() throws InterruptedException
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
	    adding_invoice.Pre_Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdown prefinal invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown();
	    adding_invoice.Full_Breakdown_des1("Test1");
	    adding_invoice.unitprice_fullbreakdown("1091.89");
	    adding_invoice.save_invoice();
	    
	}	
	@Test(priority=15)
	public void adding_prefinalinvoice_Fullbreakdownbycategory() throws InterruptedException
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
	    adding_invoice.Pre_Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdownbycategory prefinal invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown_by_category();
	    adding_invoice.Full_Breakdown_ByCategory_Labour_Description("Azarudeen");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Labour("1111");
	    adding_invoice.Full_Breakdown_ByCategory_Parts_Description("parts test");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Parts1("789.05");
	    adding_invoice.save_invoice();
    }
	@Test(priority=16)
	public void adding_finalinvoice_nobreakdown() throws InterruptedException
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
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("No breakdown final invoice");
	    //adding_invoice.customerreference("No breakdown");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.sub_total("80.96");
	    adding_invoice.save_invoice();
	}
	@Test(priority=17)
	public void adding_finalinvoice_breakdownbycategory() throws InterruptedException
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
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Breakdownbycategory final invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Breakdown_by_category();
	    adding_invoice.BreakdownByCategory_des("Labour");
	    adding_invoice.unitprice("2006");
	    adding_invoice.save_invoice();	    
	}
	@Test(priority=18)
	public void adding_finalinvoice_Fullbreakdown() throws InterruptedException
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
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdown final invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown();
	    adding_invoice.Full_Breakdown_des1("Test1");
	    adding_invoice.unitprice_fullbreakdown("1091.89");
	    adding_invoice.save_invoice();
	    
	}	
	@Test(priority=19)
	public void adding_finalinvoice_Fullbreakdownbycategory() throws InterruptedException
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
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdownbycategory final invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown_by_category();
	    adding_invoice.Full_Breakdown_ByCategory_Labour_Description("Azarudeen");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Labour("1111");
	    adding_invoice.Full_Breakdown_ByCategory_Parts_Description("parts test");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Parts1("789.05");
	    adding_invoice.save_invoice();
    }
	
  }
