package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WrapperClass;

public class OpenGoogle extends WrapperClass{
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    driver.get("http://www.google.co.in");
	}

	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String searchterm) {
        driver.findElement(By.name("q")).sendKeys("Agniprasath");
	}
	@And("enters the return key")
	public void enters_the_return_key() {
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN); 
	}

	@Then("user should see the search results")
	public void user_should_see_the_search_results() {
  boolean status = driver.findElement(By.partialLinkText("Agnipra")).isDisplayed();
     if (status==true) {
    	 System.out.println("search results is displayed");
 } else {
	   System.out.println("some error has occured");
 }
	}
}
