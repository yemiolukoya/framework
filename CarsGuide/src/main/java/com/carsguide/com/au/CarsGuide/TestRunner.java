package com.carsguide.com.au.CarsGuide;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Feature//SearchCar.feature", glue = "steps", monochrome = true // display the console in a proper
																					// readable format

//,dryRun = true
// ,plugin = { "pretty", "html:target/htmlreports" }

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
