package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.Changeinvoice;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Download_excel_print_reports;
import pages.Email_setup;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;
import pages.Reporting;
import pages.Settings;

public class Checking extends Baseclass {
	
	String homepage;
	String customerpage ="https://app.commusoft.co.uk/customers/customer/2702/view/property/view";
   String Customersreport ;
	
	
//	@Test(priority = 0)
//	public void login() throws InterruptedException
//	{
//		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
//		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
//		Thread.sleep(1000);
//		homepage = driver.getCurrentUrl();
//	}
   /* @Test(priority=35)
	public void changesinvoicetype() throws InterruptedException
	{
		driver.get(customerpage);
		Changeinvoice changeinvoices=new Changeinvoice(driver);
		//changeinvoices.addcustomer();
		changeinvoices.addjob();
		changeinvoices.adddiary();
		changeinvoices.add_additionalinvoice();
		changeinvoices.addfinalinvoice();
		changeinvoices.editinvoicetype();
	}
	@Test(priority = 9)
	public void Addjob_NoRules_DiaryEvent() throws InterruptedException
	{
		driver.get(customerpage);
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		//job.createjob();
		Thread.sleep(4000);
		job.Add_new_diaryEvent();
		Diary diary = new Diary(driver);
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_Timing3();
		diary.Diary_EventFromJob();
	}*/
   @Test(priority=50)
	public void outlook() throws IOException, InterruptedException
	{
		//driver.get(homepage);
		Settings setting=new Settings(driver);
		setting.Click_Setting();
		setting.Click_Companysetting();
		Email_setup outlook  =new Email_setup(driver);
		outlook.setupemail();
		outlook.outlookbutton();
		outlook.outlookusername_password();	
		outlook.outpassword();
	}
}




