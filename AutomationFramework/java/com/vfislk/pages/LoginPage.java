package com.vfislk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * This class handles all the element in the login page
 **/
public class LoginPage {

	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.id("clearPass");
	private By languageLocator = By.name("languageChoice");
	private By loginLocator = By.xpath("//button[@type='submit']");
	private By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Enter username provided
	 **/

	public void enterUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	/**
	 * Enter Password provided
	 **/
	
	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void selectLangaugeByText(String language) {
		Select selectLang = new Select(driver.findElement(languageLocator));
		selectLang.selectByVisibleText(language);
	}

	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}

	public String getLoginPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getInvalidErrorMessage() {
		return driver.findElement(errorLocator).getText();
	}

	public String getLanguageDetailFromDropDown() {
		return driver.findElement(languageLocator).getText();
	}
}
