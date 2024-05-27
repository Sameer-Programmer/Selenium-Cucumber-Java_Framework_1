package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class LoginPageSteps {

    public WebDriver driver;
    public LoginPage loginPage;  // creating a Loginpage object
    // to get access of Login inpage Elemments

    @Given("Launch the Chrome Browser")
    public void launch_the_chrome_browser() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

    }

    @When("Enter the URL {string}")
    public void enter_the_url(String URL) {
        driver.get(URL);
    }

    @When("User Enters Email as {string} and password as {string} Click on Login")
    public void user_enters_email_as_and_password_as_click_on_login(String Email, String password) {
        loginPage.clickonLogin(Email,password);
    }

    @Then("Page Title Should be {string}")
    public void page_title_should_be(String Title) {
        Assert.assertEquals(Title,driver.getTitle());
    }

    @Then("Logout")
    public void logout() {
    loginPage.clickonLogout();
    }

    @Then("close the Browser")
    public void close_the_browser() {
    driver.quit();
    }

}
