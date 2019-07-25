package PagesPOM;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Util.TestBase;

public class WalletReviewpage extends TestBase {

	public static Actions ac = new Actions(driver);

	// XPATH TO POST REVIEW

	@FindBy(css = ".review-action > review-star:nth-child(2) > div:nth-child(1) > "
			+ "svg:nth-child(4) > g:nth-child(1) > path:nth-child(1)")

	static WebElement fourthstar;

	@FindBy(css = ".review-action > review-star:nth-child(2) > "
			+ "div:nth-child(1) > svg:nth-child(5) > g:nth-child(1) > path:nth-child(1)")
	static WebElement fifthstar;

	// -----------
	@FindBy(xpath = "//*[@id=\"scroller\"]/main/div[1]/nav/div[2]/button[1]")
	public static WebElement writereview;

	// Initializing the driver object

	public WalletReviewpage() {
		PageFactory.initElements(driver, this);
	}

	public static String clickonstars() throws Throwable {

		WebElement fourthstar = driver.findElement(By.cssSelector(".review-action > review-star:nth-child(2) >"
				+ " div:nth-child(1) > svg:nth-child(4) > g:nth-child(1) > path:nth-child(1)"));

		WebElement firfthstar = driver.findElement(By.cssSelector(".review-action > review-star:nth-child(2) > "
				+ "div:nth-child(1) > svg:nth-child(5) > g:nth-child(1) > path:nth-child(1)"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", fourthstar);

		try {

			ac.moveToElement(fourthstar).click().perform();
			Thread.sleep(4000);

			WebElement back = driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/modal-dialog/div/div/"
					+ "write-review/sub-navigation/div/div[1]/span"));
			back.click();
			js.executeScript("arguments[0].scrollIntoView(true);", firfthstar);
			Thread.sleep(4000);
			ac.moveToElement(firfthstar).click().perform();
			Thread.sleep(4000);
			WebElement back2 = driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/modal-dialog/div/div/"
					+ "write-review/sub-navigation/div/div[1]/span"));
			back2.click();

			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		}

		try {

			Thread.sleep(4000);

			WebElement writereview = driver
					.findElement(By.xpath("//*[@id=\"scroller\"]" + "/main/div[1]/nav/div[2]/button[1]"));

			writereview.click();

			Thread.sleep(4000);
			WebElement insufifthstar = driver.findElement(By.cssSelector("#reviews-section > modal-dialog >"
					+ " div > div > write-review > review-star > div > svg:nth-child(5) > g > path:nth-child(1)"));

			ac.moveToElement(insufifthstar).click().perform();

			WebElement drp = driver.findElement(By.cssSelector(".wrev-drp > div:nth-child(1) > span:nth-child(1)"));

			drp.click();

			WebElement health = driver
					.findElement(By.xpath("/html/body/web-app/div/div[1]/main/div[2]/div/div[3]/section/"
							+ "modal-dialog/div/div/write-review/div/ng-dropdown/div/ul/li[2]"));

			ac.moveToElement(health).click().perform();

			WebElement textaread = driver.findElement(By
					.xpath("//*[@id=\"reviews-section\"]/" + "modal-dialog/div/div/write-review/div/div[1]/textarea"));

			textaread.sendKeys(
					"This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!"
							+ "This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!"
							+ "This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!"
							+ "This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!");

			WebElement submitreview = driver.findElement(By.xpath(
					"//*[@id=\"reviews-section\"]/modal-dialog/div/" + "div/write-review/sub-navigation/div/div[2]"));
			submitreview.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		}
		System.out.println("Poceed to next no issues");
		Thread.sleep(5000);

		return driver.getTitle();

	}
}
