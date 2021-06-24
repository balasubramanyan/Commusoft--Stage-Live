package classicpage;

import action.Baseclass;

public class Clogin extends Baseclass {

	public void login(int id,String username,String password)
	{
		type("#logintype_clientid", "16008");
		type("#logintype_username", "ranjit");
		type("#logintype_password", "welcome123");
		click("//button[@id='successful-login']");
		
	}
}
