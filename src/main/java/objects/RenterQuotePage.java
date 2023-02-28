package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class RenterQuotePage {

	CommonActions ca;

	public RenterQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		ca = new CommonActions(driver);
	}

	@FindBy(className = "-oneX-heading--h3")
	WebElement rentersPagetittle;
	// @FindBy(xpath = "//input[@id='insured-address-city-id']")
	@FindBy(xpath = "//input[@id='insured-address-address_line1-id']")
	WebElement addressInput;
	@FindBy(xpath = "//input[@id='insured-address-address_line2-id']")
	WebElement aptNumberInput;
	@FindBy(name = "dateOfBirth")
	WebElement dateOfBirthInput;
	@FindBy(xpath = "//div[text()='Continue']")
	WebElement continueBtn;

	public void validateRentersPageTitle(String expectedTitle) {
		ca.validate(rentersPagetittle, expectedTitle);

	}

	public void addressInput(String address) {
		ca.click(addressInput);
		ca.insert(addressInput, address);
	}

	public void aptNumberInput(String apt) {
		ca.insert(aptNumberInput, apt);
	}

	public void insertDOB(String dob) {
		ca.insert(dateOfBirthInput, dob);
	}

	public void clickContinueBtn() {
		ca.click(continueBtn);
	}

}
