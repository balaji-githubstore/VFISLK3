package com.vfislk.selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest2 {

	public static void main(String[] args) {
		
		File fileObj=new File("files/OrangeHrmTestCase.xlsx");	
		String path=fileObj.getAbsolutePath();
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://smallpdf.com/pdf-to-word");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
	
		
	}
}
