package com.vfislk.nassom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://nasscom.in/");

		driver.findElement(By.partialLinkText("New User")).click();

		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("john");
		driver.findElement(By.id("edit-field-lname")).sendKeys("wick");
		driver.findElement(By.id("edit-mail")).sendKeys("john@gmail.com");
		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("VFISLK");

		Select selectBusinessFocus = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		selectBusinessFocus.selectByVisibleText("IT Consulting");

	}

}
