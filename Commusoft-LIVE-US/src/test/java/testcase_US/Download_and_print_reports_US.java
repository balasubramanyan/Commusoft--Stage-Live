package testcase_US;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action_US.Baseclass_US;
import pages.LoginPage;
import pages_US.Download_excel_print_reports_US;
import pages_US.Reporting_US;

public class Download_and_print_reports_US extends Baseclass_US{
	
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
	  Reporting_US customerreport=new Reporting_US (driver);
	  customerreport.Reporttab();
	  customerreport.Report_Sidemenu();
	  customerreport.Customer_Report();
	  customerreport.Customers_Report();
	  Download_excel_print_reports_US customerprint =new Download_excel_print_reports_US(driver);
	  customerprint.downloadexcel();
	  customerprint.print();
	  customerprint.closeprint();
    }
    @Test(priority=2)
    public void jobreportdownload_print() throws InterruptedException
    {
      Reporting_US jobsreport= new Reporting_US(driver);
      jobsreport.Reporttab();
      jobsreport.Report_Sidemenu();
      jobsreport.Job_Report();
      jobsreport.Jobs_Report();
      Download_excel_print_reports_US jobreportprintanddownload =new Download_excel_print_reports_US(driver);
      jobsreport.click_filter();
      jobsreport.click_dateoption();
      jobsreport.click_todaydate();
      jobsreport.apply_filter();
      jobreportprintanddownload.print();
      jobreportprintanddownload.closeprint();
      jobreportprintanddownload.downloadexcel();
     /* jobreportprintanddownload.jobsreportprint();
      jobreportprintanddownload.notifications();
      jobreportprintanddownload.assertion_jobrep();
      jobreportprintanddownload.jobsreportdownloadexcel();
      jobreportprintanddownload.notifications();
      jobreportprintanddownload.assertion_jobrepoexcel();*/
    }
    @Test(priority=3)
    public void timesheetreport() throws InterruptedException
    {
    	Reporting_US timesheet=new Reporting_US(driver);
    	timesheet.Reporttab();
    	timesheet.Report_Sidemenu();
    	Download_excel_print_reports_US timesheetreportprintanddownload =new Download_excel_print_reports_US(driver);
    	timesheetreportprintanddownload.clickusers();
    	timesheetreportprintanddownload.clicktimesheet();
    	timesheetreportprintanddownload.print();
    	timesheetreportprintanddownload.closeprint();
    	timesheetreportprintanddownload.downloadexcel();
    }
    @Test(priority=4)
    public void salesreport() throws InterruptedException 
    {
    	Reporting_US salereport = new Reporting_US(driver);
    	salereport.Reporttab();
    	salereport.Report_Sidemenu();
    	Download_excel_print_reports_US salesreportprintanddownload =new Download_excel_print_reports_US(driver);
    	salesreportprintanddownload.clicksales();
    	salesreportprintanddownload.clicksales2();
    	salesreportprintanddownload.print();
    	salesreportprintanddownload.closeprint();
    	salesreportprintanddownload.downloadexcel();
    	/*salesreportprintanddownload.salesreportprint();
    	salesreportprintanddownload.notifications();
    	salesreportprintanddownload.assertion_salesrepprint();
    	salesreportprintanddownload.salesreportexcel();
    	salesreportprintanddownload.notifications();
    	salesreportprintanddownload.assertion_salesrepexcel();*/
    }
}

//test