package cucumbertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue={"stepdefinition"},
		tags = {"@Smoketest,@Regression"},plugin = { "pretty", "html:target/cucumber-reports" })

public class Runnerclass {

}
