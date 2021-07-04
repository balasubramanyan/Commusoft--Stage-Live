package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Customer_search extends Wrapper {

	public Customer_search(WebDriver ldriver)
	{
		this.driver= ldriver;
	}

	public void global_search()
	{

		type("$q", "RanjitCustomer editCustomer edit1 Surnamecs Edit");

		typeenter("$q");

	}

	public void click_customer()

	{

		click("//a [text() = 'Mr & Mrs RanjitCustomer editCustomer edit1 Surnamecs Edit']");

	}



}
