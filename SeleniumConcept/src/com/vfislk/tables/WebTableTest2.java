package com.vfislk.tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		// sleep 5s
		String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();

		String t1= text.substring(13,16).trim();
		System.out.println(t1);
		
		int index=text.indexOf("of");
		
		String t2=text.substring(index+3);
		t2=t2.replace(" entries", "");
		System.out.println(t2);
		
		double n1=Double.parseDouble(t1);
		double n2=Double.parseDouble(t2);
		
		double pageCount=Math.ceil(n2/n1);
		
		
		for (int p = 1; p <= pageCount; p++) // page count
		{
			int rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
			for (int i = 1; i <= rowCount; i++) {
				String name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"))
						.getText();
				System.out.println(name);
			}
			if (driver.findElement(By.linkText("Next")).getAttribute("tabindex").equals("0")) {
				driver.findElement(By.linkText("Next")).click();
			} else {
				break;
			}
		}

	}

}
