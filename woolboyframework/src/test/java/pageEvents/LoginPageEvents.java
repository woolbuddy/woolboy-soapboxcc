package pageEvents;

import org.junit.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

		public void verifyLoginPageOpens() {
			
			ElementFetch elementFetch = new ElementFetch();
			Assert.assertTrue("Login page did not open", elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0);
		}
		
		public void enterEmailId() {
			ElementFetch elementFetch = new ElementFetch();
			elementFetch.getWebElement("ID",LoginPageElements.emailAddress).sendKeys("test@gmail.com");
		}
}
