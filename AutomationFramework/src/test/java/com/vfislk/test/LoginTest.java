package com.vfislk.test;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vfislk.base.WebDriverWrapper;
import com.vfislk.pages.DashboardPage;
import com.vfislk.pages.LoginPage;
import com.vfislk.utilities.DataUtils;

/**
 * 
 * @author Balaji Dinakran
 *
 *This class handles all the test case related to login scenario
 */
public class LoginTest extends WebDriverWrapper {

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider",groups = {"low"})
	public void checkLanguageTest(String expectedLanguage) {
		LoginPage login = new LoginPage(driver);

		String actualValue = login.getLanguageDetailFromDropDown();
		Assert.assertTrue(actualValue.contains(expectedLanguage));
		// log the result in excel --> excel, sheetname, row
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "validCredentialData",groups = {"high","login"})
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

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider",groups = {"high","login"})
	public void invalidCredentialTest(String username, String password, String language, String expectedValue) {

		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		test.log(Status.INFO, "Entered Usename as "+username);
		login.enterPassword(password);
		test.log(Status.INFO, "Entered Password");
		login.selectLangaugeByText(language);
		test.log(Status.INFO, "Selected Language as "+language);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		test.log(Status.INFO, "Error Message Displayed "+actualError);
		Assert.assertEquals(actualError, expectedValue);
	}

}
