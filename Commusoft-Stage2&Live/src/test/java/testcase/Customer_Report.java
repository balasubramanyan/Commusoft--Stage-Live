package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.LoginPage;
import pages.Reporting;

public class Customer_Report extends Baseclass {
	public String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(15000);
		homepage = driver.getCurrentUrl();
	}
	@Test (priority=1)
	public void CustomerReports() throws InterruptedException
	{
		
		//driver.get(homepage);
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.Customers_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.View_customer();
	
			
		
	}

}
