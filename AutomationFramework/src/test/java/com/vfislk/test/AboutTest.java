package com.vfislk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vfislk.base.WebDriverWrapper;

public class AboutTest extends WebDriverWrapper {
	
	@Test
	public void checkVersionNumberTest()
	{
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		driver.findElement(By.xpath("//div[text()='About']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='msc']")));	
		String actualVersion= driver.findElement(By.tagName("h4")).getText();	
		driver.switchTo().defaultContent();
		
		Assert.assertEquals(actualVersion, "Version Number: v6.0.0 (2)");
	}
	
}
