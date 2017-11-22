package test;

import data.DataProvid;
import io.appium.java_client.android.AndroidDriver;
import method.Swip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.WelcomePage;
import util.Initial;

import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2017/11/21.
 */
public class Login {
    AndroidDriver driver;
    Initial initial;
    Swip swip;

    @BeforeMethod
    public void setUp() throws Exception {
        // initializing explicit wait object
        driver = initial.getDriverWithInstallerRest("3DN0216524001409", "com.etiantian.im", "com.etiantian.im.frame.page.activities.LoadingActivity");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "登陆成功", dataProvider = "LoginSucess", dataProviderClass = DataProvid.class)
    public void loginSuccess(String userName, String pwd) throws Exception {
        Thread.sleep(2000);
        swip = new Swip();
        for (int i = 0; i < 2; i++) {
            swip.swipToLeft(driver);
            Thread.sleep(2000);
        }
        WelcomePage wp = new WelcomePage(driver);
        wp.goToLoginpage.click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.username.sendKeys(userName);
        loginPage.pwd.sendKeys(pwd);
        loginPage.loginButton.click();
    }
}
