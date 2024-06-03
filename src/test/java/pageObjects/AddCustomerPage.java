package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    public WebDriver driver;

    public  AddCustomerPage(WebDriver driver ){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    // page Elements or Objects or Locators
    @FindBy(css = ".nav-icon.far.fa-user")
    WebElement Customers_maintab;

    @FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    WebElement Customers_subtab;


    @FindBy(css = "a[class='btn btn-primary']")
    WebElement Addnewbutton;

    @FindBy(xpath = " //input[@id='SearchEmail']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    WebElement Firstname;






}
