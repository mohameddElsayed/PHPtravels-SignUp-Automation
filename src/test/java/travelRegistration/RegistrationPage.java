package travelRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends PageBase {
	
	public RegistrationPage(ChromeDriver driver) {
		super(driver);
	}	
	
	             /* Find elements that will need it to work with it */
	@FindBy(name =  "firstname")
	private WebElement txtFirstname;
	
	
	
	@FindBy(name =  "lastname")
	private WebElement txtLastname;
	
	
	@FindBy(css = "#headersignupform > div:nth-child(4) > label > input[type=text]")
    private WebElement txtMobileNumber;
	

	
    @FindBy(name =  "email")
    private WebElement txtEmail;
    

    @FindBy(name =  "password")
    private WebElement txtPassword;
    

    @FindBy(name =  "confirmpassword")
    private WebElement txtConfirmPassword;
    
    
    
    @FindBy(tagName =  "i")
    private WebElement buttonSignUP;

	
	public void typeFirstName(String firstName) {
		
		clearText(txtFirstname);
        setElementsText(txtFirstname, firstName);
        submitElement(txtFirstname);
    }
	
	public void typeLastName(String lastName) {
		clearText(txtLastname);
        setElementsText(txtLastname, lastName );
        submitElement(txtLastname);
    }
	
	public void typeMobileNmuber(String mobileNumber) {
		clearText(txtMobileNumber);
        setElementsText(txtMobileNumber, mobileNumber );
        submitElement(txtMobileNumber);
    }
	
	public void typeEmail(String email) {
		clearText(txtEmail);
        setElementsText(txtEmail, email);
        submitElement(txtEmail);
    }
	
	public void typePassword(String password) {
		clearText(txtPassword);
        setElementsText(txtPassword, password);
        submitElement(txtPassword);
    } 
	public void typeConfirmationPassword(String confirmationPassword) {
		clearText(txtConfirmPassword);
        setElementsText(txtConfirmPassword, confirmationPassword);
        submitElement(txtConfirmPassword);
    }
	
	public void clickOnSignUpButton() {
		clickElement(buttonSignUP);

	}
}