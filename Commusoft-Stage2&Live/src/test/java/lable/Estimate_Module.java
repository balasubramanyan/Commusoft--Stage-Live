package lable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.Estimate;
import pages.LoginPage;

public class Estimate_Module extends Baseclass {

	@Test(priority = 0)
	public void AddCustomer() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Add_Customer();
	}
	@Test(priority = 1)
	public void Estimate_Add_Accept() throws InterruptedException
	{

		Estimate estimate = new Estimate(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Intro();
		estimate.Estimate_body();
		Thread.sleep(3000);
		estimate.Estimate_Price_tab();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(3000);
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}
	@Test(priority = 2)
	public void Estimate_AddEdit_Accept() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		Estimate estimate = new Estimate(driver);		
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_Survey_Edit();
		Thread.sleep(3000);
		estimate.Estimate_Price_tab();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(3000);
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}
	@Test(priority = 3)
	public void Estimate_Delete() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		job.customer_breadcrum();
		Estimate estimate = new Estimate(driver);		
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_Survey_Edit();
		Thread.sleep(3000);
		estimate.Estimate_Price_tab();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(3000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(3000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(3000);
		estimate.Estimate_SendtoCustomer();
		Thread.sleep(1000);
		estimate.Estimate_Delete();
		
	}
	@Test(priority = 4)
	public void Estimate_reject() throws InterruptedException
	{
		driver.navigate().refresh();
		Estimate estimate = new Estimate(driver);		
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_Survey_Edit();
		Thread.sleep(1000);
		estimate.Estimate_Price_tab();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(1000);
		estimate.Estimate_SendtoCustomer();
		Thread.sleep(1000);
		estimate.Estimate_Reject();
		
		
	}
	
	@Test(priority = 5)
	public void Estimate_MakeNewOption() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		Thread.sleep(2000);
		driver.navigate().refresh();
		job.customer_breadcrum();
		
		Estimate estimate = new Estimate(driver);		
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		Thread.sleep(1000);
		estimate.Estimate_Price_tab();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(1000);
		estimate.MakeNewOption();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_MakeNewOption();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Deposite_MakeNewOption();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Completion_MakeNewOption();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Retention_MakeNewOption();
		estimate.AdditionalOption_breadcrum();		
		Thread.sleep(1000);
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
		
	}
	
	@Test(priority = 6)
	public void Estimate_Clone_Option() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		Thread.sleep(2000);
		driver.navigate().refresh();
		job.customer_breadcrum();
		
		Estimate estimate = new Estimate(driver);		
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		Thread.sleep(1000);
		estimate.Estimate_Price_tab();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown();
		Thread.sleep(1000);
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Deposite();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Completion();
		Thread.sleep(1000);
		estimate.Estimate_InvoiceSchedule_Retention();
		Thread.sleep(1000);
		estimate.Estimate_Clone();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept2();
	}
	
}
