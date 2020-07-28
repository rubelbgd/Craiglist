package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class baseClass {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties or;
	public static Properties config;
	public static String projectPath;

	// Naviga Browser
	@BeforeSuite
	public static void webDriverInstantiation() throws IOException {
		projectPath = System.getProperty("user.dir");
		fis = new FileInputStream(projectPath + "\\src\\test\\resources\\properties\\OR.properties");
		or = new Properties();// or = object repository
		or.load(fis);

		fis = new FileInputStream(projectPath + "\\src\\test\\resources\\properties\\config.properties");
		config = new Properties();
		config.load(fis);

		if (config.getProperty("BROWSER").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					projectPath + "\\src\\test\\resources\\executable\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		// else if(config.getProperty("BROWSER").equals("firefox"));
		// System.getProperty("webdriver.gekho.driver","C:\\Java\\eclipse-workspace\\Craigslist");
		// driver = new FirefoxDriver();
	}

	// login
	@BeforeClass
	public static void login() {
		driver.get(config.getProperty("BASE_URL"));
		elementClick(By.xpath(or.getProperty("LOGIN_LINK")));
		elementSendKeys(By.xpath(or.getProperty("USER_ID_XPATH")), or.getProperty("USER_ID"));
		elementSendKeys(By.xpath(or.getProperty("PASS_XPATH")), or.getProperty("PASSWORD"));
		elementClick(By.xpath(or.getProperty("LOGIN_BTN")));
	}

	public static void elementClick(By locator) {
		driver.findElement(locator).click();
	}

	public static void elementSendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static boolean isClickable(By locator) {
		try {
			WebElement el = driver.findElement(locator);
			WebDriverWait wait = new WebDriverWait(driver, 9);
			wait.until(ExpectedConditions.elementToBeClickable(el));
			return true;
		} catch (Exception e) {
			return false;
		}
	}// isClickable

	// logOut
	@AfterClass
	public static void logOut() {
		elementClick(By.cssSelector(or.getProperty("LOGOUT_CSS")));
		WebElement plp_tittle = driver.findElement(By.xpath(or.getProperty("PLP_TITTLE")));
		if (plp_tittle.getText().contains(or.getProperty("PLP_TEXT"))) {
		}
	}

	// Close

	public static void broswer_close() {
		driver.close();
	}

}// class
