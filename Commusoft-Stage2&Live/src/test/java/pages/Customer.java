package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Customer extends Wrapper {
	
	public Customer(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public HashMap<String,String> customername()
	{
		HashMap<String,String> customer = new HashMap<String,String>();
		customer.put("Ranjit", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai_TamilNadu");
		customer.put("Bala", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		customer.put("Karna", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		customer.put("Ezhil", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		
		return customer;
		
	}
		String a = customername().get("Ranjit");
		String Ranjit[] = a.split("_");
	
	public void Customer_create()
	{
		click("#customertypecustomer");
	}
	public void Customer_title()
	{
		selectdropdown("#customertype_contacts_settingsTitlesid", "Mr");
	}
	public void Customer_Name()
	{
		type("#customertype_contacts_name", Ranjit[0]);
	}
	public void Customer_Name(String name)
	{
		type("#customertype_contacts_name",name );
	}
	public void Customer_SurName()
	{
		type("#customertype_contacts_surname", Ranjit[1]);
	}
	public void Customer_Mobile()
	{
		type("#customertype_contacts_contactstelephone_0_telephonenumber", Ranjit[3]);
	}
	public void Customer_email()
	{
		type("#customertype_contacts_contactsemail_emailaddress", Ranjit[2]);
	}
	public void Customer_AddressLine1()
	{
		type("#customertype_addressline1", Ranjit[4]);
	}
	public void Customer_AddressLine2()
	{
		type("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/div[1]/div/div/form/fieldset[2]/div[2]/div[2]/div[3]/div/input", Ranjit[5]);
	}
	public void Edit_Customer()
	{
		click("#editcustomer");
	}
	public void Edit_Customer_Save()
	{
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/div[1]/div/div/form/div[2]/button/span[1]");
	}
	public void Customer_Save()
	{
		click("//button[@type='submit']");
	}
	public void workaddress_tab()
	{
		click("#workAddressTab");
	}
	public void workaddress_addnewWorkaddress()
	{
		click("#addNewBranch");
	}
	public void Workaddress_create() throws InterruptedException
	{
		type("#workaddress_contacts_name","Work Address Ranjit");
		
		type("#workaddress_contacts_surname","Aravind");
		
		type("#workaddress_contacts_contactstelephone_0_telephonenumber","9865326598");
		
		type("#workaddress_contacts_contactstelephone_1_telephonenumber","2530178");
		
		type("#workaddress_contacts_contactsemail_emailaddress","ranjittestinfgun@yopmail.com");
		
		type("#workaddress_addressline1","Madurai JILLA");
		click("//span[@ng-hide='saving']");
		Thread.sleep(9000);
	}
	
	/*K*/
	
	public void Add_Customer() throws InterruptedException
	{
		Customer_create();
		Customer_title();
		Customer_Name();
		Customer_SurName();
		Customer_Mobile();
		Customer_email();
		Customer_AddressLine1();
		Customer_Save();
		Thread.sleep(25000);
		
	}
	
	
	
}
