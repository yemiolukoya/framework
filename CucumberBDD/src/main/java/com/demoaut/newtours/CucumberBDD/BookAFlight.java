package com.demoaut.newtours.CucumberBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(2) > td:nth-child(1) > input")
	private WebElement firstName;

	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input")
	private WebElement lastName;

	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(7) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=\"text\"]")
	private WebElement ccNumber;
	
	@FindBy(name = "buyFlights")
	private WebElement submit;
	
	public BookAFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void flightBooking(String fname, String lname, String creditCardNumber) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		ccNumber.sendKeys(creditCardNumber);
		submit.click();
	}

}
