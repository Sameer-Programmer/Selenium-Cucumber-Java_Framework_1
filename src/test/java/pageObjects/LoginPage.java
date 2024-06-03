package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public  WebDriver driver;

   // page Elements or Objects or Locators
    @FindBy(css = " #Email")
    WebElement Email;

    @FindBy(css = "#Password")
    WebElement password;

    @FindBy(css = "button[type='submit']")
    WebElement Loginsubmit;

    @FindBy(xpath = " //a[normalize-space()='Logout']")
    WebElement Logout;


    //initializing the page Objects
   public  LoginPage(WebDriver driver ){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    //page actions
    public void clickonLogin(String useremail, String pwd){
        Email.clear();
        Email.sendKeys(useremail);
        password.clear();
        password.sendKeys(pwd);
        Loginsubmit.click();
    }

//    public void verifyTitleofPage(String Title){
//       Title = driver.getTitle();
//    }

    public void clickonLogout(){
        Logout.click();
    }
}
