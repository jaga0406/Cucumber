package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Thanos_Hook {

	@Before(order=0)
	public void beforetoBeforescenario() {
		System.out.println("Thanos has to be born");
	}
	@Before(order=1)
	public void Beforescenario() {
		System.out.println("Thanos collects the infinity stones");
	}
	@After(order=1)
	public void Afterscenario() {
		System.out.println("After killing everyone Thanos is taking rest in garden");
	}
	@After(order=0)
	public void aftertoAfterscenario() {
		System.out.println("Finally Thanos is also dying");
	}
	
}
