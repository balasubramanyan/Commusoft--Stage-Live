package lable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Customer;
import pages.Job;
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
		Job job = new Job(driver);
		//job.customer();
		//job.customerview();
		job.addjob();
		job.JobDescription("Demo", "First", "Second");
		job.createjob();
		
	}
	@Test(priority = 2)
	public void jobedit() throws InterruptedException
	{
		Job job = new Job(driver);
		job.jobeditlink("TestDes", "Test", "Edit first", "Edit second");
		job.Editsavejob();
		
		
	}
	@Test(priority=3)
	public void Jobdelete() throws InterruptedException
	{
		Job job = new Job(driver);
		job.Jobdeleted("delete");
		
		
	}
}
