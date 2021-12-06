package com.vfislk.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEmrTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Messages']")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("msg")));
			
		driver.findElement(By.partialLinkText("Add New")).click();
		
		driver.findElement(By.id("note")).sendKeys("Hello everyone!!!");
		
		Select selectType=new Select(driver.findElement(By.id("form_note_type")));
		selectType.selectByVisibleText("Pharmacy");
		
		driver.findElement(By.id("newnote")).click();
		
		String actualText=driver.findElement(By.xpath("//span[contains(text(),'Please choose')]")).getText();
		System.out.println(actualText);
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
	}
}








