package pageEvents;

import org.junit.Assert;

import pageObjects.ContactBubbleElements;
import utils.ElementFetch;

public class ContactBubbleEvents {

		public void verifyContactBubbleIsDisplayed() {
			
			ElementFetch elementFetch = new ElementFetch();
			Assert.assertTrue("Contact Bubble form is not displayed", elementFetch.getWebElement("XPATH",ContactBubbleElements.contactHeader).isDisplayed());
		}
		
		public void fillOutContactForm() {
			
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("XPATH", ContactBubbleElements.contactName).sendKeys("Zach");
			elementFetch.getWebElement("XPATH", ContactBubbleElements.contactMobile).sendKeys("5555555555");
			elementFetch.getWebElement("XPATH", ContactBubbleElements.contactMessage).sendKeys("This is a test!");
			
		}
		
		public void sendButtonIsValid() {
			
			ElementFetch elementFetch = new ElementFetch();
			Assert.assertTrue("Contact Bubble form is not complete", elementFetch.getWebElement("XPATH",ContactBubbleElements.sendButton).isDisplayed());
		}
		
		public void closeContactBubble() {
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("XPATH", ContactBubbleElements.closeButton).click();
			Assert.assertFalse("Contact Bubble form did not close", elementFetch.getWebElement("XPATH",ContactBubbleElements.contactHeader).isDisplayed());
		
		}
}
