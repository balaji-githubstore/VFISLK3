package com.vfislk.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vfislk.base.WebDriverWrapper;
import com.vfislk.pages.DashboardPage;
import com.vfislk.pages.LoginPage;
import com.vfislk.utilities.DataUtils;

public class LoginTest extends WebDriverWrapper {

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider")
	public void checkLanguageTest(String expectedLanguage) {
		LoginPage login = new LoginPage(driver);

		String actualValue = login.getLanguageDetailFromDropDown();
		Assert.assertTrue(actualValue.contains(expectedLanguage));
		// log the result in excel --> excel, sheetname, row
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "validCredentialData")
	public void validCredentialTest(String username, String password, String language, String expectedValue) {

		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.selectLangaugeByText(language);
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.waitForPresenceOfAbout();

		String actualTitle = dashboard.getDashboardPageTitle();
		Assert.assertEquals(actualTitle, expectedValue);
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username, String password, String language, String expectedValue) {

		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.selectLangaugeByText(language);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();

		Assert.assertEquals(actualError, expectedValue);
	}

}
