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
}
