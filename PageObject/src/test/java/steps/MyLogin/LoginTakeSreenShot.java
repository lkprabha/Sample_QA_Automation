//package steps.MyLogin;
//
//import java.io.File;
//import java.sql.Driver;
//
//import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
//import org.apache.commons.io.FileUtils;
////import org.apache.commons.logging.Log;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.apache.commons.io.FileUtils;
//
//public class LoginTakeSreenShot {
//
//    private static DocFile FileUtils;
//    static WebDriver driver;
//
//    public  void testLoginTakeSreenShot() throws Throwable, Exception {
//        WebDriver driver;
//        driver = new FirefoxDriver();
//        Object logs = null;
//        try {
//            this.takeSnapShot(driver, "src/test/resources/img/test.png");
////            Assert.assertEquals("Let's start learning,",(driver.getTitle()));
////            logs.notify();
//        }
//        catch (Exception ex)
//        {
//            logs.toString() ;
//            Object tU;
//
////            System.out.println("Screen Shot Failed:");
//        }
//    }
//    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//
//        long epoch = System.currentTimeMillis();
//        String ssTimestamp = String.valueOf(epoch);
//
//        TakesScreenshot scrShot =((TakesScreenshot)webdriver); //Convert web driver object to TakeScreenshot
//
//        File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////        File SrcFile= scrShot.getScreenshotAs(OutputType.FILE); //Call getScreenshotAs method to create image file
////        File DestFile=new File(fileWithPath);   //Move image file to new destination
//          String   fileStr= fileWithPath;
//
//         FileUtils.copyFile(SrcFile ,new File(fileStr+ ssTimestamp + ".jpg"));
//
//
//
//    }
//
//}
