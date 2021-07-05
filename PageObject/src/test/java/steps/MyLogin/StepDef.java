package steps.MyLogin;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.*;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
//import steps.MyLogin.LoginTakeSreenShot; c
import steps.MyLogin.FullPageScreeShot;

public class StepDef {

    public static WebDriver driver;
    private String Stringactual;
    HomePage objhompage;
    LoginPage objloginpage;
//    LoginTakeSreenShot srnshot; c
    FullPageScreeShot fpSshot;
    @BeforeTest
    public void setup(){

        System.setProperty("webdriver.gecko.driver", "src/test/resources/GekoDriver/geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.udemy.com/join/login-popup/");
    }

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct() throws Throwable {

        objloginpage = new LoginPage(driver);
        objloginpage.LoginPageTo("prasliit18@gmail.com","qKccl2q4XpFg");
        objhompage = new HomePage(driver);

//        srnshot = new LoginTakeSreenShot(); c
//        srnshot.testLoginTakeSreenShot(); c
        fpSshot = new FullPageScreeShot();
        fpSshot.main(  );
        driver.quit();
    }

 }

