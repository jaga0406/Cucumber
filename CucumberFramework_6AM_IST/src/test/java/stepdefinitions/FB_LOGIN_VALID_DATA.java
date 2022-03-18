package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WrapperClass;

public class FB_LOGIN_VALID_DATA extends WrapperClass  {
	
	@When("User enter valid credentials")
	public void user_enter_valid_credentials() {
		// Type UN & PWD
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.name("email")).sendKeys("jagannaths737@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jagan1996");
	}
	
	@Then("Application should not display the validation Message")
	public void application_should_not_display_the_validation_message() {
		if (driver.findElements(By.linkText("Find your account and log in.")).size()>0 || 
				driver.findElements(By.linkText("Forgotten password?")).size()>0) {
			System.out.println("Error msg displayed, credentials are incorrect");	
	}else {
		System.out.println("credentials are crt great, Have a nice day!!!");
	}
	    
	
	}

}
