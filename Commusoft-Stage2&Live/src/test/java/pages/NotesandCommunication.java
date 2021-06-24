package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class NotesandCommunication extends Wrapper {
	
	public NotesandCommunication(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void emailinvoice() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[text()='Email invoice']");
		Thread.sleep(2000);
		selectdropdown("//select[@ng-model='email.selected_recipient_address']","ranjit@commusoft.com");
		Thread.sleep(1000);
		click("(//a[@ng-click='sendEmail()'])[2]");
		Thread.sleep(4000);
	}
	public void printinvoice() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[@ng-click='showPrintInvoice()']");
		Thread.sleep(2000);
		click("//button[@ng-click='print()']");
		tab("tab");
		Thread.sleep(2000);
	}

}
