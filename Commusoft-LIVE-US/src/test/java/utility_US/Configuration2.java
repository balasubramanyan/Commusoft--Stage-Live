package utility_US;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration2 
{
Properties pro;
	
	public Configuration2() throws IOException
	{
		File src = new File("./Configure/Config");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		
	}
	
	public String Browser()
	{
		return pro.getProperty("Browser");
	}
	public String URl()
	{
		return pro.getProperty("URL");
	}
	public String URL2()
	{
		return pro.getProperty("URL2");
	}
}
