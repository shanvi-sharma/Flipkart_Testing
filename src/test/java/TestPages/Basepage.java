package TestPages;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.ExtentManager;
import Utilities.ReadingPropertiesFile;
import Utilities.ScreenShots;




public class Basepage {
	
	public static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;
	public static Logger log=LogManager.getLogger(Basepage.class.getName());
	
	
	public Basepage(){
		super();
	}
	
	
	@Parameters({"browserName"})
	@BeforeSuite
	
	public void startBrowser(String browserName)
	{
		log.info("=======Starting Login Page Test========");
		log.info("Initializing Drivers");
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			String projectPath= System.getProperty("user.dir");
			System.out.println("Project Path is: "+ projectPath);
			System.setProperty("webdriver.gecko.driver", projectPath+"driver/geckodriver/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			//options.addArguments("--headless");
			options.addArguments("start-maximized");
			driver= new FirefoxDriver(options);
			log.info("Driver loaded ... Traversing to Login Page");
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			String projectPath= System.getProperty("user.dir");
			System.out.println("Project Path is: "+ projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			options.addArguments("start-maximized");

			driver= new ChromeDriver(options);
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		extent = ExtentManager.getInstance("reports//ExtentReport_Flipkart.html");
		

	}
	
	@Parameters({"url"})
	@BeforeTest
	public void navigate_url(String url) {
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		test = extent.startTest(method.getName());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS)
			test.log(LogStatus.PASS, "Test case got passed");
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
			ScreenShots.takeScreenShot(driver, result.getName());
		}
			
		else if(result.getStatus()==ITestResult.SKIP)
			test.log(LogStatus.SKIP, result.getThrowable());
		
		extent.flush();
	}
		

	
	@AfterSuite
	public void tearDown() {
		log.info("Closing browser");
		driver.quit();
		log.info("Browser closed");
	}


}
