package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.LoginPage;
import pages.Reporting;

public class Job_Report extends Baseclass{
	
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
		
		Reporting Report = new Reporting(driver); 
		Report.Reporttab();
		Report.Report_Sidemenu();
		Report.Job_Report();
		Report.Jobs_Report();
		Report.click_filter();
		click("//a[text()=\"Created on Date\"]");
		Report.click_todaydate();
		Report.apply_filter();
		Report.First_Plus_button();
		Report.Click_viewjob();

}
}
