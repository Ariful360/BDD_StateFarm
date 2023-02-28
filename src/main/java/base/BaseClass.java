package base;

import static utils.IConstant.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import common.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.AddressPage;
import objects.AutoQuotePage;
import objects.LandingPage;
import objects.RenterQuotePage;
import utils.ReadProperties;

public class BaseClass{
	public static WebDriver driver;
	ReadProperties envVar = new ReadProperties();
	public static LandingPage landingPage;
	public static AddressPage addressPage;
	public static RenterQuotePage renterQuotePage;
	public static AutoQuotePage autoQuotePage;

	
	public void setUpDriver(String browserName) {
		// String browser = envVar.getProperties(BROWSER);
		String url = envVar.getProperties(URL);
		// driver.get(envVar.getProperties(URL));
		long pageLoadWait = envVar.getNumProperties(PAGELOAD_WAIT);
		long implicitWait = envVar.getNumProperties(IMPLICITLY_WAIT);
		// long explicitWait=envVar.getNumProperty(EXPLICITLY_WAIT);
		initDriver(browserName);
		initClasses(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));

	}

	public void initClasses(WebDriver driver) {
		landingPage = new LandingPage(driver);
		addressPage = new AddressPage(driver);
		autoQuotePage = new AutoQuotePage(driver);
		renterQuotePage = new RenterQuotePage(driver);

	}

	public void initDriver(String driverName) {
		switch (driverName) {

		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

	}

	
	public void tearUp() {
		driver.quit();
	}

}
