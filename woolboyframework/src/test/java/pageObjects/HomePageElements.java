package pageObjects;

public interface HomePageElements {

	String loginLink = "//a[contains(@href,'app.podium.com')]";
	
//	Menu Items on Home Page:
	String productsMenuItem = "//span[contains(text(),'Products')]";
	String pricingMenuItem = "//a[@href='/pricing/']";
	String watchDemoLink = "//a[@href='/demo']";
	
//	Products Sub Menu Items:
	String getStarted = "//a[contains(@href,'get-started')]";
	
//	Contact Bubble:
	String contactBubble = "//button[@aria-label='Chat widget open']";
	
	String closeTextBubble = "//button[@class='Prompt__CloseButton']";
	
}