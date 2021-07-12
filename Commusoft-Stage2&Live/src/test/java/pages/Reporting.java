package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Reporting extends Wrapper {
	
	public Reporting(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Reporttab() throws InterruptedException
	{
		Thread.sleep(6000);
		click("//a[@class=\"trigger-dropdown ng-scope\"]"); //report tab
		Thread.sleep(3000);	
	}
	public void Report_Sidemenu() throws InterruptedException
	{
		Thread.sleep(5000);
		click("//a[@id=\"side-bar\"]"); //side menu
		Thread.sleep(3000);
	}
	public void Customer_Report() throws InterruptedException
	{
		click("//a[@has-root-permission=\"customerReports\"]"); //click customer report
		Thread.sleep(3000);
	}
	public void Customers_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basiccustomerreports,readaccess\"])[1]"); //click first customer report
		//click("//input[@class=\"filter-search-field ng-pristine ng-valid left-padding ui-autocomplete-input\"]");
		Thread.sleep(3000);
	}
	public void click_filter() throws InterruptedException 
	{
		click("//input[@class=\"filter-search-field ng-pristine ng-valid left-padding ui-autocomplete-input\"]");// click filter option
	}
	public void click_dateoption() throws InterruptedException 
	{
		click("//a[text()='Date created']");
		
	}
	public void click_todaydate() throws InterruptedException 
	{
		click("//*[@id=\"daterange\"]/li[1]/span/a");//click today date
	}
	public void apply_filter() throws InterruptedException
	{
		click("//*[@id=\"main\"]/div[2]/div/ng-container/section/div[1]/div/section/div/div/div/div/div/div/div/tag-input/div[2]/div[3]/a[2]");//apply filter
	}
	public void First_Plus_button() throws InterruptedException
	{
		click("(//span[@class=\"preview-file-link actions-toggle ng-scope ss-plus\"])[1]"); //click first + button
		Thread.sleep(3000);
		
	}
	public void Click_View_customer() throws InterruptedException {
		click("//*[@id=\"actions-dropdown\"]/ng-include/div/span/span/a");//click view customer 
	}
	public void Customer1_Assertion(String ER)
	{
		String AR = gettext("(//a[@ng-show=\"canDisplayMenu(category, 'customerIds', $index)\"])[1]");
		Assertion(ER, AR, "Customer report all visible");
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public void WA_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basiccustomerreports,readaccess\"])[2]"); //click 2nd customer report
		Thread.sleep(3000);
	}
	public void Click_View_workaddres()  throws InterruptedException
	{
		click("//*[@id=\"actions-dropdown\"]/ng-include/div/span/span[1]/a");// click the view workaddress	
		
	}
	public void Customer2_Assertion(String ER)
	{
		String AR = gettext("(//a[@ng-show=\"canDisplayMenu(category, 'workaddressIds', $index)\"])[1]");
		Assertion(ER, AR, "Customer2 report all visible");
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public void Appliance_Details_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basiccustomerreports,readaccess\"])[3]"); //click 3rd customer report
		Thread.sleep(4000);
	}
	public void Customer3_Assertion()
	{
		try 
		{
			isdisplayed("//span[@data-row-index=\"0\" and @data-column=\"Customer.Account.Number\"]");//check the first row customer accoutn number present or not
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	public void Advertising_Performance_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basiccustomerreports,readaccess\"])[4]"); //click 3rd customer report
		Thread.sleep(4000);
	}
	public void Customer4_Assertion()
	{
		try 
		{
			isdisplayed("//span[@data-row-index=\"0\" and @data-column=\"No Jobs Created\"]");//check the first row job number present or not
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public void JobEstimateAccessPhoneCallList_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basiccustomerreports,readaccess\"])[5]"); //click 3rd customer report
		Thread.sleep(3000);
	}
	public void Customer5_Assertion()
	{
		try 
		{
			String v="//span[@data-column=\"Status\" and @data-row-index=\"0\"]";
			isdisplayed(v);
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public void ServicePlan_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basiccustomerreports,readaccess\"])[6]"); //click 3rd customer report
		Thread.sleep(3000);
	}
	public void Customer6_Assertion()
	{
		try 
		{
			isdisplayed("//span[@data-column=\"Customer address line 1\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public void Asset_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"customerAsset,readaccess\"])"); //click 3rd customer report
		Thread.sleep(3000);
	}
	public void Customer7_Assertion()
	{
		try 
		{
			isdisplayed("//span[@data-column=\"Customer name\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	public void Contracts_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"ViewContractReport,readaccess\"])[1]"); //click 3rd customer report
		Thread.sleep(3000);
	}
	public void Customer8_Assertion()
	{
		try 
		{
			isdisplayed("//span[@data-column=\"Customer.name\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/	
	public void PPM_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"ViewContractReport,readaccess\"])[2]"); //click 3rd customer report
		Thread.sleep(3000);
	}
	public void Customer9_Assertion()
	{
		try 
		{
			isdisplayed("//th[@data-column-index=\"2\" and contains (text(), 'Number of jobs planned')]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Service_Reminder_Report() throws InterruptedException
	{
		click("//a[@has-root-permission=\"serviceReminderReports\"]");//click service reminder report
		Thread.sleep(4000);
	}
	public void Service_Reminders_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicservicereminderreports,readaccess\"])[1]");//click 1st report
		Thread.sleep(6000);
	}
	public void ServiceReminder1_Assertion()
	{
		try
		{
		isdisplayed("//span[@data-column=\"Customer Name\" and @data-row-index=\"0\"]");
		}
		catch(Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Properties_Without_Services_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicservicereminderreports,readaccess\"])[2]");//click 1st report
		Thread.sleep(6000);
	}
	public void ServiceReminder2_Assertion()
	{
		try
		{
		isdisplayed("//span[@data-column=\"Customer.Name\" and @data-row-index=\"0\"]");
		}
		catch(Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Supplier_Report() throws InterruptedException
	{
		click("//a[@has-root-permission=\"supplierReports\"]");//click Supplier report
		Thread.sleep(4000);
	}
	public void Suppliers_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicsupplierreports,readaccess\"])[1]");//click Suppliers report
		Thread.sleep(6000);
	}
	public void Supplier1_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Name\" and @data-row-index=\"0\"]");
		}
		catch(Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Contacts_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicsupplierreports,readaccess\"])[2]");//click Suppliers report
		Thread.sleep(6000);
	}
	public void Supplier2_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Supplier.Name\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Estimate_Report() throws InterruptedException
	{
		click("//a[@has-root-permission=\"estimateReports\"]");//click Estimate report
		Thread.sleep(3000);
	}
	public void Estimates_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicestimatereports,readaccess\"])[1]");//click estimates report
		Thread.sleep(6000);
	}
	public void click_viewestimate () throws InterruptedException
	{
		click("//*[@id=\"actions-dropdown\"]/ng-include/div/span/span/a");
	}
	public void Estimate1_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Estimate Number\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Accepted_Vs_Rejected_Estimates_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicestimatereports,readaccess\"])[2]");//click estimates report
		Thread.sleep(6000);
	}
	public void Estimate2_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"User\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
