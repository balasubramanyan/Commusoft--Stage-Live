package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	Properties pro;
	
	public Config() throws IOException
	{
		File src = new File("./Config/config.properties");
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
}
