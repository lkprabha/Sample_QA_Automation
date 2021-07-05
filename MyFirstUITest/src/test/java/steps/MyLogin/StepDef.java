package steps.MyLogin;

import java.awt.print.Printable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
        driver.quit();

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
        String title = driver.getTitle().substring(0, (driver.getTitle().indexOf(",")));
        Assert.assertEquals(title, titleAct);
//        int size = driver.findElements(By.tagName("iframe")).size();
////        List<String> Framecount = new ArrayList<>();
//         List <WebElement> Framecount= driver.findElements(By.tagName("iframe"));
//        System.out.println("Test, "+size);
//        Select DropDwn = new Select(driver.findElement(By.className("udlite-select udlite-text-md")));
////        DropDwn.selectByVisibleText("Highest Rated");
//        DropDwn.selectByIndex(1);

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

    //    Test case 05
    @When("User enter UNme and Pword")
    public void userEnterUNmeAndPword(DataTable testData) throws Throwable {
        Map<String, String> data = testData.asMap(String.class, String.class);
        System.out.println(data);
        driver.findElement(By.id("email--1")).sendKeys(data.get("UNme"));
        driver.findElement(By.id("id_password")).sendKeys(data.get("Pword"));
    }

// Test case 06
    @When("User enter all details")
    public void userEnterAllDetails(DataTable tdata) throws Throwable{
        List<String> details = tdata.asList(String.class);
        System.out.println(details);
        driver.findElement(By.id("email--1")).sendKeys(details.get(0));
        driver.findElement(By.id("id_password")).sendKeys(details.get(1));
    }
}

