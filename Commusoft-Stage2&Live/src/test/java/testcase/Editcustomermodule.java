package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Editcustomer_workaddress;
import pages.LoginPage;

public class Editcustomermodule extends Baseclass {


	String homepage;
	String customer = "https://stage2.commusoft.net/customers/customer";
	String editworkadddress = "https://stage2.commusoft.net/customers/customer/1420/work/view";

	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority = 1)
	public void Edit_customer() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(3000);
		Editcustomer_workaddress editcustomer = new Editcustomer_workaddress(driver);
		editcustomer.View_customer();
		editcustomer.Editcustomer_link();
		editcustomer.Editcustomer_title();
		editcustomer.Editcustomer_Name();
		editcustomer.Editcustomer_SurName();
		editcustomer.Editcustomer_Mobile();
		editcustomer.Editcustomer_email();
		editcustomer.Editcustomer_AddressLine1();
		editcustomer.Editcustomer_Save();
	}

	@Test(priority = 2)

	public void  editworkaddress() throws InterruptedException

	{

		driver.get(editworkadddress);
		Thread.sleep(3000);
		Editcustomer_workaddress editworkaddress = new Editcustomer_workaddress(driver);
		editworkaddress.EditWorkaddress_view();
		editworkaddress.Edit_workaddress();
		editworkaddress.Edit_WAtitle();
		editworkaddress.Edit_waname();
		editworkaddress.Edit_wasurname();
		editworkaddress.Edit_walandline();
		editworkaddress.Edit_wamobile();
		editworkaddress.Edit_waemail();
		editworkaddress.Edit_waaddress1();
		editworkaddress.Edit_wasavebutton();

	}



}
