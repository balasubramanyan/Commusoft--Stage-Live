package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Job_Des_Setting extends Wrapper {
	
	public  void main(String[] args)

	{
		click("//a[@id='drop4']");
		click("//a[text()='System settings']");
		click("//a[text()='Job descriptions']");
		click("//a[text()='Add job description']");
		int a =1;
		type("//input[@class='control-input ng-pristine ng-invalid ng-touched']", "Ranjit -"+a+"");
		WebElement text = driver.findElement(By.xpath("//span[text()='This description already exists']"));
		if(text.isDisplayed())
		{
			for(a=1;a>=1000;a++)
			type("//input[@class='control-input ng-pristine ng-invalid ng-touched']", "Ranjit -"+a+"");
		}
		click("(//span[text()='Save'])[2]");
		

		
	}
}

