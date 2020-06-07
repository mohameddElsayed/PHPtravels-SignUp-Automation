package sampleDemo_without_OOP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Registration {
	
ChromeDriver driver;
	

	@BeforeTest
	public void OpenUrl(){

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Sources_Chrome\\chromedriverr.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/register");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void TextRegister() throws Exception {
		
		
	WebElement TxtFirstname = driver.findElement(By.name("firstname"));
	TxtFirstname.clear();
	TxtFirstname.sendKeys("Mai");
	TxtFirstname.submit();
	
	
	WebElement TxtLastname = driver.findElement(By.name("lastname"));
	TxtLastname.clear();
	TxtLastname.sendKeys("Nader");
	TxtLastname.submit();
	
	
	    
	

	
	WebElement TxtMobileNumber = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(4) > label > input[type=text]"));
	TxtMobileNumber.clear();
	TxtMobileNumber.sendKeys("01124984247");
  TxtMobileNumber.submit();
	
		
	
	WebElement TxtEmail = driver.findElement(By.name("email"));
	TxtEmail.clear();
	TxtEmail.sendKeys("mohamedsaid@gmail.com");
	TxtEmail.submit();
	
	
	WebElement TxtPassword = driver.findElement(By.name("password"));
	TxtPassword.clear();
	TxtPassword.sendKeys("Mohamed@1_2");
	TxtPassword.submit();
	
	
	
	WebElement TxtConfrimPassword = driver.findElement(By.name("confirmpassword"));
	TxtConfrimPassword.clear();
	TxtConfrimPassword.sendKeys("Mohamed@1_2");
	TxtConfrimPassword.submit();
	
	WebElement ButtonSignUP = driver.findElement(By.tagName("i"));
    ButtonSignUP.click();

                       // text-align-left class 
    WebElement SuccessNotification1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/h3"));
	System.out.println(SuccessNotification1.getText());
	Assert.assertTrue(SuccessNotification1.getText().contains("Hi,"));

	
	WebElement SuccessNotification2 = driver.findElement(By.tagName("h4"));
	System.out.println(SuccessNotification2.getText());
	Assert.assertTrue(SuccessNotification2.getText().contains("Yet"));
	

	
		}
	
	       /* close chrome */
	
	@AfterTest
	public void QuitURL()
	{
	driver.quit();
	}
	
}

