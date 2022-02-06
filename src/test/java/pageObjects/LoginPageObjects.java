package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));

	}

	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("login"));

	}
}
