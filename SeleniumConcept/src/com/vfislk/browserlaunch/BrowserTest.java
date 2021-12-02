package com.vfislk.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");	
		System.setProperty("webdriver.edge.driver", "C:\\Components\\msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Components\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Components\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		
		
	}
}
