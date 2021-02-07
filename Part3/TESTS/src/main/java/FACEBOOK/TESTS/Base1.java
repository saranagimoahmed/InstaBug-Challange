package FACEBOOK.TESTS;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base1 {

	//create general webdriver
	protected static WebDriver driver;
	public WebDriverWait wait;
	
	//create constructor
	@SuppressWarnings("deprecation")
	public Base1 (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 120);
	}
}
