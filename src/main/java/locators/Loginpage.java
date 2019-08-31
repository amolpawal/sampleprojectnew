package locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	
	
	@FindBy(xpath="//a[@id='userAccountLink']")
	public WebElement useracclink;
	
	@FindBy(xpath="//ul[@id='userAccountMenu']//li[@class='clearFix']//li[@class='signInBlock']/input")
	public WebElement signIn;
	
}
