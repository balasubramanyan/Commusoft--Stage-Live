package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.ConsolidatedInv;
import pages.CreateJob;
import pages.LoginPage;
import pages.Customer;

public class Consolidated_Inv extends Baseclass {

	
	String homepage;
	   
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	
	@Test(priority = 1)
	
	public void newcustomer() throws InterruptedException
	{
		
		Customer NewCustomer = new Customer(driver);
		NewCustomer.Add_Customer();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 2)
	public void cons_job() throws InterruptedException
	{
		
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
			
	}
	
	@Test(priority = 3)
	public void cust_details() throws InterruptedException
	{
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void cons_job1() throws InterruptedException
	{
		//driver.navigate().refresh();
		//driver.get(jobadd);
		Thread.sleep(2000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	@Test(priority = 5)
	public void cust_details1() throws InterruptedException
	{
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void cons_job2() throws InterruptedException
	{
		
		Thread.sleep(6000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		Thread.sleep(3000);				
	}
	
	@Test(priority = 7)
	public void cust_details2() throws InterruptedException
	{
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}
	
	@Test(priority = 8)
	public void addconsolidatedinv() throws InterruptedException
	{
		//driver.navigate().refresh();
		//driver.get(customer);
		  ConsolidatedInv addCInv=new ConsolidatedInv(driver);		
		  Thread.sleep(4000); 
		  addCInv.quicklinks(); 
		  Thread.sleep(4000);
		  addCInv.chooseConInv(); 
		  Thread.sleep(4000);		 
		addCInv.addConsolidatedInv();
		
	}
	
	@Test(priority = 9)
	public void AddInterimInv() throws InterruptedException
	{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			ConsolidatedInv InterimInv = new ConsolidatedInv(driver);
			Thread.sleep(3000);
			InterimInv.totalConInvValue_Interim("Interim");
			Thread.sleep(3000);
	}
	
	@Test(priority = 10)	
	public void AddAdditionalInv() throws InterruptedException
	{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			ConsolidatedInv AddInv = new ConsolidatedInv(driver);
			Thread.sleep(3000);
			AddInv.totalConInvValue_Additional();
			Thread.sleep(3000);
	}
	
	@Test(priority = 11)
	
	public void AddFinalInv() throws InterruptedException
	{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			ConsolidatedInv FinalInv = new ConsolidatedInv(driver);
			Thread.sleep(3000);
			FinalInv.totalConInvValue_Final("Final");
			Thread.sleep(3000);
	}
	
	
	@Test(priority = 12)
	public void addConInv() throws InterruptedException
	{
			click("//button[@type='submit']");
			Thread.sleep(3000);
		
	}
	
	@Test(priority = 13)
	
	public void Popupoffinalinvoice() throws InterruptedException
	
	{
	 ConsolidatedInv Popup = new ConsolidatedInv(driver);
	 Popup.rasieFinalinvoice_Popup();
	 Thread.sleep(3000);
	}
}
