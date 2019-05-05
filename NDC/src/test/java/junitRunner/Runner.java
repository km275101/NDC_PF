package junitRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
	features = ".//src//test//resources//featureFile",
	glue = "defineStep"
	)

public class Runner {

}
