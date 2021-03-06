package com.vfislk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.vfislk.base.WebDriverKeywords;

/**
 * This class handles all the element in the login page
 **/
public class LoginPage extends WebDriverKeywords {

	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.id("clearPass");
	private By languageLocator = By.name("languageChoice");
	private By loginLocator = By.xpath("//button[@type='submit']");
	private By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Enter username provided
	 **/

	public void enterUsername(String username) {
		typeOnElement(usernameLocator, username);
	}

	/**
	 * Enter Password provided
	 **/
	
	public void enterPassword(String password) {
		typeOnElement(passwordLocator, password);
	}

	public void selectLangaugeByText(String language) {
		SelectUsingText(languageLocator,language);
	}

	public void clickOnLogin() {
		clickOnElement(errorLocator);
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
