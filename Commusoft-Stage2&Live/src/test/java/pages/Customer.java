package pages;

import java.security.Timestamp;
import java.util.HashMap;
import java.util.Random;

import org.bouncycastle.tsp.TimeStampResponse;
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
		customer.put("Karna", "Karnan_Athisivam_karnan@commusoft.com_8248724397_Chennai");
		customer.put("Karna_Edit", "Karikalan_A_kari@commusoft.com_8248724397_Chennai");
		customer.put("Ezhil", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		
		return customer;
		
	}
		String a = customername().get("Karna");
		String Karna[] = a.split("_");
		String b = customername().get("Karna_Edit");
		String Karna_Edit[] = b.split("_");
	
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
		type("#customertype_contacts_name", Karna[0]);
	}
	public void Unique_Customer_Name()
	{
		String name = Karna[0] + new Random().nextInt(1000);
		
		type("#customertype_contacts_name", name);
		
	}
	public void Customer_Name(String name)
	{
		type("#customertype_contacts_name",name );
	}
	public void Customer_SurName()
	{
		type("#customertype_contacts_surname", Karna[1]);
	}
	public void Customer_Mobile()
	{
		type("#customertype_contacts_contactstelephone_0_telephonenumber", Karna[3]);
	}
	public void Customer_email()
	{
		type("#customertype_contacts_contactsemail_emailaddress", "estimateemail@yopmail.com");
	}
	public void Customer_AddressLine1()
	{
		type("#customertype_addressline1", Karna[4]);
	}
	public void Customer_AddressLine2()
	{
		type("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/div[1]/div/div/form/fieldset[2]/div[2]/div[2]/div[3]/div/input", Karna[5]);
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
	public void Edit_Customers() throws InterruptedException
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
	public void Add_Unique_Customer() throws InterruptedException
	{
		Thread.sleep(6000);
		Customer_create();
		Customer_title();
		Unique_Customer_Name();
		Customer_SurName();
		Customer_Mobile();
		Customer_email();
		Customer_AddressLine1();
		Customer_Save();
		Thread.sleep(25000);
		
	}
	public void Verify_Customer() throws InterruptedException
	{
		Thread.sleep(5000);
		CustomerName = gettext("(//span[@class=\"ng-binding\"])[6]");
		AccountNumber = gettext("(//span[@class=\"ng-binding\"])[8]");
		System.out.println(AccountNumber);
		type("(//input[@class=\"ng-pristine ng-valid\"])[1]", AccountNumber);
		Thread.sleep(3000);
		typeenter("//input[@id=\"search-input\"]");
		Thread.sleep(5000);
		click("//a[@class=\"ng-scope ng-binding\" and contains(text(),'"+CustomerName+"')]");
		Thread.sleep(4000);
		String Actual = gettext("(//span[@class=\"ng-binding\"])[6]");
		String ActualNumber = gettext("(//span[@class=\"ng-binding\"])[8]");
		Assertion(AccountNumber, ActualNumber, "Customer Number Loaded Successfully as expected");
		Assertion(CustomerName, Actual, "Customer Loaded Successfully as expected");
	}
	
	public void Unique_Workaddress_create() throws InterruptedException
	{
		String name = "Work Address Karnan" + new Random().nextInt(1000);
		
		type("#workaddress_contacts_name",name);
		
		type("#workaddress_contacts_surname","Athisivam");
		
		type("#workaddress_contacts_contactstelephone_0_telephonenumber","8248724397");
		
		type("#workaddress_contacts_contactstelephone_1_telephonenumber","2530178");
		
		type("#workaddress_contacts_contactsemail_emailaddress","karnan@yopmail.com");
		
		type("#workaddress_addressline1","Chennai City");
		click("//span[@ng-hide='saving']");
		Thread.sleep(9000);
	}
	
	public void Verify_WA() throws InterruptedException
	{
		Thread.sleep(6000);
		WAName = gettext("(//span[@class=\"ng-binding\"])[14]");
		WAAccountNumber = gettext("(//span[@class=\"ng-binding\"])[16]");
		System.out.println("WA" +WAAccountNumber);
		clear("//input[@id=\"search-input\"]");
		type("//input[@id=\"search-input\"]", WAAccountNumber);
		Thread.sleep(3000);
		typeenter("//input[@id=\"search-input\"]");
		Thread.sleep(5000);
		click("//a[@class=\"ng-scope ng-binding\" and contains(text(),'"+WAName+"')]");
		Thread.sleep(4000);
		String Actual = gettext("(//span[@class=\"ng-binding\"])[13]");
		String ActualNumber = gettext("(//span[@class=\"ng-binding\"])[15]");
		Assertion(WAAccountNumber, ActualNumber, "WA Number Loaded Successfully as expected");
		Assertion(WAName, Actual, "WA Loaded Successfully as expected");
	}
	
}
