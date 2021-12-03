package com.vfislk.orangehrm;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); //no limit for page load so it will for page load happen
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
