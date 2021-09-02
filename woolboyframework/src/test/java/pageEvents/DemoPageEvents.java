package pageEvents;

import org.junit.Assert;

import pageObjects.DemoPageElements;
import utils.ElementFetch;

public class DemoPageEvents {
	
		public void verifyDemoPageOpens() {
			
			ElementFetch elementFetch = new ElementFetch();
			Assert.assertTrue("Demo page did not open", elementFetch.getListWebElements("XPATH", DemoPageElements.demoText).size()>0);
		}
		
		public void enterDemoEmailAddress() {
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("ID", DemoPageElements.demoEmailAddress).sendKeys("test@gmail.com");
		}
		
		public void clickWatchDemo() {
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("XPATH",DemoPageElements.watchDemoButton).click();
		}
		
		public void completeDemoForm() {
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("ID", DemoPageElements.demoFirstName).sendKeys("Zach");
			elementFetch.getWebElement("ID", DemoPageElements.demoLastName).sendKeys("Test");
			elementFetch.getWebElement("ID", DemoPageElements.demoCompanyName).sendKeys("Soapbox.io");
			elementFetch.getWebElement("ID", DemoPageElements.demoMobile).sendKeys("5555555555");
		}
}