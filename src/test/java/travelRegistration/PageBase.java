package travelRegistration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


/*This is the base class for all pages where common elements are identified and the ChromeDriver and 
webdriverWait are identified */

public class PageBase {
	
     //create constructor
	
    public PageBase(ChromeDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
   
  
    public static void clickElement(WebElement element)
    {
        element.click();
    }
    
    public void clearText(WebElement element)
    {
        element.clear();
    }

    public  static void setElementsText(WebElement textElement , String value)
    {
        textElement.sendKeys(value);
    }
    
    public  static void submitElement(WebElement element) {
    	element.submit();
    }
}
