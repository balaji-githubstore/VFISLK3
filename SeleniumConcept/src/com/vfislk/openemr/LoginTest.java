package com.vfislk.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");

		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//get the title of the dashboard page
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);

	}
}
