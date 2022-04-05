package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Company extends Wrapper{
	
	public Company(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public HashMap<String,String> companyname()
	{
		HashMap<String,String> customer = new HashMap<String,String>();
		customer.put("Star", "Star_Systems_star@commusoft.com_8248724397_NO.4,4thCROSSSTREET_GOWRI NAGAR_MUGALIVAKKAM_CHENNAI");
		customer.put("Commusoft", "Commusoft_India_comm@commusoft.com_8248724397_Floor3,241Southwark_BridgeRd_London,_SE1 6FP");
		
		return customer;
		
	}
		String a = companyname().get("Star");
		String Star[] = a.split("_");
		String b = companyname().get("Commusoft");
		String Commusoft[] = b.split("_");
		
		public void Add_Company() throws InterruptedException
		{
			click("#customertypecompany");
			Thread.sleep(2000);
		}
		public void Company_Name() throws InterruptedException
		{
			type("#company_contacts_companyname", Star[0]+Star[1]);
			Thread.sleep(2000);
		}
		public void Comapny_Address1() throws InterruptedException
		{
			type("#company_addressline1", Star[4]);
			Thread.sleep(2000);
		}
		public void Company_Address2() throws InterruptedException
		{
			type("#company_addressline2", Star[5]);
			Thread.sleep(2000);
		}
		public void Company_Address3() throws InterruptedException
		{
			type("#company_addressline3", Star[6]);
			Thread.sleep(2000);
		}
		public void Company_Town() throws InterruptedException
		{
			type("#company_town", Star[7]);
			Thread.sleep(2000);
		}
		public void Company_County() throws InterruptedException
		{
			click("(//span[@class=\"select2-chosen\"])[1]");
			Thread.sleep(5000);
			type("//input[@class=\"select2-input select2-focused\"]", "Antrim");
			Thread.sleep(3000);
			click("//span[@class=\"select2-match\" and contains(text(),'Antrim')]");
			Thread.sleep(10000);
		}
		public void Company_Postalcode() throws InterruptedException
		{
			type("#company_postcode", "600032");
			Thread.sleep(2000);
		}
		public void Company_Landline() throws InterruptedException
		{
			type("#company_contacts_companylandline_telephonenumber", "8248724397");
			Thread.sleep(2000);
		}
		public void Company_Email() throws InterruptedException
		{
			type("#company_contacts_contactsemail_emailaddress", "enter@gmai.co");
			Thread.sleep(2000);
		}
		public void Company_Title() throws InterruptedException
		{
			selectdropdown("#company_optionalcontacts_settingsTitlesid", "Mr");
			Thread.sleep(2000);
		}
		public void Company_Contact_Details() throws InterruptedException
		{
			type("#company_optionalcontacts_name", "Contact");
			type("#company_optionalcontacts_surname", "test");
			type("#company_optionalcontacts_position", "tester");
			type("#company_contacts_contactstelephone_0_telephonenumber", "5454545454");
			type("#company_contacts_contactstelephone_1_telephonenumber", "545454545");
			type("#company_optionalcontacts_contactsemail_emailaddress", "enter@gmail.co");
			Thread.sleep(4000);
		}
		public void Company_Save()
		{
			click("//button[@type=\"submit\"]");
		}
		
		public void Create_Company() throws InterruptedException
		{
			Add_Company();
			Company_Name();
			Comapny_Address1();
			Company_Address2();
			Company_Address3();
			Company_Town();
			Company_County();
			Company_Postalcode();
			Company_Landline();
			Company_Email();
			Company_Title();
			Company_Contact_Details();
			Company_Save();	
			Thread.sleep(8000);
			if(!driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).isDisplayed()) {
					
			}else {
				click("(//button[@type=\"submit\"])[2]");
				Thread.sleep(8000);
			}
		}
		public void Edit_Company() throws InterruptedException
		{
			click("#editcustomer");
			Thread.sleep(5000);
			clear("$customerDetails.companyname");
			type("$customerDetails.companyname", Commusoft[0]+Commusoft[1]);
			clear("$customerLandlineNumber");
			type("$customerLandlineNumber", Commusoft[3]);
			clear("$customerDetails.emailAddress");
			type("$customerDetails.emailAddress", Commusoft[2]);
			clear("$addressline1");
			type("$addressline1", Commusoft[4]);
			clear("$addressline2");
			type("$addressline2", Commusoft[5]);
			clear("$addressline3");
			type("$addressline3", Commusoft[6]);
			clear("$town");
			type("$town", "town edited");
			click("(//span[@class=\"select2-chosen\"])[2]");
			Thread.sleep(3000);
			type("//input[@class=\"select2-input select2-focused\"]", "Bedfordshire");
			Thread.sleep(3000);
			click("//span[@class=\"select2-match\" and contains(text(),'Bedfordshire')]");
			Thread.sleep(5000);
			clear("(//input[@name=\"postcode\"])[3]");
			type("(//input[@name=\"postcode\"])[3]", Commusoft[7]);
			Thread.sleep(3000);
			click("//button[@class=\"btn btn-primary loading_btn save_btn\"]");
		}
		public void Delete_Company() throws InterruptedException
		{
			Thread.sleep(4000);
			click("//a[@class=\"btn dropdown-toggle btn-small quick-links-btn\"]");
			Thread.sleep(4000);
			click("//a[@class=\"ng-scope\" and contains(text(),'Delete')]");
			Thread.sleep(7000);
			type("#confirm_delete_input", "DELETE");
			Thread.sleep(3000);
			click("//a[@id=\"delete-button\"]");
		}
		

}
