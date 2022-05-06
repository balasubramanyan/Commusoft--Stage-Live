package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	public void Estimate_Price_tab() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//li[@id='estimate-price-step']");
	}
	public void Estimate_Price_NoBreakdown() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[@ng-click='noBreakdown()']");
	}
	public void Estimate_Price_NoBreakdown_PartsTotal() throws InterruptedException
	{
		Thread.sleep(3000);
		Thread.sleep(3000);
		dclick("//td[contains(@class,'afterHiddenColumn firstVisibleColumn')]");
		Thread.sleep(3000);
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "600");
		Thread.sleep(2000);
		typeenter("//textarea[@class='handsontableInput']");
		Thread.sleep(6000);
		click("//td[contains(@class,'afterHiddenColumn firstVisibleColumn')]");
	}
	public void Estimate_InvoiceSchedule() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//li[@id='estimate-invoice-step']");
		Thread.sleep(2000);
	}
	public void Estimate_InvoiceSchedule_Deposite() throws InterruptedException
	{
		Thread.sleep(3000);
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
		Thread.sleep(3000);
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
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		click("//li[@id='estimate-customer-step']");
		Thread.sleep(3000);
	}
	public void Estimate_Email() throws InterruptedException
	{
		Thread.sleep(3000);
		click("(//a[@class=\"btn btn-primary btn-small on-right ng-scope\" and contains(text(),'Email estimate')])");
		Thread.sleep(2000);
		click("//input[@class=\"select2-input select2-default\"]");//click on to field
		Thread.sleep(2000);
		click("//div[@class=\"select2-result-label\"]");//select email
		Thread.sleep(2000);
	}
	public void Estimate_Email_Send() throws InterruptedException
	{
		click("//a[@class=\"btn btn-primary btn-small ng-scope\" and contains(text(),'Send')]");//send email
		Thread.sleep(3000);
	}
	public void Estimate_Notes_tab() throws InterruptedException
	{
		click("//span[@class=\"ng-scope\" and contains(text(),'Notes & communications')]");//notes tab
		Thread.sleep(5000);
	}
	public void Estimate_Portal() throws InterruptedException
	{
		click("(//a[contains(text(),'open the portal')])[1]");//click on portal link
		Thread.sleep(3000);
	}
	public void Estimate_Portal_Accept() throws InterruptedException
	{
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		click("//button[@class=\"action-button confirm\" and contains(text(),'Accept')]");
		click("//*[@id=\"react-root\"]/div/div[1]/main/div[1]/div/div[2]/div/textarea");
		type("//*[@id=\"react-root\"]/div/div[1]/main/div[1]/div/div[2]/div/textarea","testing");
		//type("//textarea[@class=\"focus-visible\"]", "text field");
		click("//*[@id=\"react-root\"]/div/div[1]/main/div[1]/div/div[2]/div/input");
		type("//*[@id=\"react-root\"]/div/div[1]/main/div[1]/div/div[2]/div/input","accept");
		//type("//input[@class=\"focus-visible\"]", "accept");
		click("//button[@class=\"action-button confirm\" and contains(text(),'Accept')]");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
	}
	public void Estimate_Portal_Accept_Verification()
	{
		click("//span[@class=\"ng-scope\" and contains(text(),'Estimate details')]");
		WebElement ss = driver.findElement(By.xpath("//a[@class=\"ng-scope\" and contains(text(),'View job')]"));
		if(ss.isDisplayed()) {
			System.out.println("Estimate Accepted");
		}else {
			System.out.println("Case Failed kindly recheck");
		}
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

	public void Intro()throws InterruptedException
	{
		Thread.sleep(1000);
		click("//span[text()='Introduction']");
		Thread.sleep(3000);
		driver.switchTo().frame("estimate_intro_ifr");
		// select the editor and do the input 
		driver.findElement(By.id("tinymce")).sendKeys("Estimate Create for ezhilraja work ");
		// switch back to the default window 
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		click("//a[@class=\"btn btn-primary on-right save_btn loading_btn\"]");
	}
	public void Estimate_body()throws InterruptedException
	{
		Thread.sleep(1000);
		click("//span[text()='Estimate body']");
		Thread.sleep(3000);
		driver.switchTo().frame("estimate_body_ifr");
		// select the editor and do the input 
		driver.findElement(By.id("tinymce")).sendKeys("Estimate bodyCreate for ezhilraja work ");
		// switch back to the default window 
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		click("//a[@class=\"btn btn-primary on-right save_btn loading_btn\"]");
	}
	public void Estimate_Survey_Edit()throws InterruptedException
	{
		Thread.sleep(1000);
		click("(//a[text()='Edit'])[1]");
		clear("//input[@name='description']");
		type("//input[@name='description']", "Updated estimate desc");
		Thread.sleep(1000);
		type("//textarea[@class='customer-note-textarea ng-pristine ng-valid']", "Estimate notes updated");
		Thread.sleep(1000);
		type("//input[@name='customerReference']", "Refer NO 55");		
		Thread.sleep(1000);
		selectdropdownvalue("//select[@name='userGroupId']", "1");
		Thread.sleep(1000);
		click("//button[@class='btn btn-primary loading_btn save_btn']");
	}
	public void Estimate_Delete()throws InterruptedException
	{
		Thread.sleep(1000);
		click("//a[@id='quickLinks']");
		click("(//a[text()='Delete'])[1]");
		Thread.sleep(2000);
		type("//input[@id='confirm_delete_input']", "Delete");
		Thread.sleep(1000);
		click("//a[@id='delete-button']");
	}

}
