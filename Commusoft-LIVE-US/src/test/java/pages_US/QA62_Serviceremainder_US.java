package pages_US;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import action_US.Wrapper_US;

public class QA62_Serviceremainder_US extends Wrapper_US{

	public QA62_Serviceremainder_US(WebDriver ldriver)
	{
		this.driver = ldriver;
	} 
	public void view_all_serviceremainder() throws InterruptedException
	{
		click("//a[@has-permission='Servicereminderreports,readaccess']");
	    Thread.sleep(4000);
	}
	
	public void enable_checkbox()
	{
		click("(//*[@class='select-row-checkbox'])[1]");
	    click("(//*[@class='select-row-checkbox'])[2]");
	}
	public void process_remainder_btn()
	{
		click("//a[@class='btn btn-primary btn-small batch-process']");
	}
	public void print_icon()
	{
		click("#printscreen");
	}
	public void notification()
	{
		click("#drop3");
	}
	public void assertion_serviceremain()
	{
		String Actualtitle = gettext("(//a[@class=\"large-number warning ng-binding\"])[5]");
        System.out.println(Actualtitle);
        Assert.assertEquals(Actualtitle, "2");
	}
}

