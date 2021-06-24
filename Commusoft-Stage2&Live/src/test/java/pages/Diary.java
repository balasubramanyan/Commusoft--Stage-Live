package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Diary extends Wrapper {
	public Diary(WebDriver ldriver)
	{
		this.driver = ldriver;
		ldriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void Diary_Module()
	{
		click("//a[text()='Diary']");
	}
	
	public void Diary_Daily()
	{
		try
		{
		click("//button[text()='Daily']");
		}catch(Exception e)
		{
			
		}
		
	}
	public void Diary_Today() throws InterruptedException
	{
		Thread.sleep(3000);
		try {
			click("//a[text()='Today']");
			Thread.sleep(3000);
			click("(//div[@class='fc-row fc-week fc-widget-content'])[2]");
		}catch(Exception e)
		{
			Thread.sleep(3000);
			click("(//a[@class='icon ss-navigateright'])[1]");
			Thread.sleep(3000);
			click("//a[text()='Today']");
		}
	}
	public void Diary_PM() throws InterruptedException
	{
		click("(//div[@class='fc-row fc-week fc-widget-content'])[2]");
	}
	public void Diary_EventFromJob() throws InterruptedException
	{
		click("//button[@ng-click='saveDiaryEvent()']");
	}
	public void Diary_Timing()
	{
		click("(//td[@class=\"fc-widget-content\"])[10]");
	}
	public void Diary_Timing1()
	{
		click("(//td[@class=\"fc-widget-content\"])[11]");
	}
	public void Diary_Timing2()
	{
		click("(//td[@class=\"fc-widget-content\"])[12]");
	}
	public void Diary_Normal_EvenDescription()
	{
		type("//input[@name='description']", "Normal Event");
	}
	public void Diary_Save()  //used to clik on save button on create diary event side panel
	{
		click("(//span[text()='Save'])[2]");
	}
	public void Diary_Estimate()
	{
		click("//a[text()='Estimate']");
	}
	public void Diary_job()
	{
		click("//a[text()='Job']");
	}
	public void Diary_propertysearch() throws InterruptedException
	{
		type("//input[@id='top-input-in-event-type']", "Ranjit");
		typeenter("//input[@id='top-input-in-event-type']");
		Thread.sleep(5000);
		click("(//input[@name='selected_property'])[1]");
		Thread.sleep(5000);
	}
	public void Diary_propertysearch(String name) throws InterruptedException
	{
		type("//input[@id='top-input-in-event-type']", name);
		typeenter("//input[@id='top-input-in-event-type']");
		Thread.sleep(5000);
		click("(//input[@name='selected_property'])[1]");
		Thread.sleep(5000);
	}
	public void Diary_Estimate_EventDescription()
	{
		selectdropdownvalue("//select[@ng-change='setEstimateDescription()']", "1");
	}
	public void Diary_Job_EventDescription()
	{
		selectdropdownvalue("//select[@name='description']", "1");
	}
	
	public void Diary_Monthly_view() throws InterruptedException
	{
	click("//button[text()='Monthly']");
	Thread.sleep(4000);
	}
	
	public void Diary_Monthly_Date()
	{
		try
		{
			click("//td[@class='fc-day-top fc-tue fc-today ']");
		}catch(Exception E)
		{
			try
			{
				click("(//td[@rowspan='3'])[6]");
			}
			catch(Exception q)
			{
				try
				{
					click("(//td[@rowspan='3'])[7]");
				}catch(Exception w)
				{
					try
					{
						click("(//td[@rowspan='3'])[8]");
					}catch(Exception e)
					{
						try
						{
							click("(//td[@rowspan='3'])[9]");
						}catch(Exception r)
						{
							try
							{
								click("(//td[@rowspan='3'])[10]");
							}catch(Exception j)
							{
								click("(//td[@rowspan='3'])[11]");	
							}
						}
					}
				}}}
						
	}
	public void Diary_currentdate_datepicker()
	{
		click("//span[@class='ss-calendar']");
		click("//a[@class='daterange-day ng-binding today']");
		
	}
	
	public void Diary_job_AddProperty()
	{
		click("//a[@ng-click='addNewProperty(event_type)']");
	}
	public void Diary_TypesOfProperty()
	{
		selectdropdown("//select[@id='new-property-type-input']","Customer");
	}
	public void Diary_TypesOfCustomer()
	{
		selectdropdownvalue("//select[@ng-change='setCustomerType()']","0");
	}
	public String name(String name)
	{
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 name = name + date1;
		return name;
	}
	public void Diary_AddProperty_CustomerName()
	{
		type("//input[@ng-model='add_new_customer_inputs.first_name']",name("Ranjit-"));
	}
	public void Diary_AddProperty_CustomerSurName()
	{
		type("//input[@ng-model='add_new_customer_inputs.surname']","Diary");
	}
	public void Diary_AddProperty_CustomerSurName(String Surname)
	{
		type("//input[@ng-model='add_new_customer_inputs.surname']",Surname);
	}
	public void Diary_AddProperty_CustomerEmail()
	{
		type("//input[@ng-model='add_new_customer_inputs.email']","ranjit@commusoft.com");
	}
	public void Diary_AddProperty_CustomerEmail(String Email)
	{
		type("//input[@ng-model='add_new_customer_inputs.email']",Email);
	}
	public void Diary_AddProperty_CustomerAdd1()
	{
		type("//input[@ng-model='add_new_customer_inputs.addrs_1']","Madurai");
	}
	public void Diary_AddProperty_CustomerAdd1(String Email)
	{
		type("//input[@ng-model='add_new_customer_inputs.addrs_1']",Email);
	}
	public void Diary_AddProperty_CustomerSave() throws InterruptedException
	{
		click("//button[@ng-show=\"selected_customer_type == 'new_customer'\"]");
		Thread.sleep(15000);
	}
	public void Diary_PrintJobSheet() throws InterruptedException
	{
		click("//span[text()='Print job sheets']");
		Thread.sleep(1000);
		tab(Location);
	}
	public void Diary_PrintSummarySheet()
	{
		click("//span[text()='Print summary sheets']");
		String windowHandle1 = driver.getWindowHandle();
		driver.switchTo().window(windowHandle1);
	}

}
