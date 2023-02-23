package sfarm.bdd.objects;

import static sfarm.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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

	public void validateHomePageTitle(String expectedTitle){
		validate(homePageTitle, expectedTitle);

	}

	public void zipCode(String zipCode) throws InterruptedException {
		insert(zipCodeFld, zipCode);
		Thread.sleep(2000);
	}

	public void clickStartAQuote() throws InterruptedException {
		startAQuote.click();
		Thread.sleep(2000);
	}

	public void dropdn(String value) throws InterruptedException {
		click(dropdun);
		select(dropdun, value);
	}

	public void clickContinueBtn() throws InterruptedException {
		continueBtn.click();
		Thread.sleep(5000);
	}
}
