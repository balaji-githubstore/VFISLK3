package com.vfislk.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://phptravels.net/");
		
		driver.findElement(By.xpath("//a[text()='flights']")).click();
		
		Select selectType=new Select(driver.findElement(By.id("flight_type")));
		selectType.selectByVisibleText("Business");
		
		driver.findElement(By.id("autocomplete")).sendKeys("lax");
		driver.findElement(By.xpath("//b[text()='LAX']")).click();
		
		driver.findElement(By.id("autocomplete2")).sendKeys("dal");
		driver.findElement(By.xpath("//b[text()='DAL']")).click();
		
		driver.findElement(By.id("departure")).clear();
		driver.findElement(By.id("departure")).sendKeys("30-12-2021");
		
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
		//adults- 4
		int adult=4;
		for(int i=2;i<=adult;i++)
		{
			driver.findElement(By.xpath("//i[@class='la la-plus']")).click();
		}
		
		//childs - 2
		int child=3;
		
		for(int i=1;i<=child;i++)
		{
			driver.findElement(By.xpath("(//i[@class='la la-plus'])[2]")).click();
		}
		
		//click on search 
		driver.findElement(By.id("flights-search")).click();
		
		//get the text of search result
		String text=driver.findElement(By.xpath("//div[@class='breadcrumb-content']")).getText();
		System.out.println(text);
	}

}






