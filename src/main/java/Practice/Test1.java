package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.findElement(By.cssSelector(" #Email")).clear();
        driver.findElement(By.cssSelector(" #Email")). sendKeys("admin@yourstore.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector(".nav-icon.far.fa-user")).click();
       // WebElement Customers_maintab;
        driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")).click();
        //WebElement Customers_subtab;
        driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
//        WebElement Addnewbutton;
         driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Testuser@gmail.com");
        driver.findElement(By.xpath("  //input[@id='Password']")).sendKeys("Testuser@123");
         driver.findElement(By.xpath("//input[@id='SearchFirstName']")).sendKeys("Test");
         driver.findElement(By.xpath("//input[@id='SearchLastName']")).sendKeys("user");
         driver.findElement(By.xpath("//select[@id='SearchMonthOfBirth']")).click();


         driver.close();
         driver.quit();








    }
}
