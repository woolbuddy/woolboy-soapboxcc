package pageEvents;


import pageObjects.HomePageElements;
import tests.BaseTest;
import utils.ElementFetch;

public class HomePageEvents {
	
	public void clickLoginLink() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.loginLink).click();
	}
	
	public void clickWatchDemoLink() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.watchDemoLink).click();
	}
	
	public void productSubMenu() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.productsMenuItem).click();
		elementFetch.getWebElement("XPATH", HomePageElements.productsMenuItem).click();
	}
	
	public void pricingPageLink() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.pricingMenuItem).click();
	}
	
	public void clickGetStarted() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.getStarted).click();
	}
	
	public void closeContactBubblePrompt() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.closeTextBubble).click();
	}
	
	public void clickContactBubble() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("ID", HomePageElements.contactBubble).click();
	}
	
	public void switchFrame() {
		BaseTest.driver.switchTo().frame("podium-bubble");
	}
}
