package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
public class AutoQuotePage {
	
	CommonActions ca;
	public AutoQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		ca = new CommonActions(driver);
	}
	
	@FindBy(css = "h1.-oneX-heading--h1.-oneX-font--bold.margin0")
	WebElement addressPagetittle;
	@FindBy(name = "firstName")
	WebElement firstNameInput;
	@FindBy(name = "lastName")
	WebElement lastNameInput;
	@FindBy(name = "welcomeAddress.street1")
	WebElement addressInput;
	@FindBy(name = "welcomeAddress.street2")
	WebElement aptNumberInput;
	@FindBy(name = "dateOfBirth")
	WebElement dateOfBirthInput;
	@FindBy(xpath = "//label[@for='termsIDCheckbox']")
	WebElement checkBox;
	@FindBy(name = "nextVehicles")
	WebElement nextVehiclesBtn;


	public void validateHomePageTitle(String expectedTitle){
		ca.validate(addressPagetittle, expectedTitle);

	}

	public void insertFirstName(String firstName) {
		ca.insert(firstNameInput, firstName);
	}

	public void insertlasttName(String lastName) {
		ca.insert(lastNameInput, lastName);
	}
	
	public void insertAddress(String address) {
		ca.insert(addressInput, address);
	}
	
	public void insertAptNumber(String apt) {
		ca.insert(aptNumberInput, apt);
	}
	
	public void insertDOB(String dob) {
		ca.insert(dateOfBirthInput, dob);
	}
	
	public void clickCheckBox() {
		ca.click(checkBox);
	}
	
	public void clicknextVehiclesBtn() {
		ca.click(nextVehiclesBtn);
	}

}
