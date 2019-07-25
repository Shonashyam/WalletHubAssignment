package PagesPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.TestBase;

public class Facebookpage extends TestBase {

	@FindBy(name = "email")
	static WebElement username;
	@FindBy(name = "pass")
	static WebElement password;
	@FindBy(id = "u_0_a")
	static WebElement login;

	public Facebookpage() {
		PageFactory.initElements(driver, this);
	}

	public static String titleofthepage() {
		return driver.getTitle();
	}

	public static Boolean display() {

		return username.isDisplayed();
	}

	public static String fblogin(String s1, String s2) throws Throwable {
		username.sendKeys(s1);
		password.sendKeys(s2);
		Thread.sleep(4000);
		login.click();
		String str = s1;

		if (str.contains("User")) {
			driver.close();
		}

		else {
			System.out.println(" ");
		}
		return str;

		// return driver.getTitle();
	}

}
