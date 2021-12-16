package com.vfislk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vfislk.base.WebDriverWrapper;
import com.vfislk.utilities.DataUtils;

public class AboutTest extends WebDriverWrapper {
	
	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void checkVersionNumberTest(String username, String password, String language, String expectedVersion)
	{
		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.id("clearPass")).sendKeys(password);
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText(language);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='About']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='msc']")));	
		String actualVersion= driver.findElement(By.tagName("h4")).getText();	
		driver.switchTo().defaultContent();
		
		Assert.assertEquals(actualVersion, expectedVersion);
	}
	
}
