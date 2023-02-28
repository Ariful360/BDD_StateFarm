package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class LandingPage {

	CommonActions ca;
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		ca = new CommonActions(driver);
	}

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement loginBtn;
	@FindBy(name = "IDToken1")
	WebElement userId;
	@FindBy(name = "IDToken2")
	WebElement password;
	@FindBy(xpath = "//label[contains(text(),'Remember my')]")
	WebElement rememberMeBox;
	@FindBy(css = "button.-oneX-util-login-button.-oneX-btn-primary.-oneX-btn-fit-content")
	WebElement loginBtn02;
	
	public void clickLoginBtn() {
		ca.click(loginBtn);
	}

	public void insertUserId(String userID) {
		ca.insert(userId, userID);
	}
	public void insertPassword(String passWord)  {
		ca.insert(password, passWord);
	}
	public void clickRememberMeBox() {
		ca.click(rememberMeBox);
	}
	public void clickLoginBtn02() {
		ca.click(loginBtn02);
		
	}

}
