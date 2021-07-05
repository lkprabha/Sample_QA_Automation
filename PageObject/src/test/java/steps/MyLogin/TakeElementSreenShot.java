package steps.MyLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeElementSreenShot<driver> {
    public static void main(String[] args){
    WebDriver driver;
    driver = new FirefoxDriver();
    driver.get("");
    WebElement email=driver.findElement(By.xpath("//input[@id='email--1'"));

//    email.getScreenshotAs();
}
}
