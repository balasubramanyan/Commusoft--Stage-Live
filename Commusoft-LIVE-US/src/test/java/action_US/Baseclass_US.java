package action_US;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import utility.Browsers;
import utility.Screenshot;
import utility_US.Browsers_US;
import utility_US.Configuration2;
import utility_US.ExcelsheetdataUS;

public class Baseclass_US extends Wrapper_US
{
	public ExcelsheetdataUS sheet;
	public Configuration2 Config;
	public XSSFSheet sh;
	public ExtentReports report;
	public ExtentTest logger;
	

	@BeforeSuite(alwaysRun = true)
	public void initial() throws IOException
	{
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("./Reports2/USLive_SmokeTest_Result " +System.currentTimeMillis()+  ".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		logger = report.createTest("Smoke Test");
		sheet = new ExcelsheetdataUS();
		Config = new Configuration2();
	}
		@BeforeTest(alwaysRun = true)
		public void setup() throws IOException, InvalidTokenException, AgentConnectException, ObsoleteVersionException
		{
			
			driver = Browsers_US.startapplication(driver, Config.Browser(), Config.URl());
			//driver = Browsers.startapplication(driver, config.Browser(), config.URL2());
			String SystemName=InetAddress.getLocalHost().getHostName();
			Sysout("Commusoft Web-Automation Started in :   "+SystemName );
			SlackCommusoft();	
		}
		@AfterMethod(alwaysRun = true)
		public void teardown(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				logger.log(Status.PASS, "Method Been Executed Sucessfully:-" +result.getName());
				System.out.println( "Method Been Executed Sucessfully:-" +result.getName());
				Sysout("Method Been Executed Sucessfully:-" +result.getName());
				SlackCommusoftstatus("Method Been Executed Sucessfully:-" +result.getName());
			}else 
				if(ITestResult.FAILURE==result.getStatus())
			{
					logger.log(Status.FAIL, "Method Been Failed:-" +result.getName());
			//		logger.log(Status.FAIL,logger.addScreenCaptureFromPath(Screenshot.capture(driver))+result.getName());
					logger.fail("Test Failed :- " +result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.capture(driver)).build());
					System.out.println( "Method Been Failed:-" +result.getName());
					Sysout("Method Been Failed:-" +result.getName());
					SlackCommusoftstatus("Method Been Failed:-" +result.getName());
				//	logger.log(Status.FAIL,logger.addScreenCaptureFromPath( capture(driver)) +"  Method Name:- " + result.getName());
			}else
			{
				logger.log(Status.SKIP, "Method been Skiped");
				logger.skip(result.getThrowable());
			}
			
		}
		@AfterSuite
		public void tearDown() throws IOException{
			Sysout("Commusoft Web-Automation Completed in :   "+InetAddress.getLocalHost().getHostName());
			SlackCommusoftdone(InetAddress.getLocalHost().getHostName());
			
			report.flush();
		   }
}
	
