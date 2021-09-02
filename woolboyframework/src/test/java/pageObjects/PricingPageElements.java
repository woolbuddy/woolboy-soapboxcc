package pageObjects;

public interface PricingPageElements {
	
	String pricingText = "//div[contains(text(),'custom pricing')]";

//	Quote Request Form Fields:
	
	String quoteRequestFirstName = "first-name";
	
	String quoteRequestLastName = "last-name";
	
	String companyName = "company";
	
	String quoteRequestEmail = "user-email";
	
	String quoteRequestMobile = "phone-number";

// Get a Quote button:
	
	String getQuoteButton = "//input[@value='Get a Quote']";
}
