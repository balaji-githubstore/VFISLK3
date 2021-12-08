package com.vfislk.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.com/");
		
		
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.SHIFT).sendKeys("hello")
		.keyUp(Keys.SHIFT).pause(Duration.ofSeconds(1)).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ENTER).build().perform();

		
	}
}
