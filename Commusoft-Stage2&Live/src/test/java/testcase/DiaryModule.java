package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Diary;
import pages.LoginPage;

public class DiaryModule extends Baseclass {
	
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
	public void Diary_Estimate() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_PM();
		diary.Diary_Estimate();
		diary.Diary_propertysearch();
		Thread.sleep(3000);
		diary.Diary_Estimate_EventDescription();
		diary.Diary_Save();
	}
	@Test(priority = 2)
	public void Diary_Job() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_Timing();
		diary.Diary_job();
		diary.Diary_propertysearch();
		Thread.sleep(3000);
		diary.Diary_Job_EventDescription();
		diary.Diary_Save();
	}
	@Test(priority = 3)
	public void Diary_Normal() throws InterruptedException
	{
		Thread.sleep(6000);
		Diary diary = new Diary(driver);
		diary.Diary_Module();
		diary.Diary_Daily();
		diary.Diary_Today();
		diary.Diary_PM();
		diary.Diary_Normal_EvenDescription();
		diary.Diary_Save();
	}
	@Test(priority = 4)
	public void Addcustomer_job() throws InterruptedException
	{
	Diary diary = new Diary(driver);
	diary.Diary_Module();
	diary.Diary_Monthly_view();
	diary.Diary_Monthly_Date();
	diary.Diary_job();
	diary.Diary_job_AddProperty();
	diary.Diary_TypesOfProperty();
	diary.Diary_TypesOfCustomer();
	diary.Diary_AddProperty_CustomerName();
	diary.Diary_AddProperty_CustomerSurName();
	diary.Diary_AddProperty_CustomerEmail();
	diary.Diary_AddProperty_CustomerAdd1();
	diary.Diary_AddProperty_CustomerSave();
//	diary.Diary_currentdate_datepicker();
	diary.Diary_Job_EventDescription();
	diary.Diary_Save();
	}
	@Test(priority =5)
	public void diaryutility() throws InterruptedException
	{
		Diary diary = new Diary(driver);
		diary.Diary_PrintJobSheet();
		diary.Diary_PrintSummarySheet();
	}
	
	

}
