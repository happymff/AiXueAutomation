package method;

import io.appium.java_client.android.AndroidDriver;
import page.LoginAndRegisterPage;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class LoginAndRegister {
    LoginAndRegisterPage lr;
    public void login(AndroidDriver driver) throws Exception {
        lr = new LoginAndRegisterPage(driver);
        lr.loginAndRegpage();
        lr.loginButton.click();
    }
    public void register(AndroidDriver driver) throws Exception {
        lr = new LoginAndRegisterPage(driver);
        lr.loginAndRegpage();
        lr.regButton.click();
    }
    public void back(AndroidDriver driver) throws Exception {
        lr = new LoginAndRegisterPage(driver);
        lr.loginAndRegpage();
        lr.backButton.click();
    }
}
