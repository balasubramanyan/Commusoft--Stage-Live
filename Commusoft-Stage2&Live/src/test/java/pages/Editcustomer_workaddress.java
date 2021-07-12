package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import action.Wrapper;

public class Editcustomer_workaddress extends Wrapper {




	public Editcustomer_workaddress (WebDriver ldriver)
	{
		this.driver = ldriver;
	}



	public void View_customer()
	{
		click("//a [@id='Name']");
	}

	public void Editcustomer_link() throws InterruptedException
	{

		click("//span[text() = 'Edit customer']");
		Thread.sleep(3000);
	}
	public void Editcustomer_title() throws InterruptedException


	{
		click ("//select [@id='title']");
		Thread.sleep(3000);
		click("//option [text() = 'Mr & Mrs']");
	}
	public void Editcustomer_Name()
	{
		clear("//input [@id='name']");
		type("//input [@id='name']", "Ezhil ");
	}

	public void Editcustomer_SurName()
	{
		clear("//input [@name='customerDetails.surname']");
		type("//input [@name='customerDetails.surname']", "Raja");
	}
	public void Editcustomer_Mobile()
	{
		clear("//input [@name='customerMobileNumber']");
		type("//input [@name='customerMobileNumber']", "97899599678");
	}
	public void Editcustomer_email()
	{
		clear("//input [@name='customerEmail']");
		type("//input [@name='customerEmail']", "eezhilraja@commusoft.com");
	}
	public void Editcustomer_AddressLine1()
	{
		type("//input [@name='addressline1']", "Thirumazhisai");
	}
	public void Editcustomer_Save()
	{
		click("//button [@class='btn btn-primary loading_btn save_btn']");
	}


	public void EditWorkaddress_view()
	{
		click ("//span [text() = 'View']");
	}

	public void Edit_workaddress()
	{
		click("//span [text() = 'Edit work address']");

	}

	public void Edit_WAtitle()
	{
		//click("#title");
		Select value = new Select(driver.findElement(By.id("title")));
		value.selectByValue("3");

	}

	public void Edit_waname()
	{
		click("#name");
		type("#name", "WA ezhilraja");

	}
	public void Edit_wasurname()
	{
		clear ("$customerDetails.surname");
		type("$customerDetails.surname","elango");

	}

	public void Edit_walandline()
	{

		clear("$customerLandlineNumber");
		type("$customerLandlineNumber","04426120526");

	}

	public void Edit_wamobile()

	{
		clear("$customerMobileNumber");	
		type("$customerMobileNumber","9789929937");

	}

	public void Edit_waemail()

	{
		clear ("$customerEmail");
		type  ("$customerEmail","eezhilraja@commusoft.com");

	}

	public void Edit_waaddress1()
	{
		clear("$addressline1");
		type("$addressline1","Demo1");
	}

	public void Edit_wasavebutton()
	{
		click("//button [@class='btn btn-primary loading_btn save_btn']");

	}


}






