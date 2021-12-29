package testcase;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Download_excel_print_reports;
import pages.LoginPage;
import pages.Reporting;

public class Download_and_print_reports extends Baseclass{
	
	public String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl(); 
	}

    @Test(priority=1)
    public void customersreportdownload_print() throws InterruptedException
    {
	  Reporting customerreport=new Reporting (driver);
	  customerreport.Reporttab();
	  customerreport.Report_Sidemenu();
	  customerreport.Customer_Report();
	  customerreport.Customers_Report();
	  Download_excel_print_reports customerprint =new Download_excel_print_reports(driver);
	  customerprint.downloadexcel();
	  customerprint.print();
	  customerprint.closeprint();
    }
    @Test(priority=2)
    public void jobreportdownload_print() throws InterruptedException
    {
      Reporting jobsreport= new Reporting(driver);
      jobsreport.Reporttab();
      jobsreport.Report_Sidemenu();
      jobsreport.Job_Report();
      jobsreport.Jobs_Report();
      Download_excel_print_reports jobreportprintanddownload =new Download_excel_print_reports(driver);
      jobreportprintanddownload.jobsreportprint();
      jobreportprintanddownload.notifications();
      jobreportprintanddownload.assertion_jobrep();
      jobreportprintanddownload.jobsreportdownloadexcel();
      jobreportprintanddownload.notifications();
      jobreportprintanddownload.assertion_jobrepoexcel();
    }
    @Test(priority=3)
    public void timesheetreport() throws InterruptedException
    {
    	Reporting timesheet=new Reporting(driver);
    	timesheet.Reporttab();
    	timesheet.Report_Sidemenu();
    	Download_excel_print_reports timesheetreportprintanddownload =new Download_excel_print_reports(driver);
    	timesheetreportprintanddownload.clickusers();
    	timesheetreportprintanddownload.clicktimesheet();
    	timesheetreportprintanddownload.print();
    	timesheetreportprintanddownload.closeprint();
    	timesheetreportprintanddownload.downloadexcel();
    }
    @Test(priority=4)
    public void salesreport() throws InterruptedException 
    {
    	Reporting salereport = new Reporting(driver);
    	salereport.Reporttab();
    	salereport.Report_Sidemenu();
    	Download_excel_print_reports salesreportprintanddownload =new Download_excel_print_reports(driver);
    	salesreportprintanddownload.clicksales();
    	salesreportprintanddownload.clicksales2();
    	salesreportprintanddownload.salesreportprint();
    	salesreportprintanddownload.notifications();
    	salesreportprintanddownload.assertion_salesrepprint();
    	salesreportprintanddownload.salesreportexcel();
    	salesreportprintanddownload.notifications();
    	salesreportprintanddownload.assertion_salesrepexcel();	
    }
}

//test