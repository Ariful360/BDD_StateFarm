package sfarm.bdd.objects;

import static sfarm.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	public void clickLoginBtn() throws InterruptedException {
		click(loginBtn);
		Thread.sleep(3000);
	}

	public void insertUserId(String userID) throws InterruptedException {
		insert(userId, userID);
		Thread.sleep(3000);
	}
	public void insertPassword(String passWord) throws InterruptedException {
		insert(password, passWord);
		Thread.sleep(3000);
	}
	public void clickRememberMeBox() throws InterruptedException {
		click(rememberMeBox);
		Thread.sleep(3000);
	}
	public void clickLoginBtn02() throws InterruptedException {
		click(loginBtn02);
		Thread.sleep(3000);
		
	}

}
