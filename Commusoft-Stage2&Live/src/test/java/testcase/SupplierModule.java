package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.LoginPage;
import pages.Supplier;
import pages.searchengine;


public class SupplierModule extends Baseclass{
	
	public String homepage;
	public String Supplierhomepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority =1)
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
	}
	@Test(priority=2)
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
//		/* Assertion */
//		Job.assert_Supplierparttoal();
//		Job.assert_Suppliersubtotal();
//		Job.assert_Suppliervat();
//		Job.assert_suppliereditgrand();	
	}
	@Test(priority=3)
	public void Supplier_Invoice() throws InterruptedException
	{
		driver.get(Supplierhomepage);
		click("//a[text()='Add new invoice']");
		Thread.sleep(3000);
		type("//input[@check-exists='invoiceNumber']","55");
		searchengine search = new searchengine(driver);
		search.searchbox_supplier_parts("Parts");
		search.searchbox_supplier_parts_nominalcode("Parts");
		click("//span[@ng-hide='saving']");
	}
	

}
