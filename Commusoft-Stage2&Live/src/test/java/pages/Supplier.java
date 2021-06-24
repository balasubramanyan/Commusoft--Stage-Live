package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Supplier extends Wrapper {
	
	public Supplier(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Suppliercreate() throws InterruptedException
	{
		click("//a[text()=\"Suppliers\"]");
		click("//a[text()=\"New supplier \"]");
		Thread.sleep(2000);
		type("//input[@id=\"suppliertype_contacts_companyname\"]", "Supplier");
		type("//input[@id=\"suppliertype_addressline1\"]", "Address1");
		click("//button[@id=\"company-details-save\"]");
		Thread.sleep(2000);
	}
	
	public void Supplier_Module() throws InterruptedException
	{
		click("(//a[@class='ng-scope'])[3]");
		Thread.sleep(4000);
	}
	public void Supplier_create()
	{
		click("#newSupplier");
	}
	public String name(String name)
	{
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 name = name + date1;
		return name;
	}
	public void Supplier_Name()
	{
		type("#suppliertype_contacts_companyname",name("Ranjit-"));
	}
	public void Supplier_Address1()
	{
		type("#suppliertype_addressline1","Madurai 1 ");
	}
	public void Supplier_Address2()
	{
		type("#suppliertype_addressline2","Madurai 2 ");
	}
	public void Supplier_email()
	{
		type("#suppliertype_contacts_contactsemail_emailaddress","ranjit@commusoft.com");
	}
	public void Supplier_save()
	{
		click("//span[@ng-hide='saving']");
	}
	public void Supplier_PO_AddPOButton()
	{
		click("(//a[@class='btn btn-primary btn-small ng-scope'])[1]");
	}
	
	
	public void Add_Supplier_PO()
	{
		click("//a[text()=\"Add new purchase order\"]");
	}
	
	
	
	
	
	
}
