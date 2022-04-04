package pages;

import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import action.Wrapper;

public class Editcustomer_workaddress extends Wrapper {




	public Editcustomer_workaddress (WebDriver ldriver)
	{
		this.driver = ldriver;
	}

	public HashMap<String,String> customername()
	{
		HashMap<String,String> customer = new HashMap<String,String>();
		customer.put("Karna", "Karnan_Athisivam_karnan@commusoft.com_8248724397_Chennai");
		customer.put("WA", "Work_Address_WA@commusoft.com_8248724397_Madras");
		
		return customer;
		
	}
		String a = customername().get("Karna");
		String Karna[] = a.split("_");


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
	public void Unique_Editcustomer_Name()
	{
		String name = Karna[0] + new Random().nextInt(1000);
		clear("//input [@id='name']");
		type("//input [@id='name']", name);
	}

	public void Editcustomer_SurName()
	{
		clear("//input [@name='customerDetails.surname']");
		type("//input [@name='customerDetails.surname']", "Raja");
	}
	public void Unique_Editcustomer_SurName()
	{
		String name = Karna[1] + new Random().nextInt(1000);
		clear("//input [@name='customerDetails.surname']");
		type("//input [@name='customerDetails.surname']", name);
	}
	public void Editcustomer_Mobile()
	{
		clear("//input [@name='customerMobileNumber']");
		type("//input [@name='customerMobileNumber']", "97899599678");
	}
	public void Unique_Editcustomer_Mobile()
	{
		String name = Karna[3] + new Random().nextInt(1000);
		clear("//input [@name='customerMobileNumber']");
		type("//input [@name='customerMobileNumber']", name);
	}
	public void Editcustomer_email()
	{
		clear("//input [@name='customerEmail']");
		type("//input [@name='customerEmail']", "eezhilraja@commusoft.com");
	}
	public void Unique_Editcustomer_email()
	{
		Random randomGenerator = new Random();  
		int name = randomGenerator.nextInt(1000);
		clear("//input [@name='customerEmail']");
		type("//input [@name='customerEmail']", "karna"+name+"@commusoft.com");
	}
	public void Editcustomer_AddressLine1()
	{
		type("//input [@name='addressline1']", "Thirumazhisai");
	}
	public void Unique_Editcustomer_AddressLine1()
	{
		String name = Karna[4] + new Random().nextInt(1000);
		type("//input [@name='addressline1']", name);
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
	public void Unique_Edit_waname()
	{
		String name = Karna[0] + new Random().nextInt(1000);
		click("#name");
		clear("#name");
		type("#name", name);

	}
	public void Edit_wasurname()
	{
		clear ("$customerDetails.surname");
		type("$customerDetails.surname","elango");

	}
	public void Unique_Edit_wasurname()
	{
		String name = Karna[1] + new Random().nextInt(1000);
		clear ("$customerDetails.surname");
		type("$customerDetails.surname",name);

	}

	public void Edit_walandline()
	{

		clear("$customerLandlineNumber");
		type("$customerLandlineNumber","04426120526");

	}
	public void Unique_Edit_walandline()
	{

		clear("$customerLandlineNumber");
		type("$customerLandlineNumber","04426120526");

	}

	public void Edit_wamobile()

	{
		clear("$customerMobileNumber");	
		type("$customerMobileNumber","9789929937");

	}
	public void Unique_Edit_wamobile()

	{
		clear("$customerMobileNumber");	
		type("$customerMobileNumber","8888888888");

	}

	public void Edit_waemail()

	{
		clear ("$customerEmail");
		type  ("$customerEmail","eezhilraja@commusoft.com");

	}
	public void Unique_Edit_waemail()

	{
		Random randomGenerator = new Random();  
		int name = randomGenerator.nextInt(1000);
		clear ("$customerEmail");
		type  ("$customerEmail","karnan"+name+"@commusoft.com");

	}

	public void Edit_waaddress1()
	{
		clear("$addressline1");
		type("$addressline1","Demo1");
	}
	public void Unique_Edit_waaddress1()
	{
		Random randomGenerator = new Random();  
		int name = randomGenerator.nextInt(1000);
		clear("$addressline1");
		type("$addressline1","Chenani"+name);
	}

	public void Edit_wasavebutton()
	{
		click("//button [@class='btn btn-primary loading_btn save_btn']");

	}


}






