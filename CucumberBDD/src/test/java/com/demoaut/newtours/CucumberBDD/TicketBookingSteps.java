package com.demoaut.newtours.CucumberBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TicketBookingSteps {
	
	 WebDriver driver;
	 Login lp;
	
	
	@Given("^the user login into application successfully$")
	public void the_user_login_into_application_successfully() throws Throwable {
	    driver = new ChromeDriver();
	    lp = new Login(driver);
	    lp.applicationLogin("mercury", "mercury");
	}

	@Given("^he selected the flight details on the flight finder page$")
	public void he_selected_the_flight_details_on_the_flight_finder_page() throws Throwable {
	    
	}

	@Given("^he select the departure and return flight on select flight page$")
	public void he_select_the_departure_and_return_flight_on_select_flight_page() throws Throwable {
	    
	}

	@Given("^he enter all the mandatory details on book a flight page$")
	public void he_enter_all_the_mandatory_details_on_book_a_flight_page() throws Throwable {
	    
	}

	@Then("^he must get a successful message at the end$")
	public void he_must_get_a_successful_message_at_the_end() throws Throwable {
	    
	}

}
