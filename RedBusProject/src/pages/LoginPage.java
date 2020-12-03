package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;


public class LoginPage {
    
	  WebDriver driver;
	    
	    @FindBy(id="i-icon-profile")
	    WebElement LoginIcon;
	    
	    @FindBy(id="signInLink")
	    WebElement LoginLink;
	    
	    @FindBy(id="mobileNoInp")
	    WebElement MobileNo;
	    
	    public LoginPage(WebDriver driver) {
	        
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	    }
	    
	    public void LogintoApp(String mobileid) throws InterruptedException{
	        
	        LoginIcon.click();
	        LoginLink.click();
	        
	        driver.switchTo().frame(0);
	        Thread.sleep(2000);
	        MobileNo.sendKeys(mobileid);
	    }

}
