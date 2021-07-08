package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import action.Baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Editcustomer_workaddress;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;
import pages.Reporting;
import pages.Supplier;
import pages.Supplierinvoice;
import pages.searchengine;
import utility.PageloadResponse;

public class Smoketest extends Baseclass {

	public String homepage;
	public String jobURL;
	public String WA;
	public String Supplierhomepage;



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
		job.createjob();
	}
	@Test(priority = 4)
	public void Add_job_Final_Complete() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(6000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("AutoFinal");
		job.createjob();
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
		job.createjob();
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
		job.createjob();
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
		job.createjob();
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
		job.createjob();
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
		invoice.invoice_payment_AddDescription();
		invoice.invoice_payment_method();
		invoice.invoice_payment_nominalcode();
		invoice.invoice_payment_amount();
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
		job.createjob();
	}
	@Test(priority = 14)
	public void WA_Addpayment_job() throws InterruptedException
	{
		driver.get(WA);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		job.createjob();
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
		invoice.invoice_payment_AddDescription();
		invoice.invoice_payment_method();
		invoice.invoice_payment_nominalcode();
		invoice.invoice_payment_amount();
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
	@Test(priority = 17)
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
	@Test(priority = 18)
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
	@Test(priority = 19)
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
	@Test(priority =20)
	public void diaryutility() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_PrintJobSheet();
		diary.Diary_PrintSummarySheet();
	}
	@Test(priority =21)
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

	@Test(priority=22)
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
	@Test(priority=23)
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
	@Test(priority = 24)
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
	@Test (priority=25)
	public void CustomerReports() throws InterruptedException
	{

		driver.get(homepage);
		//customer report - 1
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Customers_Report();
		Report.First_Plus_button();
		Report.Customer1_Assertion("View Customer");


	}
	@Test (priority=26)
	public void ServiceRemindersReports() throws InterruptedException
	{
		driver.get(homepage);
		//Service_Reminder = 1
		Reporting Report = new Reporting(driver);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Service_Reminder_Report();
		Report.Service_Reminders_Report();
		Report.ServiceReminder1_Assertion();

	}
	@Test (priority = 27)
	public void SupplierReports() throws InterruptedException
	{
		driver.get(homepage);
		//Supplier Report = 1
		Reporting Report = new Reporting(driver);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Supplier_Report();
		Report.Suppliers_Report();
		Report.Supplier1_Assertion();

	}
	@Test (priority=28)
	public void EstimateReport() throws InterruptedException
	{
		driver.get(homepage);
		//Estimate Report = 1
		Reporting Report = new Reporting(driver);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Estimate_Report();
		Report.Estimates_Report();
		Report.Estimate1_Assertion();
	}
	@Test(priority=29)
	public void JobReport() throws InterruptedException
	{
		driver.get(homepage);
		//Job Report = 1
		Reporting Report = new Reporting(driver);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.Jobs_Report();
		Report.Job1_Assertion();


	}
	@Test(priority = 30)
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
	//	@Test(priority = 30)
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


}
