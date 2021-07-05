package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;

    By UserName = By.xpath("//input[@id='email--1']");

    By PassWord = By.xpath("//input[@id='id_password']");

    By login = By.xpath("//input[@id='submit-id-submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setUserName(String strUserName){

        driver.findElement(UserName).sendKeys(strUserName);

    }
    public void setPassword(String strPassword){

        driver.findElement(PassWord).sendKeys(strPassword);

    }
    public void clickLogin(){

        driver.findElement(login).click();

    }
    public void LoginPageTo(String strUserName, String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();
    }

}
