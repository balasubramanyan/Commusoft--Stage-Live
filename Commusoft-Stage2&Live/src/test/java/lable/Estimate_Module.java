package lable;

import java.awt.AWTException;

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
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
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
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
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
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.Estimate_SendtoCustomer();
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

		estimate.Estimate_Price_tab();

		estimate.Estimate_Price_NoBreakdown();

		estimate.Estimate_Price_NoBreakdown_PartsTotal();

		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.Estimate_SendtoCustomer();

		estimate.Estimate_Reject();


	}

	@Test(priority = 5)
	public void Estimate_MakeNewOption() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
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

		estimate.Estimate_Price_tab();

		estimate.Estimate_Price_NoBreakdown();

		estimate.Estimate_Price_NoBreakdown_PartsTotal();

		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.MakeNewOption();

		estimate.Estimate_Price_NoBreakdown();

		estimate.Estimate_Price_NoBreakdown_PartsTotal();

		estimate.Estimate_InvoiceSchedule_MakeNewOption();

		estimate.Estimate_InvoiceSchedule_Deposite_MakeNewOption();

		estimate.Estimate_InvoiceSchedule_Completion_MakeNewOption();

		estimate.Estimate_InvoiceSchedule_Retention_MakeNewOption();
		estimate.AdditionalOption_breadcrum();		

		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();

	}

	@Test(priority = 6)
	public void Estimate_Clone_Option() throws InterruptedException
	{
		CreateJob job = new CreateJob(driver);
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

		estimate.Estimate_Price_tab();

		estimate.Estimate_Price_NoBreakdown();

		estimate.Estimate_Price_NoBreakdown_PartsTotal();

		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.Estimate_Clone();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept2();
	}
	@Test(priority = 7)
	public void Estimate_Breakdown_By_Category() throws InterruptedException
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

		estimate.Estimate_Price_tab();

		estimate.Estimate_Price_BreakdownByCategory();

		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}
	@Test(priority = 8)
	public void Estimate_Full_Breakdown() throws InterruptedException
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

		estimate.Estimate_Price_tab();

		//driver.navigate().refresh();
		estimate.Estimate_Price_FullBreakdown();

		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}

	@Test(priority = 9)
	public void Estimate_Full_Breakdown_By_Category() throws InterruptedException
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
		Thread.sleep(2000);
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_FullBreakdownByCategory();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}

	@Test(priority = 10)
	public void Estimate_AddToReserveList() throws InterruptedException
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

		estimate.Estimate_Add_To_Reserve_List();
		estimate.Estimate_Price_tab();

		estimate.Estimate_Price_NoBreakdown();

		estimate.Estimate_Price_NoBreakdown_PartsTotal();


		estimate.Estimate_InvoiceSchedule();

		estimate.Estimate_InvoiceSchedule_Deposite();

		estimate.Estimate_InvoiceSchedule_Completion();

		estimate.Estimate_InvoiceSchedule_Retention();

		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();

	}

	@Test(priority = 11)
	public void Estimate_CLoneEstimate() throws InterruptedException
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
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Clone_Estimate();
		estimate.Estimate_Accept();

	}
	@Test(priority = 12)
	public void Estimate_TransferEstimate() throws InterruptedException
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
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_NoBreakdown();
		estimate.Estimate_Price_NoBreakdown_PartsTotal();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_InvoiceSchedule_Deposite();
		estimate.Estimate_InvoiceSchedule_Completion();
		estimate.Estimate_InvoiceSchedule_Retention();
		estimate.Estimate_SendtoCustomer();
		Thread.sleep(1000);
		estimate.Estimate_Transfer_Estimate();

	}


	@Test(priority = 13)
	public void Estimate_Parts() throws InterruptedException, AWTException
	{
		//CreateJob job = new CreateJob(driver);
		//job.customer_jobmodule();
		driver.navigate().refresh();
		//job.customer_breadcrum();
		Thread.sleep(2000);
		Estimate estimate = new Estimate(driver);		
		estimate.Estimate_AddNew();
		Thread.sleep(1000);
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		//driver.navigate().refresh();
		estimate.Estimate_parts();

		estimate.Estimate_Price_tab();

		estimate.Estimate_Price_NoBreakdown();

		estimate.Estimate_priceTab_Lineitemestimate();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();

	}

}


