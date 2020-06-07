package testRunner;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReaderr;
import travelRegistration.RegistrationPage;
import travelRegistration.ConfirmationPage;

public class RegistrationTestCase {
		
// public static final String DataProvider = null;

ChromeDriver driver;

@BeforeTest
public void OpenUrl(){

	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\Sources_Chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.phptravels.net/register");	
	driver.manage().window().maximize();
	
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

      /*  i used three types to input/write data in text fields 
       
                                     First Type  
                              
                            /* Write data manual  in code  */
	@Test()
	public void TextRegister()  
	
	{

	RegistrationPage registrationPage =  new RegistrationPage(driver);
 	ConfirmationPage confirmationPage = new  ConfirmationPage(driver);
	
	registrationPage.typeFirstName("Mohamed");
	registrationPage.typeLastName("Elsayed");
	registrationPage.typeMobileNmuber("01124984247");
	registrationPage.typeEmail("mohammedelsayed.94z@gmail.com");
	registrationPage.typePassword("Mohamed_1_2_3@");
	registrationPage.typeConfirmationPassword("Mohamed_1_2_3@");
	
	registrationPage.clickOnSignUpButton();
	confirmationPage.assertFirstSuccessNotification();
	confirmationPage.assertSecondSuccessNotification();
	}
	                           
	                            /*   Second Type
	                           Read from excel sheet */
	
//	@DataProvider(name="ExcelDataa")
//	public Object[][] UserRegistartion() throws IOException
//	{
//		ExcelReaderr ER = new ExcelReaderr();
//	    return ER.GetExcelFile();
//	}
	 
//	@Test(priority = 1, alwaysRun = true , dataProvider="ExcelDataa")
//	public void TextRegister(String firstname , String lastname , String mobilenumber , String email , String password ,String confirmationPassword)  
//	{
	
//	RegistrationPage registrationPage =  new RegistrationPage(driver);
// 	confirmationPage confirmationPage = new  confirmationPage(driver);
//	
//	registrationPage.typeFirstName(firstname);
//	registrationPage.typeLastName(lastname);
//	registrationPage.typeMobileNmuber(mobilenumber);
//	registrationPage.typeEmail(email);
//	registrationPage.typePassword(password);
//	registrationPage.typeConfirmationPassword(confirmationPassword);
//	
//	registrationPage.clickOnSignUpButton();
//	confirmationPage.assertFirstSuccessNotification();
//	confirmationPage.assertSecondSuccessNotification();
//	}
	
	
	                                  /*   Third Type        Excelizer 
	                                   
	                                    
             Read from excel sheet  directly here without (create class then take object form it ) 
                        using Excelizer dependency in pom file   */

//@DataProvider(name="ExcelDataa")
//public Object[][] UserRegistration()
//{
//return  ExcelReader.loadTestData("\\src\\test\\java\\Data\\Dataa.xlsx","Sheet1");		
//}
	
	
	
	
	
	       /* this method to take screenshots  for failures */
	
	@AfterMethod
	public void TakeScreenShot ( ITestResult Result) throws IOException
	{
		if (ITestResult.FAILURE == Result.getStatus())
			// Create reference screenshots
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShots/"+Result.getName()+".png"));	
		}
	}
	
	
	              /* Method to close chrome after test finish */

	@AfterTest
	public void QuitURL() 
	{
		driver.quit();
	}	
}


















