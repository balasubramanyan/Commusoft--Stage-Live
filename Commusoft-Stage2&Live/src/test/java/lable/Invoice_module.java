package lable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;

public class Invoice_module extends Baseclass
{
String invoicepage;
String editpage; //="https://app.commusoft.co.uk/customers/customer/1635/jobs/1669/invoices/537/view";
String jobpage="https://app.commusoft.co.uk/customers/customer_list/1726/jobs/1733/details/view";
String customerpage;//="https://app.commusoft.co.uk/customers/customer/1922/view/property/view";
String payment;
String editpay; //= "https://app.commusoft.co.uk/customers/customer_list/2082/jobs/2274/invoices/1084/payment/142/edit";
String additionalinvoiceurl; //="https://app.commusoft.co.uk/customers/customer_list/2231/jobs/2754/invoices/1277/view";
String interiminvoiceurl;
String Prefinalinvoice;
String Finalinvoiceurl;
String retention;
public String invoicenumber;
String Amountpaid;
String Grandtotal;
String Remainderamountpay;

	/*@Test(priority = 1)
	public void add_invoice() throws InterruptedException
	{
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
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
		invoice.Customer_email();
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
	    adding_invoice.save_invoice1();	
	    additionalinvoiceurl=driver.getCurrentUrl();
	    
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
	    adding_invoice.save_invoice1();
	    interiminvoiceurl=driver.getCurrentUrl();
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
		invoice.Customer_email();
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
		invoice.Customer_email();
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
		invoice.Customer_email();
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
	    adding_invoice.save_invoice1();
	    Prefinalinvoice=driver.getCurrentUrl();
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
		invoice.Customer_email();
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
		invoice.Customer_email();
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
	    adding_invoice.save_invoice1();	    
	    Finalinvoiceurl=driver.getCurrentUrl();
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
		invoice.Customer_email();
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
		invoice.Customer_email();
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
	    adding_invoice.save_invoice1();
	    payment= driver.getCurrentUrl();
	    invoicenumber=gettext("(//span[@class='ng-scope ng-binding'])[2]");
	    System.out.println(invoicenumber);
    }
	@Test(priority=20)
	public void Draftinvoice_to_invoice() throws InterruptedException
		{
		driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
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
	    adding_invoice.draft_invoice();
	    adding_invoice.save_invoice();
	    adding_invoice.convert_draftinvoice();
		}
	@Test(priority=21)
	public void Prefinalinvoice_to_Finalinvoice() throws InterruptedException
	{
		driver.get(Prefinalinvoice);
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.editinvoice();
		adding_invoice.Final_invoice();
		adding_invoice.save_invoice();
	}
    @Test(priority=22)	
    public void Externalinvoice_use_as_invoiceaddress() throws InterruptedException
	{
    	driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
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
		Invoice adding_invoice =new Invoice(driver);
		adding_invoice.quick_links();
		adding_invoice.invoiceaddresses();
		adding_invoice.addnewinvoiceaddress();
		adding_invoice.searchinvoiceaddress("yes");
		adding_invoice.addnewinvoiceaddress();
		adding_invoice.invoiceaddress();
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");
		adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes1("Fullbreakdownbycategory final invoice");
	    //adding_invoice.customerreference("breakdown by category");
	    adding_invoice.invoiceaddress2();
	    adding_invoice.invoice_Category();
	    adding_invoice.invoice_UserGroup();
	    adding_invoice.Invoice_Breakdown_Full_breakdown_by_category();
	    adding_invoice.Full_Breakdown_ByCategory_Labour_Description("Azarudeen");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Labour("1111");
	    adding_invoice.Full_Breakdown_ByCategory_Parts_Description("parts test");
	    adding_invoice.unitprice_FullBreakdown_ByCategory_Parts1("789.05");
	    adding_invoice.save_invoice();
	}
    @Test(priority=23)	
    public void workaddress_As_invoiceaddress() throws InterruptedException
    {
    	driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
		invoice.Customer_Landline();
	    invoice.Customer_Mobile();
	    invoice.Customer_AddressLine1();
	    invoice.Customer_AddressLine2();
	    invoice.Customer_AddressLine3();
	    invoice.Customer_town();
	    invoice.Customer_Save();
	    Thread.sleep(4000);
	    invoice.workaddress_tab();
	    invoice.workaddress_addnewWorkaddress();
	    invoice.Workaddress_create();
	    Invoice adding_invoice =new Invoice(driver);
	    adding_invoice.enable_invoice_address();
	    CreateJob WAjob=new CreateJob(driver);
	    WAjob.addjob();
	    WAjob.JobDescription("PreFinal");
	    adding_invoice.InvoiceTab();
	    adding_invoice.addinvoice();
	    adding_invoice.Final_invoice();
	    adding_invoice.invoice_description();
	    adding_invoice.invoice_notes();
	    adding_invoice.invoiceaddress2();
	    adding_invoice.invoice_Category();
	    adding_invoice.Invoice_Breakdown_No_Breakdown();
	    adding_invoice.sub_total("1000");
	    adding_invoice.save_invoice();
	    }
    
   @Test(priority=24)
    public void invoicepaymentadd() throws InterruptedException
    {
    	driver.get(payment);
    	Invoice addpayment=new Invoice(driver);
    	addpayment.invoice_AddnewPayment();
    	addpayment.invoice_payment_AddDescription("Partial payment");
    	addpayment.payment_reference("azarudeen-payment");
    	addpayment.invoice_payment_method();
    	addpayment.invoice_payment_nominalcode();
    	addpayment.invoice_payment_amount("985.83");
    	addpayment.invoice_paymeny_save();			
    	Thread.sleep(2000);
    }
    @Test(priority=25)
    public void invoicepaymentedit() throws InterruptedException
    {
    	//driver.get(editpay);
    	Invoice editpayment=new Invoice(driver);
    	editpayment.view_payment();
    	editpayment.Editpayment();
    	editpayment.invoice_payment_editDescription();
    	editpayment.editpayment_reference();
    	editpayment.editinvoice_payment_method();
    	editpayment.invoice_payment_amount1();
    	editpayment.invoice_paymeny_save();
   	}
    @Test(priority=26)
    public void invoicepaymentdelete()
    {
    	Invoice deletepayment=new Invoice(driver);
    	deletepayment.Deletepay();
    	deletepayment.confirmdelete();
    	deletepayment.delete_button();

    }
    @Test(priority=27)
    public void Finalinvoice_from_jobinfobar() throws InterruptedException
    {
    	driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
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
		job.JobDescription("No Rules");
		job.edit_job();
		job.complete_job();
		Invoice finalinvoice=new Invoice(driver);
		finalinvoice.Raisefinalinvoice();
		finalinvoice.invoice_description();
		finalinvoice.invoice_notes();
		finalinvoice.invoice_Category();
		finalinvoice.Invoice_Breakdown_No_Breakdown();
		finalinvoice.sub_total("5000");
		finalinvoice.save_invoice();
		
    }
    @Test(priority=28)
    public void Automatic_prefinalinvoice() throws InterruptedException
    {
    	driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
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
		job.JobDescription1("Auto prefinal");
		Invoice autopre = new Invoice(driver);
		autopre.InvoiceTab();
		autopre.assertionprefinal();				
    }
    @Test(priority=29)
    public void Additionalinvoice_print_email() throws InterruptedException
   
    {
    	driver.get(additionalinvoiceurl);
    	Invoice email_print=new Invoice(driver);
    	email_print.invoice_communication_email();
    	email_print.invoice_communication_print();
    	email_print.closeprint();
    	email_print.verifyprint();
    }
    @Test(priority=30)
    public void interiminvoice_print_email() throws InterruptedException
   
    {
    	driver.get(interiminvoiceurl);
    	Invoice email_print=new Invoice(driver);
    	email_print.invoice_communication_email();
    	email_print.invoice_communication_print();
    	email_print.closeprint();
    	email_print.verifyprint();
    }
    @Test(priority=31)
    public void prefinalinvoice_print_email() throws InterruptedException
   
    {
    	driver.get(Prefinalinvoice);
    	Invoice email_print=new Invoice(driver);
    	email_print.invoice_communication_email();
    	email_print.invoice_communication_print();
    	email_print.closeprint();
    	email_print.verifyprint();
    }
    @Test(priority=32)
    public void finalinvoice_print_email() throws InterruptedException
   
    {
    	driver.get(Finalinvoiceurl);
    	Invoice email_print=new Invoice(driver);
    	email_print.invoice_communication_email();
    	email_print.invoice_communication_print();
    	email_print.closeprint();
    	email_print.verifyprint();
    }
    @Test(priority=33)
    public void Minus_deposit_retention_interim_invoices_on_finalinvoice() throws InterruptedException 
    {
    	driver.get(homepage);
		Customer invoice =new Customer (driver);
		invoice.Customer_create();
		invoice.Customer_title();
		invoice.Customer_Name();
		invoice.Customer_SurName();
		invoice.Customer_email();
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
	    Estimate invoice1=new Estimate(driver);
	    invoice1.Estimate_AddNew();
	    invoice1.choose_description();
	    invoice1.Estimate_Notes();
	    invoice1.Estimate_CustomerReference();
	    invoice1.Estimate_user_group();
	    invoice1.Estimate_AddEstimate();
		Thread.sleep(3000);
		invoice1.Estimate_Price_tab();
		Thread.sleep(3000);
		invoice1.Estimate_Price_NoBreakdown();
		Thread.sleep(3000);
		invoice1.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(3000);
		invoice1.Estimate_InvoiceSchedule();
		Thread.sleep(3000);
		invoice1.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(3000);
		invoice1.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(3000);
		invoice1.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(3000);
		invoice1.Estimate_SendtoCustomer();
		invoice1.Estimate_Accept();
		Invoice invoice2=new Invoice(driver);
		invoice2.InvoiceTab();
		retention=driver.getCurrentUrl();
		invoice2.addinvoice();
		invoice2.Interim_invoice();
		invoice2.invoice_description();
		invoice2.invoice_notes();
		invoice2.invoice_Category();
		invoice2.Invoice_Breakdown_No_Breakdown();
		invoice2.sub_total("100");
		invoice2.save_invoice1();   
		driver.get(retention);
		invoice2.addinvoice();
		invoice2.Final_invoice();
		invoice2.invoice_description();
		invoice2.invoice_notes();
		invoice2.invoice_Category();
		invoice2.save_invoice1();
    }
    @Test(priority=34)
    public void Searchinvoice()
    {
    	driver.get(homepage);
    	type("#search-input",invoicenumber);
    	typeenter("#search-input");
    	click("(//span[@class='ss-layout icon'])[1]");
    	click("(//a[text()='"+invoicenumber+"'])[2]");
    }
    @Test(priority=35)
    public void partialpayment_to_invoice() throws InterruptedException
    
    	{
    		driver.get(homepage);
    		Customer invoice =new Customer (driver);
    		invoice.Customer_create();
    		invoice.Customer_title();
    		invoice.Customer_Name();
    		invoice.Customer_SurName();
    		invoice.Customer_email();
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
    	    adding_invoice.unitprice_fullbreakdown("1592.55");
    	    adding_invoice.save_invoice();
    	    Invoice addpayment=new Invoice(driver);
        	addpayment.invoice_AddnewPayment();
        	addpayment.invoice_payment_AddDescription("Partial payment");
        	addpayment.payment_reference("azarudeen-partial");
        	addpayment.invoice_payment_method();
        	addpayment.invoice_payment_nominalcode();
        	addpayment.invoice_payment_amount("985");
        	addpayment.invoice_paymeny_save();		
        	Thread.sleep(2000);
        	Grandtotal=gettext("(//span[@class='ng-binding'])[25]");
        	Grandtotal= Grandtotal.replace("£","");
        	Grandtotal= Grandtotal.replace(",","");
            Amountpaid= gettext("(//span[@class='ng-binding'])[34]");
            Amountpaid= Amountpaid.replace("£","");
            System.out.println("partial Amountpaid : " + Amountpaid);
            double remaindertopay= Double.parseDouble(Grandtotal) - Double.parseDouble(Amountpaid);
            System.out.println("Remainder amount to be paid : " + remaindertopay);
            Remainderamountpay=gettext("(//span[@class='ng-binding'])[35]");
            Remainderamountpay= Remainderamountpay.replace("£","");
            double Remainingamount= Double.parseDouble(Remainderamountpay);
            assertEquals(remaindertopay, Remainingamount);
    	}
                
    	
           @Test(priority=36)
    	    public void Fullpayment_to_invoice() throws InterruptedException
    	    
    	    	{
    	    		driver.get(homepage);
    	    		Customer invoice =new Customer (driver);
    	    		invoice.Customer_create();
    	    		invoice.Customer_title();
    	    		invoice.Customer_Name();
    	    		invoice.Customer_SurName();
    	    		invoice.Customer_email();
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
    	    	    adding_invoice.unitprice_fullbreakdown("1592.55");
    	    	    adding_invoice.save_invoice();
    	    	    Grandtotal=gettext("(//span[@class='ng-binding'])[25]");
    	        	Grandtotal= Grandtotal.replace("£","");
    	        	Grandtotal= Grandtotal.replace(",","");
    	    	    Invoice addpayment=new Invoice(driver);
    	        	addpayment.invoice_AddnewPayment();
    	        	addpayment.invoice_payment_AddDescription("Full payment");
    	        	addpayment.payment_reference("azarudeen-FUllpayment");
    	        	addpayment.invoice_payment_method();
    	        	addpayment.invoice_payment_nominalcode();
    	        	addpayment.invoice_payment_amount(Grandtotal);
    	        	addpayment.invoice_paymeny_save();		
    	        	Thread.sleep(2000);
    	            Amountpaid= gettext("(//span[@class='ng-binding'])[34]");
    	            Amountpaid= Amountpaid.replace("£","");
    	            Amountpaid= Amountpaid.replace(",","");
    	            System.out.println("partial Amountpaid : " + Amountpaid);
    	            double remaindertopay= Double.parseDouble(Grandtotal) - Double.parseDouble(Amountpaid);
    	            System.out.println("Remainder amount to be paid : " + remaindertopay);
    	            Remainderamountpay=gettext("(//span[@class='ng-binding'])[35]");
    	            Remainderamountpay= Remainderamountpay.replace("£","");
    	            double Remainingamount= Double.parseDouble(Remainderamountpay);
    	            assertEquals(remaindertopay, Remainingamount);        
    	    	}*/

