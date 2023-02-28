package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoQuoteSteps extends BaseClass {

	@When("click start a quote")
	public void click_start_a_quote() {
		addressPage.clickStartAQuote();
	}
	
	@Then("click continue01 button")
	public void click_continue01_button() {
		addressPage.clickContinueBtn();
	}

	@When("insert first name {string}")
	public void insert_first_name(String firstName) {
		autoQuotePage.insertFirstName(firstName);
	}

	@Then("insert last name {string}")
	public void insert_last_name(String lastName) {
		autoQuotePage.insertlasttName(lastName);
	}

}