package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import action.Baseclass;
import pages.Customer;
import pages.LoginPage;
import pages.searchengine;

public class CustomerModule extends Baseclass {
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
	public void Customer_Add() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Customer_create();
		customer.Customer_title();
		customer.Customer_Name();
		customer.Customer_SurName();
		customer.Customer_Mobile();
		customer.Customer_email();
		customer.Customer_AddressLine1();
		customer.Customer_Save();
	}
	
	
//	@Test(priority=2)
	public void Create_job()
	{
		click("//span[text()='Add new job']");
		String data = gettext("(//span[@class=\"select2-chosen\"])[2]");
		if(data.equals("- Ranjit Aravind"))
		{
			logger.log(Status.INFO,"Verified current contact as job contact");
		}else
		{
			logger.log(Status.FAIL, "Job contact is not as primary contact");
		}
		searchengine s = new searchengine(driver);
		s.searchbox("Ranjit");
		type("$engineernotes", "Job Notes");
		click("$isservicejob");
		WebElement box = driver.findElement(By.name("servicereminderinstance"));
		if(box.isDisplayed())
		{
			logger.log(Status.INFO, "Once Service job is enabled -service reminder appears");
		}else
		{
			logger.log(Status.FAIL, "Service reminder pop-up is missing");
		}
		selectdropdown("$servicereminderinstance", sheet.sheetIN("Login", 3, 1));
		type("$quotedamount", "5000");
		type("$ponumber", "Customer reference");
		selectdropdown("$job[priority]", "Important");
		selectdropdownvalue("$job[usergroupsid]","1");
		selectdropdownvalue("$job[invoicecategoryid]", "1");
	
	}
//	@Test(priority=3)
	public void Edit_Job()
	{
		
//		driver.get(customer);
		click("//span[text()='Add new job']");
		searchengine s = new searchengine(driver);
		s.searchbox("Ranjit");
		click("//button[@type='submit']");
		click("//a[text()='Edit']");
		clear("$descriptionofoption");
		type("$descriptionofoption", "Updated Description");
		click("(//input[contains(@id,'s2id_autogen')])[3]");
		type("(//input[contains(@id,'s2id_autogen')])[3]", "Ski");
	    typeenter("(//input[contains(@id,'s2id_autogen')])[3]");
		type("$engineernotes", "Job Notes");
		click("$isservicejob");
		WebElement box = driver.findElement(By.name("servicereminderinstance"));
		if(box.isDisplayed())
		{
			logger.log(Status.INFO, "Once Service job is enabled -service reminder appears");
		}else
		{
			logger.log(Status.FAIL, "Service reminder pop-up is missing");
		}
		selectdropdownvalue("$servicereminderinstance", "3");
		type("$quotedamount", "5000");
		type("$ponumber", "Customer reference");
		selectdropdown("$job[priority]", "Important");
		selectdropdownvalue("$job[usergroupsid]","1");
		selectdropdownvalue("$job[invoicecategoryid]", "1");
		click("//button[@type='submit']");
		
	}
//	@Test(priority=4)
	public void AfterSalesCare_FreeofCharge() throws InterruptedException
	{
//		driver.get(customer);
		click("//span[text()='Add new job']");
		searchengine s = new searchengine(driver);
		s.searchbox("Ranjit");
		type("$engineernotes", "Job Notes");
		type("$quotedamount", "5000");
		click("//button[@type='submit']");
		click("//span[text()='Quick links']");
		click("//a[text()='Free of charge job']");
		selectdropdownvalue("#freeofchargeandabortjob_reason", "2");
		click("//button[@type='submit']");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//div[@class='span12 single-notice ng-scope']"));
		if(a.isDisplayed())
		{
			logger.log(Status.INFO, "After Sales Care sucessfully executed");
		}else
		{
			logger.log(Status.FAIL, "After sales care is missing");
		}
		
	}
	@Test(priority=4)
	public void AfterSalesCare_FinalInvoice() throws InterruptedException
	{
//		driver.get(customer);
//		click("//span[text()='Add new job']");
//		searchengine s = new searchengine(driver);
//		s.searchbox("Ranjit");
//		type("$engineernotes", "Job Notes");
//		type("$quotedamount", "5000");
//		click("//button[@type='submit']");
//		click("//span[text()='Invoices']");
//		WebElement quoated = driver.findElement(By.xpath("//div[@ng-repeat='information in information_data']"));
//		if(quoated.isDisplayed())
//		{
//			logger.log(Status.INFO, "quoated amount sucessfully appeared");
//		}else
//		{
//			logger.log(Status.FAIL, "quoated amount is missing");
//		}
//		click("//a[@class='btn btn-primary btn-small ng-scope']");
//		Invoice a = new Invoice(driver);
//		Thread.sleep(3000);
//	//	a.Final_invoice();
//		a.invoice_description("Update");
//		a.invoice_category();
//		a.sub_total("500");
//		a.save_invoice();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		WebElement b = driver.findElement(By.xpath("//div[@class='span12 single-notice ng-scope']"));
//		if(b.isDisplayed())
//		{
//			logger.log(Status.INFO, "After Sales Care sucessfully executed");
//		}else
//		{
//			logger.log(Status.FAIL, "After sales care is missing");
//		}
//	
		driver.get("https://stage.commusoft.net/customers/customer/1014/jobs/1044/invoices/new/partial");
		Thread.sleep(4000);
	//	selectdropdown("//select[@class='full-width-select ng-pristine ng-valid ng-touched']", "Final invoice");
		Select fcc = new Select(driver.findElement(By.xpath("//select[@formcontrolname='invoiceCategoryId']")));
		fcc.selectByValue("Aravind Category");
	}

}
