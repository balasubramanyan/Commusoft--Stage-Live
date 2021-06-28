package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import classicpage.Clogin;
import pages.Contact;
import pages.CreateJob;
import pages.Customer;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;
import pages.searchengine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import action.Baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.CreateJob;

public class Divya extends Baseclass {
String homepage;
   
	
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		
		  LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		  loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1,
		  1),sheet.sheetIN("Login", 2, 1));
		 
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority=1 )
	public void Customer_creation() throws InterruptedException
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
	
	@Test(priority = 2)
	public void Add_job() throws InterruptedException
	{
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");

	}
	
	@Test(priority=3)
	public void Invoice_process() throws InterruptedException {
		Invoice in = new Invoice(driver);
		in.InvoiceTab();
		in.addinvoice();
		in.invoice_description();
		in.sub_total("500");
		in.save_invoice();
		Thread.sleep(3000);
		NotesandCommunication communication = new NotesandCommunication(driver);
		//communication.emailinvoice();
		communication.printinvoice();
		}


  @Test(priority=4 ) 
  public void Contact_details() throws InterruptedException{
   driver.get(customerpage); 
   Contact c = new Contact(driver);
    c.Click_contacttab();
    c.Add_contact();
    c.Con_title(); 
    c.name();
    c.Surname();
    c.Email();
    c.Click(); 
    c.Click_mobile();
    c.Phone_number(); 
    c.click_addphone();
    c.click_addcontact(); 
    Thread.sleep(3000); 
    Customer customer = new Customer(driver); 
    customer.workaddress_tab();
    customer.workaddress_addnewWorkaddress(); 
    customer.Workaddress_create();
      Thread.sleep(6000); 
     Estimate estimate = new Estimate(driver);
      estimate.Estimate_AddNew(); 
      estimate.choose_description();
      estimate.Estimate_Notes(); 
      estimate.Estimate_CustomerReference();
       estimate.Estimate_user_group();
      estimate.Estimate_AddEstimate();
  }
  }
 