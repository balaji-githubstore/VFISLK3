package com.vfislk.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("wick@gmail.com");
		
		driver.findElement(By.name("CompanyName")).sendKeys("VFISLK");
		
		Select selectJob=new Select(driver.findElement(By.xpath("//select[contains(@id,'UserTitle')]")));
		selectJob.selectByValue("IT_Manager_AP");
		
		Select selectCon=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCon.selectByVisibleText("United Kingdom");
		
		Select selectEmp=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmp.selectByVisibleText("101 - 500 employees");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		driver.findElement(By.name("start my free trial")).click();
		
		String actualError=driver.findElement(By.xpath("//*[contains(text(),'valid phone')]")).getText();
		System.out.println(actualError);
	}

}
