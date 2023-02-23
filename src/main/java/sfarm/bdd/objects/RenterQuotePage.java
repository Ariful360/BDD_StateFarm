package sfarm.bdd.objects;

import static sfarm.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RenterQuotePage {
	
	public RenterQuotePage(WebDriver driver) {
		PageFactory.initElements (driver, this);
		
	} 
		

	@FindBy(className = "-oneX-heading--h3")
	WebElement rentersPagetittle;
	//@FindBy(xpath = "//input[@id='insured-address-city-id']")
	@FindBy(xpath = "//input[@id='insured-address-address_line1-id']")
	WebElement addressInput;
	@FindBy(xpath = "//input[@id='insured-address-address_line2-id']")
	WebElement aptNumberInput;
	@FindBy(name = "dateOfBirth")
	WebElement dateOfBirthInput;
	@FindBy(xpath = "//div[text()='Continue']")
	WebElement continueBtn;
	
	public void validateRentersPageTitle(String expectedTitle){
		validate(rentersPagetittle, expectedTitle);

	}
	
	public void addressInput(String address) throws InterruptedException {
		click(addressInput);
		insert(addressInput, address);
		Thread.sleep(3000);
	}
	public void aptNumberInput(String apt) throws InterruptedException {
		insert(aptNumberInput, apt);
		Thread.sleep(3000);
	}
	
	public void insertDOB(String dob) throws InterruptedException {
		insert(dateOfBirthInput, dob);
		Thread.sleep(3000);
	}
	public void clickContinueBtn() throws InterruptedException {
		click(continueBtn);
		Thread.sleep(3000);
	}

}