/*---------------------------------------------------------------------------------------------------------*/
	
	public void Rejected_Reasons_Report() throws InterruptedException
	{
		click("(//a[@has-permission=\"Basicestimatereports,readaccess\"])[3]");//click estimates report
		Thread.sleep(6000);
	}
	public void Estimate3_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Estimate Number\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void Job_Report() throws InterruptedException
	{
		click("//a[@has-root-permission=\"jobReports\"]");//click Job report
		Thread.sleep(3000);
	}
	public void Jobs_Report() throws InterruptedException
	{
		click("//a[@has-permission=\"Basicjobreports,readaccess\" and contains(text(), 'Jobs')]");//click jobs report
		Thread.sleep(6000);
	}
	public void Job1_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Customer Name\" and @data-row-index=\"0\"]");
		}
		catch(Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
	/*---------------------------------------------------------------------------------------------------------*/
	
	public void AdditionalWork_Report() throws InterruptedException
	{
		click("//a[@has-permission=\"Basicjobreports,readaccess\" and contains(text(), 'Additional Works')]");//click additional work report
		Thread.sleep(6000);
	}
	public void Job2_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Job No\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
/*---------------------------------------------------------------------------------------------------------*/
	
	public void FOC_Report() throws InterruptedException
	{
		click("//a[@has-permission=\"Basicjobreports,readaccess\" and contains(text(), 'Free of charge jobs')]");//click FOC report
		Thread.sleep(6000);
	}
	public void Job3_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Free of charge created by\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
/*---------------------------------------------------------------------------------------------------------*/
	
	public void Aborted_Report() throws InterruptedException
	{
		click("//a[@has-permission=\"Basicjobreports,readaccess\" and contains(text(), 'Aborted jobs')]");//click FOC report
		Thread.sleep(6000);
	}
	public void Job4_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Customer Name\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
/*---------------------------------------------------------------------------------------------------------*/
	
	public void Outstanding_Jobs_Report() throws InterruptedException
	{
		click("//a[@ng-if=\"reportList.customState\" and contains(text(),'Outstanding jobs')]");//click outstanding report
		Thread.sleep(6000);
	}
	public void Job5_Assertion()
	{
		try
		{
			isdisplayed("//span[@data-column=\"Customer Name\" and @data-row-index=\"0\"]");
		}
		catch (Exception e)
		{
			String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
			String b="No records found";
			Assertion(b, a, "No records found - Assertion failed");
		}
	}
/*---------------------------------------------------------------------------------------------------------*/
	
	public void SLA_Report()
	{
		try
		{
			isdisplayed("//a[@has-permission=\"ViewSLAReport,readaccess\" and contains(text(),'SLA jobs')]");
			Thread.sleep(3000);
			click("//a[@has-permission=\"ViewSLAReport,readaccess\" and contains(text(),'SLA jobs')]");//click SLA jobs
			Thread.sleep(6000);
			try
			{
				isdisplayed("//span[@data-column=\"Job Description\" and @data-row-index=\"0\"]");
			}
			catch(Exception e)
			{
				String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
				String b="No records found";
				Assertion(b, a, "No records found - Assertion failed");
			}
		}
		catch(Exception e)
		{
			System.out.println("SLA Module is not enabled in this client ID, so no SLA_Report");
		}
	}
/*---------------------------------------------------------------------------------------------------------*/
	
	public void SLA_Performance_Report()
	{
		try
		{
			isdisplayed("//a[@href=\"/reporting/view/jobs/SLA_performance_by_job_description\"]");
			Thread.sleep(3000);
			click("//a[@href=\"/reporting/view/jobs/SLA_performance_by_job_description\"]");//click SLA2 jobs
			Thread.sleep(6000);
			try
			{
				isdisplayed("//th[@class=\"sorting_disabled\" and contains(text(),'Job description')]");
			}
			catch(Exception e)
			{
				String a=gettext("(//div[@class=\"warning-message ng-binding\" and @ng-bind-html=\"message\" and contains(text(),'No records found')])[1]");
				String b="No records found";
				Assertion(b, a, "No records found - Assertion failed");
			}
		}
		catch(Exception e)
		{
			System.out.println("SLA Module is not enabled in this client ID, so no SLA_Performance_Report");
		}
	}
	
	
	
	
	
	
	

}