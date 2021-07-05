package steps.MyLogin;

import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.util.concurrent.TimeUnit;

public class FullPageScreeShot {
    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/GekoDriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.udemy.com/join/login-popup/");
    }
    public static void takeScreenShot(String fileName) throws IOException {
//      take scrnshot and store it as a file format
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//      copy the screenshot to disired location using copyfile method:
        FileUtils.copyFile( file,new  File("src/test/resources"));

    }

}
