package stepdefinitions;



import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WrapperClass;

public class LoginSteps extends WrapperClass {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("the user enters the valid credentials {string} and {string}")
	public void the_user_enters_the_valid_credentials_and(String username, String password) {
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
	 boolean marketplace = driver.findElement(By.id("MP_link")).isDisplayed();
	  Assert.assertTrue(marketplace);
	}
}
