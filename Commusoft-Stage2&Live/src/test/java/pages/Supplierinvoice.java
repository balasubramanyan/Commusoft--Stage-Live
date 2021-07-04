package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Supplierinvoice extends Wrapper {
//
//	@FindBy(xpath = "//*[@id='main']/div[2]/div[3]/section/div/div/div/form/fieldset/div[2]/div[1]/div[2]/div/input") WebElement invoicefid;
//
//	@FindBy(xpath="//span [@class = 'control-error-message ng-scope']") WebElement confirmationMessage;

	public Supplierinvoice(WebDriver ldriver)
	{
		this.driver = ldriver;
	}


	public void Supplierinvoaddbutton() throws InterruptedException
	{
		click("//*[@id=\"supplierinvoice\"]/section/div[1]/span[2]/a");
		Thread.sleep(2000);
	}

	public void Invoiceno() throws InterruptedException, IOException
	{

	
	type("//*[@id='main']/div[2]/div[3]/section/div/div/div/form/fieldset/div[2]/div[1]/div[2]/div/input", "521");
	
	Thread.sleep(2000);
	
	}


public void supplirinvpart() throws InterruptedException 
{


	dclick("//td[(@class ='overflow_handsontable select_icon afterHiddenColumn firstVisibleColumn htPlaceholder')]");
	Thread.sleep(2000);
	type("//input[@class='select2-input select2-focused']", "part");
	Thread.sleep(3000);
	click("//div[text() ='Parts']");

}

public void quantity() throws InterruptedException {

	dclick("//td[@class='current highlight']");
	Thread.sleep(1000);
	clear("//textarea[@class='handsontableInput']");
	Thread.sleep(1000);
	type("//textarea[@class='handsontableInput']", "10");		
	typeenter("//textarea[@class='handsontableInput']");
	Thread.sleep(1000);
}

public void unitcost(String b) throws InterruptedException
{

	dclick("//td[@class='current highlight']");
	Thread.sleep(1000);
	clear("//textarea[@class='handsontableInput']");
	Thread.sleep(1000);
	type("//textarea[@class='handsontableInput']", b);
	typeenter("//textarea[@class='handsontableInput']");
}	

public void vat(String b) throws InterruptedException
{
	dclick("//td [@class='overflow_handsontable select_icon current highlight']");
	Thread.sleep(3000);

	clear("//input [@class='select2-input select2-focused']");
	Thread.sleep(2000);
	clear("//input [@class='select2-input select2-focused']");
	type("//input [@class='select2-input select2-focused']",b);
	Thread.sleep(1000);
	click("(//li [@class = 'select2-results-dept-1 select2-result select2-result-selectable'])[1]");


}

public void nominalcode() throws InterruptedException
{

	dclick("//td[@class='overflow_handsontable select_icon afterHiddenColumn htPlaceholder current highlight']");
	Thread.sleep(1000);
	click("//div[@class='select2-result-label']");
	Thread.sleep(3000);

}

//Items in supplier invoice
public void item(String c) throws InterruptedException

{

	dclick ("//td [@class='afterHiddenColumn firstVisibleColumn']");
	Thread.sleep(3000);
	type("(//textarea [@class='handsontableInput'])[2]", c);
	Thread.sleep(1000);
	typeenter("(//textarea [@class='handsontableInput'])[2]");
	Thread.sleep(1000);


}

public void itemquantity() throws InterruptedException {

	dclick("//td[@class='overflow_handsontable current highlight']");
	Thread.sleep(3000);
	clear("(//textarea [@class='handsontableInput'])[3]");
	Thread.sleep(1000);
	type("(//textarea [@class='handsontableInput'])[3]", "10");		
	typeenter("(//textarea [@class='handsontableInput'])[3]");
	Thread.sleep(1000);
}

public void itemunitcost(String b) throws InterruptedException
{

	dclick("//td[@class='overflow_handsontable current highlight']");
	Thread.sleep(1000);
	clear("(//textarea [@class='handsontableInput'])[3]");
	Thread.sleep(1000);
	type("(//textarea [@class='handsontableInput'])[3]", b);
	typeenter("(//textarea [@class='handsontableInput'])[3]");
}	

public void itemscale(String c) throws InterruptedException

{

	dclick("//td[@class='overflow_handsontable current highlight']");
	Thread.sleep(1000);
	clear("(//textarea [@class='handsontableInput'])[2]");
	Thread.sleep(1000);
	type("(//textarea [@class='handsontableInput'])[2]", c);
	Thread.sleep(1000);
	typeenter("(//textarea [@class='handsontableInput'])[2]");
	Thread.sleep(3000);

}

public void itemvat(String b) throws InterruptedException
{
	dclick("//td [@class='overflow_handsontable select_icon current highlight']");
	Thread.sleep(3000);
	clear("//input [@class='select2-input select2-focused']");
	Thread.sleep(2000); //*[@id="item_new_supplier_invoice"]/div[1]/div/div/div/table/tbody/tr[1]/td[6]
	//clear("//input [@class='select2-input select2-focused']");
	type("//input [@class='select2-input select2-focused']",b);
	Thread.sleep(1000);
	click("(//li [@class = 'select2-results-dept-1 select2-result select2-result-selectable'])[1]");


}

public void itemnominalcode() throws InterruptedException
{

	dclick("//td[@class='overflow_handsontable select_icon afterHiddenColumn htPlaceholder current highlight']");
	Thread.sleep(1000);
	click("//div[@class='select2-result-label']");
	Thread.sleep(3000);

}






public void savesupplierbutton()

{

	click ("//button[@class='btn btn-primary save_btn']");	
}


}




