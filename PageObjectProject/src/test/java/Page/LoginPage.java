package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how =How.NAME ,using="userName")
    public WebElement txtUserName;
    @FindBy(how =How.NAME ,using="PassWord")
    public WebElement txtPassWord;
    @FindBy(how =How.NAME ,using="Login")
    public WebElement btnLogin;

    public void Login(String username,String password)
    {
        txtUserName.sendKeys(  );
        txtPassWord.sendKeys(password);
    }
    public void ClickLogin() {

        btnLogin.submit();
    }
}


