package com.vfislk.test;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
//		System.out.println(System.getProperty("user.dir"));
		
		String fileName = "src/test/resources/screenshots/screenshot_"
				+ LocalDateTime.now().toString().replace(":", "-") + ".png";
		
		System.out.println(fileName);
		
//		System.out.println(LocalDateTime.now().toString().replace(":", "-"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		
		file.renameTo(new File(fileName));
		
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		System.out.println(base64);
	}

}




