package FACEBOOK.TESTS;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
/*
 * Test case 2 Sign in to fb account with test user created by fb development app 
 */
@Test
public class ValidLoginFB {
	public void test() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\snagi\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		ReadTestUsersSheet.ExcelFile("C:\\Users\\snagi\\TestData.xlsx", "Sheet1");

	}
	
   
}
 
