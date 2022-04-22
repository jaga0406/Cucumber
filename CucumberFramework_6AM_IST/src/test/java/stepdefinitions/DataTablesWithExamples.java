package stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.WrapperClass;

public class DataTablesWithExamples extends WrapperClass {

	@Given("user wants to login in login page")
	public void user_wants_to_login_in_login_page() {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) {
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}


	@And("pressed the login button")
	public void pressed_the_login_button() {
		  driver.findElement(By.id("btnLogin")).click();
	}



}