           @Test(priority=37)
    	    public void Estimatequotedamount_to_takeinfinalinvoice() throws InterruptedException
    	    {
        	driver.get(homepage);
       		Customer invoice =new Customer (driver);
       		invoice.Customer_create();
       		invoice.Customer_title();
       		invoice.Customer_Name();
       		invoice.Customer_SurName();
       		invoice.Customer_email();
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
       	    Estimate invoice1=new Estimate(driver);
       	    invoice1.Estimate_AddNew();
       	    invoice1.choose_description();
       	    invoice1.Estimate_Notes();
       	    invoice1.Estimate_CustomerReference();
       	    invoice1.Estimate_user_group();
       	    invoice1.Estimate_AddEstimate();
       		Thread.sleep(3000);
       		invoice1.Estimate_Price_tab();
       		Thread.sleep(3000);
       		invoice1.Estimate_Price_NoBreakdown();
       		Thread.sleep(3000);
       		invoice1.Estimate_Price_NoBreakdown_PartsTotal();
       		Thread.sleep(3000);
       		invoice1.estimatequoteamonut();
       		Thread.sleep(2000);  
       		invoice1.Estimate_InvoiceSchedule();
       		Thread.sleep(3000);
       		invoice1.Estimate_Accept();
       		Thread.sleep(3000);
       		invoice1.verify_jobestimate_quoteamount();
       		
    	    }
  
   }
	