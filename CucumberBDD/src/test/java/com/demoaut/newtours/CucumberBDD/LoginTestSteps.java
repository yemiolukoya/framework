package com.demoaut.newtours.CucumberBDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {
	WebDriver driver;
	
	@Before
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");	
	driver = new ChromeDriver();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	
	@Given("^the user is on login page$")
	public void the_user_is_on_login_page() throws Throwable {
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.newtours.demoaut.com/");
	}

	@When("^I enter a valid username$")
	public void i_enter_a_valid_username() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("mercury");

	}

	@When("^a valid password$")
	public void a_valid_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("mercury");

	}
	
	@When("^he clicks on the submit button$")
	public void he_clicks_on_the_submit_button() throws Throwable {
	    driver.findElement(By.name("login")).click();
	}


	@Then("^he must be able to see the SIGN-OFF option$")
	public void he_must_be_able_to_see_the_SIGN_OFF_option() throws Throwable {
         boolean signOffvisible = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
         Assert.assertTrue(signOffvisible);
	}
	
	@When("^the user enters his valid \"([^\"]*)\"$")
	public void the_user_enters_his_valid(String arg1) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^the user enters invalid \"([^\"]*)\"$")
	public void the_user_enters_invalid(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	    
	}

	@Then("^the user must see the SIGN-ON option$")
	public void the_user_must_see_the_SIGN_ON_option() throws Throwable {
		boolean signOnVisible = driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
		Assert.assertTrue(signOnVisible);
		 
	   
	}




}
