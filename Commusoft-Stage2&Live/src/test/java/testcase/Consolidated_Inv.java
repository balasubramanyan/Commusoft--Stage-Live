package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.ConsolidatedInv;
import pages.CreateJob;
import pages.LoginPage;
import pages.Customer;
import pages.Invoice;

public class Consolidated_Inv extends Baseclass {

	String homepage;
	
	//public String ConInv = "https://stage2.commusoft.net/customers/customer/1973/multiple_invoice/1810/view";

	//@Test(priority = 0)
	public void login() throws InterruptedException {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login", 0, 1), sheet.sheetIN("Login", 1, 1), sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}

	@Test(priority = 1)

	public void newcustomer() throws InterruptedException {

		Customer NewCustomer = new Customer(driver);
		NewCustomer.Add_Customer();
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void cons_job() throws InterruptedException {

		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");

	}

	@Test(priority = 3)
	public void cust_details() throws InterruptedException {
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void cons_job1() throws InterruptedException {
		// driver.navigate().refresh();
		// driver.get(jobadd);
		Thread.sleep(2000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@Test(priority = 5)
	public void cust_details1() throws InterruptedException {
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void cons_job2() throws InterruptedException {

		Thread.sleep(6000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void cust_details2() throws InterruptedException {
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void addconsolidatedinv() throws InterruptedException {
		// driver.navigate().refresh();
		// driver.get(customer);
		ConsolidatedInv addCInv = new ConsolidatedInv(driver);
		Thread.sleep(4000);
		addCInv.quicklinks();
		Thread.sleep(4000);
		addCInv.chooseConInv();
		Thread.sleep(4000);
		addCInv.addConsolidatedInv();

	}

	@Test(priority = 9)
	public void AddInterimInv() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		ConsolidatedInv InterimInv = new ConsolidatedInv(driver);
		Thread.sleep(3000);
		InterimInv.totalConInvValue_Interim("Interim");
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void AddAdditionalInv() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		ConsolidatedInv AddInv = new ConsolidatedInv(driver);
		Thread.sleep(3000);
		AddInv.totalConInvValue_Additional();
		Thread.sleep(3000);
	}

	@Test(priority = 11)

	public void AddFinalInv() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		ConsolidatedInv FinalInv = new ConsolidatedInv(driver);
		Thread.sleep(3000);
		FinalInv.totalConInvValue_Final("Final");
		Thread.sleep(3000);
	}

	@Test(priority = 12)
	public void addConInv() throws InterruptedException {
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
	
	//Edit consolidated invoice
	
	@Test(priority = 14)
	public void EditConsolidatedInv() throws InterruptedException

	{

		ConsolidatedInv EditInvoice = new ConsolidatedInv(driver);
		EditInvoice.editLink();
		EditInvoice.editConsolidatedInv();
		Thread.sleep(3000);
	}
	
	@Test(priority = 15)
	public void ChangeVatType() throws InterruptedException
	{
	
		ConsolidatedInv ChooseVatType = new ConsolidatedInv(driver);
		ChooseVatType.changeVatType();
		Thread.sleep(3000);
	}
	
	@Test(priority = 16)
	public void VatValueChange() throws InterruptedException
	{
	
		ConsolidatedInv Vat = new ConsolidatedInv(driver);
		Vat.changeVatValue();
		Thread.sleep(3000);
	}
	
	@Test(priority = 17)
	public void TotalValueChange() throws InterruptedException
	{
	
		ConsolidatedInv Total = new ConsolidatedInv(driver);
		Total.changeTotalValue();
		Thread.sleep(3000);
	}
	
	// Changing into draft
	
	@Test(priority = 18)
	public void draftinvoice() throws InterruptedException
	{
		Invoice Draft = new Invoice(driver);
		Draft.draft_invoice();
	}
	
	@Test(priority = 19)
	public void EditConInv() throws InterruptedException 
	{
		click("//button[@type='submit']");
		Thread.sleep(3000);

	}
	
	@Test(priority = 20)
	public void convertingdraft() throws InterruptedException
	{
		ConsolidatedInv Convdraft = new ConsolidatedInv(driver);
		Convdraft.convert_draftinvoice();
		Thread.sleep(4000);
	}
	// In view invoice
	@Test(priority = 21)
	public void PrintInv() throws InterruptedException 
	{
		ConsolidatedInv Print = new ConsolidatedInv(driver);
		Print.printInvoice();
		Thread.sleep(3000);
	}
	
	@Test(priority = 22)
	public void Switchtab() throws InterruptedException
	{
		ConsolidatedInv tabs = new ConsolidatedInv(driver);
		tabs.tabs();
				
	}
	
	@Test(priority = 23)
	public void EmailInv() throws InterruptedException
	{
		//driver.get(ConInv);
		Thread.sleep(5000);
		ConsolidatedInv Email = new ConsolidatedInv(driver);
		Email.emailInvoice();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		Email.emailWidget();			
	}
	
   @Test(priority = 24)
	public void cust_details3() throws InterruptedException 
   {
		Thread.sleep(3000);
		click("//*[@id=\"angular-es-container\"]/app-multiple-invoice-view/div[1]/div/h3/a[3]");
		Thread.sleep(3000);
	}
   
   @Test(priority = 25)
	public void cons_job4() throws InterruptedException {

		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		Thread.sleep(3000);	}
   
   @Test(priority = 26)
	public void cust_details4() throws InterruptedException {
		Thread.sleep(3000);
		ConsolidatedInv custdetails = new ConsolidatedInv(driver);
		custdetails.customerdetails();
		Thread.sleep(3000);
	}
   
   @Test(priority = 27)
   public void addconsolidatedinv2() throws InterruptedException {
		// driver.navigate().refresh();
		// driver.get(customer);
		ConsolidatedInv addCInv = new ConsolidatedInv(driver);
		Thread.sleep(4000);
		addCInv.quicklinks();
		Thread.sleep(4000);
		addCInv.chooseConInv();
		Thread.sleep(4000);
		addCInv.addConsolidatedInv();

	}
	
	@Test(priority = 28)
	public void AddInterimInv2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		ConsolidatedInv InterimInv = new ConsolidatedInv(driver);
		Thread.sleep(3000);
		InterimInv.totalConInvValue_Interim("Interim");
		Thread.sleep(3000);
	}
	
	@Test(priority = 29)
	public void addConInv2() throws InterruptedException {
		click("//button[@type='submit']");
		Thread.sleep(3000);

	}
	
	@Test(priority = 30)
	public void delete_invoice() throws InterruptedException
	{
		ConsolidatedInv delinvoice = new ConsolidatedInv(driver);
		delinvoice.quicklinks();
		delinvoice.deleteInvoice();
		Thread.sleep(3000);

	}
			
}
