package testcase_US;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action_US.Baseclass_US;
import pages.LoginPage;
import pages_US.CreateJob_US;
import pages_US.Diary_US;
import pages_US.Invoice_US;


public class Create_Job_Invoicev4_US extends Baseclass_US  {
		
String homepage;
   
	public String customer = "https://app.commusoft.us/customers/customer/1554/view/property/view";
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority = 1)
	public void createjob_Prefinal() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(4000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("PreFinal");
		//job.createjob();
	}
	@Test(priority = 2)
	public void createjob_Final_Complete() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(6000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("AutoFinal");
		//job.createjob();
		Thread.sleep(6000);
		job.edit_job();
		Thread.sleep(3000);
		job.complete_job();
	}
	//@Test(priority = 3)
	public void createjob_Draft() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(4000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("Draft Invoice");
		job.createjob();
	}
	@Test(priority = 4)
	public void createjob_NoRules() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(4000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(3000);
		Invoice_US invoice = new Invoice_US(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Final_invoice();
		invoice.invoice_description();
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.sub_total("500");
		invoice.save_invoice();
	}
	@Test(priority = 5)
	public void Addjob_NoRules_DiaryEvent() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(4000);
		CreateJob_US job = new CreateJob_US(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(4000);
		job.Add_new_appointment();
		Diary_US diary = new Diary_US(driver);
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_EventFromJob();
		
	}
	
}
