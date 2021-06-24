package action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wrapper {

	 public WebDriver driver; 
	 
	 public long totalTime;
	 public static String Location;
	 public String formattedDate;
	 public String customerpage;
	 
	 
	public void type(String xpath, String value)
	{
		{
			 if(xpath.contains("$"))
			 {
				 xpath = xpath.replace("$", "");
				 driver.findElement(By.name(xpath)).sendKeys(value);
				 
			 }
			 else if(xpath.contains("#"))
			 {
				 xpath = xpath.replace("#", "");
				driver.findElement(By.id(xpath)).sendKeys(value); 
			 }
			 else if(xpath.contains("~"))
			 {
				 xpath = xpath.replace("~", "");
				 driver.findElement(By.className(xpath)).sendKeys(value);
			 }
			 else
			 {
				 driver.findElement(By.xpath(xpath)).sendKeys(value);
			 }
		}
	}
	
	public void Enterkey()
	{
		Actions builder = new Actions(driver);        
		builder.sendKeys(Keys.ENTER);
	}
		public void type(String xpath, CharSequence[] value)
		{
			{
				 if(xpath.contains("$"))
				 {
					 xpath = xpath.replace("$", "");
					 driver.findElement(By.name(xpath)).sendKeys(value);
					 
				 }
				 else if(xpath.contains("#"))
				 {
					 xpath = xpath.replace("#", "");
					driver.findElement(By.id(xpath)).sendKeys(value); 
				 }
				 else if(xpath.contains("~"))
				 {
					 xpath = xpath.replace("~", "");
					 driver.findElement(By.className(xpath)).sendKeys(value);
				 }
				 else
				 {
					 driver.findElement(By.xpath(xpath)).sendKeys(value);
				 }
		}
	}
	
	
	public void click(String option)
	{
		{
			 if(option.contains("$"))
			 {
				 option = option.replace("$", "");
				 driver.findElement(By.name(option)).click();
				 
			 }
			 else if(option.contains("#"))
			 {
				 option = option.replace("#", "");
				driver.findElement(By.id(option)).click(); 
			 }
			 else if(option.contains("~"))
			 {
				  option = option.replace("~", "");
				 driver.findElement(By.className(option)).click();
			 }
			 else
			 {
				 //option = option.replace("//", "");
				 driver.findElement(By.xpath(option)).click();
			 }
	}
	}
	
	
	
	
	
	
	public void clear(String xpath)
	{
		{
			 if(xpath.contains("$"))
			 {
				 iwait();
				 xpath = xpath.replace("$", "");
				 driver.findElement(By.name(xpath)).clear();
				 
			 }
			 else if(xpath.contains("#"))
			 {
				 iwait();
				 xpath = xpath.replace("#", "");
				driver.findElement(By.id(xpath)).clear(); 
			 }
			 else if(xpath.contains("~"))
			 {
				 iwait();
				 xpath = xpath.replace("~", "");
				 driver.findElement(By.className(xpath)).clear();
			 }
			 else
			 {
				 iwait();
				 //xpath = xpath.replace("//", "");
				 driver.findElement(By.xpath(xpath)).clear();
			 }
	}
	}
	
	
	public void selectdropdown(String xpath, String value)
	{
		if(xpath.contains("#"))
		{
			xpath = xpath.replace("#", "");
			Select sc = new Select(driver.findElement(By.id(xpath)));
			sc.selectByVisibleText(value);
		}else
			if(xpath.contains("$"))
			{
				xpath = xpath.replace("$", "");
				Select sc = new Select(driver.findElement(By.name(xpath)));
				sc.selectByVisibleText(value);
			}else
			{
				Select fcc = new Select(driver.findElement(By.xpath(xpath)));
				fcc.selectByVisibleText(value);
			}
		
	}
	public void selectdropdownvalue(String xpath, String value)
	{
		if(xpath.contains("#"))
		{
			xpath = xpath.replace("#", "");
			Select sc = new Select(driver.findElement(By.id(xpath)));
			sc.selectByValue(value);
		}else
			if(xpath.contains("$"))
			{
				xpath = xpath.replace("$", "");
				Select sc = new Select(driver.findElement(By.name(xpath)));
				sc.selectByValue(value);
			}else
			{
				Select fcc = new Select(driver.findElement(By.xpath(xpath)));
				fcc.selectByValue(value);
			}
			
		iwait();
	}
	public void selectdropdownindex(String xpath, int value)
	{
		iwait();
		Select fcc = new Select(driver.findElement(By.xpath(xpath)));
		fcc.selectByIndex(value);
	
		iwait();
	}
	
	public String gettext(String xpath)
	{
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public void deselectdropdown(String xpath, String value)
	{
		iwait();
		Select fcc = new Select(driver.findElement(By.xpath(xpath)));
		fcc.deselectByVisibleText(value);
		iwait();
	}
	
	public void isdisplayed(String xpath)
	{
		{
			 if(xpath.contains("$"))
			 {
				 iwait();
				 xpath = xpath.replace("$", "");
				 driver.findElement(By.name(xpath)).isDisplayed();
				
				 
			 }
			 else if(xpath.contains("#"))
			 {
				 iwait();
				 xpath = xpath.replace("#", "");
				driver.findElement(By.id(xpath)).isDisplayed(); 
				
			 }
			 else if(xpath.contains("~"))
			 {
				 iwait();
				 xpath = xpath.replace("~", "");
				 driver.findElement(By.className(xpath)).isDisplayed();
				
			 }
			 else
			 {
				 iwait();
				// xpath = xpath.replace("//", "");
				 driver.findElement(By.xpath(xpath)).isDisplayed();
				
			 }
         }
	}
	public void isenabled(String xpath)
	{
		{
			 if(xpath.contains("$"))
			 {
				 xpath = xpath.replace("$", "");
				 driver.findElement(By.name(xpath)).isEnabled();
				
				 
			 }
			 else if(xpath.contains("#"))
			 {
				 xpath = xpath.replace("#", "");
				driver.findElement(By.id(xpath)).isEnabled(); 
		
			 }
			 else if(xpath.contains("."))
			 {
				  xpath = xpath.replace(".", "");
				 driver.findElement(By.className(xpath)).isEnabled();
				
			 }
			 else
			 {
				// xpath = xpath.replace("//", "");
				 driver.findElement(By.xpath(xpath)).isEnabled();
				
			 }
         }
	}
	public void isselected(String xpath)
	{
		{
			 if(xpath.contains("$"))
			 {
				 xpath = xpath.replace("$", "");
				 driver.findElement(By.name(xpath)).isSelected();
			
				 
			 }
			 else if(xpath.contains("#"))
			 {
				 xpath = xpath.replace("#", "");
				driver.findElement(By.id(xpath)).isSelected(); 
		
			 }
			 else if(xpath.contains("~"))
			 {
				 xpath = xpath.replace("~", "");
				 driver.findElement(By.className(xpath)).isSelected();
				
			 }
			 else
			 {
				// xpath = xpath.replace("//", "");
				 driver.findElement(By.xpath(xpath)).isSelected();
			
			 }
         }
	}
	public void getattribute(String xpath , String attributename, String value )
	
	{
		{
			 if(xpath.contains("$"))
			 {
				 xpath = xpath.replace("$", "");
				 String temp;
				 temp = driver.findElement(By.name(xpath)).getAttribute(attributename);
				 			 
				 if(temp.equals(value))
				 {
					 System.out.println("Value is Fine");
				 }else
				 {
					 System.out.println("Need to check the validation");
				 }
				 
			 }
			 else if(xpath.contains("#"))
			 {
				 xpath = xpath.replace("#", "");
				 String temp;
				 temp = driver.findElement(By.id(xpath)).getAttribute(attributename);
				 			 
				 if(temp.equals(value))
				 {
					 System.out.println("Value is Fine");
				 }else
				 {
					 System.out.println("Need to check the validation");
				 }
			 }else if(xpath.contains("~"))
			 {
				 xpath = xpath.replace("~", "");
				 String temp;
				 temp = driver.findElement(By.className(xpath)).getAttribute(attributename);
				 			 
				 if(temp.equals(value))
				 {
					 System.out.println("Value is Fine");
				 }else
				 {
					 System.out.println("Need to check the validation");
				 }
			 }else
			 {
				 //xpath = xpath.replace("//", "");
				 driver.findElement(By.xpath(xpath)).isDisplayed();
				
			 }
        }
	}
	public void framein(String value)
	{
		iwait();
		driver.switchTo().frame(value);
		iwait();
	}
	public void frameout()
	{
		iwait();
		driver.switchTo().defaultContent();
		iwait();
	}
	
	


	public void typeenter(String xpath)
	{
		{
			 if(xpath.contains("$"))
			 {
				 iwait();
				 xpath = xpath.replace("$", "");
				 driver.findElement(By.name(xpath)).sendKeys(Keys.ENTER);
				 iwait();
			 }
			 else if(xpath.contains("#"))
			 {
				 iwait();
				 xpath = xpath.replace("#", "");
				driver.findElement(By.id(xpath)).sendKeys(Keys.ENTER); 
				iwait();
			 }
			 else if(xpath.contains("~"))
			 {
				 iwait();
				 xpath = xpath.replace("~", "");
				 driver.findElement(By.className(xpath)).sendKeys(Keys.ENTER);
				 iwait();
			 }
			 else
			 {
				 iwait();
				 //xpath = xpath.replace("//", "");
				 driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
			 }
	}
	}
	
	public void iwait()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	public void dclick(String xpath)
	{
		iwait();
		if(xpath.contains("$"))
		 {
			 xpath = xpath.replace("$", "");
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.name(xpath));
		actions.doubleClick(elementLocator).perform();
		iwait();
		 }
		else if(xpath.contains("#"))
		 {
			iwait();
			 xpath = xpath.replace("#", "");
			 Actions actions = new Actions(driver);
				WebElement elementLocator = driver.findElement(By.id(xpath));
				actions.doubleClick(elementLocator).perform(); 
		 }
		 else if(xpath.contains("~"))
		 {
			 xpath = xpath.replace("~", "");
			 Actions actions = new Actions(driver);
				WebElement elementLocator = driver.findElement(By.className(xpath));
				actions.doubleClick(elementLocator).perform();
		 }
		 else
		 {
			 //xpath = xpath.replace("//", "");
			 Actions actions = new Actions(driver);
				WebElement elementLocator = driver.findElement(By.xpath(xpath));
				actions.doubleClick(elementLocator).perform();
		 }
	}
	
	
		public String geturl(String value)
		{
			value = driver.getCurrentUrl();
		
		return geturl(value);
		}

		
		public void dd(String one, String two )
		{
			WebElement from = driver.findElement(By.xpath("+one+"));
			WebElement	To = driver.findElement(By.xpath("+two+"));
			
			Actions drag = new Actions(driver);
			drag.dragAndDrop(from,To).build().perform();
		}
		
		
		public void tab(String windowHandle1)
		{
			windowHandle1 = driver.getWindowHandle();
			driver.switchTo().window(windowHandle1);
			
		}

	public void Ewait(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		 if(xpath.contains("$"))
		 {
			 iwait();
			 xpath = xpath.replace("$", "");
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.name(xpath)));
			// driver.findElement(By.name(xpath)).sendKeys(Keys.ENTER);
			 iwait();
		 }
		 else if(xpath.contains("#"))
		 {
			 iwait();
			 xpath = xpath.replace("#", "");
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id(xpath)));
		//	driver.findElement(By.id(xpath)).sendKeys(Keys.ENTER); 
			iwait();
		 }
		 else if(xpath.contains("~"))
		 {
			 iwait();
			 xpath = xpath.replace("~", "");
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.className(xpath)));
		//	 driver.findElement(By.className(xpath)).sendKeys(Keys.ENTER);
			 iwait();
		 }
		 else
		 {
			 iwait();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		//	 driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
		 }
		
	}
	
	public void perform(String xpath , String ypath)
	{
		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, 20);
					
		click(xpath);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ypath)));
		
		long finish = System.currentTimeMillis();
		totalTime = finish - start; 
		System.out.println("Total Time for page load - "+totalTime); 
		
		
	} 
	
	
	public void getCurrentTimeUsingDate() {
	    Date date = new Date();
	    String strDateFormat = "hh:mm:ss a";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    formattedDate= dateFormat.format(date);
	    System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
	}
	public void Assertion(String ER , String AR, String R)
	{
		Assert.assertEquals(AR, ER,R);
	}
	
	public void user_name()
	{
		HashMap<String,String> usermap = new HashMap<String,String>();
		usermap.put("Ranjit", "ranjit_welcome123");
		usermap.put("Karna", "karna_demo123");
		usermap.put("Bala", "bala_bala@123");
		usermap.put("Ezhil", "ezhil_ezhil123");
		
		
	}

}
