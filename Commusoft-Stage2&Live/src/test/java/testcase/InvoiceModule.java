package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Invoice;
import pages.LoginPage;

public class InvoiceModule extends Baseclass 
{
	String homepage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
		

	}
	@Test(priority = 1)
	public void invoice_No_Breakdown() throws InterruptedException
	{
		driver.get("https://stage.commusoft.net/customers/customer/1023/jobs/1119/details/view");
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Interim_invoice();
		invoice.invoice_description();
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.sub_total("500");
		invoice.save_invoice();
	}
	@Test(priority = 2)
	public void invoice_Breakdown_Bycategory() throws InterruptedException
	{
		driver.get("https://stage.commusoft.net/customers/customer/1023/jobs/1119/details/view");
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Additional_invoice();
		invoice.Invoice_Breakdown_Breakdown_by_category();
		invoice.invoice_description();
		invoice.BreakdownByCategory_des("Labour");
		invoice.unitprice("300");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.save_invoice();
	}
	@Test(priority = 3)
	public void invoice_FullBreakdown() throws InterruptedException
	{
		driver.get("https://stage.commusoft.net/customers/customer/1023/jobs/1119/details/view");
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Pre_Final_invoice();
		invoice.Invoice_Breakdown_Full_breakdown();
		invoice.invoice_description();
		invoice.Full_Breakdown_des("Price 1");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.save_invoice();
	}
	@Test(priority = 4)
	public void invoice_FullBreakdown_category() throws InterruptedException
	{
		driver.get("https://stage.commusoft.net/customers/customer/1023/jobs/1119/details/view");
		Thread.sleep(3000);
		Invoice invoice = new Invoice(driver);
		invoice.InvoiceTab();
		invoice.addinvoice();
		invoice.Pre_Final_invoice();
		invoice.Invoice_Breakdown_Full_breakdown_by_category();
		invoice.invoice_description();
		invoice.Full_Breakdown_ByCategory_Labour_Description("Labour");
		invoice.unitprice_FullBreakdown_ByCategory_Labour("300");
		invoice.Full_Breakdown_ByCategory_Parts_Description("Price 1");
		invoice.invoice_UserGroup();
		invoice.invoice_Category();
		invoice.save_invoice();
	}


}
