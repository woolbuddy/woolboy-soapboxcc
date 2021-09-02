package pageObjects;

public interface DemoPageElements {
	
	String demoText = "//h3[contains(text(),'Enough about us')]";

//	Demo Contact Form:
	
	String demoEmailAddress = "user-email";
	String demoFirstName = "first-name";
	String demoLastName = "last-name";
	String demoCompanyName = "company-name";
	String demoMobile = "mobile";
	
	String watchDemoButton = "//button[@class='cta-primary']";
}
