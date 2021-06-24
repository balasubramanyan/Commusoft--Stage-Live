package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Estimate extends Wrapper {
	
	public Estimate(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Estimate_AddNew()
	{
		click("//button[@id='newEstimate']");
	}
	public void choose_description()
	{
		selectdropdownvalue("(//select[@id='landlords-select'])[2]", "2");
	}
	public void Estimate_Notes()
	{
		type("//textarea[@id='estimate_engineernotes']", "Estimate Note");
	}
	public void Estimate_CustomerReference()
	{
		type("//input[@id='estimate_customerreference']", "Customer Reference");
	}
	public void Estimate_user_group()
	{
		selectdropdownvalue("//select[@id='estimate_usergroupsid']", "1");
	}
	public void Estimate_AddEstimate()
	{
		click("//button[@type='submit']");
	}
	public void Estimate_Price_tab()
	{
		click("//li[@id='estimate-price-step']");
	}
	public void Estimate_Price_NoBreakdown()
	{
		click("//a[@ng-click='noBreakdown()']");
	}
	public void Estimate_Price_NoBreakdown_PartsTotal() throws InterruptedException
	{
		dclick("//td[contains(@class,'afterHiddenColumn firstVisibleColumn')]");
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "600");
		Thread.sleep(2000);
		typeenter("//textarea[@class='handsontableInput']");
		Thread.sleep(6000);
		click("//td[contains(@class,'afterHiddenColumn firstVisibleColumn')]");
	}
	public void Estimate_InvoiceSchedule() throws InterruptedException
	{
		click("//li[@id='estimate-invoice-step']");
		Thread.sleep(2000);
	}
	public void Estimate_InvoiceSchedule_Deposite() throws InterruptedException
	{
		dclick("(//span[@class='value-cell'])[2]");
		clear("//input[@id='time0row0associated_rows01']");
		type("//input[@id='time0row0associated_rows01']", "200");
		Thread.sleep(2000);
		typeenter("//input[@id='time0row0associated_rows01']");
//		Actions builder = new Actions(driver);        
//		builder.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public void Estimate_InvoiceSchedule_Completion() throws InterruptedException
	{
		dclick("(//span[@class='value-cell'])[5]");
		clear("//input[@id='time1row0associated_rows01']");
		type("//input[@id='time1row0associated_rows01']", "200");
		Thread.sleep(2000);
		typeenter("//input[@id='time1row0associated_rows01']");
//		Actions builder = new Actions(driver);        
//		builder.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public void Estimate_InvoiceSchedule_Retention() throws InterruptedException
	{
		dclick("(//span[@class='value-cell'])[8]");
		clear("//input[@id='time2row0associated_rows01']");
		type("//input[@id='time2row0associated_rows01']", "200");
		Thread.sleep(2000);
		typeenter("//input[@id='time2row0associated_rows01']");
//		Actions builder = new Actions(driver);        
//		builder.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public void Estimate_SendtoCustomer() throws InterruptedException
	{
		click("//li[@id='estimate-customer-step']");
		Thread.sleep(3000);
	}
	public void Estimate_Accept() throws InterruptedException
	{
		click("//li[@id='estimate-accept-step']");
		Thread.sleep(2000);
		click("//input[@ng-checked='option.estimate_option_allow_check === true']");
		click("//button[text()='Accept']");
		Thread.sleep(3000);
		type("//input[@id='confirm_delete_input']", "ACCEPT");
		Thread.sleep(1000);
		click("//button[@id='delete-button']");
	}
	public void Estimate_Reject() throws InterruptedException
	{
		click("//li[@id='estimate-accept-step']");
		Thread.sleep(2000);
		click("//input[@ng-checked='option.estimate_option_allow_check === true']");
		click("//button[text()='Reject']");
		Thread.sleep(3000);
		type("//input[@id='confirm_delete_input']", "REJECT");
		selectdropdown("//select[@ng-model='select_estimate_reject_reason']", "Too expensive");
		click("//button[@id='delete-button']");
	
	}
	public void Estimate_partsTab() throws InterruptedException
	{
		click("//a[@id='partsTab']");
		Thread.sleep(3000);
	}
	public void Estimate_Addpartlist() throws InterruptedException
	{
		Thread.sleep(5000);
		click("//button[text()='Add part list']");
		Thread.sleep(4000);
		click("//button[text()='Save']");
	}
	public void Estimate_AddPartstoPartlist() throws InterruptedException
	{
		click("//div[@id='react-select-3--value']");
		type("//input[contains(@aria-activedescendant,'react-select-')]","Parts");
		Thread.sleep(2000);
		typeenter("//input[contains(@aria-activedescendant,'react-select-')]");
		type("//input[contains(@aria-activedescendant,'react-select-')]","items");
		Thread.sleep(2000);
		typeenter("//input[contains(@aria-activedescendant,'react-select-')]");	
		Thread.sleep(4000);
	}
	public void Estimate_Select_CheapestPrice_Parts() throws InterruptedException
	{
		Thread.sleep(3000);
		selectdropdownvalue("//select[@class='cs-quick-select']", "cheapest");
		Thread.sleep(6000);
	}
	public void Estimate_Price_AddLineItems() throws InterruptedException
	{
		click("//span[text()='Add line items to estimate']");
		Thread.sleep(4000);
		click("(//input[@class='inline-checkbox ng-scope'])[1]");
		click("(//input[@class='inline-checkbox ng-scope'])[2]");
		click("//a[@id='save-panel-btn']");
		Thread.sleep(4000);
	}
	public void Estimate_Parts_ChoosePrice() throws InterruptedException
	{
		Thread.sleep(4000);
		click("(//td[@class='supplier  '])[1]");
		Thread.sleep(4000);
		click("(//td[@class='supplier  '])[2]");
		Thread.sleep(2000);
	}
	
	

}
