package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/a")
	public WebElement buyAndSellLink;
	
	@FindBy(xpath = "//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[1]/a")
	public WebElement searchCarLink;
	
	public SearchPage(WebDriver driver) {

		this.driver = driver;
		//this.executor = (JavascriptExecutor) this.driver;

		PageFactory.initElements(driver, this);

	}
	
	public void mouseOverBuyAndSellLink() {
		Actions actions = new Actions (driver);
		actions.moveToElement(buyAndSellLink).perform();
		
	}
	
	public void clickSearchCarLink() {
		searchCarLink.click();
	}
	
	
}
