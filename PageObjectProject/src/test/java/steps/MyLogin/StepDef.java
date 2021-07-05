package steps.MyLogin;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import Page.LoginPage;
import com.google.common.base.Verify;
import com.sun.jna.platform.win32.Netapi32Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class StepDef {

    public static WebDriver driver;
    private String Stringactual;

    @Given("navigate to udemy site login page")
    public void navigateToUdemySiteLoginPage() throws Throwable {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/GekoDriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.udemy.com/join/login-popup/");
    }

    @When("^User enter following for Login$")
    public void UserenterfollowingforLogin( DataTable table) throws Throwable {

        List<Netapi32Util.User> users = new ArrayList<>();
        users = table.asList(Netapi32Util.User.class);
        LoginPage page = new LoginPage();


        for ((Netapi32Util.User) user ; users) {
            page.Login(user.username,user.password);
        }

    }
    @And("click on  Sign In button")
    public void clickOnSignInButton() throws Throwable {
        LoginPage page = new LoginPage();
        page.ClickLogin();
    }
    @Then("User should see the home page ")
    public void Usershouldseethehomepage () throws Throwable {

        driver.quit();

    }

    @After()
    public void tearDown() {
        driver.quit();
    }


}

