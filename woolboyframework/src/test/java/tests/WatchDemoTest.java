package tests;

import org.testng.annotations.Test;

import pageEvents.DemoPageEvents;
import pageEvents.HomePageEvents;

public class WatchDemoTest extends BaseTest {
	
	@Test
	public void completeDemoContactForm() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.clickWatchDemoLink();
		
		DemoPageEvents demoPageEvents = new DemoPageEvents();
		demoPageEvents.verifyDemoPageOpens();
		demoPageEvents.enterDemoEmailAddress();
		demoPageEvents.clickWatchDemo();
		demoPageEvents.completeDemoForm();
	}

}
