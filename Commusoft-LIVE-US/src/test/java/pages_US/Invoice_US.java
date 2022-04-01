package pages_US;

import org.openqa.selenium.WebDriver;

import action_US.Wrapper_US;

public class Invoice_US extends Wrapper_US{
	
	public Invoice_US(WebDriver ldriver)
	{
		this.driver =ldriver;
	}
	public void InvoiceTab()
	{
		click("//span[text()='Invoices']");
	}
	
	public void addinvoice() throws InterruptedException
	{
		click("//a[@has-permission='Customerinvoicing,writeaccess']");
		Thread.sleep(1000);
	}
	
	public void Additional_invoice() throws InterruptedException
	{
		selectdropdownvalue("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "partial");
		Thread.sleep(2000);
	}
	
	public void Interim_invoice() throws InterruptedException
	{
		selectdropdownvalue("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "interim");
		Thread.sleep(2000);
	}
	
	public void Pre_Final_invoice() throws InterruptedException
	{
		selectdropdownvalue("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "preFinal");
		Thread.sleep(2000);
	}
	
	public void Final_invoice() throws InterruptedException
	{
		selectdropdown("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "Final invoice");
		Thread.sleep(2000);
	}
	public void Invoice_Breakdown_No_Breakdown()
	{
		click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[1]");
	}
	
	public void Invoice_Breakdown_Breakdown_by_category()
	{
		click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[2]");
	}
	public void BreakdownByCategory_des(String a) throws InterruptedException
	{
		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
		type("//input[contains(@class,'select2-input select')]", a);
		Thread.sleep(1000);
		typeenter("//input[contains(@class,'select2-input select')]");
		Thread.sleep(1000);
		click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
	}
	public void unitprice(String a) throws InterruptedException
	{
		dclick("(//td[@class='afterHiddenColumn'])[1]");
		Thread.sleep(1000);
		clear("//textarea[@class='handsontableInput']");
		Thread.sleep(1000);
		type("//textarea[@class='handsontableInput']", a);
	}
	public void Invoice_Breakdown_Full_breakdown()
	{
		click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[3]");
	}
	public void Full_Breakdown_des(String a) throws InterruptedException
	{
		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
		type("//input[contains(@class,'select2-input select')]", a);
		Thread.sleep(1000);
		//click("//span[text()=\"parts\"]");
		typeenter("//input[contains(@class,'select2-input select')]");
		Thread.sleep(1000);
	}
	public void quanity_fbs(String a) throws InterruptedException
	{
		dclick("(//td[@class='afterHiddenColumn area highlight']");
		//typeenter("//td[@class='afterHiddenColumn area highlight']");
		Thread.sleep(1000);
		clear("//textarea[@class='handsontableInput']");
		Thread.sleep(1000);
		type("//textarea[@class='handsontableInput']", a);
	}
	public void Unitprice_Full_breakdown_des(String a) throws InterruptedException
	{
        dclick("//td[@class='overflow_handsontable current highlight']");
		Thread.sleep(1000);
		clear("//textarea[@class='handsontableInput']");
		Thread.sleep(2000);
		type("//textarea[@class='handsontableInput']", a);
		typeenter("//textarea[@class='handsontableInput']");
		
	}
	public void Invoice_Breakdown_Full_breakdown_by_category()
	{
		click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[4]");
	}
	public void Full_Breakdown_ByCategory_Labour_Description(String a) throws InterruptedException
	{
		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
		type("//input[contains(@class,'select2-input select')]", a);
		Thread.sleep(1000);
		click("//span[text()=\"labour\"]");
		//typeenter("//input[contains(@class,'select2-input select')]");
		Thread.sleep(1000);
		click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
	}
	public void Full_Breakdown_ByCategory_Parts_Description(String a) throws InterruptedException
	{
		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[7]");
		type("//input[contains(@class,'select2-input select')]", a);
		Thread.sleep(1000);
		click("//span[text()=\"parts\"]");
		//typeenter("//input[contains(@class,'select2-input select')]");
		Thread.sleep(1000);
		click("(//td[contains(@class,'overflow_handsontable select_icon')])[7]");
	}
	public void unitprice_FullBreakdown_ByCategory_Labour(String a) throws InterruptedException
	{
		dclick("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(1000);
		clear("//textarea[@class='handsontableInput']");
		Thread.sleep(1000);
		type("//textarea[@class='handsontableInput']", a);
	}
	public void unitprice_FullBreakdown_ByCategory_Parts(String a) throws InterruptedException
	{
		dclick("(//td[@class='overflow_handsontable'])[3]");
		Thread.sleep(1000);
		clear("//textarea[@class='handsontableInput']");
		Thread.sleep(1000);
		type("//textarea[@class='handsontableInput']", a);
	}
	
	public void invoice_description()
	{
		click("//a[text()='Copy from job']");
	}
	
	public void invoice_description(String a)
	{
		type("(//input[@class='validate-control-input ng-untouched ng-pristine ng-valid'])[1]", "Description");
	}
	
	public void invoice_UserGroup()
	{
		selectdropdownvalue("//select[@formcontrolname='userGroupId']", "1");
	}
	
	public void invoice_Category()
	{
		selectdropdownvalue("//select[@formcontrolname='invoiceCategoryId']", "11");
	}
	
	public void sub_total(String a)
	{
		type("(//input[@class='validate-control-input ng-untouched ng-pristine ng-valid'])[2]", a);
	}
	
	public void save_invoice()
	{
		click("(//button[@type='submit'])[1]");
	}
	public void invoice_AddnewPayment()
	{
		click("//a[@class='btn btn-small btn-primary action-btn']");
	}
	public void invoice_payment_AddDescription()
	{
		type("//textarea[@ng-model='description']","Enter the Description");
	}
	public void invoice_payment_method()
	{
		selectdropdownvalue("//select[@name='paymentMethod']","4");
	}
	public void invoice_payment_nominalcode()
	{
		selectdropdown("//select[@name='nominalAccount']","Bank");
	}
	public void invoice_payment_amount()
	{
		clear("//input[@name='amount']");
		type("//input[@name='amount']","100");
	}
	public void invoice_paymeny_save()
	{
		click("//button[@type='submit']");
	}
	
	
	
	
	
	
		
	


}
