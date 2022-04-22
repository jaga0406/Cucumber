package stepdefinitions;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utilities.WrapperClass;

public class DataTableWithHeader extends WrapperClass {

	@Given("user want to login in login page")
	public void user_want_to_login_in_login_page() {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("the user enters valid data")
	public void the_user_enters_valid_data(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> keyvaluepair = dataTable.asMaps(String.class, String.class);
		 String username = keyvaluepair.get(0).get("UserName");
		 String password = keyvaluepair.get(0).get("PassWord");
		
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}

	@And("presses the login button")
	public void presses_the_login_button() {
		 driver.findElement(By.id("btnLogin")).click();
	}


}
