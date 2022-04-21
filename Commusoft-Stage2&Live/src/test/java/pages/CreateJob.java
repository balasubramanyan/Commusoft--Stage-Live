package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class CreateJob extends Wrapper {

	public CreateJob(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void addjob() throws InterruptedException
	{
		click("//a[@id='newJob']");
		Thread.sleep(1000);
	}
	public void JobDescription(String a) throws InterruptedException
	{
		searchengine search = new searchengine(driver);
		search.searchbox_jobDescription(a);
		//selectdropdownvalue("$servicereminderinstance", "3");
		type("$quotedamount", "2000");
		type("$ponumber", "Customer reference");
		selectdropdown("$job[priority]", "Important");
		selectdropdownvalue("$job[usergroupsid]","1");
		selectdropdownvalue("$job[invoicecategoryid]", "1");
		//	click("//button[@type='submit']");
		Thread.sleep(3000);

	}
	public void job_diary_customerside()
	{
		click("//span[text()= 'Book into diary after adding job']");
	}
	public void createjob()
	{
		click("//span[text()='Add job']");
	}
	public void jobdetail()
	{
		click("(//a[text()='Details'])[2]");
	}
	public void edit_job() throws InterruptedException
	{
		click("(//a[text()='Edit'])[1]");
		Thread.sleep(1000);
	}
	public void complete_job() throws InterruptedException
	{
		click("//input[@formcontrolname='completed']");
		Thread.sleep(3000);
		click("(//span[text()='Save'])[2]");
	}
	public void Add_new_diaryEvent()
	{
		click("//span[text()='Add new diary event']");
	}
	/*k*/
	public void JobCost()
	{
		click("//span[text()='Costs']");
	}
	public void JobCostPO()
	{
		click("(//a[@class=\"btn btn-primary btn-small ng-scope\"])[3]");//Click PO
	}
	public void PO_item_unitprice( String amount)
	{
		dclick("(//td[@class=\"overflow_handsontable\"])[3]");
		clear("(//textarea[@class=\"handsontableInput\"])[4]");
		type("(//textarea[@class=\"handsontableInput\"])[4]", amount);
		typeenter("(//textarea[@class=\"handsontableInput\"])[4]");		
	}
	public void PO_item_unitprice_value()
	{
		dclick("(//td[@class=\"overflow_handsontable\"])[2]");
		clear("(//textarea[@class=\"handsontableInput\"])[4]");
		type("(//textarea[@class=\"handsontableInput\"])[4]", "500");
		typeenter("(//textarea[@class=\"handsontableInput\"])[4]");		
	}
	public void PO_item_saleprice( String amount)
	{
		dclick("//td[@class=\"overflow_handsontable current highlight\"]");
		clear("(//textarea[@class=\"handsontableInput\"])[3]");
		type("(//textarea[@class=\"handsontableInput\"])[3]", amount);
		typeenter("(//textarea[@class=\"handsontableInput\"])[3]");


	}
	public void PO_part_unitprice_eidt( String amount)
	{
		dclick("//*[@id=\"part_edit_purchase_order\"]/div[1]/div/div/div/table/tbody/tr/td[4]");
		clear("//textarea[@class=\"handsontableInput\"]");
		type("//textarea[@class=\"handsontableInput\"]", amount);
		typeenter("//textarea[@class=\"handsontableInput\"]");		
	}
	public void PO_part_itemprice_eidt( String amount)
	{
		dclick("(//td[@class=\"overflow_handsontable\"])[2]");
		clear("(//textarea[@class=\"handsontableInput\"])[2]");
		type("(//textarea[@class=\"handsontableInput\"])[2]", amount);
		typeenter("(//textarea[@class=\"handsontableInput\"])[2]");		
	}
	public void Supplier_PO_itemprice_eidt( String amount) throws InterruptedException
	{
		dclick("(//td[@class=\"overflow_handsontable\"])[5]");
		clear("(//textarea[@class=\"handsontableInput\"])[2]");
		type("(//textarea[@class=\"handsontableInput\"])[2]", amount);
		typeenter("(//textarea[@class=\"handsontableInput\"])[2]");
	}
	public void Add_PO_button()
	{
		click("(//span[@class=\"ng-scope\"])[15]");
	}
	public void view_po()
	{
		click("(//a[@class=\"ng-scope\"])[27]");
	}
	public void edit_po()
	{
		click("(//span[@class=\"ng-scope\"])[26]");
	}
	public void supplier_edit_po()
	{
		click("(//span[@class=\"ng-scope\"])[19]");
	}
	public void save_po() throws InterruptedException
	{
		click("//span[@ng-hide=\"saving\"]");
		Thread.sleep(3000);
	}
	public void invoice_withlineitem() throws InterruptedException
	{
		click("(//span[@class=\"ng-scope\"])[16]");//click invoice tab
		click("//a[@class=\"btn btn-primary btn-small ng-scope\"]");// click add invoice
		click("(//span[@class=\"help-block\"])[1]");//copy from job
		selectdropdownindex("//select[@class=\"full-width-select ng-untouched ng-pristine ng-invalid\"]", 1);//invoice category
		click("//a[@class=\"without-margin\"]");// lineitem
		click("(//input[@type=\"checkbox\"])[4]");//click part checkbox
		//isenabled("//button[@class=\"btn btn-primary loading_btn save_btn\"]");//save and add line items
		Thread.sleep(3000);
		click("(//input[@type=\"checkbox\"])[5]");//click labour checkbox
		Thread.sleep(3000);
		click("(//a[@class=\"btn btn-primary\"])[1]");//save invoice
	}
	public void save_invocie()
	{
		click("//button[@class=\"btn btn-primary loading_btn save_btn\"]");// save button
	}
	public void assert_parttotal()
	{
		String part_total = gettext("(//span[@class=\"ng-binding\"])[16]");//part total
		part_total = part_total.replace("£", "");
		String Expectedparttotal= "300.00";
		Assertion(part_total, Expectedparttotal,"Wrong part total");
	}
	public void assert_itemtotal()
	{
		String item_total = gettext("(//span[@class=\"ng-binding\"])[23]");//item total
		item_total = item_total.replace("£", "");
		String Expecteditemtotal= "100.00";
		Assertion(item_total, Expecteditemtotal,"Wrong item total");
	}
	public void assert_subtotal()
	{
		String sub_total = gettext("(//span[@class=\"ng-binding\"])[24]");//sub total
		sub_total = sub_total.replace("£", "");
		String Expectedsubtotal= "400.00";
		Assertion(sub_total, Expectedsubtotal,"Wrong sub total");
	}
	public void assert_VAT()
	{
		String VAT = gettext("(//span[@class=\"ng-binding\"])[25]");//VAT
		VAT = VAT.replace("£", "");
		String ExpectedVATpart= "80.00";
		Assertion(VAT,ExpectedVATpart,"Wrong VAT value");
	}
	public void assert_grandtotal()
	{
		String Grandtotal = gettext("(//span[@class=\"ng-binding\"])[26]");//Grand total
		Grandtotal = Grandtotal.replace("£", "");
		String ExpectedGrandtotal= "480.00";
		Assertion(Grandtotal,ExpectedGrandtotal,"Wrong Grandtotal value");
	}
	public void assert_partedittoal()
	{
		String part_total = gettext("(//span[@class=\"ng-binding\"])[16]");//part total
		part_total = part_total.replace("£", "");
		String Expectedparttotal= "600.00";
		Assertion(part_total, Expectedparttotal,"Wrong part total");
	}
	public void assert_Supplierparttoal()
	{
		String part_total = gettext("(//span[@class=\"ng-binding\"])[21]");//part total
		part_total = part_total.replace("£", "");
		String Expectedparttotal= "600.00";
		Assertion(part_total, Expectedparttotal,"Wrong part total");
	}
	public void assert_item_edittotal()
	{
		String item_total = gettext("(//span[@class=\"ng-binding\"])[23]");//item total
		item_total = item_total.replace("£", "");
		String Expecteditemtotal= "200.00";
		Assertion(item_total, Expecteditemtotal,"Wrong item total");
	}
	public void assert_Supplieritem_total()
	{
		String item_total = gettext("(//span[@class=\"ng-binding\"])[28]");//item total
		item_total = item_total.replace("£", "");
		String Expecteditemtotal= "200.00";
		Assertion(item_total, Expecteditemtotal,"Wrong item total");
	}
	public void assert_subedittotal()
	{
		String sub_total = gettext("(//span[@class=\"ng-binding\"])[24]");//sub total
		sub_total = sub_total.replace("£", "");
		String Expectedsubtotal= "800.00";
		Assertion(sub_total, Expectedsubtotal,"Wrong sub total");
	}
	public void assert_Suppliersubtotal()
	{
		String sub_total = gettext("(//span[@class=\"ng-binding\"])[29]");//sub total
		sub_total = sub_total.replace("£", "");
		String Expectedsubtotal= "800.00";
		Assertion(sub_total, Expectedsubtotal,"Wrong sub total");
	}
	public void assert_editvat()
	{
		String VAT = gettext("(//span[@class=\"ng-binding\"])[25]");//VAT
		VAT = VAT.replace("£", "");
		String ExpectedVATpart= "120.00";
		Assertion(VAT,ExpectedVATpart,"Wrong VAT value");
	}
	public void assert_Suppliervat()
	{
		String VAT = gettext("(//span[@class=\"ng-binding\"])[30]");//VAT
		VAT = VAT.replace("£", "");
		String ExpectedVATpart= "120.00";
		Assertion(VAT,ExpectedVATpart,"Wrong VAT value");
	}
	public void assert_editgrand()
	{
		String Grandtotal = gettext("(//span[@class=\"ng-binding\"])[26]");//Grand total
		Grandtotal = Grandtotal.replace("£", "");
		String ExpectedGrandtotal= "920.00";
		Assertion(Grandtotal,ExpectedGrandtotal,"Wrong Grandtotal value");
	}
	public void assert_suppliereditgrand()
	{
		String Grandtotal = gettext("(//span[@class=\"ng-binding\"])[31]");//Grand total
		Grandtotal = Grandtotal.replace("£", "");
		String ExpectedGrandtotal= "920.00";
		Assertion(Grandtotal,ExpectedGrandtotal,"Wrong Grandtotal value");
	}

	public void assert_Suppliergrand()
	{
		String Grandtotal = gettext("(//span[@class=\"ng-binding\"])[31]");//Grand total
		Grandtotal = Grandtotal.replace("£", "");
		String ExpectedGrandtotal= "920.00";
		Assertion(Grandtotal,ExpectedGrandtotal,"Wrong Grandtotal value");
	}
	public void assert_invoicetotal()
	{
		String Total_in = gettext("(//div[@class=\"total-value\"])[1]");
		Total_in = Total_in.replace("£", "");
		String Expectedintotal= "800.00";
		Assertion(Total_in, Expectedintotal,"Wrong invoice total");
	}
	public void assert_invoicetotal(String ex)
	{
		String Total_in = gettext("(//strong[@class=\"ng-binding\"])[1]");
		Total_in = Total_in.replace("£", "");
		//int k =Integer.parseInt(Total_in);
		Assertion(Total_in, ex,"Wrong invoice total");
	}
	public void assert_invoicevattotal()
	{
		String Total_vat = gettext("(//div[@class=\"total-value\"])[2]");
		Total_vat = Total_vat.replace("£", "");
		String Expectedvattotal= "160.00";
		Assertion(Total_vat, Expectedvattotal,"Wrong vat total");
	}
	public void assert_invoicevattotal(String ex) throws InterruptedException
	{
		Thread.sleep(1000);
		String Total_vat = gettext("(//td[@class=\"ng-binding\"])[7]");
		Total_vat = Total_vat.replace("£", "");
		Assertion(Total_vat, ex,"Wrong vat total");
	}
	public void assert_invoicegrand()
	{
		String Total_grand = gettext("(//div[@class=\"total-value\"])[3]");
		Total_grand = Total_grand.replace("£", "");
		String Expectedgrandtotal= "960.00";
		Assertion(Total_grand, Expectedgrandtotal,"Wrong grand total");
	}
	public void assert_invoicegrand(String ex)
	{
		String Total_grand = gettext("(//strong[@class=\"ng-binding\"])[3]");
		Total_grand = Total_grand.replace("£", "");
		Assertion(Total_grand, ex,"Wrong grand total");
	}
	public void assert_finalinvoicetotal()
	{
		String Finalvalue = gettext("(//div[@class=\"total-value\"])[3]");
		Finalvalue = Finalvalue.replace("£", "");
		String ExpectedFinalvalue= "960.00";
		Assertion(Finalvalue, ExpectedFinalvalue,"Wrong Final total");
	}
	public void Jobparts_fulfil(String qty, String markup, String status) throws InterruptedException
	{
		Thread.sleep(3000);
		click("(//span[@class=\"ng-scope\"])[7]");
		//click("(//span[@class=\"ng-scope\"])[32]");//add new part
		click("(//a[@class=\"btn btn-primary btn-small ng-scope\"])[1]");
		searchengine search = new searchengine(driver);
		search.searchbox_Job_parts("Parts");
		type("(//input[@type=\"text\"])[2]", qty);
		type("//input[@name=\"part[markup]\"]", markup);
		search.selectdropdown("//select[@class=\"full-width-select ng-pristine ng-invalid ng-invalid-required\"]", status);
		Thread.sleep(2000);
		click("//button[@type=\"submit\"]");
	}
	public void order_from_supplier() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//span[@class=\"preview-file-link actions-toggle ng-scope ss-plus\"]");//click + 
		Thread.sleep(2000);
		click("//*[@id=\"actions-dropdown\"]/span/actionstemplate/div/span[1]/span[1]/a"); //fullfil
		click("(//span[@class=\"ng-scope\"])[48]");//order from supplier
		Thread.sleep(2000);
		click("//button[@class=\"btn btn-primary primary-button ng-binding\"]");
	}

	//ezhil
	public void addjob1() throws InterruptedException
	{
		click("//a[@id='newJob']");
		Thread.sleep(1000);
	}
	public void JobDescription(String a, String b, String c) throws InterruptedException
	{
		Thread.sleep(2000);
		click("//span[text()='-- Please choose --']"); 
		// Des select
		Thread.sleep(2000);
		click("(//div[@class='select2-result-label'])[7]"); 
		// Skill
		Thread.sleep(2000);
		click("(//input[@class=\"select2-input select2-default\"])[1]"); 
		Thread.sleep(2000);
		click("//option[text()='Test QA']");
		// Job note
		Thread.sleep(2000);
		type("//textarea[@name='engineernotes']", a);    
		//Service job
		Thread.sleep(2000);
		click("//input[@formcontrolname='isservicejob']"); 
		Thread.sleep(2000);
		click("(//select[@name='servicereminderinstance'])[1]");
		Thread.sleep(2000);
		click("(//option[text()='Boiler service'])[1]");
		//Quoted amount
		Thread.sleep(2000);
		type("//input[@formcontrolname='quotedamount']", b); 
		//Customer reference
		Thread.sleep(2000);
		type("//input[@formcontrolname=\"ponumber\"]", c);
		//Expected completion date
		Thread.sleep(2000);
		click("//span[@class=\"add-on date-picker-edit\"]");
		Thread.sleep(2000);
		click("(//td [@role=\"gridcell\"])[25]");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '07']");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '15']");
		Thread.sleep(2000);
		click("//select[@class='meridian ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= 'AM']");
		//Priority
		Thread.sleep(2000);
		click("//select[@formcontrolname='priority']");
		Thread.sleep(2000);
		click("//option[text()=\"Not Important\"]");
		//User group
		Thread.sleep(2000);
		click("//select[@formcontrolname='usergroupsid']");
		Thread.sleep(2000);
		click("//option[text()= 'Aravind Group']");
		//Invoice Category
		Thread.sleep(2000);
		click("//select[@formcontrolname='invoicecategoryid']");
		Thread.sleep(2000);
		click("//option[text()= 'Aravind Category']");

	}
	public void JobDescription2(String a, String b, String c) throws InterruptedException
	{
		Thread.sleep(2000);
		click("//span[text()='-- Please choose --']"); 
		// Des select
		Thread.sleep(2000);
		click("(//div[@class='select2-result-label'])[7]"); 
		// Skill
		Thread.sleep(2000);
		click("(//input[@class=\"select2-input select2-default\"])[1]"); 
		Thread.sleep(2000);
		click("//option[text()='Test QA']");
		// Job note
		type("//textarea[@name='engineernotes']", a);    
		//Quoted amount
		Thread.sleep(2000);
		type("//input[@formcontrolname='quotedamount']", b); 
		//Customer reference
		Thread.sleep(2000);
		type("//input[@formcontrolname=\"ponumber\"]", c);
		//Expected completion date
		Thread.sleep(2000);
		click("//span[@class=\"add-on date-picker-edit\"]");
		Thread.sleep(2000);
		click("(//td [@role=\"gridcell\"])[25]");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '07']");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '15']");
		Thread.sleep(2000);
		click("//select[@class='meridian ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= 'AM']");
		//Priority
		Thread.sleep(2000);
		click("//select[@formcontrolname='priority']");
		Thread.sleep(2000);
		click("//option[text()=\"Not Important\"]");
		//User group
		Thread.sleep(2000);
		click("//select[@formcontrolname='usergroupsid']");
		Thread.sleep(2000);
		click("//option[text()= 'Aravind Group']");
		//Invoice Category
		Thread.sleep(2000);
		click("//select[@formcontrolname='invoicecategoryid']");
		Thread.sleep(2000);
		click("//option[text()= 'Aravind Category']");

	}
	public void createjob1() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//span[text()='Add job']");
	}
	public void jobeditlink(String D, String E, String F, String G) throws InterruptedException
	{
		Thread.sleep(2000);
		click("//a[text()='Edit']");
		Thread.sleep(2000);
		//Job desc
		clear("//input[@formcontrolname='description']");
		Thread.sleep(2000);
		type("//input[@formcontrolname='description']", D);
		//Skill
		clear("(//input[@class='select2-input select2-default'])[1]");
		click("(//input[@class='select2-input select2-default'])[1]");
		Thread.sleep(2000);
		click("//option[text()='Test QA']");
		// Job note
		Thread.sleep(2000);
		type("//textarea[@name='engineernotes']", E);    
		//Service job
		Thread.sleep(2000);
		click("//input[@formcontrolname='isservicejob']"); 
		Thread.sleep(2000);
		click("//input[@formcontrolname='isservicejob']");
		//	Thread.sleep(2000);
		//	click("(//select[@name='servicereminderinstance'])[1]");
		//	Thread.sleep(2000);
		//	click("(//option[text()='Boiler service'])[1]");
		//Quoted amount
		Thread.sleep(2000);
		type("//input[@formcontrolname='quotedamount']", F); 
		//Customer reference
		Thread.sleep(2000);
		type("//input[@formcontrolname=\"ponumber\"]", G);
		//Expected completion date
		Thread.sleep(2000);
		click("//span[@class=\"add-on date-picker-edit\"]");
		Thread.sleep(2000);
		click("(//td [@role=\"gridcell\"])[25]");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '08']");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '45']");
		Thread.sleep(2000);
		click("//select[@class='meridian ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= 'PM']");
		//Priority
		Thread.sleep(2000);
		click("//select[@formcontrolname='priority']");
		Thread.sleep(2000);
		click("//option[text()='Important']");
		//User group
		Thread.sleep(2000);
		click("//select[@formcontrolname='usergroupsid']");
		Thread.sleep(2000);
		click("//option[text()= 'Ranjit Group']");
		//Invoice Category
		Thread.sleep(2000);
		click("//select[@formcontrolname='invoicecategoryid']");
		Thread.sleep(2000);
		click("//option[text()= 'Ranjit Category']");

	}
	public void Editsavejob() throws InterruptedException
	{
		Thread.sleep(2000);
		click("//button[@type='submit']");
	}
	public void Jobdeleted(String H) throws InterruptedException
	{
		Thread.sleep(2000);
		click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
		Thread.sleep(2000);
		click("//a[@has-permission='Jobs,deleteaccess']");
		Thread.sleep(2000);
		type("//input[@id='confirm_delete_input']", H);
		Thread.sleep(2000);
		click("//a[@id='delete-button']");

	}
	public void JobFOC(String I) throws InterruptedException
	{
		Thread.sleep(2000);
		click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
		Thread.sleep(2000);
		click("//a[@has-permission='Completejobasfreeofcharge,writeaccess']");
		Thread.sleep(2000);
		//Reason
		click("//select[@id='freeofchargeandabortjob_reason']");
		click("//option[@value='2']");
		Thread.sleep(2000);
		//More details
		click("//textarea[@id='freeofchargeandabortjob_moredetails']");
		type("//textarea[@id='freeofchargeandabortjob_moredetails']", I);
		Thread.sleep(2000);
		click("//button[@class='btn btn-primary loading_btn save_btn']");
		Thread.sleep(5000);
		click("(//a[@class='ng-binding'])[2]");
	}
	public void customer_breadcrum() throws InterruptedException
	{

		Thread.sleep(5000);
		click("(//a[@class='ng-binding'])[2]");

	}
	public void Job_complete() throws InterruptedException
	{

		Thread.sleep(2000);
		//Complete check box
		click("//input[@formcontrolname='completed']");
		Thread.sleep(2000);
		click("(//span[@class='add-on date-picker-edit'])[2]");
		Thread.sleep(2000);
		click("(//td[@role='gridcell'])[20]");
		Thread.sleep(2000);
		click("//button[@type='submit']");


	}
	public void Job_Recall(String D,String E,String F,String G ) throws InterruptedException
	{

		Thread.sleep(2000);
		click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
		Thread.sleep(2000);
		//Recall link
		click("//a[text()='Create recall']");
		Thread.sleep(2000);
		//Job desc
		clear("//input[@formcontrolname='description']");
		Thread.sleep(2000);
		type("//input[@formcontrolname='description']", D);
		//Who's to blame
		click("(//a[@class='select2-choice'])[3]");
		click("(//div[@class='select2-result-label'])[5]");
		Thread.sleep(2000);
		click("//option[text()='Test QA']");
		// Job note
		Thread.sleep(2000);
		type("//textarea[@name='engineernotes']", E);    
		//Quoted amount
		Thread.sleep(2000);
		type("//input[@formcontrolname='quotedamount']", F); 
		//Customer reference
		Thread.sleep(2000);
		type("//input[@formcontrolname=\"ponumber\"]", G);
		//Expected completion date
		Thread.sleep(2000);
		click("//span[@class=\"add-on date-picker-edit\"]");
		Thread.sleep(2000);
		click("(//td [@role=\"gridcell\"])[25]");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '08']");
		Thread.sleep(2000);
		click("//select[@class='hour-min ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= '45']");
		Thread.sleep(2000);
		click("//select[@class='meridian ng-untouched ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= 'PM']");
		//Priority
		Thread.sleep(2000);
		click("//select[@formcontrolname='priority']");
		Thread.sleep(2000);
		click("//option[text()='Important']");
		//User group
		Thread.sleep(2000);
		click("//select[@formcontrolname='usergroupsid']");
		Thread.sleep(2000);
		click("//option[text()= 'Ranjit Group']");
		//Invoice Category
		Thread.sleep(2000);
		click("//select[@formcontrolname='invoicecategoryid']");
		Thread.sleep(2000);
		click("//option[text()= 'Ranjit Category']");
		Thread.sleep(2000);
		click("//span[text()='Add recall']");

	}

	public void customer_jobmodule() throws InterruptedException
	{

		Thread.sleep(2000);
		click("//a[text()='Total number of customers:']");
		Thread.sleep(2000);
		click("(//a[text()='View'])[1]");
		Thread.sleep(2000);
		click("(//a[text()='View'])[4]");
		Thread.sleep(2000);
		//*[@id="ongoingwork"]/table/tbody/tr[2]/td[9]/a[2]
	}


	public void Job_Abort(String reasontext ) throws InterruptedException
	{

		Thread.sleep(2000);
		click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
		Thread.sleep(2000);
		//Abort link
		click("//a[text()='Abort job']");
		Thread.sleep(2000);
		//Reason dropdown
		click("//select[@name='freeofchargeandabortjob[reason]']");
		Thread.sleep(2000);
		click("//option[@value='1']");
		Thread.sleep(2000);
		click("//textarea[@id='freeofchargeandabortjob_moredetails']");
		Thread.sleep(2000);
		type("//textarea[@id='freeofchargeandabortjob_moredetails']", reasontext );
		//Save button
		Thread.sleep(2000);
		click("//button[@type='submit']");

	}

	public void Job_PlaceOnHold() throws InterruptedException
	{

		Thread.sleep(2000);
		click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
		Thread.sleep(2000);		
		click("//a[text()='Place job on hold']");
		Thread.sleep(1000);
		//Dropdown
		click("//select[@id='onholdjob_settingsjobonholddescriptionid']");
		click("//option[@value=\"1\"]");
		//set a reminder
		click("//input[@id='onholdjob_issetreminder']");
		click("//span[@ng-click='show_date_picker = true']");
		click("//a[@class='month-text ng-binding']");
		//Month
		click("(//a[@class='daterange-day ng-binding'])[5]");
		//Date
		click("(//a[@class='daterange-day ng-binding'])[6]");
        //user select
		click("//input[@class='select2-input select2-default']");
		click("(//div[@class='select2-result-label'])[1]");
		//save
		click("(//button[@type='submit'])[1]");

	}
	public void link_job_recall() throws InterruptedException
	{

		Thread.sleep(2000);
		click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
		Thread.sleep(2000);		
		click("//a[text()='Link job as a recall to another job']");
		Thread.sleep(2000);
		click("(//a[@class='select2-choice'])[2]");
		Thread.sleep(3000);
		//click("(//input[@type='text'])[5]");
		type("(//input[@type='text'])[5]", "test");
		Thread.sleep(3000);
		click("(//div[@class='select2-result-label'])[1]");
		Thread.sleep(2000);
		click("//button[text()='Confirm link']");
		
	}
	public void Customer_addedjob_diray() throws InterruptedException
	{

		Thread.sleep(2000);
		click("//a[@class='btn btn-small btn-primary']");
			
	}
	public void Customer_Editjob_diray() throws InterruptedException
	{

		Thread.sleep(2000);
		click("(//a[text()='Edit'])[2]");
		Thread.sleep(2000);
		click("//span[@class='add-on date-picker-edit']");
		
		Thread.sleep(2000);
		click("(//a[@class='daterange-day ng-binding'])[23]");
		Thread.sleep(2000);
		click("(//select[@ng-change='updateHours(hours)'])[1]");
		Thread.sleep(2000);
		click("//option[text()= '07']");
		Thread.sleep(2000);
		click("(//select[@ng-change='updateMinutes()'])[1]");
		Thread.sleep(2000);
		click("//option[text()= '15']");
		Thread.sleep(2000);
		click("//select[@class='diary-time-meridian ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= 'AM']");	
		Thread.sleep(2000);
		click("(//select[@ng-change='updateHours(hours)'])[1]");
		Thread.sleep(2000);
		click("//option[text()= '08']");
		Thread.sleep(2000);
		click("(//select[@ng-change='updateMinutes()'])[1]");
		Thread.sleep(2000);
		click("//option[text()= '15']");
		Thread.sleep(2000);
		click("//select[@class='diary-time-meridian ng-pristine ng-valid']");
		Thread.sleep(2000);
		click("//option[text()= 'AM']");	
		Thread.sleep(2000);
		click("(//button[text()='Save'])[1]");
		Thread.sleep(2000);
		click("(//button[text()='Save and close'])[1]");
		
		
		
	}
}      