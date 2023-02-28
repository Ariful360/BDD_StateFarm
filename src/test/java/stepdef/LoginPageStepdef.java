package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepdef extends BaseClass{
	
	@When("click login button01")
	public void click_login_button01() {
	   landingPage.clickLoginBtn();
	}
	@When("input user id {string}")
	public void input_user_id(String userId) {
	   landingPage.insertUserId(userId);
	}
	@When("input user password {string}")
	public void input_user_password(String password) {
	    landingPage.insertPassword(password);
	}
	@Then("click login button02")
	public void click_login_button02() {
	    landingPage.clickLoginBtn02();
	}

}
