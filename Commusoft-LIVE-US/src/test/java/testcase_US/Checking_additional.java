package testcase_US;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action_US.Baseclass_US;
import pages.LoginPage;
import pages_US.Changeinvoice_US;
import pages_US.CreateJob_US;
import pages_US.Download_excel_print_reports_US;
import pages_US.Invoice_US;
import pages_US.NotesandCommunication_US;
import pages_US.QA62_Serviceremainder_US;
import pages_US.Reporting_US;
import pages_US.Supplier_US;
import pages_US.Supplierinvoice_US;
import pages_US.searchengine_US;
import utility_US.PageloadResponse_US;

public class Checking_additional extends Baseclass_US{
public String homepage;
public String customer = "https://app.commusoft.us/customers/customer/1554/view/property/view";
public String Supplierhomepage;


	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(15000);
		homepage = driver.getCurrentUrl();
		Thread.sleep(3000);
	}
//	//@Test(priority = 1)
//	public void Addjob_NoRules_Adddtional() throws InterruptedException
//	{
//		driver.get(customer);
//		Thread.sleep(4000);
//		CreateJob_US job = new CreateJob_US(driver);
//		job.addjob();
//		job.JobDescription("No Rules");
//		//job.createjob();
//		Thread.sleep(3000);
//		Invoice_US invoice = new Invoice_US(driver);
//		invoice.InvoiceTab();
//		invoice.addinvoice();
//		invoice.Additional_invoice();
//		invoice.invoice_UserGroup();
//		invoice.invoice_Category();
//		invoice.Invoice_Breakdown_Full_breakdown_by_category();
//		invoice.invoice_description();
//		invoice.Full_Breakdown_ByCategory_Labour_Description("Labour");
//		invoice.unitprice_FullBreakdown_ByCategory_Labour("300");
//		invoice.Full_Breakdown_ByCategory_Parts_Description("parts");
//		invoice.save_invoice();
//	}
	@Test(priority = 1)
	public void Addpayment_job() throws InterruptedException
	{
		driver.get(customer);
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
		invoice.Full_Breakdown_des("Pricing One");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		//invoice.quanity_fbs("3");
		//invoice.Unitprice_Full_breakdown_des("600");
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
//	@Test(priority =1)
//	public void Supplier_Create() throws InterruptedException
//	{
//		Supplier_US supplier = new Supplier_US(driver);
//		supplier.Supplier_Module();
//		supplier.Supplier_create();
//		supplier.Supplier_Name();
//		supplier.Supplier_email();
//		supplier.Supplier_Address1();
//		supplier.Supplier_Address2();
//		supplier.Supplier_save();
//		Thread.sleep(6000);
//		Supplierhomepage = driver.getCurrentUrl();
//	}
//
//	@Test(priority=2)
//	public void Supplier_PO() throws InterruptedException
//	{
//		click("//a[text()='Add new purchase order']");
//		Thread.sleep(4000);
//		searchengine_US search = new searchengine_US(driver);
//		search.searchbox_supplier_parts("New part");
//		search.searchbox_supplier_parts_nominalcode("Bank Fees");
//		search.parts_deliverymethod("Delivery to office");
//		CreateJob_US Job = new CreateJob_US(driver);
//		Job.save_po();
//
//	}
//	@Test(priority=3)
//	public void Supplier_Invoice() throws InterruptedException, IOException
//	{
//		driver.get(Supplierhomepage);
//		Thread.sleep(4000);
//		Supplierinvoice_US supplierinv = new Supplierinvoice_US(driver);
//		supplierinv.Supplierinvoaddbutton();		
//		supplierinv.Invoiceno();
//		supplierinv.supplirinvpart();
//		supplierinv.quantity();
//		supplierinv.unitcost("300");
//		supplierinv.vat("Test2");
//		supplierinv.nominalcode();
//		supplierinv.item("Demo");
//		supplierinv.itemquantity();
//		supplierinv.itemunitcost("200");
//		supplierinv.itemscale("400");
//		supplierinv.itemvat("Test2");
//		supplierinv.itemnominalcode();		
//		supplierinv.savesupplierbutton();
//	}
//	@Test (priority=1)
//	public void CustomerReports() throws InterruptedException
//	{
//		//driver.get(homepage);
//				Reporting_US Report = new Reporting_US(driver); 
//				Report.Reporttab();
//				Report.Report_Sidemenu();
//				Report.Customer_Report();
//				Report.Customers_Report();
//				Report.click_filter();
//				Report.click_dateoption1();
//				Report.click_todaydate();
//				Report.apply_filter();
//				Report.First_Plus_button();
//				Report.View_customer();
//		
//	}
//	@Test (priority=2)
//	public void ServiceRemindersReports() throws InterruptedException
//	{
//		driver.get(homepage);
//		//Service_Reminder = 1
//		Reporting_US Report = new Reporting_US(driver);
//		Report.Reporttab();
//		Report.Report_Sidemenu();
//		Report.Service_Reminder_Report();
//		Report.Service_Reminders_Report();
//		Report.ServiceReminder1_Assertion();
//	}
//	@Test (priority = 3)
//	public void SupplierReports() throws InterruptedException
//	{
//		driver.get(homepage);
//		//Supplier Report = 1
//		Reporting_US Report = new Reporting_US(driver);
//		Report.Reporttab();
//		Report.Report_Sidemenu();
//		Report.Supplier_Report();
//		Report.Suppliers_Report();
//		Report.Supplier1_Assertion();
//	}
//	@Test (priority=4)
//	public void EstimateReport() throws InterruptedException
//	{
//		Reporting_US Report = new Reporting_US(driver); 
//		Report.Reporttab();
//		Report.Report_Sidemenu();
//		Report.Estimate_Report();
//		Report.Estimates_Report();
//		Report.click_filter();
//		Report.click_dateoption1();
//		Report.click_todaydate();
//		Report.apply_filter();
//		Report.First_Plus_button();
//		Report.click_viewestimate();
//	}
//	@Test(priority=5)
//	public void JobReport() throws InterruptedException
//	{
//		Reporting_US Report = new Reporting_US(driver); 
//		Report.Reporttab();
//		Report.Report_Sidemenu();
//		Report.Estimate_Report();
//		Report.Estimates_Report();
//		Report.click_filter();
//		Report.click_dateoption1();
//		Report.click_todaydate();
//		Report.apply_filter();
//		Report.First_Plus_button();
//		Report.click_viewestimate();
//	}
//	@Test (priority=6)
//	public void Work_address_Reports() throws InterruptedException
//	{
//		Reporting_US Report = new Reporting_US(driver); 
//		Report.Reporttab();
//		Report.Report_Sidemenu();
//		Report.Customer_Report();
//		Report.WA_Report();
//		Report.click_filter();
//		Report.click_dateoption1();
//		Report.click_todaydate();
//		Report.apply_filter();
//		Report.First_Plus_button();
//		Report.Click_View_workaddres();
//	}
//	@Test(priority=7)
//    public void customersreportdownload_print() throws InterruptedException
//    {
//	  Reporting_US customerreport=new Reporting_US (driver);
//	  customerreport.Reporttab();
//	  customerreport.Report_Sidemenu();
//	  customerreport.Customer_Report();
//	  customerreport.Customers_Report();
//	  Download_excel_print_reports_US customerprint =new Download_excel_print_reports_US(driver);
//	  customerprint.downloadexcel();
//	  //customerprint.print();
//	  customerprint.print_customer();
//	  customerprint.closeprint();
//    }
//    @Test(priority=8)
//    public void jobreportdownload_print() throws InterruptedException
//    {
//      Reporting_US jobsreport= new Reporting_US(driver);
//      jobsreport.Reporttab();
//      jobsreport.Report_Sidemenu();
//      jobsreport.Job_Report();
//      jobsreport.Jobs_Report();
//      Download_excel_print_reports_US jobreportprintanddownload =new Download_excel_print_reports_US(driver);
//      jobsreport.click_filter();
//      jobsreport.click_dateoption();
//      jobsreport.click_todaydate();
//      jobsreport.apply_filter();
//      jobreportprintanddownload.print();
//      jobreportprintanddownload.closeprint();
//      jobreportprintanddownload.downloadexcel();
//     /* jobreportprintanddownload.jobsreportprint();
//      jobreportprintanddownload.notifications();
//      jobreportprintanddownload.assertion_jobrep();
//      jobreportprintanddownload.jobsreportdownloadexcel();
//      jobreportprintanddownload.notifications();
//      jobreportprintanddownload.assertion_jobrepoexcel();*/
//    }
//    @Test(priority=9)
//    public void timesheetreport() throws InterruptedException
//    {
//    	Reporting_US timesheet=new Reporting_US(driver);
//    	timesheet.Reporttab();
//    	timesheet.Report_Sidemenu();
//    	Download_excel_print_reports_US timesheetreportprintanddownload =new Download_excel_print_reports_US(driver);
//    	timesheetreportprintanddownload.clickusers();
//    	timesheetreportprintanddownload.clicktimesheet();
//    	timesheetreportprintanddownload.print();
//    	timesheetreportprintanddownload.closeprint();
//    	timesheetreportprintanddownload.downloadexcel2();
//    }
//    @Test(priority=10)
//    public void salesreport() throws InterruptedException 
//    {
//    	Reporting_US salereport = new Reporting_US(driver);
//    	salereport.Reporttab();
//    	salereport.Report_Sidemenu();
//    	Download_excel_print_reports_US salesreportprintanddownload =new Download_excel_print_reports_US(driver);
//    	salesreportprintanddownload.clicksales();
//    	salesreportprintanddownload.clicksales2();
//    	salesreportprintanddownload.print();
//    	salesreportprintanddownload.closeprint();
//    	salesreportprintanddownload.downloadexcel2();
//    	/*salesreportprintanddownload.salesreportprint();
//    	salesreportprintanddownload.notifications();
//    	salesreportprintanddownload.assertion_salesrepprint();
//    	salesreportprintanddownload.salesreportexcel();
//    	salesreportprintanddownload.notifications();
//    	salesreportprintanddownload.assertion_salesrepexcel();*/
//    }
//	
//	//stata
//	@Test(priority=11)
//	public void changesinvoicetype() throws InterruptedException
//	{
//		driver.get(customer);
//		Changeinvoice_US changeinvoices=new Changeinvoice_US(driver);
//		//changeinvoices.addcustomer();
//		changeinvoices.addjob();
//		changeinvoices.adddiary();
//		changeinvoices.add_additionalinvoice();
//		changeinvoices.addfinalinvoice();
//		changeinvoices.editinvoicetype();
//	}
//	@Test(priority=12)
//	public void ser_remainder() throws InterruptedException
//	{
//		driver.get(homepage);
//		QA62_Serviceremainder_US Service_remainder =new QA62_Serviceremainder_US(driver);
//		Service_remainder.view_all_serviceremainder();
//		Service_remainder.enable_checkbox();
//		Service_remainder.process_remainder_btn();
//		Service_remainder.print_icon();
//		Service_remainder.notification();
//		Service_remainder.assertion_serviceremain();
//		
//	}
	//@Test(priority = 13)
	public  void SolarSearch_pageresponse() throws InterruptedException, IOException
	{
		type("#search-input","Azar");
		typeenter("#search-input");
		String url = driver.getCurrentUrl();
		Thread.sleep(3000);
		click("(//a[@class='ng-scope ng-binding'])[1]");
		PageloadResponse_US page = new PageloadResponse_US();
		int a = page.httpResponseCodeViaGet(url);
		System.out.println("Status:- " +a);
		Assert.assertEquals(a, 200);
}
}