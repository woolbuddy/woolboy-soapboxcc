package tests;

import pageEvents.GetStartedPageEvents;
import pageEvents.HomePageEvents;
import org.testng.annotations.Test;

public class FreeVersionTest extends BaseTest {
	
	@Test
	public void completeFormForFreeVersion() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.productSubMenu();
		homePageEvents.clickGetStarted();
		
		GetStartedPageEvents getStartedEvents = new GetStartedPageEvents();
		getStartedEvents.verifyGetStartedPageOpens();
		getStartedEvents.fillOutForm();
		getStartedEvents.getStartedButtonIsDisplayed();
	}

}
