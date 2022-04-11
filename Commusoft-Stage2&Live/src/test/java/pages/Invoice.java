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
        click("(//a[@class=\"ng-scope\"])[20]");
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
    
    
    
    
    
    
        
    
}