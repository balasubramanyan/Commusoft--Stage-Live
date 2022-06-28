package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import action.Baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.Changeinvoice;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Download_excel_print_reports;
import pages.Editcustomer_workaddress;
import pages.Email_setup;
import pages.Estimate;
import pages.Invoice;
import pages.NotesandCommunication;
import pages.QA62_Serviceremainder;
import pages.Reporting;
import pages.Settings;
import pages.Supplier;
import pages.Supplierinvoice;
import pages.searchengine;
import utility.PageloadResponse;


public class Smoketest extends Baseclass {

	//public String homepage;
	public String jobURL;
	public String WA;
	public String Supplierhomepage;
	public String invoicepage;
	public String jobpage; 
	public String payment;
	public String Prefinalinvoice;
	public String retention;
	public String invoicenumber;

//manually edited

	@Test(priority = 1)
	public void Add_Customer() throws InterruptedException
	{
		Customer customer = new Customer(driver);
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
	public void Edit_Customer() throws InterruptedException
	{

		driver.get(customerpage);
		Thread.sleep(3000);
		Editcustomer_workaddress editcustomer = new Editcustomer_workaddress(driver);
		editcustomer.Editcustomer_link();
		editcustomer.Editcustomer_title();
		editcustomer.Editcustomer_Name();
		editcustomer.Editcustomer_SurName();
		editcustomer.Editcustomer_Mobile();
		editcustomer.Editcustomer_email();
		editcustomer.Editcustomer_AddressLine1();
		editcustomer.Editcustomer_Save();
	}

	@Test(priority = 3)
	public void Add_job_Prefinal() throws InterruptedException
	{
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");
		//job.createjob();
	}
	@Test(priority = 4)
	public void Add_job_Final_Complete() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(6000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("AutoFinal");
		//job.createjob();
		Thread.sleep(6000);
		job.edit_job();
		Thread.sleep(3000);
		job.complete_job();
	}
	@Test(priority = 5)
	public void Addjob_NoRules() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Final_invoice();
		invoice.invoice_description();
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.sub_total("500");
		invoice.save_invoice();
	}
	@Test(priority = 6)
	public void Addjob_NoRules_Adddtional() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Additional_invoice();
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.Invoice_Breakdown_Full_breakdown_by_category();
		invoice.invoice_description();
		invoice.Full_Breakdown_ByCategory_Labour_Description("Labour");
		invoice.unitprice_FullBreakdown_ByCategory_Labour("300");
		invoice.Full_Breakdown_ByCategory_Parts_Description("Price one");
		invoice.save_invoice();
	}
	@Test(priority = 7)
	public void Estimate_Accept() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(5000);
		Estimate estimate = new Estimate(driver);
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
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(3000);
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}
	@Test(priority = 8)
	public void Estimate_Reject() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(5000);
		Estimate estimate = new Estimate(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Reject();
	}
	@Test(priority = 9)
	public void Addjob_NoRules_DiaryEvent() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(4000);
		job.Add_new_diaryEvent();
		Diary diary = new Diary(driver);
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_Timing3();
		diary.Diary_EventFromJob();
	}
	@Test(priority = 10)
	public void Addpayment_job() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(4000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Pre_Final_invoice();
		invoice.Invoice_Breakdown_Full_breakdown();
		invoice.invoice_description();
		invoice.Full_Breakdown_des("Price one");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.save_invoice();
		NotesandCommunication communication = new NotesandCommunication(driver);
		communication.emailinvoice();
		communication.printinvoice();
		invoice.invoice_AddnewPayment();
		invoice.invoice_payment_AddDescription("Job payments");
		invoice.invoice_payment_method();
		invoice.invoice_payment_nominalcode();
		invoice.invoice_payment_amount("250.22");
		invoice.invoice_paymeny_save();
	}
	@Test(priority = 11)
	public void Workaddress_Add() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(5000);
		Customer customer = new Customer(driver);
		customer.workaddress_tab();
		customer.workaddress_addnewWorkaddress();
		customer.Workaddress_create();
		Thread.sleep(6000);
		WA = driver.getCurrentUrl();

	}

	@Test(priority = 12)	
	public void  Work_Address_Edit() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(4000);
		Editcustomer_workaddress editworkaddress = new Editcustomer_workaddress(driver);
		//editworkaddress.EditWorkaddress_view();
		editworkaddress.Edit_workaddress();
		editworkaddress.Edit_WAtitle();
		editworkaddress.Edit_waname();
		editworkaddress.Edit_wasurname();
		editworkaddress.Edit_walandline();
		editworkaddress.Edit_wamobile();
		editworkaddress.Edit_waemail();
		editworkaddress.Edit_waaddress1();
		editworkaddress.Edit_wasavebutton();

	}

	@Test(priority = 13)
	public void WA_Add_job_Prefinal() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");
		//job.createjob();
	}
	@Test(priority = 14)
	public void WA_Addpayment_job() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(4000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Pre_Final_invoice();
		invoice.Invoice_Breakdown_Full_breakdown();
		invoice.invoice_description();
		invoice.Full_Breakdown_des("Price one");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.save_invoice();
		NotesandCommunication communication = new NotesandCommunication(driver);
		communication.emailinvoice();
		communication.printinvoice();
		invoice.invoice_AddnewPayment();
		invoice.invoice_payment_AddDescription("WA payment");
		invoice.invoice_payment_method();
		invoice.invoice_payment_nominalcode();
		invoice.invoice_payment_amount("450");
		invoice.invoice_paymeny_save();
	}
	@Test(priority = 15)
	public void WA_Estimate_Accept() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(5000);
		Estimate estimate = new Estimate(driver);
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
	@Test(priority = 16)
	public void add_invoice() throws InterruptedException
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
	@Test(priority=17)
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
	@Test(priority=18)
	public void delete_invoice()	
	{
		Invoice Delete_invoice =new Invoice(driver);
		Delete_invoice.delete_inv();	
	}
	@Test(priority=19)
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

	@Test(priority=20)
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
	@Test(priority=21)
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

	@Test(priority=22)
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
	
	@Test(priority=23)
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
    	
    @Test(priority=24)
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
    @Test(priority=25)
    public void Searchinvoice()
    {
    	driver.get(homepage);
    	type("#search-input",invoicenumber);
    	typeenter("#search-input");
    	click("(//span[@class='ss-layout icon'])[1]");
    	click("(//a[text()='"+invoicenumber+"'])[2]");
    }
	@Test(priority = 26)
	public void Diary_Estimate() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_PM();
		diary.Diary_Estimate();
		diary.Diary_propertysearch();
		Thread.sleep(3000);
		diary.Diary_Estimate_EventDescription();
		diary.Diary_Save();
	}
	@Test(priority = 27)
	public void Diary_Job() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_Timing();
		diary.Diary_job();
		diary.Diary_propertysearch();
		Thread.sleep(5000);
		diary.Diary_Job_EventDescription();
		diary.Diary_Save();
	}
	@Test(priority = 28)
	public void Diary_Normal() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_Timing1();
		diary.Diary_Normal_EvenDescription();
		diary.Diary_Save();
	}
	@Test(priority = 29)
	public void Addcustomer_job() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_Timing2();
		diary.Diary_job();
		diary.Diary_job_AddProperty();
		diary.Diary_TypesOfProperty();
		diary.Diary_TypesOfCustomer();
		diary.Diary_AddProperty_CustomerName();
		diary.Diary_AddProperty_CustomerSurName();
		diary.Diary_AddProperty_CustomerEmail();
		diary.Diary_AddProperty_CustomerAdd1();
		diary.Diary_AddProperty_CustomerSave();
		//	diary.Diary_currentdate_datepicker();
		diary.Diary_Job_EventDescription();
		diary.Diary_Save();
	}
	@Test(priority =30)
	public void diaryutility() throws InterruptedException
	{
		Thread.sleep(3000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		Thread.sleep(6000);
		diary.Diary_PrintJobSheet();
		diary.Diary_PrintSummarySheet();
	}
	@Test(priority =31)
	public void Supplier_Create() throws InterruptedException
	{
		Supplier supplier = new Supplier(driver);
		supplier.Supplier_Module();
		supplier.Supplier_create();
		supplier.Supplier_Name();
		supplier.Supplier_email();
		supplier.Supplier_Address1();
		supplier.Supplier_Address2();
		supplier.Supplier_save();
		Thread.sleep(6000);
		Supplierhomepage = driver.getCurrentUrl();
	}

	@Test(priority=32)
	public void Supplier_PO() throws InterruptedException
	{
		click("//a[text()='Add new purchase order']");
		Thread.sleep(4000);
		searchengine search = new searchengine(driver);
		search.searchbox_supplier_parts("Parts");
		search.searchbox_supplier_parts_nominalcode("Parts");
		search.parts_deliverymethod("Delivery to office");
		CreateJob Job = new CreateJob(driver);
		Job.save_po();

	}
	@Test(priority=33)
	public void Supplier_Invoice() throws InterruptedException, IOException
	{
		driver.get(Supplierhomepage);
		Thread.sleep(4000);
		Supplierinvoice supplierinv = new Supplierinvoice(driver);
		supplierinv.Supplierinvoaddbutton();		
		supplierinv.Invoiceno();
		supplierinv.supplirinvpart();
		supplierinv.quantity();
		supplierinv.unitcost("300");
		supplierinv.vat("5.00");
		supplierinv.nominalcode();
		supplierinv.item("Demo");
		supplierinv.itemquantity();
		supplierinv.itemunitcost("200");
		supplierinv.itemscale("400");
		supplierinv.itemvat("5.00");
		supplierinv.itemnominalcode();		
		supplierinv.savesupplierbutton();
	}
	@Test(priority = 34)
	public  void Customer_Createcontact() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(3000);

		click("//span[text()='Contacts']");
		Thread.sleep(2000);

		click("//a[text()='Add new contact']");

		type("#contact_name", "Aravind");
		type("#contact_surname", "Reigns");
		type("#contact_contactsemail_emailaddress","rara@yopmail.com");

		Thread.sleep(1000);
		click("//span[@class='number-type-toggle ng-binding']");

		click("//li[text()='Mobile']");
		type("$contact[contactstelephone][0][telephonenumber]", "9856325698");
		click("//span[text()='Add phone number']");

		click("//span[text()='Add contact']");

	}
	@Test (priority=35)
	public void CustomerReports() throws InterruptedException
	{
		 //driver.get(homepage);
				Reporting Report = new Reporting(driver); 
				Report.Reporttab();
				Report.Report_Sidemenu();
				Report.Customer_Report();
				Report.Customers_Report();
				Report.click_filter();
				Report.click_dateoption();
				Report.click_todaydate();
				Report.apply_filter();
				Report.First_Plus_button();
				Report.View_customer();
		
	}
	@Test (priority=36)
	public void ServiceRemindersReports() throws InterruptedException
	{
		//driver.get(homepage);
		//Service_Reminder = 1
		Reporting Report = new Reporting(driver);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Service_Reminder_Report();
		Report.Service_Reminders_Report();
		Report.ServiceReminder1_Assertion();
	}
	@Test (priority = 37)
	public void SupplierReports() throws InterruptedException
	{
		//driver.get(homepage);
		//Supplier Report = 1
		Reporting Report = new Reporting(driver);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Supplier_Report();
		Report.Suppliers_Report();
		Report.Supplier1_Assertion();
	}
	@Test (priority=38)
	public void EstimateReport() throws InterruptedException
	{
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Estimate_Report();
		Report.Estimates_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.click_viewestimate();
	}
	@Test(priority=39)
	public void JobReport() throws InterruptedException
	{
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Estimate_Report();
		Report.Estimates_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.click_viewestimate();
	}
	@Test (priority=40)
	public void Work_address_Reports() throws InterruptedException
	{
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.WA_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.Click_View_workaddres();
	}
	@Test(priority=41)
    public void customersreportdownload_print() throws InterruptedException
    {
	  Reporting customerreport=new Reporting (driver);
	  customerreport.Reporttab();
	  customerreport.Report_Sidemenu();
	  customerreport.Customer_Report();
	  customerreport.Customers_Report();
	  Download_excel_print_reports customerprint =new Download_excel_print_reports(driver);
	  customerprint.customerprint1(); 
	  //customerprint.downloadexcel();
      //customerprint.print();
	  //customerprint.closeprint();
      //customerprint.salesreportprint();
	  //customerprint.notifications();
	  //customerprint.assertion_salesrepprint();
	  customerprint.customer_download2();
      //customerprint.salesreportexcel();
  	  //customerprint.notifications();
  	  //customerprint.assertion_salesrepexcel();
    }
    @Test(priority=42)
    public void jobreportdownload_print() throws InterruptedException
    {
      Reporting jobsreport= new Reporting(driver);
      jobsreport.Reporttab();
      jobsreport.Report_Sidemenu();
      jobsreport.Job_Report();
      jobsreport.Jobs_Report();
      Download_excel_print_reports jobreportprintanddownload =new Download_excel_print_reports(driver);
      jobsreport.click_filter();
      jobsreport.click_dateoption1();
      jobsreport.click_todaydate();
      jobsreport.apply_filter();
      jobreportprintanddownload.print();
      jobreportprintanddownload.closeprint();
      jobreportprintanddownload.downloadexcel();
//      jobreportprintanddownload.jobsreportprint();
//      jobreportprintanddownload.notifications();
//      jobreportprintanddownload.assertion_jobrep();
//      jobreportprintanddownload.jobsreportdownloadexcel();
//      jobreportprintanddownload.notifications();
//      jobreportprintanddownload.assertion_jobrepoexcel();
    }
    @Test(priority=43)
    public void timesheetreport() throws InterruptedException
    {
    	Reporting timesheet=new Reporting(driver);
    	timesheet.Reporttab();
    	timesheet.Report_Sidemenu();
    	Download_excel_print_reports timesheetreportprintanddownload =new Download_excel_print_reports(driver);
    	timesheetreportprintanddownload.clickusers();
    	timesheetreportprintanddownload.clicktimesheet();
    	timesheetreportprintanddownload.print();
    	timesheetreportprintanddownload.closeprint();
    	timesheetreportprintanddownload.downloadexcel();
    }
	 @Test(priority=44)
	    public void salesreport() throws InterruptedException 
	    {
	    	Reporting salereport = new Reporting(driver);
	    	salereport.Reporttab();
	    	salereport.Report_Sidemenu();
	    	Download_excel_print_reports salesreportprintanddownload =new Download_excel_print_reports(driver);
	    	salesreportprintanddownload.clicksales();
	    	salesreportprintanddownload.clicksales2();
//	    	salesreportprintanddownload.printsalesreport();
//	    	salesreportprintanddownload.closeprint();
//	    	salesreportprintanddownload.downloadexcelsalesreport();
	    	salesreportprintanddownload.salesreportprint();
	    	salesreportprintanddownload.notifications();
	    	salesreportprintanddownload.assertion_salesrepprint();
	    	salesreportprintanddownload.salesreportexcel();
	    	salesreportprintanddownload.notifications();
	    	salesreportprintanddownload.assertion_salesrepexcel();
	    }
		
	
	//stata
	@Test(priority=45)
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
	@Test(priority=46)
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
	@Test(priority = 47)
	public  void SolarSearch_pageresponse() throws InterruptedException, IOException
	{
		type("#search-input","ranjit");
		typeenter("#search-input");
		String url = driver.getCurrentUrl();
		Thread.sleep(3000);
		click("(//a[@class='ng-scope ng-binding'])[1]");
		PageloadResponse page = new PageloadResponse();
		int a = page.httpResponseCodeViaGet(url);
		System.out.println("Status:- " +a);
		Assert.assertEquals(a, 200);
	}
	//	@Test(priority = 72)
	void get_InvoiceNumber_API()
	{
		RestAssured.baseURI="https://stage2.commusoft.net/webservice_dev.php/api/v1";
		RequestSpecification titlerequest = RestAssured.given();
		//Response Object
		Response resp = titlerequest.request(Method.GET,"/customers/customer/1284/jobs/1694/invoices?token=AsWoiK-X_Z73s61ja6xy2Q_vKI7Z7kvk3qcT9eNJi_xQXjyJsSXFDK7eQV36eZyavU7MYTQOZ0HqPE_9hX2_FQ");
		String ResponseBody = resp.getBody().asString();
		System.out.println("Response value" +ResponseBody);
		int statuscode = resp.getStatusCode();
		System.out.println("Status:- " +statuscode);
		Assert.assertEquals(statuscode, 200);
		
	}
	//@Test(priority=48)
	public void Estimate_Accepted_In_Portal_With_Payment() throws InterruptedException{
		
		driver.get(homepage);
		Thread.sleep(8000);
		Customer customer = new Customer(driver);
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
		Thread.sleep(5000);
		Estimate estimate = new Estimate(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Email();
		estimate.Estimate_Email_Send();
		estimate.Estimate_Notes_tab();
		estimate.Estimate_Portal();
		estimate.Estimate_Portal_Accept();
		estimate.Estimate_Portal_Accept_Verification();			
	}
	
	//@Test(priority=49)
	public void Estimate_Accepted_In_Portal_Without_Payment() throws InterruptedException
	{
		driver.get(homepage);
		Thread.sleep(8000);
		Customer customer = new Customer(driver);
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
		Thread.sleep(5000);
		Estimate estimate = new Estimate(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Email();
		estimate.Estimate_Email_Send();
		estimate.Estimate_Notes_tab();
		estimate.Estimate_Portal();
		estimate.Estimate_Portal_Accept();
		estimate.Estimate_Portal_Accept_Verification();	
	}
	@Test(priority=50)
	public void outlook() throws IOException, InterruptedException
	{
		driver.get(homepage);
		Settings setting=new Settings(driver);
		setting.Click_Setting();
		setting.Click_Companysetting();
		Email_setup outlook  =new Email_setup(driver);
		outlook.setupemail();
		outlook.outlookbutton();
		outlook.outlookusername_password();	
		outlook.outpassword();
	}
}
