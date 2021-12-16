package com.vfislk.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.vfislk.utilities.PropUtils;

public class WebDriverWrapper {
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {

		String browser = PropUtils.getValue("src/test/resources/testdata/data.properties", "browser");

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
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
