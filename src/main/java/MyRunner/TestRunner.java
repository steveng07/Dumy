package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
 	@CucumberOptions(features = "src\\main\\java\\Features\\patientCreation.feature", //the path of the feature files
	glue={"stepDefinitions"})

	public class TestRunner {
	 
	}

