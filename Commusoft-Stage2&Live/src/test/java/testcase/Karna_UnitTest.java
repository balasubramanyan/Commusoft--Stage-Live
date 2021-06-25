package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.LoginPage;
import pages.Reporting;
import pages.Supplier;
import pages.Customer;
import pages.CreateJob;
import pages.searchengine;

public class Karna_UnitTest extends Baseclass {
	
String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	
	@Test(priority = 1)
	public void PO() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Add_Customer();
		Thread.sleep(5000);
		 // get the code from Customer page using driver inside the Wrapper
		Thread.sleep(2000);
		CreateJob Job = new CreateJob(driver);
		Job.addjob(); 
		Job.JobDescription("No Rules");
		Job.createjob();
		Thread.sleep(7000);
		Job.JobCost();
		Job.JobCostPO();
		searchengine search = new searchengine(driver);
		Thread.sleep(3000);
		search.searchbox_supplier("supplier");
		search.searchbox_supplier_parts("Parts");
		search.searchbox_supplier_parts_nominalcode("Part");
		search.parts_deliverymethod("Delivery to Office");
		search.supplierpo_items("Item");
		Job.PO_item_unitprice("100");
		Job.PO_item_saleprice("200");
		search.searchbox_supplier_item_nominalcode("Parts");
		Job.Add_PO_button();	
	}
	@Test (priority = 2)
	public void PO_Value_Validation() throws InterruptedException 
	{
		//PO(); 
		Thread.sleep(3000);
		CreateJob job = new CreateJob(driver);
		job.view_po();
		job.assert_parttotal();
		job.assert_itemtotal();
		job.assert_subtotal();
		job.assert_VAT();
		job.assert_grandtotal();
	} 
	@Test (priority = 3)
	public void PO_Edit_Value_Validation() throws InterruptedException
	{
		Thread.sleep(3000);
		CreateJob Job = new CreateJob(driver);
		Job.edit_po();
		Job.PO_part_unitprice_eidt("600");
		searchengine searchvat = new searchengine(driver);
		searchvat.searchboxedit_supplier_partVAT("15.00");
		Job.PO_part_itemprice_eidt("200");
		searchvat.searchboxedit_supplier_itemVAT("15.00");
		Job.save_po();
		/* Assertion */
		Job.assert_partedittoal();
		Job.assert_item_edittotal();
		Job.assert_subedittotal();
		Job.assert_editvat();
		Job.assert_editgrand();
	}
	@Test(priority = 4)
	public void PO_Invoice_Lintitem_invoice() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.get("https://dev.commusoft.net/customers/customer/1069/jobs/416/costs/purchase_order/74/details");
		CreateJob Job = new CreateJob(driver);
		Job.invoice_withlineitem();
		/* Assertion */
		Job.assert_invoicetotal();
		Job.assert_invoicevattotal();
		Job.assert_invoicegrand();
		Job.save_invocie();
		Job.assert_finalinvoicetotal();
		
	}
/* Separate usecase */
	
	@Test(priority =5)
	public void Jobparts_PO() throws InterruptedException
	{
		driver.get(homepage);
		Thread.sleep(3000);
		Customer customer = new Customer(driver);
		CreateJob job = new CreateJob(driver);
		searchengine search = new searchengine(driver);
		customer.Add_Customer();
		job.addjob();
		job.JobDescription("No Rules");
		job.createjob();
		job.Jobparts_fulfil("10", "1", "Requested");
		job.order_from_supplier();
		Thread.sleep(2000);
		search.searchbox_supplier("Supplier");
		search.searchbox_supplier_parts_nominalcode("parts");
		search.parts_deliverymethod("Delivery to office");
		job.save_po();
		/* Assertion for invoiec values check */
		job.assert_invoicetotal("5,000.00");
		job.assert_invoicevattotal("1,000.00");
		job.assert_invoicegrand("6,000.00");
		
	}
	@Test(priority=6)
	public void Supplier_PO() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get(homepage);
		Supplier supplier = new Supplier(driver);
		supplier.Suppliercreate();
		supplier.Add_Supplier_PO();
		searchengine search = new searchengine(driver);
		search.searchbox_supplier_parts("Parts");
		search.searchbox_supplier_parts_nominalcode("Parts");
		search.parts_deliverymethod("Delivery to office");
		search.supplierpo_items("Item");
		CreateJob job = new CreateJob(driver);
		job.PO_item_unitprice("100");
		job.PO_item_saleprice("200");
		search.searchbox_supplier_item_nominalcode("Parts");
		job.save_po();
		CreateJob Job = new CreateJob(driver);
		Job.supplier_edit_po();
		Job.PO_part_unitprice_eidt("600");
		searchengine searchvat = new searchengine(driver);
		searchvat.searchboxsupplieredit_partVAT("15.00");
		Job.Supplier_PO_itemprice_eidt("200");
		searchvat.searchboxsupplieredit_itemVAT("15.00");
		Job.save_po();
		/* Assertion */
		Job.assert_Supplierparttoal();
		Job.assert_Supplieritem_total();
		Job.assert_Suppliersubtotal();
		Job.assert_Suppliervat();
		Job.assert_suppliereditgrand();	
	}
	@Test (priority=7)
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
			
		//customer report - 2
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.WA_Report();
		Report.First_Plus_button();
		Report.Customer2_Assertion("View Workaddress");
		
		//customer report - 3
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Appliance_Details_Report();
		Report.Customer3_Assertion();
		
		//customer report - 4
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Advertising_Performance_Report();
		Report.Customer4_Assertion();
		
		//customer report - 5
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.JobEstimateAccessPhoneCallList_Report();
		Report.Customer5_Assertion();
				
		//customer report - 6
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.ServicePlan_Report();
		Report.Customer6_Assertion();
				
		//customer report - 7
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Asset_Report();
		Report.Customer7_Assertion();
				
		//customer report - 8
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Contracts_Report();
		Report.Customer8_Assertion();
				
		//customer report - 9
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.PPM_Report();
		Report.Customer9_Assertion();
	}
	@Test (priority=8)
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
			
		//Service_Reminder = 2
		Report.Report_Sidemenu();
		Report.Service_Reminder_Report();
		Report.Properties_Without_Services_Report();
		Report.ServiceReminder2_Assertion();
	}
	@Test (priority = 9)
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
				
		//Supplier Report = 2
		Report.Report_Sidemenu();
		Report.Supplier_Report();
		Report.Contacts_Report();
		Report.Supplier2_Assertion();
	}
	@Test (priority=10)
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
			
				
		//Estimate Report = 2
		Report.Report_Sidemenu();
		Report.Estimate_Report();
		Report.Accepted_Vs_Rejected_Estimates_Report();
		Report.Estimate2_Assertion();
				
		//Estimate Report = 3
		Report.Report_Sidemenu();
		Report.Estimate_Report();
		Report.Rejected_Reasons_Report();
		Report.Estimate3_Assertion();
	}
	@Test(priority=11)
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
				
		//Job Report = 2
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.AdditionalWork_Report();
		Report.Job2_Assertion();
				
		//Job Report = 3
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.FOC_Report();
		Report.Job3_Assertion();
				
		//Job Report = 4
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.Aborted_Report();
		Report.Job4_Assertion();
				
		//Job Report = 5
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.Outstanding_Jobs_Report();
		Report.Job5_Assertion();
				
		//Job Report = 6
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.SLA_Report();
				
		//Job Report = 7
		driver.get(homepage);
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.SLA_Performance_Report();
	}

	
}
