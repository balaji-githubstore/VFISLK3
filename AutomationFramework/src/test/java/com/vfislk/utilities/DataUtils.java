package com.vfislk.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException{
		//get the current test method name which will be the sheetname
		String sheetName=method.getName();
		Object[][] arr = ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdata/OpenEmrData.xlsx", sheetName);
		return arr;
	}
	

	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] arr = new Object[3][4];

		arr[0][0] = "admin";
		arr[0][1] = "pass";
		arr[0][2] = "English (Indian)";
		arr[0][3] = "OpenEMR";

		arr[1][0] = "accountant";
		arr[1][1] = "accountant";
		arr[1][2] = "English (Indian)";
		arr[1][3] = "OpenEMR";
		
		arr[2][0] = "physician";
		arr[2][1] = "physician";
		arr[2][2] = "English (Indian)";
		arr[2][3] = "OpenEMR";

		return arr;
	}

}




