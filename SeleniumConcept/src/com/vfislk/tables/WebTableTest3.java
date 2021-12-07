package com.vfislk.tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		int rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		for (int i = 1; i <= rowCount; i++) {
			String name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]")).getText();
			System.out.println(name);

			if (i == rowCount) {
				if (driver.findElement(By.linkText("Next")).getAttribute("tabindex").equals("0")) {
					driver.findElement(By.linkText("Next")).click();
					i = 0;
					rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
				} else {
					break;
				}
			}

		}

	}

}
