package com.demoaut.newtours.CucumberBDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTitleSteps {
	WebDriver driver;
	String expectedTitle;
	String actualTitle;
	
	@Given("^the user is on the landing page of LinkedIn$")
	public void the_user_is_on_the_landing_page_of_LinkedIn() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uk.linkedin.com/");
	    
	}

	@When("^he compares the actual titile with the expected title$")
	public void he_compares_the_actual_titile_with_the_expected_title() throws Throwable {
	     expectedTitle = "LinkedIn: Log In or Sign Up";
	     actualTitle = driver.getTitle();
	    
	}

	@Then("^the title should match$")
	public void the_title_should_match() throws Throwable {
	   
		if(expectedTitle.equals(actualTitle)) {
	    	System.out.println("Test Case Passed");
	    }
	    else {
	    	System.out.println("Test Cas e Failed");
	    }
		driver.close();
	}


}
