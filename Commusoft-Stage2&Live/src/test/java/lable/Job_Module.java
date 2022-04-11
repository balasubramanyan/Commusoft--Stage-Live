package lable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
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
		
	}
	@Test(priority = 5)
	public void jobFOC() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.JobFOC("Automaction done for job");
		
	}
	@Test(priority = 6)
	public void jobaddcomplete() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
	}
	@Test(priority = 7)
	public void jobcompelete() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.edit_job();
		job.complete_job();
	}
	@Test(priority = 8)
	public void Recalljob() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.Job_Recall("Demo", "First", "Second", "Ezhil");
	}
	@Test(priority = 9)
	public void Aboutjob() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		job.addjob1();
		job.JobDescription2("Demo", "First", "Second");
		job.createjob1();
		job.Job_Abort("Demo");
	}

	
}
