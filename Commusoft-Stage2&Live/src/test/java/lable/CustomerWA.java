package lable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import action.Baseclass;
import pages.Company;
import pages.Customer;
import pages.Diary;
import pages.Editcustomer_workaddress;
import pages.LoginPage;
import pages.Property_search;
import pages.Reporting;

public class CustomerWA extends Baseclass {
	String homepage;
	public String customerpage;
	public String WApage;
	public String Companypage;
	public String Company_WA;
	public String WA_as_Company;
   
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(15000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority = 1)
	public  void Property_Links_Verification() throws InterruptedException
	{
		Thread.sleep(6000);
		click("//a[text()='View all properties']");
		click("/html/body/div[3]/ng-container/div/section/div[2]/div/ng-container/div[2]/div/div/section/section/table/tbody/tr[1]/td[7]/a");
		Thread.sleep(3000);
		click("//a[text()='Customers']");
		click("//a[text()='Total number of customers:']");
		click("/html/body/div[3]/ng-container/div/section/div[2]/div/ng-container/div[2]/div/div/section/section/table/tbody/tr[1]/td[7]/a");
		Thread.sleep(3000);
		click("//a[text()='Customers']");
		click("//a[text()='Total number of work addresses:']");
		click("/html/body/div[3]/ng-container/div/section/div[2]/div/ng-container/div[2]/div/div/section/section/table/tbody/tr[1]/td[7]/a");
		Thread.sleep(3000);
		click("//a[text()='Customers']");
	}
	@Test(priority = 2)
	public void Customer_Add() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Customer_create();
		customer.Customer_title();
		customer.Customer_Name();
		customer.Customer_SurName();
		customer.Customer_Mobile();
		customer.Customer_email();
		customer.Customer_AddressLine1();
		customer.Customer_Save();
		Thread.sleep(20000);
		customerpage = driver.getCurrentUrl();
	}
	@Test(priority = 3)
	public void Customer_Edit() throws InterruptedException
	{

		//driver.get(customerpage);
		Thread.sleep(6000);
		Editcustomer_workaddress editcustomer = new Editcustomer_workaddress(driver);
		editcustomer.Editcustomer_link();
		//editcustomer.Editcustomer_title();
		//editcustomer.Editcustomer_Name();
		//editcustomer.Editcustomer_SurName();
		editcustomer.Editcustomer_Mobile();
		editcustomer.Editcustomer_email();
		editcustomer.Editcustomer_AddressLine1();
		editcustomer.Editcustomer_Save();
		Thread.sleep(6000);
	}
	@Test(priority = 4)
	public void Customer_Search() throws InterruptedException
	{
		driver.get(customerpage);
		Property_search searchcustomer = new Property_search(driver);	
		searchcustomer.search_customer();
		Thread.sleep(6000);
		searchcustomer.click_customer();
		Thread.sleep(6000);
	}
	@Test(priority = 5)
	public void Workaddress_Add() throws InterruptedException//Work address agains customer
	{
		driver.get(customerpage);
		Thread.sleep(20000);
		Customer customer = new Customer(driver);
		customer.workaddress_tab();
		customer.workaddress_addnewWorkaddress();
		customer.Workaddress_create();
		Thread.sleep(20000);
		WApage = driver.getCurrentUrl();

	}

	@Test(priority = 6)	
	public void  WorkAddress_Edit() throws InterruptedException
	{
		//driver.get(WApage);
		Thread.sleep(20000);
		Editcustomer_workaddress editworkaddress = new Editcustomer_workaddress(driver);
		//editworkaddress.EditWorkaddress_view();
		editworkaddress.Edit_workaddress();
		editworkaddress.Edit_WAtitle();
		editworkaddress.Edit_waname();
		editworkaddress.Edit_wasurname();
		editworkaddress.Edit_walandline();
		editworkaddress.Edit_wamobile();
		editworkaddress.Edit_waemail();
		editworkaddress.Edit_waaddress1();
		editworkaddress.Edit_wasavebutton();
		Thread.sleep(20000);

	}
	@Test(priority = 7)
	public void WA_Search() throws InterruptedException
	{
		click("//a[text()='Customers']");
		Property_search searchWA = new Property_search(driver);	
		searchWA.search_workaddress();
		Thread.sleep(6000);
		searchWA.click_workaddress();
		Thread.sleep(6000);
	}
	@Test(priority = 8)
	public void Company_Add() throws InterruptedException
	{
		Company company = new Company(driver);
		click("//a[text()='Customers']");
		company.Company_AddCompany();//Company without contact
		Thread.sleep(20000);
		Companypage = driver.getCurrentUrl();
	}
	@Test(priority = 9)
	public void Company_Edit() throws InterruptedException
	{
		Company company = new Company(driver);
		//driver.get(companypage);
		Thread.sleep(20000);
		company.Company_EditCompany();//Company without contact
		Thread.sleep(20000);
		companypage = driver.getCurrentUrl();
	}
	@Test(priority = 10)
	public void Company_Search() throws InterruptedException
	{
		click("//a[text()='Customers']");
		Property_search searchcompany = new Property_search(driver);	
		searchcompany.search_company();
		Thread.sleep(6000);
		searchcompany.click_company();
		Thread.sleep(6000);
	}
	@Test(priority = 11)
	public void Company_with_contact_Add() throws InterruptedException
	{
		Company company = new Company(driver);
		click("//a[text()='Customers']");
		company.Company_AddCompany_with_Contact();//Creating Company with contact
		Thread.sleep(20000);
		companypage = driver.getCurrentUrl();
	}
	@Test(priority = 12)
	public void Company_contact_Edit() throws InterruptedException
	{
		Company company = new Company(driver);
		driver.get(companypage);
		company.Company_Edit_Company_Contact();//Updating Company's contact
		Thread.sleep(20000);
	}
	@Test(priority = 13)
	public void Company_Add_Workaddress() throws InterruptedException//Work address against company
	{
		driver.get(companypage);
		Thread.sleep(20000);
		Customer customer = new Customer(driver);
		customer.workaddress_tab();
		customer.workaddress_addnewWorkaddress();
		customer.Workaddress_create();
		Thread.sleep(20000);
		Company_WA = driver.getCurrentUrl();
	
	}
	@Test(priority = 14)	
	public void  Company_Edit_WorkAddress() throws InterruptedException
	{
		//driver.get(WA);
		Thread.sleep(20000);
		Editcustomer_workaddress editworkaddress = new Editcustomer_workaddress(driver);
		//editworkaddress.EditWorkaddress_view();
		editworkaddress.Edit_workaddress();
		editworkaddress.Edit_WAtitle();
		editworkaddress.Edit_waname();
		editworkaddress.Edit_wasurname();
		editworkaddress.Edit_walandline();
		editworkaddress.Edit_wamobile();
		editworkaddress.Edit_waemail();
		editworkaddress.Edit_waaddress1();
		editworkaddress.Edit_wasavebutton();
		Thread.sleep(20000);
	}
	@Test(priority = 15)
	public void WAasCompany_Add() throws InterruptedException//Work address as company against customer
	{
		Thread.sleep(20000);
		Customer customer = new Customer(driver);
		click("//a[text()='Customers']");
		customer.Customer_create();
		customer.Customer_title();
		customer.Customer_Name();
		customer.Customer_SurName();
		customer.Customer_Mobile();
		customer.Customer_email();
		customer.Customer_AddressLine1();
		customer.Customer_Save();
		Thread.sleep(6000);
		customer.workaddress_tab();
		customer.workaddress_addnewWorkaddress();
		customer.Workaddress_as_company_create();
		Thread.sleep(20000);
		WA_as_Company = driver.getCurrentUrl();

	}
	@Test(priority = 16)
	public void WAasCompany_Edit() throws InterruptedException//Work address against customer
	{
		Thread.sleep(20000);
		Editcustomer_workaddress editworkaddress = new Editcustomer_workaddress(driver);
		//editworkaddress.EditWorkaddress_view();
		editworkaddress.Edit_workaddress();
		editworkaddress.Edit_WAcompanyname();
		editworkaddress.Edit_wasavebutton();
		Thread.sleep(20000);

	}
	
	@Test(priority = 17)
	public void WAasCompany_Search() throws InterruptedException
	{
		Property_search searchWA = new Property_search(driver);	
		click("//a[text()='Customers']");
		searchWA.search_WA_as_company();
		Thread.sleep(6000);
		searchWA.click_WA_as_company();
		Thread.sleep(6000);
	}
	@Test(priority = 18)
	public void Add_Customer_diary() throws InterruptedException
	{
		//Add Customer to customer in diary screen and add job
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		Thread.sleep(6000);
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_PM();
		Thread.sleep(6000);
		diary.Diary_job();
		Thread.sleep(6000);
		diary.Diary_job_Add_Property();
		Thread.sleep(3000);
		diary.Diary_TypesOfProperty_Customer();
		diary.Diary_TypesOfCustomer();
		Thread.sleep(6000);
		diary.Diary_AddProperty_CustomerName();
		diary.Diary_AddProperty_CustomerSurName();
		diary.Diary_AddProperty_CustomerEmail();
		diary.Diary_AddProperty_CustomerAdd1();
		diary.Diary_AddProperty_CustomerSave();
		Thread.sleep(5000);
		diary.Diary_Job_EventDescription();
		diary.Diary_Save();
		//diary.Diary_AddProperty_CloseSidepanel();
		Thread.sleep(6000);
	}
	/*@Test(priority = 1)
	public void Add_WorkAddress_diary() throws InterruptedException
	
	{
		//Add workaddress to customer in diary screen and add job
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		Thread.sleep(10000);
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_PM();
		Thread.sleep(10000);
		diary.Diary_job();
		Thread.sleep(6000);
		diary.Diary_job_Add_Property();
		diary.Diary_TypesOfProperty_WorkAddress();
		Thread.sleep(6000);
		diary.Diary_SearchCustomer_Add_WorkAddress();
		Thread.sleep(6000);
		diary.Diary_AddProperty_WAName();
		diary.Diary_AddProperty_WASurName();
		diary.Diary_AddProperty_WAEmail();
		diary.Diary_AddProperty_WAAdd1();
		diary.Diary_AddProperty_WAAdd2();
		diary.Diary_AddProperty_WASave();
		Thread.sleep(5000);
		diary.Diary_Job_EventDescription();
		diary.Diary_Save();
		//diary.Diary_AddProperty_CloseSidepanel();
		Thread.sleep(6000);
	}*/
	@Test(priority = 19)
	public void Add_Company_diary() throws InterruptedException
	{
		//Add Company in diary screen and add job
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		Thread.sleep(6000);
		diary.Diary_Daily();
		//diary.Diary_Today();
		diary.Diary_PM();
		Thread.sleep(6000);
		diary.Diary_job();
		Thread.sleep(6000);
		diary.Diary_job_Add_Property();
		Thread.sleep(3000);
		diary.Diary_TypesOfProperty_Customer();
		diary.Diary_TypesOfCompany();
		Thread.sleep(6000);
		diary.Diary_AddProperty_CompanyName();
		diary.Diary_AddProperty_CompanyAdd1();
		diary.Diary_AddProperty_CompanySave();
		Thread.sleep(5000);
		diary.Diary_Job_EventDescription();
		diary.Diary_Save();
		//diary.Diary_AddProperty_CloseSidepanel();
		Thread.sleep(6000);
	}
	@Test(priority = 20)
	public  void Customer_Createcontact() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(3000);
		//Contact contact = new Contact(driver);
		//Contact.Click_ContactTab();
		click("//span[text()='Contacts']");
		Thread.sleep(2000);
		click("//a[text()='Add new contact']");
		type("#contact_name", "Customer");
		type("#contact_surname", "Contact");
		type("#contact_contactsemail_emailaddress","Customer_contact@yopmail.com");
		Thread.sleep(1000);
		click("//span[@class='number-type-toggle ng-binding']");
		click("//li[text()='Mobile']");
		type("$contact[contactstelephone][0][telephonenumber]", "9941023232");
		click("//span[text()='Add phone number']");
		click("//span[text()='Add contact']");

	}
	@Test(priority = 21)
	public  void WorkAddress_CreateContact() throws InterruptedException
	{
		driver.get(WApage);
		Thread.sleep(3000);
		//Contact contact = new Contact(driver);
		//Contact.Click_ContactTab();
		click("//span[text()='Contacts']");
		Thread.sleep(2000);
		click("//a[text()='Add new contact']");
		type("#contact_name", "Work address");
		type("#contact_surname", "Contact");
		type("#contact_contactsemail_emailaddress","WA_contact@yopmail.com");
		Thread.sleep(1000);
		click("//span[@class='number-type-toggle ng-binding']");
		click("//li[text()='Mobile']");
		type("$contact[contactstelephone][0][telephonenumber]", "9941023232");
		click("//span[text()='Add phone number']");
		click("//span[text()='Add contact']");

	}
	@Test(priority = 22)
	public  void Company_CreateContact() throws InterruptedException
	{
		driver.get(Companypage);
		Thread.sleep(3000);
		click("//span[text()='Contacts']");
		Thread.sleep(2000);
		click("//a[text()='Add new contact']");
		type("#contact_name", "Work address");
		type("#contact_surname", "Contact");
		type("#contact_contactsemail_emailaddress","WA_contact@yopmail.com");
		Thread.sleep(1000);
		click("//span[@class='number-type-toggle ng-binding']");
		click("//li[text()='Mobile']");
		type("$contact[contactstelephone][0][telephonenumber]", "9941023232");
		click("//span[text()='Add phone number']");
		click("//span[text()='Add contact']");

	}
	@Test(priority = 23)
	public void CustomerReports() throws InterruptedException
	{
		
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Customers_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.View_customer();
	}
	
	@Test (priority=24)
	public void Work_address_Reports() throws InterruptedException
	{
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.WA_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.Click_View_workaddres();
	}
	
}
	
