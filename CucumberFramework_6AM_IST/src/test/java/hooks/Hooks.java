package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WrapperClass;

public class Hooks extends WrapperClass {

	@Before
    public void beforeScenario(){
		System.out.println("This will run before the Scenario");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        
    }	
	
	@After
    public void afterScenario() throws InterruptedException{
		System.out.println("This will run after the Scenario");
        driver.quit();
        
    }
	
	
	
//	@After
//    public void afterScenario(){
//        System.out.println("This will run after the every Scenario");
//    }		
//	@Before
//    public void beforeScenario(){
//        System.out.println("This will run before the every Scenario");
//    }	
//
//	@Before("@Second")
//    public void beforeSecond(){
//        System.out.println("This will run only before the Second Scenario");
//    }		
//	@Before("@First,@Third")
//    public void beforeFirstAndThird(){
//        System.out.println("This will run before both First & Third Scenario");
//    }
//
//	@After("@First")
//    public void afterFirst(){
//        System.out.println("This will run only after the First Scenario");   
//    }		
//	@After("@Second")
//    public void afterSecond(){
//        System.out.println("This will run only after the Second Scenario");   
//    }		
//	@After("@Third")
//    public void afterThird(){
//        System.out.println("This will run only after the Third Scenario");   
//    }	

	
	
//	@Before(order=1)
//    public void beforeScenario(){
//        System.out.println("This will run before the every Scenario");
//    }	
//	@Before(order=0)
//    public void beforeScenarioStart(){
//        System.out.println("-----------------Start of Scenario-----------------");
//    }	
//	
//	
//	@After(order=0)
//    public void afterScenarioFinish(){
//        System.out.println("-----------------End of Scenario-----------------");
//    }	
//	@After(order=1)
//    public void afterScenario(){
//        System.out.println("This will run after the every Scenario");
//    }	
}


