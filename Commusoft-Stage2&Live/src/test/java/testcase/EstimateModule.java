package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Estimate;
import pages.LoginPage;

public class EstimateModule extends Baseclass {
	
	String homepage;
	public String customer = "https://stage.commusoft.net/customers/customer/1014/view/property/view";
	
   	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority = 1)
	public void Estimate_Accept() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(5000);
		Estimate estimate = new Estimate(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
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
	public void Estimate_Reject() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(5000);
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
		estimate.Estimate_Reject();
	}
	@Test(priority = 3)
	public void Estimate_PartsandPrice() throws InterruptedException
	{
		driver.get(customer);
		Thread.sleep(10000);
		Estimate estimate = new Estimate(driver);
		estimate.Estimate_AddNew();
		estimate.choose_description();
		estimate.Estimate_Notes();
		estimate.Estimate_CustomerReference();
		estimate.Estimate_user_group();
		estimate.Estimate_AddEstimate();
		estimate.Estimate_partsTab();
		estimate.Estimate_Addpartlist();
		estimate.Estimate_AddPartstoPartlist();
		estimate.Estimate_Parts_ChoosePrice();
		estimate.Estimate_Price_tab();
		estimate.Estimate_Price_AddLineItems();
		estimate.Estimate_InvoiceSchedule();
		estimate.Estimate_SendtoCustomer();
		estimate.Estimate_Accept();
	}	

}
