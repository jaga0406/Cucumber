package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGround_Steps {
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		System.out.println("I am at the LogIn Page");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		System.out.println("I Submit my Username and Password");
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("I am logged on to the website");
	}

	@Given("User search for Lenovo Laptop")
	public void user_search_for_lenovo_laptop() {
		System.out.println("User searched for Lenovo Laptop");
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
		System.out.println("First search result added to bag");
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
		System.out.println("Bag is now contains the added product");
	}

	@Given("User navigate for Lenovo Laptop")
	public void user_navigate_for_lenovo_laptop() {
		System.out.println("User navigated for Lenovo Laptop");
	}

	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
		System.out.println("Laptop added to the basket");
	}

}
