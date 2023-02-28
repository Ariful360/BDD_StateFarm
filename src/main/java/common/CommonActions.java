package common;

import static utils.IConstant.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import reporting.Logs;
import utils.ReadProperties;

import org.junit.Assert;

public class CommonActions {
	ReadProperties envVar = new ReadProperties();
	public WebDriverWait wait;

	public CommonActions(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(envVar.getNumProperties(EXPLICITLY_WAIT)));
	}

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Logs.log(element + "----> has been clicked");
		} catch (NullPointerException | NoSuchElementException | TimeoutException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}
	}

	public void validate(WebElement element, String expected) {
		String actual = "";
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			actual = element.getText();
			Logs.log("Validating ---> Actual : *** " + actual + " ***. Expected : *** " + expected + " ***");
		} catch (NullPointerException | NoSuchElementException | TimeoutException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}

	public void insert(WebElement element, String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
			Logs.log(value + "<--- This value has been passed into " + element);
		} catch (NullPointerException | NoSuchElementException | TimeoutException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}
	}

	public void select(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
		} catch (NullPointerException | NoSuchElementException | TimeoutException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}

	}

}
