package pages;

import java.security.Timestamp;
import java.util.HashMap;
import java.util.Random;

import org.bouncycastle.tsp.TimeStampResponse;
import org.openqa.selenium.By;
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
		customer.put("Karna", "Karnan_Athisivam_karnan@commusoft.com_8248724397_NO.4,4thCROSSSTREET_GOWRI NAGAR_MUGALIVAKKAM_CHENNAI_Senior Test Engineer");
		customer.put("Karna_Edit", "Karikalan_A_kari@commusoft.com_8248724397_Floor3,241Southwark_BridgeRd_London,_SE1 6FP");
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
	public void EditCustomer_title() throws InterruptedException
	{

		Thread.sleep(2000);
		selectdropdown("$selectedTitle", "Dr");
	}
	public void Customer_Name()
	{
		type("#customertype_contacts_name", Karna[0]);
	}
	public void EditCustomer_Name() throws InterruptedException
	{
		clear("#name");
		Thread.sleep(2000);
		type("#name", Karna_Edit[0]);
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
	public void EditCustomer_SurName() throws InterruptedException
	{
		clear("$customerDetails.surname");
		Thread.sleep(2000);
		type("$customerDetails.surname", Karna_Edit[1]);
	}
	public void Customer_Mobile()
	{
		type("#customertype_contacts_contactstelephone_0_telephonenumber", Karna[3]);
	}
	public void EditCustomer_Mobile() throws InterruptedException
	{
		clear("$customerLandlineNumber");
		Thread.sleep(2000);
		type("$customerLandlineNumber", Karna_Edit[3]);
	}
	public void Customer_Landline()
	{
		type("#customertype_contacts_contactstelephone_1_telephonenumber", Karna[3]);
	}
	public void EditCustomer_Landline() throws InterruptedException
	{
		clear("$customerMobileNumber");
		Thread.sleep(2000);
		type("$customerMobileNumber", Karna_Edit[3]);
	}
	public void Customer_email()
	{
		type("#customertype_contacts_contactsemail_emailaddress", "estimateemail@yopmail.com");
	}
	public void EditCustomer_email() throws InterruptedException
	{
		clear("$customerEmail");
		Thread.sleep(2000);
		type("$customerEmail", "edited@yopmail.com");
	}
	public void Customer_AddressLine1()
	{
		type("#customertype_addressline1", Karna[4]);
	}
	public void EditCustomer_AddressLine1() throws InterruptedException
	{
		clear("$addressline1");
		Thread.sleep(2000);
		type("$addressline1", Karna_Edit[4]);
	}
	public void Customer_AddressLine2()
	{
		type("#customertype_addressline2", Karna[5]);
	}
	public void EditCustomer_AddressLine2() throws InterruptedException
	{
		clear("$addressline2");
		Thread.sleep(2000);
		type("$addressline2", Karna_Edit[5]);
	}
	public void Customer_AddressLine3()
	{
		type("#customertype_addressline3", Karna[6]);
	}
	public void EditCustomer_AddressLine3() throws InterruptedException
	{
		clear("$addressline3");
		Thread.sleep(2000);
		type("$addressline3", Karna_Edit[6]);
	}
	public void Customer_town()
	{
		type("#customertype_town", Karna[7]);
	}
	public void EditCustomer_town() throws InterruptedException
	{
		clear("$town");
		Thread.sleep(2000);
		type("$town", Karna_Edit[7]);
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
	public void EditCustomer_Save() 
	{
		click("//button[@class=\"btn btn-primary loading_btn save_btn\"]");
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
		Customer_Landline();
		Customer_Mobile();
		Customer_email();
		Customer_AddressLine1();
		Customer_AddressLine2();
		Customer_AddressLine3();
		Customer_town();
		Customer_Save();
		Thread.sleep(25000);

	}
	public void Edit_Customers() throws InterruptedException
	{
		//This method follow the Add customer 
		Edit_Customer();
		EditCustomer_title();
		EditCustomer_Name();
		EditCustomer_SurName();
		EditCustomer_Mobile();
		EditCustomer_Landline();
		EditCustomer_email();
		EditCustomer_AddressLine1();
		EditCustomer_AddressLine2();
		EditCustomer_AddressLine3();
		EditCustomer_town();
		EditCustomer_Save();
		Thread.sleep(10000);

	}
	public void Delete_Customers() throws InterruptedException
	{
		//This method follow the Edit customer 
		Thread.sleep(5000);
		click("//a[@class=\"btn dropdown-toggle btn-small quick-links-btn\"]");
		Thread.sleep(4000);
		click("//a[@class=\"ng-scope\" and contains(text(),'Delete')]");
		Thread.sleep(5000);
		type("#confirm_delete_input","DELETE");
		Thread.sleep(3000);
		click("#delete-button");
		Thread.sleep(5000);
	}
	public void Add_Primary_Contact() throws InterruptedException
	{
		Thread.sleep(4000);
		click("//a[@id=\"contactsTab\"]");
		Thread.sleep(4000);
		click("//a[@class=\"btn btn-primary btn-small loading_btn save_btn ng-scope\" and contains(text(),'Add new contact')]");
		Thread.sleep(5000);
		selectdropdown("#contact_settingsTitlesid", "Mr");
		type("#contact_name", "Contact Name");
		type("#contact_surname", "Sur Name");
		click("#show_date_picker");
		Thread.sleep(3000);
		click("//a[@class=\"daterange-day ng-binding today\"]");
		type("$contact[contactstelephone][0][telephonenumber]", "87878787");
		Thread.sleep(4000);
		click("//span[@class=\"ng-scope\" and contains(text(),'Add phone number')]");
		Thread.sleep(3000);
		type("#contact_position", Karna[8]);
		type("#contact_contactsemail_emailaddress", "erere@sdsd.ol");
		type("//input[@ng-model=\"Twitter_Handle\"]", "twitter");
		type("//input[@ng-model=\"Facebook_URL\"]", "FB");
		type("//input[@ng-model=\"LinkedIn_URL\"]", "LinkedIn");
		Thread.sleep(3000);
		click("//button[@type=\"submit\"]");
		Thread.sleep(6000);
		click("//a[@class=\"edit ng-scope\" and contains(text(),'Set as primary contact')]");
		Thread.sleep(5000);
		type("//input[@id=\"confirm_delete_input\"]", "primary");
		Thread.sleep(4000);
		click("//a[@class=\"btn btn-primary make-default-btn save_btn\"]");

		if(driver.findElement(By.xpath("//td[@class=\"ng-binding\" and contains(text(),'"+Karna[8]+"')]")).isDisplayed()) {
			System.out.println("Primary contact changed as per the code flow");	
		}else {
			System.out.println("Primary contact Error in changing");		
		}
	}
	public void Add_Branch() throws InterruptedException
	{
		Thread.sleep(4000);
		click("//span[@class=\"ng-scope\" and contains(text(),'Branches')]");
		Thread.sleep(4000);
		click("//a[@id=\"addNewBranch\"]");
		Thread.sleep(3000);
		type("#branch_branchname", "Branch Name");
		type("#branch_addressline1", "Add1");
		type("#branch_addressline2", "Add2");
		type("#branch_addressline3", "Add3");
		type("#branch_town", "Town");
		Thread.sleep(3000);
		click("(//span[@class=\"select2-chosen\"])[1]");
		Thread.sleep(3000);
		type("//input[@class=\"select2-input select2-focused\"]", "Bristol");		
		click("//span[@class=\"select2-match\" and contains(text(),'Bristol')]");
		type("#branch_postcode", "600032");
		Thread.sleep(3000);
		click("//button[@type=\"submit\"]");
	}
	public void Edit_Branch() throws InterruptedException
	{
		//edit
		Thread.sleep(4000);
		click("//a[@class=\"edit ng-scope\"]");
		Thread.sleep(5000);
		clear("$branchDetails.branchname");
		type("$branchDetails.branchname", "Branch edited");
		clear("$addressline1");
		type("$addressline1", "Add1 edited");
		clear("$addressline2");
		type("$addressline2", "Add2 edited");
		clear("$addressline3");
		type("$addressline3", "Add3 edited");
		clear("$town");
		type("$town", "Town edited");
		click("(//span[@class=\"select2-chosen\"])[1]");
		Thread.sleep(2000);
		type("//input[@class=\"select2-input select2-focused\"]", "Kent");		
		click("//span[@class=\"select2-match\" and contains(text(),'Kent')]");
		Thread.sleep(4000);
		clear("//input[@id=\"postcode\"]");
		type("//input[@id=\"postcode\"]", "SE1 6FP");
		Thread.sleep(5000);
		click("//button[@class=\"btn btn-primary loading_btn save_btn\"]");
	}
	public void Delete_Branch() throws InterruptedException
	{
		//delete
		Thread.sleep(7000);
		click("(//a[@class=\"ng-scope\" and contains(text(),'Delete')])[2]");
		Thread.sleep(4000);
		type("//input[@id=\"confirm_delete_input\"]", "DELETE");
		Thread.sleep(2000);
		click("//a[@id=\"delete-button\"]");

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
