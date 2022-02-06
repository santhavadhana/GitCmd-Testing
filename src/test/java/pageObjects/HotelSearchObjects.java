package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelSearchObjects {

	public static WebElement location(WebDriver driver) {
		return driver.findElement(By.id("location"));
	}

	public static WebElement hotels(WebDriver driver) {

		return driver.findElement(By.id("hotels"));
	}

	public static WebElement roomType(WebDriver driver) {
		
		return driver.findElement(By.id("room_type"));
	}

	public static WebElement roomNo(WebDriver driver) {
		return driver.findElement(By.id("room_nos"));
	}

	public static WebElement checkIn(WebDriver driver) {
		return driver.findElement(By.id("datepick_in"));
	}

	public static WebElement checkOut(WebDriver driver) {
		return driver.findElement(By.id("datepick_out"));
	}

	public static WebElement adultRoom(WebDriver driver) {
		return driver.findElement(By.id("adult_room"));
	}

	public static WebElement childRoom(WebDriver driver) {
		return driver.findElement(By.id("child_room"));
	}

	public static WebElement search(WebDriver driver) {
		return driver.findElement(By.id("Submit"));
	}

	public static void main(String[] args) {
		
	}
}
