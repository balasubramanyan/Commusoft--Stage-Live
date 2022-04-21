package pages;

import org.openqa.selenium.WebDriver;
import action.Wrapper;

public class ConsolidatedInv extends Wrapper {

	public ConsolidatedInv(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void customerdetails() throws InterruptedException {
		click("//*[@id=\"main\"]/div[2]/div/ng-container/div[1]/div/h3/span[4]/a");
	}

	public void quicklinks() throws InterruptedException

	{
		click("//a[@id='quickLinks']");
		Thread.sleep(3000);
	}

	public void chooseConInv() throws InterruptedException {
		click("//a[@ng-click='handleConsolidatedInvoice()']");
		Thread.sleep(3000);
	}

	public void addConsolidatedInv() throws InterruptedException

	{
		type("//input[@formcontrolname='invoiceDescription']", "inv description");
		type("//textarea[@id='note']", "Invoice notes for testing");
		selectdropdownvalue("//select[@formcontrolname='invoiceCategoryId']", "1");
		Thread.sleep(3000);
	}

	public void totalConInvValue_Interim(String a) throws InterruptedException

	{

		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
		clear("//*[@id='select2-drop']/div/input");
		type("//input[contains(@class,'select2-input select')]", "Interim");
		Thread.sleep(3000);
		typeenter("//input[contains(@class,'select2-input select')]");
		Thread.sleep(3000);
		dclick("(//td[contains(@class,'overflow_handsontable')])[10]");
		Thread.sleep(4000);
		type("//*[@id='multiple-invoice-create-edit']/div[8]/textarea", "125");
		typeenter("//*[@id='multiple-invoice-create-edit']/div[8]/textarea");

	}

	public void totalConInvValue_Additional() throws InterruptedException

	{
		Thread.sleep(2000);
		typeenter("//*[@id='multiple-invoice-create-edit']/div[8]/textarea");
		Thread.sleep(3000);
		type("//*[@id='multiple-invoice-create-edit']/div[8]/textarea", "526");
		typeenter("//*[@id='multiple-invoice-create-edit']/div[8]/textarea");

	}

	public void totalConInvValue_Final(String a) throws InterruptedException

	{

		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[7]");
		clear("//*[@id='select2-drop']/div/input");
		type("//input[contains(@class,'select2-input select')]", "Final");
		Thread.sleep(3000);
		typeenter("//input[contains(@class,'select2-input select')]");
		Thread.sleep(3000);
		dclick("(//td[contains(@class,'overflow_handsontable')])[30]");
		Thread.sleep(4000);
		type("//*[@id='multiple-invoice-create-edit']/div[8]/textarea", "600");
		typeenter("//*[@id='multiple-invoice-create-edit']/div[8]/textarea");

	}

	public void rasieFinalinvoice_Popup() throws InterruptedException

	{

		click("//input[@id='confirm_delete_input']");
		Thread.sleep(3000);
		type("//input[@id='confirm_delete_input']", "confirm");
		Thread.sleep(3000);
		click("//button[@id='delete-button']");
		Thread.sleep(3000);
	}

}
