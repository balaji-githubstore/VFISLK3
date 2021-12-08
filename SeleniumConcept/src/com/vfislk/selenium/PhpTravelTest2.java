package com.vfislk.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelTest2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://phptravels.net/");
		
		driver.findElement(By.xpath("//a[text()='flights']")).click();
		
		Select selectType=new Select(driver.findElement(By.id("flight_type")));
		selectType.selectByVisibleText("Business");
		
		Actions action=new Actions(driver);
		
		driver.findElement(By.id("autocomplete")).sendKeys("lax");
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.id("autocomplete2")).sendKeys("DAL");
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}






