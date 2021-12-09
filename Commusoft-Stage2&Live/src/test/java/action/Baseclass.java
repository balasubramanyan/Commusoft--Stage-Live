package action;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import io.testproject.sdk.internal.exceptions.AgentConnectException;
//import io.testproject.sdk.internal.exceptions.InvalidTokenException;
//import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import utility.Browsers;
import utility.Config;
import utility.Excelsheetdata;
import utility.Screenshot;

public class Baseclass extends Wrapper {
	
	public Excelsheetdata sheet;
	public XSSFSheet sh;
	public Config config;
	public ExtentReports report;
	public ExtentTest logger;
	
	
//	public static ExtentHtmlReporter htmlReporter;
//	public static ExtentReports extent;
//	public static ExtentTest logger;

	
	
	
	@BeforeSuite(alwaysRun = true)
	public void initial() throws IOException
	{
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("./Reports/Live_SmokeTest_Result " +System.currentTimeMillis()+  ".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		logger = report.createTest("Smoke Test");
		sheet = new Excelsheetdata();
		config = new Config();
		
		
//		htmlReporter = new ExtentHtmlReporter(new File("./Reports/Live_SmokeTest_Result " +System.currentTimeMillis()+  ".html"));
//	    extent = new ExtentReports();
//	    extent.attachReporter(htmlReporter);
//
//	    extent.setSystemInfo("OS", "Mac Sierra");
//	    extent.setSystemInfo("Host Name", "Test");
//	    extent.setSystemInfo("Environment", "QA");
//	    extent.setSystemInfo("User Name", "Napendra Singh");
//
//	    htmlReporter.config().setChartVisibilityOnOpen(true);
//	    htmlReporter.config().setDocumentTitle("Extent report");
//	    htmlReporter.config().setReportName("Final Report");
		
	
	}
	
	@BeforeTest(alwaysRun = true)
	public void setup() throws IOException
	{
		
		driver = Browsers.startapplication(driver, config.Browser(), config.URl());
		String SystemName=InetAddress.getLocalHost().getHostName();
		Sysout("Commusoft Web-Automation Started in :   "+SystemName );
		
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, "Method Been Executed Sucessfully:-" +result.getName());
			System.out.println( "Method Been Executed Sucessfully:-" +result.getName());
			Sysout("Method Been Executed Sucessfully:-" +result.getName());
		}else 
			if(ITestResult.FAILURE==result.getStatus())
		{
				logger.log(Status.FAIL, "Method Been Failed:-" +result.getName());
		//		logger.log(Status.FAIL,logger.addScreenCaptureFromPath(Screenshot.capture(driver))+result.getName());
				logger.fail("Test Failed :- " +result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.capture(driver)).build());
				System.out.println( "Method Been Failed:-" +result.getName());
				Sysout("Method Been Failed:-" +result.getName());
			//	logger.log(Status.FAIL,logger.addScreenCaptureFromPath( capture(driver)) +"  Method Name:- " + result.getName());
		}else
		{
			logger.log(Status.SKIP, "Method been Skiped");
			logger.skip(result.getThrowable());
		}
		
	}
	@AfterSuite
	public void tearDown() throws UnknownHostException{
		Sysout("Commusoft Web-Automation Completed in :   "+InetAddress.getLocalHost().getHostName());
		report.flush();
	   }

}
