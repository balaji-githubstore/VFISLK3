package com.vfislk.selenium;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		
		ChromeOptions option=new ChromeOptions();
//		option.setAcceptInsecureCerts(true);
//		option.addArguments("--headless");
//		option.addArguments("--disable-notifications");
		
		HashMap<String, String> prefMap=new HashMap<String, String>();
		prefMap.put("download.default_directory", "D:\\");
		option.setExperimentalOption("prefs", prefMap);

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/downloads/"); 
		
		driver.findElement(By.partialLinkText("32 bit")).click();
																	

//		String href = driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
//		System.out.println(href);
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//
//		String actualUrl = driver.getCurrentUrl();
//		System.out.println(actualUrl);
//
//		driver.quit();


	}

}
