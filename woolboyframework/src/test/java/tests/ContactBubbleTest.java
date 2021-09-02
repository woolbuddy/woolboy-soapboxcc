package tests;

import org.testng.annotations.Test;

import pageEvents.ContactBubbleEvents;
import pageEvents.HomePageEvents;

public class ContactBubbleTest extends BaseTest {
	
	@Test
	public void completeContactBubbleForm() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.switchFrame();
		homePageEvents.closeContactBubblePrompt();
		homePageEvents.clickContactBubble();
		
		ContactBubbleEvents contactBubbleEvents = new ContactBubbleEvents();
		contactBubbleEvents.verifyContactBubbleIsDisplayed();
		contactBubbleEvents.fillOutContactForm();
		contactBubbleEvents.sendButtonIsValid();
		contactBubbleEvents.closeContactBubble();
	}
}
