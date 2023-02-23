package sfarm.bdd.objects;

import static sfarm.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AutoQuotePage {
	
	public AutoQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	//public void verifyAboutYouPageTitle(String expectedTitle) {
	//	validate(autoAboutYouPageTitle, expectedTitle);
	//}


	public void validateHomePageTitle(String expectedTitle){
		validate(addressPagetittle, expectedTitle);

	}

	public void insertFirstName(String firstName) {
		insert(firstNameInput, firstName);
	}

	public void insertlasttName(String lastName) {
		insert(lastNameInput, lastName);
	}
	
	public void insertAddress(String address) throws InterruptedException {
		insert(addressInput, address);
		Thread.sleep(3000);
	}
	
	public void insertAptNumber(String apt) throws InterruptedException {
		insert(aptNumberInput, apt);
		Thread.sleep(3000);
	}
	
	public void insertDOB(String dob) throws InterruptedException {
		insert(dateOfBirthInput, dob);
		Thread.sleep(3000);
	}
	
	public void clickCheckBox() throws InterruptedException {
		click(checkBox);
		Thread.sleep(3000);
	}
	
	public void clicknextVehiclesBtn() throws InterruptedException {
		click(nextVehiclesBtn);
		Thread.sleep(3000);
	}

}
