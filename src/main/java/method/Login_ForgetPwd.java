package method;

import io.appium.java_client.android.AndroidDriver;
import page.LoginPage;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class Login_ForgetPwd {
    LoginPage loginPage;
    public void forgetPwd(String username, String pwd,AndroidDriver driver) throws Exception {
        loginPage = new LoginPage(driver);
        loginPage.loginPage();
        loginPage.forgetPwd.click();
    }
}
