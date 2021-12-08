package com.vfislk.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEMRAddPatientTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.cssSelector("#authUser")).sendKeys("admin");
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");

		Select selectLan=new Select(driver.findElement(By.cssSelector("select[name='languageChoice']")));
		selectLan.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Patient/Client']")).click();
		driver.findElement(By.xpath("//div[text()='Patients']")).click();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='fin']")));
		driver.findElement(By.id("create_patient_btn1")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
		
		driver.findElement(By.id("form_fname")).sendKeys("John");
		driver.findElement(By.id("form_lname")).sendKeys("wick");
		driver.findElement(By.id("form_DOB")).sendKeys("2021-12-07");
		Select selectGender=new Select(driver.findElement(By.id("form_sex")));
		selectGender.selectByVisibleText("Male");
		driver.findElement(By.id("create")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		driver.switchTo().defaultContent();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.alertIsPresent());
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
		//check the xpath count and decide 
		if(driver.findElements(By.xpath("//div[@data-dismiss='modal']")).size()>0)
		{
			driver.findElement(By.xpath("//div[@data-dismiss='modal']")).click();
		}
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
		
		String actualValue=driver.findElement(By.xpath("//h2[contains(text(),'Medical Record')]")).getText();
		System.out.println(actualValue);
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
}



