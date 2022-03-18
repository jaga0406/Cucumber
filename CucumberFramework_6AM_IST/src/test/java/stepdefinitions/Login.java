package stepdefinitions;

import java.time.Duration;



import org.openqa.selenium.By;





import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.WrapperClass;


public class Login extends WrapperClass {
	


	@Given("Open FB URL")
	public void open_fb_url() {
		driver.get("https://en-gb.facebook.com/");
		System.out.println("Successfully Open the FB URL");
	}

	@When("User enter invalid credentials")
	public void user_enter_invalid_credentials() {
		// Type UN & PWD
		driver.findElement(By.name("email")).sendKeys("jagannaths737@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asfaskjfaskf");
	}

	@And("Click on Login button")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.name("login")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}

	@Then("Application should display the validation Message")
	public void application_should_display_the_validation_message() {
		// validate the Error page text
	    String wpwd = driver.findElement(By.xpath("//*[contains(text(), 'The password')]")).getText();
	       System.out.println(wpwd);
	       if (wpwd.contains("The password that you've entered is" )) {
			System.out.println("Error has occured, Type the crt password");
		} else {
			System.out.println("The password is correct");
		}
	      
	    } 
	
	
	
	
	}     
	



