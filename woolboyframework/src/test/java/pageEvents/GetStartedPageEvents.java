package pageEvents;

import org.junit.Assert;

import pageObjects.GetStartedPageElements;
import utils.ElementFetch;

public class GetStartedPageEvents {
	
	public void verifyGetStartedPageOpens() {
		
		ElementFetch elementFetch = new ElementFetch();
		Assert.assertTrue("Get Started page did not open", elementFetch.getListWebElements("XPATH", GetStartedPageElements.freeEditionText).size()>0);
	}
	
	public void fillOutForm() {
		
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", GetStartedPageElements.firstName).sendKeys("Zach");
		elementFetch.getWebElement("XPATH", GetStartedPageElements.lastName).sendKeys("Test");
		elementFetch.getWebElement("XPATH", GetStartedPageElements.email).sendKeys("test@gmail.com");
		elementFetch.getWebElement("XPATH", GetStartedPageElements.busName).sendKeys("Soapbox.io");
		elementFetch.getWebElement("XPATH", GetStartedPageElements.mobileNum).sendKeys("5555555555");
		elementFetch.getWebElement("ID", GetStartedPageElements.password).sendKeys("password1");
	}
	
	public void getStartedButtonIsDisplayed( ) {
		
		ElementFetch elementFetch = new ElementFetch();
		Assert.assertTrue("Get Started button is not displayed", elementFetch.getWebElement("XPATH",GetStartedPageElements.getStartedButton).isDisplayed());
	}

}
