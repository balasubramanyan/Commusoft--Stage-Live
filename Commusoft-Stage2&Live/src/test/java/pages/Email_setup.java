package pages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Email_setup extends Wrapper

{
	public Email_setup(WebDriver ldriver)
    {
        this.driver =ldriver;
    }
	public void setupemail() throws InterruptedException
	{
		click("//a[text()='Set up email']");
		Thread.sleep(2000);
	}
//    public void gmailbutton()
// {
//	 click("(//img[@class='sign-in-button-width-height'])[1]");
// }
//    
//    public void gmailusername_password() throws IOException
//    {
//    	String filelocation ="./TestDatas/gmaillogi.xlsx";
//    	XSSFWorkbook wbook=new XSSFWorkbook(filelocation);
//    	XSSFSheet sheet=wbook.getSheetAt(0);
//    	XSSFRow row=sheet.getRow(1);
//    	XSSFCell cell=row.getCell(0);
//    	String username=cell.getStringCellValue();
//    	type("//input[@id='identifierId']",username);
//    	click("//span[text()='Next']");
//    	XSSFCell cell2=row.getCell(1);
//    	String password=cell2.getStringCellValue();
//    	type("//input[@type='password']",password);
//    	
//    }
    public void outlookbutton()
    {
    	click("(//img[@class='sign-in-button-width-height'])[2]");
    }
    public void outlookusername_password()throws IOException
    {
    	String filelocation="./TestDatas/gmaillogi.xlsx";
    	XSSFWorkbook wbook=new XSSFWorkbook(filelocation);
    	XSSFSheet sheet=wbook.getSheetAt(1);
    	XSSFRow row=sheet.getRow(1);
    	XSSFCell cell=row.getCell(0);
    	String outusername=cell.getStringCellValue();
    	type("//input[@type='email']",outusername);
    	click("//input[@id='idSIButton9']");
    }
    public void outpassword() throws IOException, InterruptedException
    {
    	Thread.sleep(3000);
    	String filelocation1="./TestDatas/gmaillogi.xlsx";
    	XSSFWorkbook wbook1=new XSSFWorkbook(filelocation1);
    	XSSFSheet sheet1=wbook1.getSheetAt(1);
    	XSSFRow row1=sheet1.getRow(1);
    	XSSFCell cell2=row1.getCell(1);
    	String password=cell2.getStringCellValue();
    	type("//input[@name='passwd']",password);
    	Thread.sleep(2000);
    	click("//input[@class='win-button button_primary button ext-button primary ext-primary']");
    	click("//input[@type='submit']");
    }
    
    public void email()
    {
    	type("//input[@id='identifierId']","username");
    }
}
