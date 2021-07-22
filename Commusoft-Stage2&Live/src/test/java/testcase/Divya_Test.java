package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Job_Des_Setting;
import pages.LoginPage;
import pages.Settings;
import pages.searchengine;

public class Divya_Test extends Baseclass{
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
	public void Setting() throws InterruptedException {
		Settings setting=new Settings(driver);
		setting.Click_Setting();
		setting.Click_Systemsetting();
		setting.Diary_setting();
		setting.Location();
		setting.Customer_jobconformation();
		setting.work_addressestimate_conformation();
		setting.customer_estimateconformation();
		setting.Invoice_number();
		setting.Invoice_emailmessage();
		setting.free_chargereason("offer");
		setting.Service_reminder();
		setting.Fule_type("white fuel");
		setting.Abort_reason("customer cancelled");
		setting.Appliances_group("cooker");
		setting.Appliance_types();
		setting.Appliance_Makes();
		setting.Appliance_Models();
		setting.Type_Telephone_num();
		setting.Technical_Reference();
		setting.Titles();
		setting.Bcc_emails();
		setting.Estimate_Notes();
		setting.Estimate_Reject_Reason();
		setting.Industry();
		setting.Category();
		setting.Subcategories();
		setting.Click_Setting();
		setting.Click_Companysetting();
		setting.Company_details();
		setting.CIS_Percentage();
		setting.Pdf_Fontsize();
		setting.Vat_Company_num();
		setting.Bank_Details();
		setting.Cheques_Made_Payable();
		setting.Branding_Colours();
		setting.Set_Currency();
		setting.Travel_Rate("10");
		
		
		 
		
		
		
	}

	
}
