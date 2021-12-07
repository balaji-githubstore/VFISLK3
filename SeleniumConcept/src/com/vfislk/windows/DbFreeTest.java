package com.vfislk.windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DbFreeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin
		driver.findElement(By.xpath("//b[contains(text(),'phpMyAdmin')]")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windows.get(0)); //print 1st tab session id
		System.out.println(windows.get(1)); // print 2nd tab session id
		
		driver.switchTo().window(windows.get(1)); //driver switch to second tab (1st index) 
		
		driver.findElement(By.id("input_username")).sendKeys("balaji");
		
	}

}







