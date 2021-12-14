package com.vfislk.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.openemr.io/b/openemr");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void validCredentialTest() {
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle,"OpenEMR"); 
	}
	
	@Test
	public void invalidCredentialTest()
	{
		driver.findElement(By.id("authUser")).sendKeys("john");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualError=driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
		
		Assert.assertEquals(actualError,"Invalid username or password");
	}
	
}



