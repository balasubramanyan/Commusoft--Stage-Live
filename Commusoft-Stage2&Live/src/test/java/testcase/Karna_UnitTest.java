package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.LoginPage;
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

	
}
