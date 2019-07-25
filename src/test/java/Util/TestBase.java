package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fl = new FileInputStream(
					"C:\\Users\\Shyam\\eclipse-workspace\\WalletHubTwo\\Resources\\Config.properties");
			prop.load(fl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Browser\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (BrowserName.equals("firefox"))

		{
			/*
			 * WebDriver driver; String baseUrl , nodeUrl; baseUrl =
			 * "https://www.facebook.com"; nodeUrl = "http://192.168.10.21:5568/wd/hub";
			 * 
			 * DesiredCapabilities capability = DesiredCapabilities.firefox();
			 * capability.setBrowserName("firefox");
			 * capability.setPlatform(Platform.WIN8_1);
			 */

			// driver = new RemoteWebDriver(new URL(nodeUrl),capability);
			System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\Browser\\geckodriver.exe");
			driver = new FirefoxDriver();

		} //

		else if (BrowserName.equals("ie")) {

			System.setProperty("webdriver.ie.driver", "C:\\Softwares\\Browser\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITYLY_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
