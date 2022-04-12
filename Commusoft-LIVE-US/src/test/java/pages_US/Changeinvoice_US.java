package pages_US;

import org.openqa.selenium.WebDriver;

import action_US.Wrapper_US;

public class Changeinvoice_US extends Wrapper_US 
{
	public Changeinvoice_US(WebDriver ldriver)
	{
		this.driver = ldriver;
	}

public void addcustomer() {
	  
	  click("#customertypecustomer");//testing
	  selectdropdown("#customertype_contacts_settingsTitlesid", "Mr");
	  type("#customertype_contacts_name","Mohammed azarudeen");
	  type("#customertype_contacts_surname", "N S");
	  type("#customertype_contacts_contactstelephone_0_telephonenumber", "789456322");
	  type("#customertype_contacts_contactsemail_emailaddress", "azarudeen@commusoft.com");
	  type("#customertype_addressline1", "41 prince avenue");
	  type("#customertype_addressline2", "Town apartments");
	  type("#customertype_addressline3", "Kurinji nagar");
	  click("//button[@type='submit']");  
  }

public void addjob()
{
	click("//a[@id='newJob']");
	click("(//span[@class='select2-chosen'])[3]");
	click("(//div[@class='select2-result-label'])[2]");
	click("//button[@type='submit']");
}

public void adddiary() throws InterruptedException
{
	click("//a[@class='btn btn-small btn-primary']");
	Thread.sleep(3000);
	click("(//a[@class='icon ss-navigateright'])[1]");
	click("//a[text()='Today']");
	click("(//td[@class='fc-widget-content'])[25]");
	Thread.sleep(3000);
	click("//button[@class='btn btn-primary']");
}

public void add_additionalinvoice() throws InterruptedException
{
	click("//span[text()='Invoices']");
	click("//a[@class='btn btn-primary btn-small ng-scope']");
	click("//a[text()='Copy from job']");
	Thread.sleep(3000);
	selectdropdownvalue("//select[@formcontrolname='invoiceCategoryId']","11");
	Thread.sleep(3000);
	click("(//input[@type='radio'])[2]");
	Thread.sleep(3000);
	dclick("//table[@class='htCore']//tbody/tr/td[2]");
	Thread.sleep(3000);	
	type("//*[@id=\"select2-drop\"]/div/input","parts");
	Thread.sleep(3000);
	typeenter("//*[@id=\"select2-drop\"]/div/input");
	Thread.sleep(3000);
	dclick("//table[@class='htCore']//tbody/tr/td[5]");
	Thread.sleep(3000);
	clear("//textarea[@class='handsontableInput']");
	Thread.sleep(3000);
	type("//textarea[@class='handsontableInput']","200");
	Thread.sleep(3000);
	typeenter("//textarea[@class='handsontableInput']");
	Thread.sleep(3000);
	click("//button[@class='btn btn-primary loading_btn save_btn']");
	
}
public void addfinalinvoice() throws InterruptedException
{
	click("(//a[@class='ng-scope ng-binding'])[2]");
	Thread.sleep(2000);
	driver.navigate().refresh();
	click("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[1]/div/section/div[1]/div/section/div[1]/span/a");
	Thread.sleep(3000);
	selectdropdown("(//div[@class='controls']//select)[1]","Final invoice");
	Thread.sleep(3000);
	click("//a[text()='Copy from job']");
	selectdropdownvalue("//select[@formcontrolname='invoiceCategoryId']","11");
	Thread.sleep(3000);
	click("(//input[@type='radio'])[2]");
	Thread.sleep(3000);
	dclick("//table[@class='htCore']//tbody/tr/td[2]");
	Thread.sleep(3000);	
	type("//*[@id=\"select2-drop\"]/div/input","parts");
	Thread.sleep(3000);
	typeenter("//*[@id=\"select2-drop\"]/div/input");
	Thread.sleep(3000);
	dclick("//table[@class='htCore']//tbody/tr/td[5]");
	Thread.sleep(3000);
	clear("//textarea[@class='handsontableInput']");
	Thread.sleep(3000);
	type("//textarea[@class='handsontableInput']","500");
	Thread.sleep(3000);
	typeenter("//textarea[@class='handsontableInput']");
	Thread.sleep(3000);
	click("//button[@class='btn btn-primary loading_btn save_btn']");
		
}
public void editinvoicetype() throws InterruptedException
{
	click("(//div[@class='section-title with-edit']//a)[1]");
	selectdropdown("(//div[@class='controls']//select)[1]","Interim invoice");
	Thread.sleep(3000);
	click("//button[@class='btn btn-primary loading_btn save_btn']");
}
}
