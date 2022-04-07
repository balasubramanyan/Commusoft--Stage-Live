package lable;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.Company;
import pages.Customer;

public class Customer_Module extends Baseclass{
	
	@Test(priority=0)
	public void Add_Edit_Delete_Customer() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Add_Customer();
		customer.Edit_Customers();
		customer.Delete_Customers();
	}
	@Test(priority=1)
	public void Add_Edit_Delete_Company() throws InterruptedException
	{
		driver.get(homepage);
		Thread.sleep(10000);
		Company company = new Company(driver);
		company.Create_Company();
		company.Edit_Company();
		company.Delete_Company();
	}
	@Test(priority=2)
	public void Contact_To_Primary() throws InterruptedException
	{
		driver.get(homepage);
		Thread.sleep(10000);
		Customer customer = new Customer(driver);
		customer.Add_Customer();
		customer.Add_Primary_Contact();		
	}
	@Test(priority=3)
	public void Add_Edit_Delete_Branch() throws InterruptedException
	{
		driver.get(homepage);
		Thread.sleep(10000);
		Customer customer = new Customer(driver);
		customer.Add_Customer();
		customer.Add_Branch();
		customer.Edit_Branch();
		customer.Delete_Branch();
	}

}
