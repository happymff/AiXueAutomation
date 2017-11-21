package method;

import io.appium.java_client.android.AndroidDriver;
import page.LoginPage;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class Login {
    LoginPage loginPage;
    public void login(String username, String pwd,AndroidDriver driver) throws Exception {
        loginPage = new LoginPage(driver);
        loginPage.loginPage();
        loginPage.username.clear();
        loginPage.username.sendKeys(username);
        loginPage.pwd.clear();
        loginPage.pwd.sendKeys(pwd);
        Thread.sleep(3000);
        loginPage.loginButton.click();
    }
}
