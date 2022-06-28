package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import action.Baseclass;
import pages.Email_setup;
import pages.Settings;

public class Emailsetup extends Baseclass
{
//@Test(priority=1)
//public void gmail() throws IOException
//{
//	Settings setting=new Settings(driver);
//	setting.Click_Setting();
//	setting.Click_Companysetting();
//	Email_setup gmail  =new Email_setup(driver);
//	gmail.setupemail();
//	gmail.gmailbutton();
//	gmail.gmailusername_password();
//				
//}
@Test(priority=1)
public void outlook() throws IOException, InterruptedException
{
	Settings setting=new Settings(driver);
	setting.Click_Setting();
	setting.Click_Companysetting();
	Email_setup outlook  =new Email_setup(driver);
	outlook.setupemail();
	outlook.outlookbutton();
	outlook.outlookusername_password();	
	outlook.outpassword();
}
}
