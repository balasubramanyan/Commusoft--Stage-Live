package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.LoginPage;

public class If_test extends Baseclass{
		
		public String homepage;
		
		@Test(priority = 0)
		public void login() throws InterruptedException
		{
			LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
			loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
			Thread.sleep(1000);
			homepage = driver.getCurrentUrl(); 
		}
		@Test(priority=1)
		public void Test()
		{
			if((driver.findElement(By.xpath("//span[text()='New Estate Agents']"))).isEnabled())
			{
				System.out.println("pass");
			}
			else if((driver.findElement(By.xpath("//span[text()='New Estate Agents66']"))).isEnabled())
			{
				System.out.println("fail");
			}
			else
			{
				System.out.println("TESTING DONE");
			}
		}
		
}

