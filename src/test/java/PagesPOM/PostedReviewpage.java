package PagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class PostedReviewpage extends TestBase {

	// XPATH TO VERYFY POSTED REVIEWS

	@FindBy(xpath = "//*[@id=\"join-light\"]/form/div/nav/ul/li[2]/a")
	public static WebElement signin;

	@FindBy(xpath = "//*[@id=\"join-light\"]/form/div/div[1]/input")
	public static WebElement email;

	@FindBy(xpath = "//*[@id=\"join-light\"]/form/div/div[2]/input")
	public static WebElement pwd;

	@FindBy(xpath = "//*[@id=\"join-light\"]/form/div/div[3]/button/span/span")
	public static WebElement loginclk;

	public PostedReviewpage() {
		PageFactory.initElements(driver, this);
	}

	public static String validatepostedreview(String emailid, String password) throws Throwable {

		signin.click();
		email.sendKeys(emailid);
		pwd.sendKeys(password);
		loginclk.click();

		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		WebElement yrrv = driver.findElement(By.xpath("/html/body/web-app/div/div[1]/main/div[2]/div/div[3]/"
				+ "section/section/article[1]/div[2]/div[2]/span[1]"));

		String stryourrevieq = yrrv.getText();

		if (stryourrevieq.contains("Your")) {
			System.out.println("Review Posted successfully");
		}

		WebElement postedrv = driver.findElement(
				By.xpath("/html/body/web-app/div/div[1]/main/div[2]/div/div[3]/section/section/article[1]/div[4]"));

		String postedreviewtext = postedrv.getText();

		return postedreviewtext;

	}

}
