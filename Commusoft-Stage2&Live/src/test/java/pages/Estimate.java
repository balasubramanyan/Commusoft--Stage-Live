package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import action.Wrapper;

public class Estimate extends Wrapper {

	public Estimate(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Estimate_AddNew() throws InterruptedException
	{
		Thread.sleep(1000);
		click("//button[@id='newEstimate']");
	}
	public void choose_description() throws InterruptedException
	{
		
		selectdropdownvalue("(//select[@id='landlords-select'])[2]", "2");
	}
	public void Estimate_Notes() throws InterruptedException
	{
		type("//textarea[@id='estimate_engineernotes']", "Estimate Note");
	}
	public void Estimate_CustomerReference() throws InterruptedException
	{
		type("//input[@id='estimate_customerreference']", "Customer Reference");
	}
	public void Estimate_user_group() throws InterruptedException
	{
		selectdropdownvalue("//select[@id='estimate_usergroupsid']", "1");
	}
	public void Estimate_AddEstimate() throws InterruptedException
	{
		click("//button[@type='submit']");
	}
	public void Estimate_Price_tab() throws InterruptedException
	{
		Thread.sleep(4000);
		click("//li[@id='estimate-price-step']");
	}
	public void Estimate_Price_NoBreakdown() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//a[@ng-click='noBreakdown()']");
	}
	public void Estimate_Price_NoBreakdown_PartsTotal() throws InterruptedException
	{
		
		Thread.sleep(3000);
		dclick("//td[contains(@class,'afterHiddenColumn firstVisibleColumn')]");
		Thread.sleep(1000);
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "600");
		Thread.sleep(2000);
		typeenter("//textarea[@class='handsontableInput']");
		Thread.sleep(3000);
		click("//td[contains(@class,'afterHiddenColumn firstVisibleColumn')]");
	}
	public void Estimate_InvoiceSchedule() throws InterruptedException
	{
		Thread.sleep(1000);
		click("//li[@id='estimate-invoice-step']");
		
	}
	public void Estimate_InvoiceSchedule_Deposite() throws InterruptedException
	{
		Thread.sleep(1000);
		dclick("(//span[@class='value-cell'])[2]");
		clear("//input[@id='time0row0associated_rows01']");
		type("//input[@id='time0row0associated_rows01']", "200");
		Thread.sleep(2000);
		typeenter("//input[@id='time0row0associated_rows01']");
		//		Actions builder = new Actions(driver);        
		//		builder.sendKeys(Keys.ENTER);
		
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
		
	}
	public void Estimate_InvoiceSchedule_Retention() throws InterruptedException
	{
		Thread.sleep(1000);
		dclick("(//span[@class='value-cell'])[8]");
		clear("//input[@id='time2row0associated_rows01']");
		type("//input[@id='time2row0associated_rows01']", "200");
		Thread.sleep(2000);
		typeenter("//input[@id='time2row0associated_rows01']");
		//		Actions builder = new Actions(driver);        
		//		builder.sendKeys(Keys.ENTER);
		
	}
	public void Estimate_SendtoCustomer() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//li[@id='estimate-customer-step']");
		
	}
	public void Estimate_Email() throws InterruptedException
	{
		Thread.sleep(1000);
		click("(//a[@class=\"btn btn-primary btn-small on-right ng-scope\" and contains(text(),'Email estimate')])");
		Thread.sleep(2000);
		click("//input[@class=\"select2-input select2-default\"]");//click on to field
		Thread.sleep(1000);
		click("//div[@class=\"select2-result-label\"]");//select email
		Thread.sleep(2000);
	}
	public void Estimate_Email_Send() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[@class=\"btn btn-primary btn-small ng-scope\" and contains(text(),'Send')]");//send email
		
	}
	public void Estimate_Notes_tab() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//span[@class=\"ng-scope\" and contains(text(),'Notes & communications')]");//notes tab
		
	}
	public void Estimate_Portal() throws InterruptedException
	{
		Thread.sleep(3000);
		click("(//a[contains(text(),'open the portal')])[1]");//click on portal link
		
	}
	public void Estimate_Portal_Accept() throws InterruptedException
	{
		Thread.sleep(2000);
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
	public void Estimate_Portal_Accept_Verification() throws InterruptedException
	{
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		click("//li[@id='estimate-accept-step']");
		Thread.sleep(1000);
		click("//input[@ng-checked='option.estimate_option_allow_check === true']");
		click("//button[text()='Accept']");
		Thread.sleep(1000);
		type("//input[@id='confirm_delete_input']", "ACCEPT");
		Thread.sleep(1000);
		click("//button[@id='delete-button']");
	}
	public void Estimate_Reject() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//li[@id='estimate-accept-step']");
		Thread.sleep(1000);
		click("//input[@ng-checked='option.estimate_option_allow_check === true']");
		click("//button[text()='Reject']");
		Thread.sleep(1000);
		type("//input[@id='confirm_delete_input']", "REJECT");
		selectdropdown("//select[@ng-model='select_estimate_reject_reason']", "Too expensive");
		click("//button[@id='delete-button']");

	}
	public void Estimate_partsTab() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[@id='partsTab']");
		
	}
	public void Estimate_Addpartlist() throws InterruptedException
	{
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		click("(//input[@class='inline-checkbox ng-scope'])[1]");
		click("(//input[@class='inline-checkbox ng-scope'])[2]");
		click("//a[@id='save-panel-btn']");
		Thread.sleep(2000);
	}
	public void Estimate_Parts_ChoosePrice() throws InterruptedException
	{
		Thread.sleep(2000);
		click("(//td[@class='supplier  '])[1]");
		Thread.sleep(1000);
		click("(//td[@class='supplier  '])[2]");
		Thread.sleep(2000);
	}

	public void Intro()throws InterruptedException
	{
		Thread.sleep(1000);
		click("//span[text()='Introduction']");
		Thread.sleep(2000);
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
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		click("//a[@id='quickLinks']");
		click("(//a[text()='Delete'])[1]");
		Thread.sleep(2000);
		type("//input[@id='confirm_delete_input']", "Delete");
		Thread.sleep(1000);
		click("//a[@id='delete-button']");
	}																																																																
	public void MakeNewOption()throws InterruptedException
	{
		Thread.sleep(1000);
		click("//a[@id='quickLinks']");
		click("(//a[text()='Add additional option'])[1]");
		Thread.sleep(2000);
		click("//input[@value='new_option']");
		Thread.sleep(1000);
		click("//a[@class='btn btn-primary ng-scope']");
		Thread.sleep(2000);
		click("(//a[text()='Edit'])[2]");
		Thread.sleep(3000);
		click("//span[text()='Price']");
		Thread.sleep(1000);
		//click("//a[@ng-click=\"confirmPrompt(); hideConfirmationBox()\"]");

	}
	public void Estimate_InvoiceSchedule_MakeNewOption() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//span[text()='Invoice schedule']");
		Thread.sleep(2000);
	}
	public void Estimate_InvoiceSchedule_Deposite_MakeNewOption() throws InterruptedException
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
	public void Estimate_InvoiceSchedule_Completion_MakeNewOption() throws InterruptedException
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
	public void Estimate_InvoiceSchedule_Retention_MakeNewOption() throws InterruptedException
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
	public void AdditionalOption_breadcrum()throws InterruptedException
	{
		Thread.sleep(2000);
		click("//a[text()='Additional options']");

	}
	public void Estimate_Clone()throws InterruptedException
	{
		Thread.sleep(1000);
		click("//a[@id='quickLinks']");
		click("(//a[text()='Add additional option'])[1]");
		Thread.sleep(2000);
		click("//input[@ng-click=\"cloneOption('clone')\"]");
		Thread.sleep(1000);
		click("//a[@class='btn btn-primary ng-scope']");

	}
	public void Estimate_Accept2() throws InterruptedException
	{
		click("//li[@id='estimate-accept-step']");
		Thread.sleep(2000);
		click("(//input[@ng-checked='option.estimate_option_allow_check === true'])[1]");
		click("(//input[@ng-checked='option.estimate_option_allow_check === true'])[2]");
		click("//button[text()='Accept']");
		Thread.sleep(3000);
		type("//input[@id='confirm_delete_input']", "ACCEPT");
		Thread.sleep(1000);
		click("//button[@id='delete-button']");
	}
	public void Estimate_Price_BreakdownByCategory() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[@ng-click='categoryBreakdown()']");
		Thread.sleep(3000);
		Thread.sleep(1000);
		dclick("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(3000);
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "300");
		Thread.sleep(3000);
		typeenter("//textarea[@class='handsontableInput']");
		Thread.sleep(3000);
		dclick("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(3000);
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "300");
		Thread.sleep(2000);
		typeenter("//textarea[@class='handsontableInput']");
		Thread.sleep(1000);
		//click("//td[@class='overflow_handsontable']");

	}
	public void Estimate_Price_FullBreakdown() throws InterruptedException
	{

		Thread.sleep(3000);
		click("//a[@ng-click='fullBreakdown()']");
		Thread.sleep(3000);
		Thread.sleep(1000);
		//Description
		dclick("//td[@class='afterHiddenColumn firstVisibleColumn']");
		Thread.sleep(3000);
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "Full Breakdown");
		//Quantity
		Thread.sleep(3000);
		dclick("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(1000);
		clear("(//textarea[@class='handsontableInput'])[2]");
		type("(//textarea[@class='handsontableInput'])[2]", "1");
		//Price
		Thread.sleep(5000);
		click("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(2000);
		dclick("//td[@class='overflow_handsontable current highlight']");
		Thread.sleep(1000);
		clear("(//textarea[@class='handsontableInput'])[2]");
		Thread.sleep(1000);
		type("(//textarea[@class='handsontableInput'])[2]", "600");
		Thread.sleep(2000);
		typeenter("(//textarea[@class='handsontableInput'])[2]");
		Thread.sleep(2000);
		click("(//td[@class=\"overflow_handsontable\"])[2]");
		Thread.sleep(1000);		
	}
	public void Estimate_Price_FullBreakdownByCategory() throws InterruptedException
	{
		Thread.sleep(5000);
		click("//span[text()='Add invoice item category']");
		Thread.sleep(1000);
		selectdropdownvalue("//select[@id='input-pricing-category-name']", "1");
		click("//a[text()='Save invoice item category']");

		Thread.sleep(3000);
		//Description
		dclick("//td[@class='afterHiddenColumn firstVisibleColumn']");
		Thread.sleep(3000);
		clear("//textarea[@class='handsontableInput']");
		type("//textarea[@class='handsontableInput']", "Full Breakdown By Category");

		//Quantity
		Thread.sleep(3000);
		dclick("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(3000);
		clear("(//textarea[@class='handsontableInput'])[2]");
		type("(//textarea[@class='handsontableInput'])[2]", "1");
		//Price
		Thread.sleep(5000);
		click("(//td[@class='overflow_handsontable'])[1]");
		Thread.sleep(2000);
		dclick("//td[@class='overflow_handsontable current highlight']");
		Thread.sleep(1000);
		clear("(//textarea[@class='handsontableInput'])[2]");
		Thread.sleep(2000);
		type("(//textarea[@class='handsontableInput'])[2]", "600");
		Thread.sleep(2000);
		typeenter("(//textarea[@class='handsontableInput'])[2]");
		Thread.sleep(2000);
		click("(//td[@class=\"overflow_handsontable\"])[2]");
		Thread.sleep(1000);	
	}

	public void Estimate_Add_To_Reserve_List() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[@id='quickLinks']");
		Thread.sleep(1000);
		click("(//a[text()='Add to reserve list'])[1]");
	
		//	click("//input[@id='s2id_autogen1']");
		type("//input[@class='select2-input select2-default']", "Ezhil");
		click("(//div[@class='select2-result-label'])[1]");
		Thread.sleep(1000);
		click("//span[@class='add-on']");
		Thread.sleep(1000);
		click("(//a[@class='daterange-day ng-binding'])[2]");
		Thread.sleep(1000);
		type("//input[@id='reservelist_description']", "Estimate reserve desc");
		type("//textarea[@id='reservelist_engineernote']", "Estimate reserve notes");
		Thread.sleep(1000);
		click("//button[@type='submit']");
	}
	public void Estimate_Clone_Estimate() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//a[@id='quickLinks']");
		Thread.sleep(1000);
		click("//a[text()='Clone estimate']");
		Thread.sleep(2000);		
		type("//input[@id='confirm_delete_input']","Clone");
		Thread.sleep(1000);
		click("//a[@class='btn btn-primary']");

	}

	public void Estimate_Transfer_Estimate() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//span[text()='Survey']");
		Thread.sleep(1000);
		click("(//a[text()='Edit'])[1]");
		Thread.sleep(1000);
		click("//a[@class='more-btn btn jobs-advanced']");
		Thread.sleep(1000);
		click("(//span[@class='select2-arrow'])[1]");
		Thread.sleep(2000);
		type("//input[@class='select2-input select2-focused']", "Ezhil");
		Thread.sleep(2000);
		click("(//div[@class='select2-result-label'])[1]");
		Thread.sleep(1000);
		click("//span[@class=\"add-on\"]");
		Thread.sleep(3000);
		click("(//a[@class='daterange-day ng-binding'])[55]");
		Thread.sleep(1000);
		click("//button[@class='delete btn btn-warning save-user-button merge_btn']");
		Thread.sleep(1000);
		type("//input[@id='confirm_delete_input']", "transfer");
		Thread.sleep(1000);
		click("//a[@id='delete-button']");
		

	}

	public void Estimate_parts() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		click("//a[@id='partsTab']");
		Thread.sleep(3000);
		click("//button[text()='Add part list']");
		//Part list name
		Thread.sleep(1000);
		clear("//input[@placeholder='Name']");
		type("//input[@placeholder='Name']", "Part name ");
		//Supplier
		Thread.sleep(1000);
		click("//div[@class='Select-input']");		
		Thread.sleep(3000);
		WebDriverWait Waitsupplier = new WebDriverWait(driver, 10);
		WebElement Supplier = Waitsupplier
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@role='combobox']")));
		Supplier.sendKeys("aravind");
		Thread.sleep(2000);
		Robot SelectSupplier = new Robot();
		SelectSupplier.keyPress(KeyEvent.VK_ENTER);
		SelectSupplier.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		click("//span[@class='Select-clear-zone']");

		Thread.sleep(2000);
		click("//span[@class='Select-arrow-zone']");
		Thread.sleep(3000);
		WebDriverWait Waitsupplier1 = new WebDriverWait(driver, 10);
		WebElement Supplier1 = Waitsupplier1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@role='combobox']")));
		Supplier1.sendKeys("aravind");
		Thread.sleep(2000);
		Robot SelectSupplier1 = new Robot();
		SelectSupplier1.keyPress(KeyEvent.VK_ENTER);
		SelectSupplier1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		click("//button[text() = 'Save']");
		
		//Add parts in the list
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-3--value")).click();
		Thread.sleep(3000);
		WebDriverWait Addpartwait = new WebDriverWait(driver, 10);
		WebElement Searchpart = Addpartwait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@role='combobox']")));
		Searchpart.sendKeys("Part2");
		Thread.sleep(3000);
		Robot Selectpart = new Robot();
		Selectpart.keyPress(KeyEvent.VK_ENTER);
		Selectpart.keyRelease(KeyEvent.VK_ENTER);

		//Add parts 2 in the list
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-3--value")).click();
		Thread.sleep(3000);
		WebDriverWait Addpartwait1 = new WebDriverWait(driver, 10);
		WebElement Searchpart1 = Addpartwait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@role='combobox']")));
		Searchpart1.sendKeys("Part11");
		Thread.sleep(3000);
		Robot Selectpart1 = new Robot();
		Selectpart1.keyPress(KeyEvent.VK_ENTER);
		Selectpart1.keyRelease(KeyEvent.VK_ENTER);

		//Select the stock room price 
		Thread.sleep(1000);
		click("(//td[@class='supplier ss '])[1]");
		//Select the supplier price edit and save
		Thread.sleep(1000);
		click("(//a[text()='Edit'])[2]");
		Thread.sleep(1000);
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[2]/section/div/div/section/div/div/div[2]/span/csreactcomponent/div/div/span[3]/div/div/div/div[3]/div/input");
		clear("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[2]/section/div/div/section/div/div/div[2]/span/csreactcomponent/div/div/span[3]/div/div/div/div[3]/div/input");
		type("//*[@id=\"main\"]/div[2]/div/ng-container/div[2]/span[2]/section/div/div/section/div/div/div[2]/span/csreactcomponent/div/div/span[3]/div/div/div/div[3]/div/input","30");
		Thread.sleep(1000);
		click("(//button[text()='Close'])[5]");
		Thread.sleep(1000);
		click("//td[@class='supplier  --lowest']");

	}
	public void Estimate_priceTab_Lineitemestimate() throws InterruptedException, AWTException
	{
		Thread.sleep(1000);
		click("//span[text()='Add line items to estimate']");
		Thread.sleep(2000);
		click("(//input[@class='inline-checkbox ng-scope'])[1]");
		click("(//input[@class='inline-checkbox ng-scope'])[2]");
		Thread.sleep(1000);
		click("//a[@class='btn btn-primary ng-scope']");

	}

}
