package travelRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ConfirmationPage extends PageBase {

	public ConfirmationPage(ChromeDriver driver) {
		super(driver);
	}
	
	    /*  find elements and After successful registration, verify that the user can login*/
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/h3")
	private WebElement SuccessNotification1;
	
	@FindBy(tagName =  "h4")
	private WebElement SuccessNotification2;
	
	public void assertFirstSuccessNotification() {
		Assert.assertTrue(SuccessNotification1.getText().contains("Hi,"));
	}
	
	public void assertSecondSuccessNotification() {
		Assert.assertTrue(SuccessNotification2.getText().contains("Yet"));
	}
	
}
