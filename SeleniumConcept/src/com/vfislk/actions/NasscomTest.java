package com.vfislk.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NasscomTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.oracle.com/in/index.html");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Low data networking')]"))).perform();
		
		driver.findElement(By.linkText("Sign in to Cloud")).click();

		
	}

}
