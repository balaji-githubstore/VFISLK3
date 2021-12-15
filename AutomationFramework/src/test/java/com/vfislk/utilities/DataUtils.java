package com.vfislk.utilities;

import org.testng.annotations.DataProvider;

public class DataUtils {

	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] main = new Object[3][4];

		main[0][0] = "admin";
		main[0][1] = "pass";
		main[0][2] = "Dutch";
		main[0][3] = "OpenEMR";

		main[1][0] = "accountant";
		main[1][1] = "accountant";
		main[1][2] = "English (Indian)";
		main[1][3] = "OpenEMR";
		
		main[2][0] = "physician";
		main[2][1] = "physician";
		main[2][2] = "English (Indian)";
		main[2][3] = "OpenEMR";

		return main;
	}

}
