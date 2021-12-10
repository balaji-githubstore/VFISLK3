package com.vfislk.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NasscomTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://nasscom.in/");
		

		//driver.findElement(By.xpath("//a[text()='Members Listing']")).click();

		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Members Listing']")));
		
		
		//windows scroll
		js.executeScript("window.scrollBy(0,100)");
	}

}
