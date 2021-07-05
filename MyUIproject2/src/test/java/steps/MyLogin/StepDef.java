package steps.MyLogin;

import java.awt.print.Printable;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ru.yandex.qatools.ashot.AShot;

import com.google.common.base.Verify;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
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

    @When("User enter userName")
    public void userEnterUserName() throws Throwable {
        driver.findElement(By.id("email--1")).sendKeys("prasliit18@gmail.com");
    }

    @And("user enter PassWord")
    public void userEnterPassWord() throws Throwable {
        driver.findElement(By.id("id_password")).sendKeys("qKccl2q4XpFg");
    }

    @And("click on  Sign In button")
    public void clickOnSignInButton() throws Throwable {
        driver.findElement(By.id("submit-id-submit")).click();
        driver.get("https://www.udemy.com");
//        throw new io.cucumber.java.PendingException();

    }

    @Then("user logged in")
    public void userLoggedIn() throws Throwable {

//        throw new io.cucumber.java.PendingException();

// --------------------------------------------- Scroll - down the web page by pixels -----------------------------------------------------------------

//       JavascriptExecutor js = (JavascriptExecutor) driver;
//       driver.manage().window().maximize();
//       js.executeScript("window.scrollBy(0,1000)");

// --------------------------------------------- Scroll - down the web page by pixels -----------------------------------------------------------------
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.linkText("Help and Support"));
//        js.executeScript("arguments[0].scrollIntoView();", element);

// --------------------------------------------- Scroll - down the web page by pixels -----------------------------------------------------------------
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

// --------------------------------------------- Scroll - down the web page by pixels -----------------------------------------------------------------

//          JavascriptExecutor js = (JavascriptExecutor) driver;
//          WebElement Element = driver.findElement(By.linkText("Privacy policy"));
//         js.executeScript("arguments[0].scrollIntoView();", Element);

    }

    @When("^User enter usernameSO (.+)$")
    public void usernameSO(String userName1) throws Throwable {
        driver.findElement(By.id("email--1")).sendKeys(userName1);
    }

    @And("^User enter  passwordSO (.+)$")
    public void passwordSO(String PassWord1) throws Throwable {
        driver.findElement(By.id("id_password")).sendKeys(PassWord1);
    }


    @Then("^title should be (.+)$")
    public void userVerifyTitle(String titleAct) throws Throwable {

//---------------------------- Using Assert ----------------------------------------------------------------------------
//        String title = driver.getTitle().substring(0, (driver.getTitle().indexOf(",")));
//        Assert.assertEquals("Test Fail",title, titleAct);

//---------------------------- Veryfy ----------------------------------------------------------------------------------

//        String title = driver.getTitle().substring(0, (driver.getTitle().indexOf(",")));
//        Verify.verify(title==titleAct,"Title Does Not Match!");

//_______________________________ IFrame _______________________________________________________________________________
//
//        int size = driver.findElements(By.tagName("iframe")).size();
////        List<String> Framecount = new ArrayList<>();
//          List <WebElement> Framecount= driver.findElements(By.tagName("iframe"));
//          System.out.println("Frame Count  - "+size);

//--------------------------------- Drop down lists --------------------------------------------------------------------
//
//        Select DropDwn = new Select(driver.findElement(By.className("udlite-select udlite-text-md")));
////      DropDwn.selectByVisibleText("Highest Rated");
//        DropDwn.selectByIndex(1);
//
//------------------------------------------- Navigate -----------------------------------------------------------------
//
//        driver.navigate().to("https://www.udemy.com/courses/office-productivity/google/");
////          String textAct="Google Courses";
////          WebElement textinsite = driver.findElement(By.className("udlite-heading-xxl category--heading-primary--2uO95"));
////          Verify.verify(textinsite==textAct,"Wrong navigation!");
//        driver.navigate().back();


//--------------------------------------------- Sreen shot -------------------------------------------------------------
//--------------------------------------------- Window handle -------------------------------------------------------------

    }

    @After()
    public void tearDown() {
        driver.quit();
    }

    // Test 04
    @When("User enter Username {string}")
    public void userEnter1(String username) {
        driver.findElement(By.id("email--1")).sendKeys(username);
    }

    @And("User enter Pswd {string}")
    public void userEnter2(String password) {
        driver.findElement(By.id("id_password")).sendKeys(password);
    }



}

