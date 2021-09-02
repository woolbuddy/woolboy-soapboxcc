package pageObjects;

public interface ContactBubbleElements {
	
//	Contact Bubble Header:
	String contactHeader = "//div[contains(text(),'text you.')]";
	
//	Contact Bubble Form Fields:
	String contactName = "//label[contains(@for,'Name')]";
	
	String contactMobile = "//label[contains(@for,'Mobile Phone')]";
	
	String contactMessage = "//label[contains(@for,'Message')]";

	String sendButton = "//button[@class=\"SendButton SendButton--valid\"]";
	
//	Contact Bubble Close Button:
	String closeButton = "//button[@aria-label=\"Chat widget close\"]";
}