package com.vfislk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vfislk.base.WebDriverWrapper;
import com.vfislk.utilities.DataUtils;

public class LoginTest extends WebDriverWrapper {

	@Test(dataProviderClass = DataUtils.class, dataProvider = "validCredentialData")
	public void validCredentialTest(String username, String password, String language, String expectedValue) {

		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.id("clearPass")).sendKeys(password);
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText(language);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// wait for the new page load
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedValue);
	}

	@Test
	public void invalidCredentialTest() {
		driver.findElement(By.id("authUser")).sendKeys("john");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String actualError = driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();

		Assert.assertEquals(actualError, "Invalid username or password");
	}

}
