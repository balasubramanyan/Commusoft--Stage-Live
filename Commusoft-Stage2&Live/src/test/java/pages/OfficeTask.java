package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class OfficeTask extends Wrapper {
	public OfficeTask(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Officetask_Tab()
	{
		click("(//span[@class='ng-scope'])[6]");
	}
	public void Officetask_NormalTask() throws InterruptedException
	{
		type("~mention-input__input","office task");
		Thread.sleep(1000);
		typeenter("~mention-input__input");
	}
	public void Officetask_mention() throws InterruptedException
	{
		type("~mention-input__input","#officetasknew");
		Thread.sleep(2000);
		typeenter("~mention-input__input");
		typeenter("~mention-input__input");
		Thread.sleep(5000);
	}	
}
