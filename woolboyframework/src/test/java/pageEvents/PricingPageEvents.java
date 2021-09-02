package pageEvents;

import org.junit.Assert;

import pageObjects.PricingPageElements;
import utils.ElementFetch;

public class PricingPageEvents {

		public void verifyPricingPageOpens() {
			
			ElementFetch elementFetch = new ElementFetch();
			Assert.assertTrue("Pricing page did not open", elementFetch.getListWebElements("XPATH", PricingPageElements.pricingText).size()>0);
		}
		
		public void fillOutRequestForm() {
			
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("ID", PricingPageElements.quoteRequestFirstName).sendKeys("Zach");
			elementFetch.getWebElement("ID", PricingPageElements.quoteRequestLastName).sendKeys("Test");
			elementFetch.getWebElement("ID", PricingPageElements.companyName).sendKeys("Soapbox.io");
			elementFetch.getWebElement("ID", PricingPageElements.quoteRequestEmail).sendKeys("test@gmail.com");
			elementFetch.getWebElement("ID", PricingPageElements.quoteRequestMobile).sendKeys("5555555555");
		}
		
		public void getQuoteButtonIsEnabled() {
			
			ElementFetch elementFetch = new ElementFetch();
			Assert.assertTrue("Get a Quote button is disabled", elementFetch.getWebElement("XPATH", PricingPageElements.pricingText).isEnabled());
		}
}
