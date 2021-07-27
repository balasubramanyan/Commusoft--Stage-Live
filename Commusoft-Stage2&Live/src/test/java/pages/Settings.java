package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Settings extends Wrapper {
	int a=0;
	
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
	public void CIS_Percentage() throws InterruptedException {
		Thread.sleep(3000);
		click("//a[text()=\"CIS percentage\"]");
		selectdropdownvalue("//*[@id=\"cispercentagetype_value\"]","0");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/div/div/section/form/section/div/button/span[1]");
		Thread.sleep(3000);
		}
	public void Pdf_Fontsize() throws InterruptedException {
		click("//a[text()=\"Default PDF font size \"]");
		click("//*[@id=\"main\"]/div[2]/div[2]/div/div/section/form/section/div/button/span[1]");
		Thread.sleep(3000);
		
	}
	public void Vat_Company_num() throws InterruptedException {
		click("//a[text()=\"Vat & Company numbers\"]");
		clear("//input[@id=\"companynumberstype_companyregistration\"]");
		type("//input[@id=\"companynumberstype_companyregistration\"]" , "1998");
		clear("//input[@id=\"companynumberstype_taxnumber\"]");
		type("//input[@id=\"companynumberstype_taxnumber\"]" , "888");
		click("//*[@id=\"company-number-save\"]/span[1]");
		Thread.sleep(3000);
		
	}
	public void Bank_Details() throws InterruptedException {
		click("//a[text()=\"Bank details\"]");
		Thread.sleep(3000);
		click("//input[@id=\"no_bank_details\"]");
		Thread.sleep(3000);
		click("//*[@id=\"company-bank-details\"]/section/div/button/span[1]");
		Thread.sleep(3000);
	}
	public void Cheques_Made_Payable() throws InterruptedException {
		click("//a[text()=\"Cheques made payable\"]");
		clear("//input[@id=\"chequesmadepayable_message\"]");
		Thread.sleep(3000);
		type("//input[@id=\"chequesmadepayable_message\"]" ,"pay 123 limited");
		Thread.sleep(3000);
		click("//*[@id=\"save-cheque-button\"]/span[1]");
		Thread.sleep(3000);
	}
	public void Branding_Colours() throws InterruptedException {
		click("//a[text()=\"Branding colours\"]");
		Thread.sleep(3000);
		click("//*[@id=\"branding_colours\"]/fieldset/div[2]/div[1]/div[1]/div/div[2]/ul/li[4]/a");
		Thread.sleep(3000);
		click("//*[@id=\"branding_colours\"]/fieldset/div[2]/div[1]/div[2]/div/div[2]/ul/li[2]/a");
		Thread.sleep(3000);
		click("//*[@id=\"branding-details-save\"]/span[1]");
		Thread.sleep(3000);

	}
	public void Set_Currency() throws InterruptedException {
		click("//a[text()=\"Set currency\"]");
		selectdropdown("//*[@id=\"main\"]/div[2]/div[2]/div/div/section/form/fieldset/div[3]/div/div/div/select" ,"GBP");
		Thread.sleep(3000);
		click("//*[@id=\"main\"]/div[2]/div[2]/div/div/section/form/div/button/span[1]");
		Thread.sleep(3000);
	}
	public void Travel_Rate(String rate) throws InterruptedException {
		click("//a[text()=\"Travel rate\"]");
		WebElement e=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/ng-container/section/div/div/section/form/fieldset/div[3]/div/label/div/div/input[1]"));
		if(e.isSelected()) {
			clear("//input[@id=\"travelrate_value\"]");
			type("//input[@id=\"travelrate_value\"]",rate);
			
		}else
		click("//*[@id=\"main\"]/div[2]/div/ng-container/section/div/div/section/form/fieldset/div[3]/div/label/div/div/input[1]");
		type("//input[@id=\"travelrate_value\"]", rate);
		click("//*[@id=\"main\"]/div[2]/div/ng-container/section/div/div/section/form/div/button/span[1]");
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
	public void Customer_jobconformation() throws InterruptedException {
		click("//a[text()=\"Customer job confirmation\"]");
		click("//span[@id=\"customerjobconfirmationemail\"]");
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	public void free_chargereason(String reason) throws InterruptedException {
		int a=0;
		click("//a[text()=\"Free of charge reasons\"]");
		type("//input[@id=\"freeofchargereason_description\"]",reason + a+" ");
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
	public void Type_Telephone_num() throws InterruptedException {
		click("//a[text()=\"Types of telephone numbers\"]");
		type("//input[@id=\"telephonetype_description\"]" ,"Mobile" + a + " ");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This telephone type already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"telephonetype_description\"]" ,"Mobile" + a + " ");
		}
		click("//span[text()=\"Add telephone type\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Abort_reason(String reason) throws InterruptedException {
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
	public void Appliances_group(String Appliance) throws InterruptedException {
		int a=0;
		click("//a[text()=\"Appliance groups\"]");
		type("//input[@id=\"appliancegroup_description\"]","cooker" + a + "");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This appliance group already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"appliancegroup_description\"]","cooker" + a + "");
		}
		click("//*[@id=\"save-user-button\"]/span[1]");
		Thread.sleep(3000);
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Appliance_types() throws InterruptedException {
		int a=0;
		click("//a[text()=\"Appliance types\"]");
		selectdropdown("//select[@id=\"appliancetypes_settingsAppliancegroupsid\"]","Boilers");
		type("//input[@id=\"appliancetypes_description\"]","Combination boiler" + a + "");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This appliance type already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"appliancetypes_description\"]","Combination boiler" + a + "");
		}
		click("//span[text()=\"Add appliance type\"]");
		click("//*[@id=\"main\"]/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Appliance_Makes() throws InterruptedException {
		int a=0;
		click("//a[text()=\"Appliance makes\"]");
		type("//input[@id=\"appliancemake_description\"]" , "New Appliance" + a + " ");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This appliance make already exists.\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"appliancemake_description\"]" , "New Appliance" + a + " ");
		}
		click("//span[text()=\"Add appliance make\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Appliance_Models() throws InterruptedException {
		int a=0;
		click("//a[text()=\"Appliance models\"]");
		click("//*[@id=\"s2id_appliancemodel_settingsAppliancetypesid\"]/a/span[1]");
		type("//*[@id=\"select2-drop\"]/div/input","Combination boiler");
		typeenter("//*[@id=\"select2-drop\"]/div/input");
		selectdropdownvalue("//select[@id=\"appliancemodel_settingsFuelTypesid\"]","2");
		selectdropdownvalue("//select[@id=\"appliancemodel_settingsMakesid\"]" , "3");
		type("//input[@id=\"appliancemodel_description\"]" , "Test" + a + " ");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This appliance model already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"appliancemodel_description\"]" , "Test" + a + " ");
		}
		click("//span[text()=\"Add appliance model\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Technical_Reference() throws InterruptedException {
		int a=0;
		click("//a[text()=\"Technical references\"]");
		type("//input[@id=\"technicalreference_description\"]" ,"Water main" + a+ " ");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This technical reference already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"technicalreference_description\"]" ,"Water main" + a+ " ");
			Thread.sleep(3000);
		}
		click("//span[text()=\"Add technical reference\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Pricing_items(String Description) throws InterruptedException {
		click("//a[text()=\"Pricing items\"]");
		click("//a[text()=\"Add a pricing item\"]");
		type("//input[@class=\"control-input ng-untouched ng-pristine ng-invalid\"]",Description);
		type("//input[@class=\"control-input ng-untouched ng-pristine ng-invalid\"]","2500");
		click("//*[@id=\"s2id_autogen5\"]/a/span[1]");
		type("//*[@id=\"select2-drop\"]/div/input","Sales");
		typeenter("//*[@id=\"select2-drop\"]/div/input");
		click("/html/body/sidepanel-modal-container/div/div/app-pricing-items-sidepanel/form/div[3]/button/span[1]");
		Thread.sleep(3000);
	}
	public void Titles() throws InterruptedException {
		click("//a[text()=\"Titles\"]");
		type("//input[@id=\"title_description\"]","Mr");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This title already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"title_description\"]","Mr");
		}
		click("//span[text()=\"Add title\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Bcc_emails() throws InterruptedException {
		click("//a[text()=\"BCC emails\"]");
		clear("//input[@id=\"bccemailaddress_value\"]");
		type("//input[@id=\"bccemailaddress_value\"]","demo@commusoft.com");
		click("//span[text()=\"Save\"]");
		Thread.sleep(3000);
	}
	public void Estimate_Notes() throws InterruptedException {
		click("//a[text()=\"Estimate note\"]");
		clear("//textarea[@id=\"estimatenotes_message\"]");
		type("//textarea[@id=\"estimatenotes_message\"]" , "Invoice Amount");
		click("//*[@id=\"estimate-save\"]/span[1]");
		Thread.sleep(3000);

	}
	public void Estimate_Reject_Reason() throws InterruptedException {
		click("//a[text()=\"Estimate reject reasons\"]");
		type("//input[@id=\"estimateRejectReason_description\"]" , "Too expensive");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This Estimate Reject Reason already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"estimateRejectReason_description\"]" , "Too expensive");
		}
		click("//span[text()=\"Add Estimate Reject Reason\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
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
	public void Industry() throws InterruptedException {
		click("//a[text()=\"Industries\"]");
		Thread.sleep(3000);
		type("//input[@id=\"industry_description\"]" , "Oil");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This industry already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"industry_description\"]" , "Oil");
		}
		click("//span[text()=\"Add industry\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Category() throws InterruptedException {
		click("//a[text()=\"Categories\"]");
		Thread.sleep(3000);
		type("//input[@id=\"category_description\"]" , "Main");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This category already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"category_description\"]" , "Main");
			
		}
		Thread.sleep(3000);
		click("//span[text()=\"Add category\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
		Thread.sleep(3000);
	}
	public void Subcategories() throws InterruptedException {
		click("//a[text()=\"Subcategories\"]");
		selectdropdownvalue("//select[@id=\"subcategory_settingsCategoriesid\"]" ,"1");
		Thread.sleep(3000);
		type("//input[@id=\"subcategory_description\"]" ,"demo categories");
		WebElement text = driver.findElement(By.xpath("//span[text()=\"This subcategory already exists\"]"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
				type("//input[@id=\"subcategory_description\"]" ,"demo categories");
		}
		Thread.sleep(3000);
		click("//span[text()=\"Add subcategory\"]");
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div/div/h3/a");
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
