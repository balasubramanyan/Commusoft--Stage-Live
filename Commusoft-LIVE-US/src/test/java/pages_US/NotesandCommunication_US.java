package pages_US;

import org.openqa.selenium.WebDriver;

import action_US.Wrapper_US;

public class NotesandCommunication_US extends Wrapper_US {
	
	public NotesandCommunication_US(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void emailinvoice() throws InterruptedException
	{
		Thread.sleep(3000);
		click("//a[text()='Email invoice']");
		Thread.sleep(2000);
		selectdropdown("//select[@ng-model='email.selected_recipient_address']","eezhilraja@commusoft.com");
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
