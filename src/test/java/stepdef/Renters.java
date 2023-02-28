package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Renters extends BaseClass{

	@Given("dropdown {string}")
	public void dropdown(String string) {
		addressPage.dropdn("Renters");
	}

	

	@When("click start a quote button")
	public void click_start_a_quote_button() {
		addressPage.clickStartAQuote();
	}

	@When("validate renters page title")
	public void validate_renters_page_title() {
		renterQuotePage.validateRentersPageTitle("Let's start with the address");
	}

	@Then("insert address {string}")
	public void insert_address(String address) {
		renterQuotePage.addressInput(address);
	}

	@Then("insert apt number input {string}")
	public void insert_apt_number_input(String apt) {
		renterQuotePage.aptNumberInput(apt);
	}
	
	@Then("click continue button")
	public void click_continue_button() {
		renterQuotePage.clickContinueBtn();
	}

}
