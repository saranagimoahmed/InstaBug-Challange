package FACEBOOK.TESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class LoginFB extends Base1 {
	public LoginFB(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"email\"]") //email xpath in login form 
	WebElement email;

	@FindBy(xpath = "//*[@id=\"pass\"]") //password xpath in login form 
	WebElement password;

	@FindBy(xpath = "//*[@id=\"u_0_b\"]") //login button  xpath in login form 
	WebElement LoginButton;

	@FindBy(xpath = "//*[@id=\"u_0_2\"]") //CreateNewAccount button  xpath in login form
	WebElement CreateNewAccountButton;

	@FindBy(xpath = "//*[@id=\"u_1_b\"]") //First name in sign up form 
	WebElement FirstName;

	@FindBy(xpath = "//*[@id=\"u_1_d\"]") //sur name in sign up form 
	WebElement SurName;

	@FindBy(xpath = "//*[@id=\"u_1_g\"]") //mobile number in sign up form
	WebElement MobNumber;

	@FindBy(xpath = "//*[@id=\"password_step_input\"]") //password in sign up form
	WebElement newPassword;

	/*
	 * in below function i passed name , surname , mob and password to function to sign up
	 */
	public void Register(String NAME, String SUR, String Mob, String Password) throws Exception {
		driver.navigate().to("https://www.facebook.com/");
		CreateNewAccountButton.click();
		WebDriverWait waiting = new WebDriverWait(driver, 5);
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password_step_input\"]")));
		FirstName.sendKeys(NAME);
		SurName.sendKeys(SUR);
		MobNumber.sendKeys(Mob);
		newPassword.sendKeys(Password);
		Select YesrList = new Select(driver.findElement(By.id("year"))); //birthday year
		YesrList.selectByVisibleText("1990");
		Select MonthList = new Select(driver.findElement(By.id("month"))); //month birthday
		MonthList.selectByVisibleText("Feb");
		Select DayList = new Select(driver.findElement(By.id("day"))); //day birthday
		DayList.selectByVisibleText("9");

		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();// for female

		waiting.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[contains(text(),'Sign Up')]"))));
		WebElement SignUp = driver.findElement(By.xpath("//*[contains(text(),'Sign Up')]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(SignUp).click().perform();
	}
}
