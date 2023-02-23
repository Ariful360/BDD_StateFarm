package sfarm.bdd.common;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import sfarm.bdd.reporting.Logs;

public class CommonActions {

	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + "----> has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}
	}

	public static void validate(WebElement element, String expected) {
		try {
			String actual = element.getText();
			element.click();
			Logs.log("validate ----> Actual : ***" + actual + "***. ecpected : *** " + expected + " ***");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}
	}

	public static void insert(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + "<--- This value has been passed into " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}
	}

	public static void select(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---> Element not found");
			Assert.fail();
		}

	}

}
