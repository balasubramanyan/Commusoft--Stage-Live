package lable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Invoice;
import pages.LoginPage;

public class Job_Module extends Baseclass{



	@Test(priority = 0)
	public void AddCustomer() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Add_Customer();
	}

	@Test(priority = 1)
	public void jobadd() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer();
		//job.customerview();
		job.addjob1();
		job.JobDescription("Demo", "First", "Second");
		job.createjob1();

	}
	@Test(priority = 2)
	public void jobedit() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.jobeditlink("TestDes", "Test", "Edit first", "Edit second");
		job.Editsavejob();


	}
	@Test(priority=3)
	public void Jobdelete() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.Jobdeleted("delete");


	}
	@Test(priority = 4)
	public void jobaddFOC() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.JobFOC("Automaction done for job");

	}
	
	@Test(priority = 5)
	public void jobaddcomplete() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.edit_job();
		job.complete_job();
	}
	
	@Test(priority = 6)
	public void Recalljob() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.Job_Recall("Demo", "First", "Second", "Ezhil");
	}
	@Test(priority = 7)
	public void Aboutjob() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.Job_Abort("Demo");
	}
	@Test(priority = 8)
	public void Addjob_Final_invoice() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		Invoice adding_invoice = new Invoice(driver);
		
		Thread.sleep(5000);
		adding_invoice.InvoiceTab();
		adding_invoice.addinvoice();
		adding_invoice.Final_invoice();
		adding_invoice.invoice_description();
		adding_invoice.invoice_notes1("Fullbreakdownbycategory final invoice");
		//adding_invoice.customerreference("breakdown by category");
		adding_invoice.invoice_Category();
		adding_invoice.invoice_UserGroup();
		adding_invoice.Invoice_Breakdown_Full_breakdown_by_category();
		adding_invoice.Full_Breakdown_ByCategory_Labour_Description("Azarudeen");
		adding_invoice.unitprice_FullBreakdown_ByCategory_Labour("1111");
		adding_invoice.Full_Breakdown_ByCategory_Parts_Description("parts test");
		adding_invoice.unitprice_FullBreakdown_ByCategory_Parts1("789.05");
		adding_invoice.save_invoice();
	}
	
	@Test(priority = 9)
	public void Addjob_with_diary() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.job_diary_customerside();
		job.createjob1();
		Thread.sleep(5000);
		Diary diary = new Diary(driver);
		diary.Diary_Today();
		Thread.sleep(2000);
		diary.Customer_job_Diary_Timing();
		diary.Customer_job_Diary_Timing_savebutton();
	}
	
	@Test(priority = 10)
	public void Addjob_Job_PlaceOnHold() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.Job_PlaceOnHold();
	}
	

	@Test(priority = 11)
	public void Addjob_link() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.link_job_recall();
	}


	@Test(priority = 12)
	public void Customer_addedJob_diray() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.Customer_addedjob_diray();

		//Create customer--> create job-->  create diary... 
		Thread.sleep(5000);
		Diary diary = new Diary(driver);
		diary.Diary_Today();
		Thread.sleep(3000);
		diary.Customer_job_Diary_Timing1();
		diary.Customer_job_Diary_Timing_savebutton();

		//Edit diary...
		Thread.sleep(2000);
		job.Customer_Editjob_diray();
		job.Customer_Deletejob_diray();

	}


}
