package runner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\Features\\Thanosfile.feature", 
glue = { "stepdefinitions", "hooks" },
dryRun = false,
monochrome = true


)
//plugin = {"html: report/htmlreport", "json:report/jsonreport.json", "junit: report/xmlreport.xml"},
//tags = "@justScenario or @Scenariooutline"
//tags = "not @Search"
//tags = "@justScenario and @Scenariooutline"

public class TestRunner {

}
