package FACEBOOK.TESTS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadTestUsersSheet extends Base1
 
{

	public ReadTestUsersSheet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public ReadTestUsersSheet(WebDriver driver) { super(driver); // TODO
	 * Auto-generated constructor stub }
	 */
	String USER;
	String PASS;

	public static void ExcelFile(String path, String sheetName) throws IOException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\snagi\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		FileInputStream file = new FileInputStream(new File(path));

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(file);

		// creating a Sheet object
		XSSFSheet sheet = wb.getSheet(sheetName);

		// get all rows in the sheet
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		// iterate over all the row to print the data present in each cell.
		for (int i = 1; i <= rowCount; i++) {

			// get cell count in a row
			int cellcount = sheet.getRow(i).getLastCellNum();

 //below function to open fb account and read test users data and password from excel sheet 
			
			for (int j = 1; j < cellcount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + ",");
				String user = sheet.getRow(i).getCell(0).getStringCellValue();
				String userpassword = sheet.getRow(i).getCell(1).getStringCellValue();
				driver.navigate().to("https://www.facebook.com/");
				LoginFB Loginfbobject = new LoginFB(driver);
				WebDriverWait waiting = new WebDriverWait(driver, 5);
				waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pass\"]")));
				Loginfbobject.password.sendKeys(userpassword);
				Loginfbobject.email.sendKeys(user);
				Loginfbobject.LoginButton.click();
			
			}

		}

	}

}
	   