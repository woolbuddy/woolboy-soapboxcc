package pageObjects;

public interface GetStartedPageElements {
	
	String freeEditionText = "//p[contains(text(),'Podium (Free Edition)')]";
	
//	Getting Started Form Fields:
	
	String firstName = "//input[@id='first-name']";
	
	String lastName = "//input[@id='last-name']";
	
	String email = "//input[@id='Email']";
	
	String busName = "//input[@id='company-search']";
	
	String mobileNum = "//input[@id='mobile']";
	
	String password = "Password";

// Get Started button:
	
	String getStartedButton = "//button[@id='show-me']";

}
