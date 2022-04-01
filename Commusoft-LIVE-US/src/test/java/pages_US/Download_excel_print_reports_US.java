package pages_US;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import action_US.Wrapper_US;

public class Download_excel_print_reports_US extends Wrapper_US{

	public Download_excel_print_reports_US(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void downloadexcel()
	{
		click("#downloadscreen");
	}
	public void downloadexcel2()
	{
		click("//span[@class=\"icon ss-download ng-scope\"]");
	}
	public void print_customer() throws InterruptedException
	{
		click("#printscreen");
		Thread.sleep(2000);
	}
	public void print() throws InterruptedException
	{
		click("//span[@class=\"icon ss-print ng-scope\"]");
		Thread.sleep(4000);
	}
	public void closeprint()
	{
		String oldwin=driver.getWindowHandle();
		 Set<String> handles=driver.getWindowHandles();
			
			for (String newWin : handles) 
			{
				driver.switchTo().window(newWin);
				
			}
			driver.switchTo().window(oldwin);
			
	}
	public void jobsreportprint() throws InterruptedException
	{
		click("//span[@class='icon ss-print ng-scope']");
		Thread.sleep(100000);
	}
	public void jobsreportdownloadexcel() throws InterruptedException
	{
		click("//span[@class='icon ss-download ng-scope']");
		Thread.sleep(6000);
	}
    public void notifications() throws InterruptedException 
    {
    	click("#drop3");
    	Thread.sleep(4000);
    }
    
    public void assertion_jobrep() throws InterruptedException
	{
		String Actualtitle = gettext("(//h5[@class=\"notification-title ng-scope ng-binding\"])[1]");
        System.out.println(Actualtitle);
        Assert.assertEquals(Actualtitle, "Jobs report (PDF) - NS Azar");
        Thread.sleep(4000);
    }
    public void assertion_jobrepoexcel() throws InterruptedException
    {
    	String Actualtitle = gettext("(//h5[@class='notification-title ng-scope ng-binding'])[1]");
        System.out.println(Actualtitle);
        Assert.assertEquals(Actualtitle, "Jobs report (Excel) - NS Azar");
        Thread.sleep(4000);
    }
    public void clickusers() throws InterruptedException
    {
    	click("//a[@has-root-permission='userReports']");
    	Thread.sleep(4000);
    }
    public void clicktimesheet() throws InterruptedException
    {
    	click("(//a[@has-permission='Basicusersreports,readaccess'])[2]");
    	Thread.sleep(4000);
    }
    public void clicksales () throws InterruptedException
    {
    	click("//a[@has-root-permission='salesReports']");
    	Thread.sleep(4000);
    }
    public void clicksales2 () throws InterruptedException
    {
    	click("(//a[@has-permission='Basicsalesreports,readaccess'])[1]");
    	Thread.sleep(4000);
    }
    public void salesreportprint () throws InterruptedException
    {
    	click("//span[@class='icon ss-print ng-scope']");
    	Thread.sleep(100000);
    }
    public void salesreportexcel () throws InterruptedException
    {
    	click("//span[@class='icon ss-download ng-scope']");
    	Thread.sleep(6000);
    }
    public void assertion_salesrepprint() throws InterruptedException
    {
    	String Actualtitle = gettext("(//h5[@class='notification-title ng-scope ng-binding'])[1]");
        System.out.println(Actualtitle);
        Assert.assertEquals(Actualtitle, "Sales report (PDF) - NS Azar");
        Thread.sleep(4000);
    }
    public void assertion_salesrepexcel() throws InterruptedException
    {
    	String Actualtitle = gettext("(//h5[@class='notification-title ng-scope ng-binding'])[1]");
        System.out.println(Actualtitle);
        Assert.assertEquals(Actualtitle, "Sales report (Excel) - NS Azar");
        Thread.sleep(4000);
    }
    
}

