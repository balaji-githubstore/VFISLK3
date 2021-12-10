package com.vfislk.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEMRJSWebElementTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
		//element - present and visible
		//driver.findElement(By.xpath("//li[@data-bind='click: logout']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//li[@data-bind='click: logout']")));
		
		
		js.executeScript("arguments[0].value='bala';",driver.findElement(By.id("authUser")));
		
//		js.executeScript("arguments[0].value='bala';arguments[1].value='hello'",driver.findElement(By.id("authUser")),driver.findElement(By.id("clearPass")));
	}

}
