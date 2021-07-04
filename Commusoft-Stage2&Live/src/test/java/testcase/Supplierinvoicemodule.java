package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.LoginPage;
import pages.Supplierinvoice;



public class Supplierinvoicemodule extends Baseclass{

	String homepage;

	public String Supplier = "https://stage2.commusoft.net/suppliers";
	public String supplierview = "https://stage2.commusoft.net/suppliers/list_supplier/70/view/supplier_details";

	@Test(priority = 0)

	public void Login() throws InterruptedException {


		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();

	}

	@Test(priority = 1)

	public void supplierinvoice() throws InterruptedException, IOException {


		driver.get(Supplier);
		Thread.sleep(3000);
		driver.get(supplierview);
		Thread.sleep(3000);
		Supplierinvoice supplierinv = new Supplierinvoice(driver);
		supplierinv.Supplierinvoaddbutton();
		
		supplierinv.Invoiceno();
		supplierinv.supplirinvpart();
		supplierinv.quantity();
		supplierinv.unitcost("300");
		supplierinv.vat("5.00");
		supplierinv.nominalcode();
		supplierinv.item("Demo");
		supplierinv.itemquantity();
		supplierinv.itemunitcost("200");
		supplierinv.itemscale("400");
		supplierinv.itemvat("5.00");
		supplierinv.itemnominalcode();		
		supplierinv.savesupplierbutton();



	}



}
