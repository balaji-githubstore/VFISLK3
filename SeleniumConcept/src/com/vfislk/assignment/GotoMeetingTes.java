package com.vfislk.assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class GotoMeetingTes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.linkText("Try Free")).click();
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("wick");
		driver.findElement(By.id("login__email")).sendKeys("John@gmail.com");
		
		Select selectJob=new Select(driver.findElement(By.id("JobTitle")));
		selectJob.selectByVisibleText("Help Desk");
		driver.findElement(By.xpath("//input[@value='10 - 99']")).click();
		
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
		
		//get the text 
		String header=driver.findElement(By.xpath("//h1[contains(text(),'Try GoTo')]")).getText();
		System.out.println(header);
		
		String header2=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header2);
		
		String actualError=driver.findElement(By.xpath("//div[@class='inputField__requirements']")).getText();
		System.out.println(actualError);
	}
	
}
