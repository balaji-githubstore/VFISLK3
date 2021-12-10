package com.vfislk.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://datatables.net/examples/basic_init/scroll_y.html");

		// sleep 5s
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[text()='Zorita Serrano']")));
		
		
		int rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();

		for (int i = 1; i <= rowCount; i++) {

			js.executeScript("arguments[0].scrollIntoView()",
					driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]")));

			String name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]")).getText();
			System.out.println(name);

		}

	}

}
