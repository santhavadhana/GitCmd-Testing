package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HotelSearchObjects;
import pageObjects.LoginPageObjects;

public class SearchHotel {
	private void hotelSearch() {

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\Adact_In\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();

//	LoginPageObjects loginPageObjects = new LoginPageObjects();

	LoginPageObjects.userName(driver).sendKeys("zapcomsantha");
	LoginPageObjects.password(driver).sendKeys("admin@123");
	LoginPageObjects.loginButton(driver).click();
	
//	HotelSearchObjects hotelSearchObjects=new HotelSearchObjects();
//	
//	hotelSearchObjects.location(driver).sendKeys("Sydney");
//	hotelSearchObjects.hotels(driver).sendKeys("Hotel Sunshine");
//	hotelSearchObjects.
	}
}
