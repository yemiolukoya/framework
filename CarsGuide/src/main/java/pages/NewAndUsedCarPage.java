package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAndUsedCarPage {

	//driver
	WebDriver driver;

	@FindBy(id = "makes")
	public WebElement makeDropDown;

	@FindBy(id = "models")
	public WebElement modelsDropDown;

	@FindBy(id = "locations")
	public WebElement locationsDropDown;

	@FindBy(name = "priceTo")
	public WebElement priceToDropDown;

	@FindBy(id = "search-submit")
	public WebElement submitButton;

	public NewAndUsedCarPage(WebDriver driver) {

		this.driver = driver;
		// this.executor = (JavascriptExecutor) this.driver;

		PageFactory.initElements(driver, this);

	}

	public void selectMakesDropDown() {
		Select select = new Select(makeDropDown);
		select.selectByIndex(2);
	}

	public void selectModelsDropDown() {
		Select select = new Select(modelsDropDown);
		select.selectByIndex(2);

	}

	public void selectLocationsDropDown() {
		Select select = new Select(locationsDropDown);
		select.selectByIndex(2);

	}

	public void selectPriceToDropDown() {
		Select select = new Select(priceToDropDown);
		select.selectByIndex(2);
	}

	public void clickSubmitBurton() {
		submitButton.click();
	}
}
