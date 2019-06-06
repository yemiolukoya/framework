package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.carsguide.com.au.CarsGuide.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewAndUsedCarPage;
import pages.SearchPage;

public class SearchStep extends BaseClass {

	WebDriver driver = getDriver();
	private SearchPage sp;
	private NewAndUsedCarPage np;

	@Given("^user is on car guide website$")
	public void user_is_on_car_guide_website() throws Throwable {
		driver.get("https://www.carsguide.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sp = new SearchPage(driver);
		np = new NewAndUsedCarPage(driver);
	}

	@When("^user hover over buy \\+ sell menu$")
	public void user_hover_over_buy_sell_menu() throws Throwable {
		sp.mouseOverBuyAndSellLink();

	}

	@When("^click on search cars$")
	public void click_on_search_cars() throws Throwable {
		sp.clickSearchCarLink();
	}

	@When("^select car make$")
	public void select_car_make() throws Throwable {
		np.selectMakesDropDown();

	}

	@When("^select car model$")
	public void select_car_model() throws Throwable {
		np.selectModelsDropDown();

	}

	@When("^select car location$")
	public void select_car_location() throws Throwable {
		np.selectLocationsDropDown();

	}

	@When("^select car price$")
	public void select_car_price() throws Throwable {
		np.selectPriceToDropDown();
	}

	@When("^click find my car$")
	public void click_find_my_car() throws Throwable {
		np.clickSubmitBurton();
	}

	@Then("^Car result should be displayed$")
	public void car_result_should_be_displayed() throws Throwable {
		WebElement Result = driver.findElement(By.xpath("//*[@id=\"all-tab-content\"]/div[1]/div[3]/h1"));
		Result.isDisplayed();


	}

	@Then("^the page title should be Audi A(\\d+) for Sale NSW | carsguide$")
	public void the_page_title_should_be_Audi_A_for_Sale_NSW_carsguide(int arg1) throws Throwable {
	   String ExpecteTitle = "Audi A3 for Sale NSW | carsguide";
	   String ActualTitle = driver.getTitle();
	   
	   Assert.assertEquals(ActualTitle, ExpecteTitle);
	}

}
