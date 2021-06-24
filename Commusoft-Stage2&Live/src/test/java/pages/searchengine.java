package pages;
import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class searchengine extends Wrapper {
	
	public searchengine(WebDriver ldriver)
	{
		this.driver =ldriver;
	}
	
	public void searchbox(String name)
	{
		click("(//span[@class='select2-chosen'])[3]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class='select2-match']");
	}
	public void searchbox_jobDescription(String name)
	{
		click("(//span[@class='select2-chosen'])[3]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class='select2-match']");
	}
	/*K*/
	public void searchbox_supplier(String name)
	{
		click("(//span[@class='select2-chosen'])[1]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class='select2-match']");
	}
	public void searchbox_supplier_parts(String name)
	{
		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		typeenter("//input[@class='select2-input select2-focused']");
	}
	public void searchbox_supplier_parts()
	{
		dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
		type("//input[@class='select2-input select2-focused']", "Parts");  //input[@class="select2-input select2-focused"]
		typeenter("//input[@class='select2-input select2-focused']");
	}
	public void searchbox_supplier_parts_nominalcode(String name)
	{
		dclick("(//td[@class=\"overflow_handsontable select_icon afterHiddenColumn htPlaceholder\"])[1]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		typeenter("//input[@class='select2-input select2-focused']");
	}
	public void parts_deliverymethod(String name)
	{
		dclick("(//td[@class=\"overflow_handsontable select_icon htPlaceholder\"])[1]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		typeenter("//input[@class='select2-input select2-focused']");
	}
	public void supplierpo_items(String name)
	{
		dclick("(//td[@class=\"afterHiddenColumn firstVisibleColumn\"])[1]");
		type("(//textarea[@class=\"handsontableInput\"])[3]", "Items");
		typeenter("(//textarea[@class=\"handsontableInput\"])[3]");
	}
	public void searchbox_supplier_item_nominalcode(String name)
	{
		dclick("(//td[@class=\"overflow_handsontable select_icon afterHiddenColumn htPlaceholder\"])[2]");
		type("//input[@class='select2-input select2-focused']", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class='select2-match']");
	}
	public void searchboxedit_supplier_partVAT(String name)
	{
		dclick("//td[@class=\"overflow_handsontable select_icon current highlight\"]");
		clear("(//input[@type=\"text\"])[11]");
		type("(//input[@type=\"text\"])[11]", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class=\"select2-match\"]");
	}
	public void searchboxedit_supplier_itemVAT(String name)
	{
		dclick("(//td[@class=\"overflow_handsontable select_icon\"])[3]");
		clear("(//input[@type=\"text\"])[14]");
		type("(//input[@type=\"text\"])[14]", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class=\"select2-match\"]");
	}
	public void searchboxsupplieredit_itemVAT(String name)
	{
		dclick("(//td[@class=\"overflow_handsontable select_icon\"])[4]");
		clear("(//input[@type=\"text\"])[13]");
		type("(//input[@type=\"text\"])[13]", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class=\"select2-match\"]");
	}
	public void searchboxsupplieredit_supplier_itemVAT(String name)
	{
		dclick("(//td[@class=\"overflow_handsontable select_icon\"])[3]");
		clear("(//input[@type=\"text\"])[10]");
		type("(//input[@type=\"text\"])[10]", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class=\"select2-match\"]");
	}
	public void searchbox_Job_parts(String name)
	{
		click("//a[@class=\"select2-choice select2-default\"]");
		type("//input[@class=\"select2-input select2-focused\"]", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class='select2-match']");
	}
	public void searchboxsupplieredit_partVAT(String name)
	{
		dclick("//td[@class=\"overflow_handsontable select_icon current highlight\"]");
		clear("(//input[@type=\"text\"])[10]");
		type("(//input[@type=\"text\"])[10]", name);  //input[@class="select2-input select2-focused"]
		click("//span[@class=\"select2-match\"]");
	}

}
