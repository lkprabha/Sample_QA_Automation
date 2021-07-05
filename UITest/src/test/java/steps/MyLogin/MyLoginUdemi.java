package steps.MyLogin;

import io.cucumber.java.en.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class MyLoginUdemi {
    WebDriver driver = null;

//    driver = new FirefoxDriver();

    @Given("navigate to udemy site login page")
    public void navigateToUdemySiteLoginPage() throws Throwable {
        System.setProperty("webdriver.gecko.driver","src\\test\\resources\\GekoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.udemy.com/join/login-popup/");
    }

    @When("User enter userName")
    public void userEnterUserName() {
    }

    @And("user enter PassWord")
    public void userEnterPassWord() {
    }

    @And("click on  {string} button")
    public void clickOnButton() {
//        if(driver.findElement(By.id("email--1")).isEnabled()) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//        driver.close();
    }

    @Then("user logged in")
    public void userLoggedIn() {
    }
}
