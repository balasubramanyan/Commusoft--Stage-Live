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

public class SettingsModule extends Baseclass{
	public String homepage;
	

	@Test(priority=1)
	public void Setting() throws InterruptedException {
		Settings setting=new Settings(driver);
		setting.Click_Setting();
		setting.Click_Systemsetting();
		setting.Diary_setting();
		setting.Location();
		//setting.First_jobnumber("20405");
		setting.Customer_jobconformation();
		//setting.First_estimate_number("1400");
		setting.work_addressestimate_conformation();
		setting.customer_estimateconformation();
		setting.Invoice_number();
		setting.Invoice_emailmessage();
		setting.free_chargereason("offer");
		setting.Service_reminder();
		setting.Fule_type("white fuel");
		setting.Abort_reason("customer cancelled");
		setting.Appliances_group("cooker");
		setting.Click_Setting();
		setting.Click_Companysetting();
		setting.Company_details();		
		
	}

	
}
