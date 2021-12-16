package com.vfislk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vfislk.base.WebDriverWrapper;
import com.vfislk.utilities.DataUtils;

public class PatientTest extends WebDriverWrapper {
	
	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void addPatientTest(String username,String password,String langauge,String firstName,String lastName,String dob,String gender,String expectedAlert,String expectedPatientDetail)
	{
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//add the patient
		
		//assert the added patient detail
	}

}
