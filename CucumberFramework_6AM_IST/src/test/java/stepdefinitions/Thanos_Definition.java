package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Thanos_Definition {
	@Given("Thanos has the infinity stones")
	public void thanos_has_the_infinity_stones() {
	 System.out.println("Thanos has the infinity stones");
	}

	@When("Thanos snaps his finger")
	public void thanos_snaps_his_finger() {
     System.out.println("Thanos snaps his finger");
	}

	@And("half of the living things died")
	public void half_of_the_living_things_died() {
		System.out.println("half of the living things died");
	}
}
