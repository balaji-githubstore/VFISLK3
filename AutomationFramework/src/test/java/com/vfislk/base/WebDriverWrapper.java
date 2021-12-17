package com.vfislk.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.vfislk.utilities.PropUtils;

public class WebDriverWrapper {
	protected WebDriver driver;
	protected ExtentReports extent;
	protected ExtentTest test;

	@BeforeSuite
	public void start() {
		extent = new ExtentReports();
//		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark"+LocalDateTime.now().toString().replace(":", "-")+".html");
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		
		extent.attachReporter(spark);
	}

	@AfterSuite
	public void end() {
		extent.flush();
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browsername" })
	public void setUp(@Optional("ch") String browser, Method method) throws IOException {

		String propCheck = PropUtils.getValue("src/test/resources/testdata/data.properties", "preference");

		// check for key properties and runs only if yes
		if (propCheck.equalsIgnoreCase("yes")) {
			browser = PropUtils.getValue("src/test/resources/testdata/data.properties", "browser");
		}

		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "src/test/resources/driver/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		String url = PropUtils.getValue("src/test/resources/testdata/data.properties", "url");
		driver.get(url);

		test = extent.createTest(method.getName());
		
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
//		test.addScreenCaptureFromPath(takeScreenshot()); //add file 

		test.addScreenCaptureFromBase64String(takeScreenshot(), result.getName());
		driver.quit();
	}

	public String takeScreenshot() throws IOException {
		String fileName = "src/test/resources/screenshots/screenshot_"
				+ LocalDateTime.now().toString().replace(":", "-") + ".png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		//store as file 
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(fileName));
		
		//get as base64
		String base64 = ts.getScreenshotAs(OutputType.BASE64);	

		return base64;
	}
}
