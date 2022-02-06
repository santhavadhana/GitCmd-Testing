package com.Adact_In;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	private void readExcel() {
	

}	
	
	@Test
	private void logIn() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\Adact_In\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			  
			driver.get("https://adactinhotelapp.com/");
			
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("santhavadhana");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("sundari6");
			
			WebElement loginBtn = driver.findElement(By.id("login"));
			loginBtn.click();
	}

}
