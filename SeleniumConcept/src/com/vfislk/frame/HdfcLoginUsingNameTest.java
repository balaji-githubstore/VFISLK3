package com.vfislk.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLoginUsingNameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		driver.switchTo().frame("login_page");
		
		//enter customer id as test123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		
		//click on continue
		driver.findElement(By.linkText("CONTINUE")).click();

		//come to main html (come out of frame)
		driver.switchTo().defaultContent();
		
	}
}


