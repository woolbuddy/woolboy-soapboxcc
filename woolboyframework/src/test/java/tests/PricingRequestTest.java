package tests;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;
import pageEvents.PricingPageEvents;

public class PricingRequestTest extends BaseTest {

	@Test
	public void completeRequestForPricing() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.pricingPageLink();
		
		PricingPageEvents pricingPageEvents = new PricingPageEvents();
		pricingPageEvents.verifyPricingPageOpens();
		pricingPageEvents.fillOutRequestForm();
		pricingPageEvents.getQuoteButtonIsEnabled();
	}

}