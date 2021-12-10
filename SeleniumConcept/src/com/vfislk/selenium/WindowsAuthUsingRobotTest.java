package com.vfislk.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthUsingRobotTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://softwaretesting.com/");
		
		Robot rb=new Robot();
		
		String name="Johnken123";

		for(int i=0;i<name.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(name.charAt(i)));
		}
		
		rb.keyPress(KeyEvent.VK_TAB);
		
		String password="pass123";
		
		for(int i=0;i<password.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(password.charAt(i)));
		}
	
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}

}
