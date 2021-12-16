package com.vfislk.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {

	@DataProvider
	public Object[][] validData() {
		Object[][] main = new Object[3][2];
		// i -->number of test case or set of test records
		// j --> number of parameters

		main[0][0] = "John";
		main[0][1] = "John123";

		main[1][0] = "peter";
		main[1][1] = "peter123";

		main[2][0] = "mark";
		main[2][1] = "mark123";

		return main;
	}

	@Test(dataProvider = "validData")
	public void validTest(String username, String password) {
		System.out.println("valid " + username + password);
	}

}
