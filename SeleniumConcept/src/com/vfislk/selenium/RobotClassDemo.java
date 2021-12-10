package com.vfislk.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//http://Username:Password@SiteURL
		driver.get("https://john:john123@softwaretesting.com/");
		
		
		

	}

}
