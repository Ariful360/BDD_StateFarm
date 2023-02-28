package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import reporting.Logs;

public class CommonSteps extends BaseClass {
	
	@Given("This is Login page Test")
	public void this_is_login_page_test() {
	   
	}
	
	@Given("validate home page title")
	public void validate_home_page_title() {
		addressPage.validateHomePageTitle("Create an affordable price, just for you");
	}

	@Given("insert zipcode {string}")
	public void insert_zipcode(String zipcode) {
		addressPage.zipCode(zipcode);
	}


}
