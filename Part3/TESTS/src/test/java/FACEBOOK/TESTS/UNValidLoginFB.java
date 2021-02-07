package FACEBOOK.TESTS;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

/*
 * Test case 3 Sign in to fb account with un valid test user 
 */
@Test
public class UNValidLoginFB {

	public void test() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\snagi\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		ReadTestUsersSheet.ExcelFile("C:\\Users\\snagi\\TestData-Wrong.xlsx", "Sheet1");

	}
}
