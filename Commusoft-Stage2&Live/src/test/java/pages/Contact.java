package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Contact extends Wrapper {
	
	public Contact(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Click_contacttab ()
	{
		click("//span[text()='Contacts']");
	}
	public void Add_contact()
	{
		
		click("//a[text()='Add new contact']");
	}
	public void Con_title()
	{
		selectdropdownvalue("//*[@id=\"contact_settingsTitlesid\"]", "1");
	}
	public void name()
	{
		
		type("#contact_name", "divya");
	}
	public void Surname()
	{
		type("#contact_surname", "jillu");
	}
	public void Email() {
		type("#contact_contactsemail_emailaddress","divya@gmail.com");
	}
	public void  Click()
	{
		click("//span[@class='number-type-toggle ng-binding']");
	}
	public void Click_mobile()
	{	
		
		click("//li[text()='Mobile']");
	}
	public void Phone_number()
	{
		type("$contact[contactstelephone][0][telephonenumber]", "368057898");
	}
	public void click_addphone()
	{
	
		click("//span[text()='Add phone number']");
	}
	public void click_addcontact()
	{
		
		click("//span[text()='Add contact']");
	}

}
