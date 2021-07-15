package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Settings extends Wrapper {
	
	public Settings(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Click_Setting() {
		click("//a[@id='drop4']");
	}
	public void Click_Companysetting() {
		click("//a[text()=\"Company settings\"]");
	}
	public void Company_details() throws InterruptedException {
		click("//a[text()=\"Company details\"]");
		clear("//input[@id='companydetails_email']");
		type("//input[@id='companydetails_email']","divya@gmail.com");
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	public void Click_Systemsetting() {
		click("//a[text()=\"System settings\"]");
	}
	public void Diary_setting() throws InterruptedException {
		click("//a[text()=\"Diary settings\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/div/div/section/form/section/div/button/span[1]");
		Thread.sleep(3000);
	}
	public void Location() throws InterruptedException {
		int a=0;
		click("//a[text()=\"Locations\"]");
		type("//input[@id='location_description']","garden"+a+"");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This location already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
			type("//input[@id='location_description']", "garden"+a+"");
		}
		click("//*[@id=\"location-save\"]/span[1]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void First_jobnumber(String num) throws InterruptedException {
		click("//a[text()=\"First job number\"]");
		click("//*[@id=\"customer-job-number\"]/section/fieldset/div[3]/div/div[1]/div/input");
		type("//input[@id=\"firstjobnumber_value\"]",num);
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	
	public  void Job_description(String[] args) throws InterruptedException

	{
		click("//a[text()='Job descriptions']");
		click("//a[text()='Add job description']");
		int a =1;
		type("//input[@class='control-input ng-pristine ng-invalid ng-touched']", "Ranjit -"+a+"");
		WebElement text = driver.findElement(By.xpath("//span[text()='This description already exists']"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
			type("//input[@class='control-input ng-pristine ng-invalid ng-touched']", "Ranjit -"+a+"");
		}
		click("(//span[text()='Save'])[2]");
		Thread.sleep(3000);
		}
	public void Customer_jobconformation() throws InterruptedException {
		click("//a[text()=\"Customer job confirmation\"]");
		click("//span[@id=\"customerjobconfirmationemail\"]");
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	public void free_chargereason(String reason) throws InterruptedException {
		int a=0;
		click("//a[text()=\"Free of charge reasons\"]");
		type("//input[@id=\"freeofchargereason_description\"]",reason + a+"");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This reason already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
			type("//input[@id=\\\"freeofchargereason_description\\\"]",reason +a+"");
		}
		click("//span[text()=\"Add free of charge reason\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Abort_reason(String reason) throws InterruptedException {
		int a=0;
		click("//a[text()=\"Abort reasons\"]");
		type("//input[@id=\"abortreason_description\"]",reason + a+"");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This abort reason already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"abortreason_description\"]",reason + a+"");
		}
		click("//span[text()=\"Save abort reason\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
		
	}
	public void Service_reminder() throws InterruptedException {
		int a=0;
		click("//a[text()=\"Service reminders\"]");
	    type("//input[@id=\"servicereminder_name\"]","Divya" + a+"");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This service reminder name already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"servicereminder_name\"]","Divya" + a+"");
		}
		selectdropdown("//select[@id=\"servicereminder_serviceperiod\"]","Monthly");
		selectdropdown("//select[@id=\"servicereminder_sendreminders\"]","Manual");
		
		click("//span[text()=\"Add service reminder\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	
	public void Fule_type(String fuletype) throws InterruptedException {
		int a=0;
		click("//a[text()=\"Fuel types\"]");
		type("//input[@id=\"fueltype_description\"]",fuletype +a+" ");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This fuel type already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"fueltype_description\"]",fuletype +a+" ");
		}
		click("//*[@id=\"save-user-button\"]/span[1]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Appliences_group(String Appliance) throws InterruptedException {
		int a=0;
		click("//*[@id=\"general\"]/div/div[2]/span[5]/ul/li[1]/h3/a");
		type("//input[@id=\"appliancegroup_description\"]",Appliance + a + "");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This appliance group already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"appliancegroup_description\"]",Appliance + a + "");
		}
		click("//*[@id=\"save-user-button\"]/span[1]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	
	public void First_estimate_number(String num) throws InterruptedException {
		click("//a[text()=\"First estimate number\"]");
		click("//input[@class=\"fix-margin ng-pristine ng-valid ng-valid-required\"]");
		type("//input[@id=\"firstestimatenumber_value\"]",num);
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	public void work_addressestimate_conformation() throws InterruptedException {
		click("//*[@id=\"estimates\"]/div/div[2]/ul[7]/li[1]/h3/a");
		click("//*[@id=\"work-address-estimate-confirmation\"]/fieldset/section/div[3]/div[1]/div/ul/li[1]/a");
		click("//*[@id=\"workAddressEstimateConfirmation\"]/span[1]");
		Thread.sleep(3000);
		
	}
	public void customer_estimateconformation() throws InterruptedException {
		click("//a[text()=\"Customer estimate confirmation\"]");
		click("//span[@id=\"customerestimateemail\"]");
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	public void Invoice_number() throws InterruptedException {
		click("//a[text()=\"Invoice number\"]");
		click("//input[@id=\"invoice_number1\"]");
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
		
	}
	public void Invoice_emailmessage() throws InterruptedException {
		click("//a[text()=\"Invoice email message\"]");
		click("//*[@id=\"angular-es-container\"]/app-invoice-messages/section/div/div/section/form/div/button/span[1]");
		Thread.sleep(3000);
	}
}
