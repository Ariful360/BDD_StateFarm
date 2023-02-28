package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonActions;

public class AddressPage {

	CommonActions ca;

	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		ca = new CommonActions(driver);
	}

	@FindBy(xpath = "//p[text()='Create an affordable price, just for you']")
	WebElement homePageTitle;
	@FindBy(xpath = "//input[@class='-oneX-textfield__input']")
	WebElement zipCodeFld;
	@FindBy(name = "productName")
	WebElement dropdun;
	@FindBy(id = "quote-main-zip-btn")
	WebElement startAQuote;
	@FindBy(id = "nyLegacyCloseLinkId")
	WebElement continueBtn;

	public void validateHomePageTitle(String expectedTitle) {
		ca.validate(homePageTitle, expectedTitle);

	}

	public void zipCode(String zipCode) {
		ca.insert(zipCodeFld, zipCode);
	}

	public void clickStartAQuote() {
		startAQuote.click();
	}

	public void dropdn(String value) {
		ca.click(dropdun);
		ca.select(dropdun, value);
	}

	public void clickContinueBtn() {
		continueBtn.click();
	}
}
