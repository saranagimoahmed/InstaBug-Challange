package FACEBOOK.TESTS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/*
 * Test case 1 register to fb account 
 */
@Test
public class RegisterFB {

	LoginFB LoginFBObject;

	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\snagi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// FirefoxDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		LoginFBObject = new LoginFB(driver);
		LoginFBObject.Register("test", "user", "01050008899", "01050008899");

	}

}
