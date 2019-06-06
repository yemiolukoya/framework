package com.demoaut.newtours.CucumberBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(features = "Feature"
                , glue = "com.demoaut.newtours.CucumberBDD"
                //,dryRun = true 
                //--- To check all the StepDefinition has glue code
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
