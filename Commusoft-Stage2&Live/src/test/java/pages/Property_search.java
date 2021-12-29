package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Property_search extends Wrapper {

	public Property_search(WebDriver ldriver)
	{
		this.driver= ldriver;
	}

	public void search_customer()
	{
		clear ("$q");
		type("$q", "Testing Customer");
		typeenter("$q");

	}

	public void click_customer()

	{
       click("//a [text() = 'Mr & Mrs Testing Customer']");
	}
	public void search_workaddress()
	{
		clear ("$q");
		type("$q", "Update name");
		typeenter("$q");

	}

	public void click_workaddress()

	{

		click("//a [text() = 'Mrs Update name']");
		

	}
	public void search_company()
	{
		clear ("$q");
		type("$q", "AbC company");
		typeenter("$q");
	}
	public void click_company()
	{
		click("//a [text() = 'AbC company']");
	}
	public void search_WA_as_company()
	{
		clear ("$q");
		type("$q", "WA as Company");
		typeenter("$q");
	}
	public void click_WA_as_company()
	{
		click("//a [text() = 'WA as Company']");
	}


}
