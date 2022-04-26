package pages;
import org.openqa.selenium.WebDriver;
import action.Wrapper;
public class Invoice extends Wrapper {
    
    public Invoice(WebDriver ldriver)
    {
        this.driver =ldriver;
    }
    public void InvoiceTab()
    {
        click("//span[text()='Invoices']");
    }
    
    public void addinvoice() throws InterruptedException
    {
        click("//a[@has-permission='Customerinvoicing,writeaccess']");
        Thread.sleep(1000);
    }
    public void editinvoice() throws InterruptedException
    {
        click("(//a[@class='ng-scope'])[20]");
        Thread.sleep(2000);
    }
    
    public void Additional_invoice() throws InterruptedException
    {
        selectdropdownvalue("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "partial");
        Thread.sleep(2000);
    }
    
    public void Interim_invoice() throws InterruptedException
    {
        selectdropdownvalue("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "interim");
        Thread.sleep(2000);
    }
    
    public void Pre_Final_invoice() throws InterruptedException
    {
        selectdropdownvalue("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "preFinal");
        Thread.sleep(2000);
    }
    
    public void Final_invoice() throws InterruptedException
    {
        selectdropdown("(//select[@class='full-width-select ng-untouched ng-pristine ng-valid'])[1]", "Final invoice");
        Thread.sleep(2000);
    }
    public void Invoice_Breakdown_No_Breakdown()
    {
        click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[1]");
    }
    
    public void Invoice_Breakdown_Breakdown_by_category()
    {
        click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[2]");
    }
    public void BreakdownByCategory_des(String a) throws InterruptedException
    {
        Thread.sleep(2000);
        dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
        type("//input[contains(@class,'select2-input select')]", a);
        Thread.sleep(1000);
        typeenter("//input[contains(@class,'select2-input select')]");
        Thread.sleep(1000);
        click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
    }
    public void unitprice(String a) throws InterruptedException
    {
        //dclick("(//td[@class='afterHiddenColumn'])[1]");
        dclick("//td[@class='afterHiddenColumn']");
        Thread.sleep(1000);
        clear("//textarea[@class='handsontableInput']");
        Thread.sleep(1000);
        type("//textarea[@class='handsontableInput']", a);
        Thread.sleep(1000);
        //click("//td[@class='afterHiddenColumn']");
        click("//td[@class='overflow_handsontable select_icon']");
    }
    public void Invoice_Breakdown_Full_breakdown()
    {
        click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[3]");
    }
    public void unitprice_fullbreakdown(String a) throws InterruptedException
    {
        dclick("//td[@class='overflow_handsontable']");
        Thread.sleep(1000);
        clear("//textarea[@class='handsontableInput']");
        Thread.sleep(1000);
        type("//textarea[@class='handsontableInput']", a);
        Thread.sleep(1000);
        click("(//td[@class='overflow_handsontable select_icon'])[1]");
    }
    public void Full_Breakdown_des(String a) throws InterruptedException
    {
        dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
        type("//input[contains(@class,'select2-input select')]", a);
        Thread.sleep(1000);
        typeenter("//input[contains(@class,'select2-input select')]");
        Thread.sleep(1000);
        click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
    }
    public void Full_Breakdown_des1(String a) throws InterruptedException
    {
        dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
        type("//input[contains(@class,'select2-input select')]", a);
        Thread.sleep(1000);
        typeenter("//input[contains(@class,'select2-input select')]");
        Thread.sleep(1000);
        click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
    }
    public void Invoice_Breakdown_Full_breakdown_by_category()
    {
        click("(//input[@class='on-left ng-untouched ng-pristine ng-valid'])[4]");
    }
    public void Full_Breakdown_ByCategory_Labour_Description(String a) throws InterruptedException
    {
        dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
        type("//input[contains(@class,'select2-input select')]", a);
        Thread.sleep(1000);
        typeenter("//input[contains(@class,'select2-input select')]");
        Thread.sleep(1000);
        click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
    }
    public void Full_Breakdown_ByCategory_Labour_Description2(String a) throws InterruptedException
    {
        dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
        type("(//input[contains(@class,'select2-input')])[6]", a);
        Thread.sleep(1000);
        typeenter("(//input[contains(@class,'select2-input')])[6]");
        Thread.sleep(1000);
        click("(//td[contains(@class,'overflow_handsontable select_icon')])[1]");
    }
    public void Full_Breakdown_ByCategory_Parts_Description(String a) throws InterruptedException
    {
        dclick("(//td[contains(@class,'overflow_handsontable select_icon')])[7]");
        type("//input[contains(@class,'select2-input select')]", a);
        Thread.sleep(1000);
        typeenter("//input[contains(@class,'select2-input select')]");
        Thread.sleep(1000);
        click("(//td[contains(@class,'overflow_handsontable select_icon')])[7]");
    }
    public void unitprice_FullBreakdown_ByCategory_Labour(String a) throws InterruptedException
    {
        dclick("(//td[@class='overflow_handsontable'])[1]");
        Thread.sleep(1000);
        clear("//textarea[@class='handsontableInput']");
        Thread.sleep(1000);
        type("//textarea[@class='handsontableInput']", a);
    }
    public void unitprice_FullBreakdown_ByCategory_Parts(String a) throws InterruptedException
    {
        dclick("(//td[@class='overflow_handsontable'])[3]");
        Thread.sleep(1000);
        clear("//textarea[@class='handsontableInput']");
        Thread.sleep(1000);
        type("//textarea[@class='handsontableInput']", a);
    }
    public void unitprice_FullBreakdown_ByCategory_Parts1(String a) throws InterruptedException
    {
        dclick("(//td[@class='overflow_handsontable'])[2]");
        Thread.sleep(1000);
        clear("(//textarea[@class=\"handsontableInput\"])[2]");
        Thread.sleep(1000);
        type("(//textarea[@class='handsontableInput'])[2]",a);
        Thread.sleep(1000);
        click("(//td[@class='overflow_handsontable select_icon'])[3]");
        
    }
    
    public void invoice_description()
    {
        click("//a[text()='Copy from job']");
    }
    
    public void invoice_description(String a)
    {
        type("(//input[@class='validate-control-input ng-untouched ng-pristine ng-valid'])[1]", a);
    }
    public void clear_invoice_description()
    {
        clear("(//input[@class='validate-control-input ng-untouched ng-pristine ng-valid'])[1]");
    }
    
    public void edit_invoice_description(String a) throws InterruptedException
    {
        type("//input[@class='validate-control-input ng-pristine ng-valid ng-touched']",a);
        Thread.sleep(4000);
    }
    public void invoice_notes()
    {
        click("//a[text()='Copy from job notes']");
    }
    public void invoice_notes1(String a)
    {
        type("#note",a);
    }
    
    public void customerreference(String a) throws InterruptedException
    {
        clear("//input[@class='input-medium ng-untouched ng-pristine ng-valid']");
        Thread.sleep(4000);
        type("//input[@class='input-medium ng-valid ng-dirty ng-touched']",a);
        Thread.sleep(3000);
        //type("//input[@class='input-medium ng-valid ng-touched ng-dirty']","azarudeen");
    }
    public void invoice_UserGroup()
    {
        selectdropdownvalue("//select[@formcontrolname='userGroupId']", "1");
    }
    public void editinvoice_UserGroup()
    {
        selectdropdownvalue("//select[@formcontrolname='userGroupId']", "2");
    }
    
    public void invoice_Category()
    {
        selectdropdownvalue("//select[@formcontrolname='invoiceCategoryId']", "1");
    }
    public void editinvoice_Category()
    {
        selectdropdownvalue("//select[@formcontrolname='invoiceCategoryId']", "2");
    }
    
    public void sub_total(String a)
    {
        type("(//input[@class='validate-control-input ng-untouched ng-pristine ng-valid'])[2]", a);
    }
    public void Confirm_box() throws InterruptedException
    {
        
        //click("//button[text()='Ok']");
        Thread.sleep(4000);
        click("(//button[@type='submit'])[3]");
    }
    public void draft_invoice() 
    {
    	click("//a[@class='more-btn btn jobs-advanced']");
    	click("(//input[@type='checkbox'])[1]");
    }
    public void convert_draftinvoice() throws InterruptedException
    {
    	Thread.sleep(4000);
    	click("(//a[@class=\"ng-scope\"])[19]");
    	Thread.sleep(4000);
    	type("#confirm_delete_input","Save");
    	click("#delete-button");
    }
    public void save_invoice()
    {
        click("(//button[@type='submit'])[1]");
    }
    public void save_invoice1() throws InterruptedException
    {
        click("(//button[@type='submit'])[1]");
        Thread.sleep(4000);
    }
    
    public void delete_inv()
    {
        click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
        click("//a[text()='Delete']");
        type("#confirm_delete_input","delete");
        click("#delete-button");  
    }
    public void quick_links()
    {
    	click("#quickLinks");
    }
    public void invoiceaddresses()
    {
    	click("#invoiceAddresses");
    }
    public void addnewinvoiceaddress()
    {
    	click("#addNewInvoiceAddress");
    }
    public void searchinvoiceaddress(String a)
    {
    	type("#postcode", "yes");
    	typeenter("#postcode");
    }
    public void invoiceaddress() throws InterruptedException
    {
    	selectdropdown("#invoiceaddress_contacts_settingsTitlesid","Mr");
    	type("#invoiceaddress_contacts_name", "mohamed");
    	type("#invoiceaddress_contacts_surname", "azar");
    	type("#invoiceaddress_contacts_contactstelephone_1_telephonenumber", "1234567890");
    	type("#invoiceaddress_contacts_contactstelephone_0_telephonenumber", "9190919109");
    	type("#invoiceaddress_contacts_contactsemail_emailaddress", "azarudeen@commusoft.com");
    	type("#invoiceaddress_addressline1", "41 prince avenue");
    	type("#invoiceaddress_addressline2", "kk nagar");
    	type("#invoiceaddress_addressline3", "Guindy");
    	Thread.sleep(2000);
    	click("#s2id_invoiceaddress_settingsstateprovinceid");
    	click("(//div[@class='select2-result-label'])[2]");
    	//selectdropdown("(//ul[@class='select2-results'])[2]","Bristol");
    	//selectdropdown("#select2-drop","Bristol");
    	//selectdropdown("(//span[@class='select2-arrow'])[1]","Bristol");
    	type("#invoiceaddress_postcode", "640008");
    	click("//span[text()='Save invoice address']");
    	Thread.sleep(2000);
    	click("(//a[@class='ng-binding'])[2]");
    }
    public void invoiceaddress2()
    {
    	click("#s2id_invoiceAddressId");
    	click("(//div[@class='select2-result-label'])[2]");
    }
    public void enable_invoice_address() throws InterruptedException
    {
    	click("//a[@class='btn dropdown-toggle btn-small quick-links-btn']");
    	click("#invoiceAddresses");
    	click("#enableWorkaddress");
    	selectdropdown("#enableInvoiceAddress_enableworkaddress","Enabled");
    	click("//button[@class='custom-btn-small btn btn-primary save_btn save-user-button loading_btn']");
    	Thread.sleep(2000);
    	click("(//a[@class='ng-binding'])[2]");
    }
    public void invoice_AddnewPayment()
    {
        click("//a[@class='btn btn-small btn-primary action-btn']");
    }
    public void invoice_payment_AddDescription()
    {
        type("//textarea[@ng-model='description']","Enter the Description");
    }
    public void invoice_payment_method()
    {
        selectdropdownvalue("//select[@name='paymentMethod']","4");
    }
    public void invoice_payment_nominalcode()
    {
        selectdropdown("//select[@name='nominalAccount']","Bank");
    }
    public void invoice_payment_amount()
    {
        clear("//input[@name='amount']");
        type("//input[@name='amount']","100");
    }
    public void invoice_paymeny_save()
    {
        click("//button[@type='submit']");
    }
    public void payment_reference()
    {
    	type("(//input[@class='ng-pristine ng-valid'])[4]", "AZII");
    }
    public void view_payment ()
    {
    	click ("(//td[@class='ng-scope'])[4]");
    }
    public void Editpayment ()
    {
    	click("((//div[@class='section-title with-edit'])[1]//a)[2]");
    }
    public void editinvoice_payment_method() throws InterruptedException
    {
    	Thread.sleep(2000);
        selectdropdownvalue("//select[@name='paymentMethod']","3");
        
    }
    public void invoice_payment_amount1()
    {
    	dclick("//td[@class='overflow_handsontable']");
    	dclick("//td[@class='overflow_handsontable current highlight']");
        clear("//textarea[@class='handsontableInput']");
        type("//textarea[@class='handsontableInput']","89");
     }
    public void invoice_payment_editDescription() throws InterruptedException
    {
        clear("//textarea[@ng-model='description']");
        type("//textarea[@ng-model='description']","Enter");
        Thread.sleep(2000);
    }
    public void editpayment_reference() throws InterruptedException
    {
    	clear("(//input[@class='ng-pristine ng-valid'])[4]");
    	type("//input[@class='ng-valid ng-animate ng-pristine-remove ng-pristine-remove-active ng-dirty']", "AZIIoh");
    	Thread.sleep(2000);
    } 
    public void Deletepay()
    {
    	click("//a[@has-permission='Customerpayments,deleteaccess']");
    }
    public void confirmdelete()
    {
    	type("//input[@id='confirm_delete_input']", "DelETE");
    }
    public void delete_button()
    {
    	click ("//a[@id='delete-button']");
    }
    
}