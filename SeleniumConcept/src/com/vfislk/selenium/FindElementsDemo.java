package com.vfislk.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://google.com/");

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		int noOfLinks=elements.size();
		System.out.println(noOfLinks);
		
		
		for(int i=0;i<noOfLinks;i++)
		{
			String text = elements.get(i).getText();
			System.out.println(text);
			
			String href=elements.get(i).getAttribute("href");
			System.out.println(href);
			
			if(text.equals("Images"))
			{
				elements.get(i).click();
				break;
			}
		}
		
	}

}
