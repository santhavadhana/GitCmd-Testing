 package loginTc_Jxl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_Jxl {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\Adact_In\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}

	String[][] data = null;

	@DataProvider(name = "loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;

	}

	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\LathaSanthavadhanan\\Desktop\\Test_Data.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowsCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String testData[][] = new String[rowsCount - 1][columnCount];
		for (int r = 1; r < rowsCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				testData[r - 1][c] = sheet.getCell(c, r).getContents();
			}
		}
		return testData;
	}

	@Test(dataProvider = "loginData")
	public void loginCredential(String uName, String pword) throws InterruptedException {

		driver.get("https://adactinhotelapp.com/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(uName);
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pword);
		Thread.sleep(3000);

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();
		Thread.sleep(3000);

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	private void afterTest() {
		driver.close();
	}

}
