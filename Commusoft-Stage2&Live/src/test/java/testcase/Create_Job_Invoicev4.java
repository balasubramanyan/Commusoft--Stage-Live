package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.CreateJob;
import pages.Diary;
import pages.Invoice;
import pages.LoginPage;


public class Create_Job_Invoicev4 extends Baseclass  {
		
String homepage;
   
	public String customer = "https://app.commusoft.co.uk/customers/customer/1040/view/property/view";
	
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
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("PreFinal");
		job.createjob();
	}
	@Test(priority = 2)
	public void createjob_Final_Complete() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(6000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("AutoFinal");
		job.createjob();
		Thread.sleep(6000);
		job.edit_job();
		Thread.sleep(3000);
		job.complete_job();
	}
	@Test(priority = 3)
	public void createjob_Draft() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("Draft Invoice");
		job.createjob();
	}
	@Test(priority = 4)
	public void createjob_NoRules() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		job.createjob();
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
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
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		job.createjob();
		Thread.sleep(4000);
		job.Add_new_diaryEvent();
		Diary diary = new Diary(driver);
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_EventFromJob();
		
	}
	
}
