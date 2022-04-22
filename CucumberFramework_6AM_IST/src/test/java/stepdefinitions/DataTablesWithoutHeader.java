package stepdefinitions;


import java.util.List;



import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utilities.WrapperClass;



public class DataTablesWithoutHeader extends WrapperClass {
	

	@Given("user is on the login page")
	public void user_is_on_login_page() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	
	@When("the user enters valid credentials")
	public void the_user_enters_the_valid_credentials(DataTable dataTable) {	
	List<String> credentials = dataTable.asList(String.class);
		 String username = credentials.get(0);
		 String password = credentials.get(1);
		
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@And("clicks on the login button")
	public void clicks_on_login_button() {
	  driver.findElement(By.id("btnLogin")).click();
	}
}


