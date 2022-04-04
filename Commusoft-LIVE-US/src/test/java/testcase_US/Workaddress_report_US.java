package testcase_US;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import action_US.Baseclass_US;
import pages.LoginPage;
import pages.Reporting;
import pages_US.Reporting_US;

public class Workaddress_report_US  extends Baseclass_US {
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
	public void Work_address_Reports() throws InterruptedException
	{
		Reporting_US Report = new Reporting_US(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Customer_Report();
		Report.WA_Report();
		Report.click_filter();
		Report.click_dateoption();
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.Click_View_workaddres();
	}
}
