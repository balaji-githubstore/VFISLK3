package com.vfislk.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSReturnTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://atozgrocery.in/my-account/");
		
		driver.findElement(By.id("reg_email")).sendKeys("john");
		
		
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);

		String text=js.executeScript("return document.querySelectorAll('#reg_email')[0].validationMessage").toString();
		System.out.println(text);
	}

}
