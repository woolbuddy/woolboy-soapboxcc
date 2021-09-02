package tests;

import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class LoginTest extends BaseTest {
	
	@Test
	public void enterEmailOnLogin() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.clickLoginLink();
		
		
		LoginPageEvents loginPageEvents = new LoginPageEvents();
		loginPageEvents.verifyLoginPageOpens();
		loginPageEvents.enterEmailId();
	}

}