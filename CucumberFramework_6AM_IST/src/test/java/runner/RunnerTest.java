package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features",
		glue = {"com.lao.step_definitions"},
		dryRun = true,
		monochrome = true,
        plugin = {"rerun:target/failed_scenarios.txt", "html:target/cucumber-reports/report.html"}
		)


public class RunnerTest {

}
