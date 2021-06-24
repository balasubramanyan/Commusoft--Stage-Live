package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Data extends Wrapper{
	public String customer[];

	public Data(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public HashMap<String,String> username()
	{
		HashMap<String,String> usermap = new HashMap<String,String>();
		usermap.put("Ranjit", "ranjit_welcome123");
		usermap.put("Karna", "karna_demo123");
		usermap.put("Bala", "bala_bala@123");
		usermap.put("Ezhil", "ezhil_ezhil123");
		
		return usermap;	
		
	}
	
	public HashMap<String,String> customername()
	{
		HashMap<String,String> customer = new HashMap<String,String>();
		customer.put("Ranjit", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		customer.put("Bala", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		customer.put("Karna", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		customer.put("Ezhil", "Ranjit_Aravind_ranjit@commusoft.com_8965326598_Madurai");
		
		return customer;
		
	}
	
}
