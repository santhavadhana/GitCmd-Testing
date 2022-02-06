package dataDriven_Poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetBuilder;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataDrivernPOI {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\Adact_In\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	List<String> userNameList = new ArrayList<String>();
	List<String> passwordList = new ArrayList<String>();

	public void readExcel() throws IOException {
		FileInputStream excel = new FileInputStream(
				"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\Adact_In\\TestData.xlsx");
		Workbook workBook = new XSSFWorkbook(excel);
		Sheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();

			Iterator<Cell> columnIterator = rowValue.iterator();

			int i = 2;
			while (columnIterator.hasNext()) {
				if (i % 2 == 0) {
					userNameList.add(columnIterator.next().getStringCellValue());
				} else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}

				i++;
			}
		}

	}
@Test
	private void loginCred(String uName, String pword) {
		driver.get("https://adactinhotelapp.com/");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(uName);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pword);

		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();
	}

}
