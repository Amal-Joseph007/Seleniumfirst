//package testngpkg;
//
//
//import java.io.ObjectInputFilter.Status;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.*;
//import com.aventstack.extentreports.*;
//
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//
//public class Extendreportss {
//	WebDriver driver;
//	String baseurl="https://www.facebook.com/";
//	ExtentSparkReporter reporter;
//	ExtentTest test;
//	ExtentReports extent;
//	@BeforeTest
//	public void setUp()
//	{
//		driver=new ChromeDriver();
//		reporter=new ExtentSparkReporter("./Reports/myreport.html");
//		reporter.config().setDocumentTitle("Automationreport");
//		reporter.config().setReportName("Functional Test");
//		reporter.config().setTheme(Theme.DARK);
//		
//		extent=new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("host name", "local host");
//		extent.setSystemInfo("OS", "windows 11");
//		extent.setSystemInfo("Tester name", "Amal joseph");
//		extent.setSystemInfo("Browser", "Chrome");
//		
//		
//		
//	}
//	@BeforeMethod
//	public void urlreload()
//	{
//		driver.get(baseurl);
//	}
//	@Test
//	public void titleverification()
//	{
//		test=extent.createTest("titleverification");
//		String exp="facebook";
//		String act=driver.getTitle();
//		Assert.assertEquals(exp, act);
//	}
//	@Test
//	public void buttonverification()
//	{
//		test=extent.createTest("buttonverification");
//	}
//	@AfterTest
//	public void teardown()
//	{
//		extent.flush();
//	}
//	@AfterMethod
//	public void browserclose(ITestResult result)
//
//	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			test.log(Status.FAIL, "test case failed is"+result.getName());
//			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
//			
//
//		}
//		else if(result.getStatus()==ITestResult.SKIP)
//		{
//			test.log(Status.SKIP, "test case skipped is"+result.getName());
//		}
//		else if(result.getStatus()==ITestResult.SUCCESS)
//		{
//			test.log(Status.PASS, "test case Passed is"+result.getName());
//		}
//
//	}
//	
//
//}
