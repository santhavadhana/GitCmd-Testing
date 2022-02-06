package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\Adact_In\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

//		LoginPageObjects loginPageObjects = new LoginPageObjects();

		LoginPageObjects.userName(driver).sendKeys("zapcomsantha");
		LoginPageObjects.password(driver).sendKeys("admin@123");
		LoginPageObjects.loginButton(driver).click();

//      WebElement userName = driver.findElement(By.id("username"));
//		userName.sendKeys("zapcomsantha");
//
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("admin@123");
//
//		WebElement loginBtn = driver.findElement(By.id("login"));
//		loginBtn.click();
//		driver.quit();
	}
}