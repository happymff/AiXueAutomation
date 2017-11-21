package test;

import data.DataProvid;
import io.appium.java_client.android.AndroidDriver;
import method.Login;
import method.LoginAndRegister;
import module.InitSetup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AboutUSPage;
import page.MainPage;
import util.InitializeDriver;
import util.StartAppiumServer;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class LoginTest {
    AndroidDriver driver;
    InitializeDriver initialize;
    MainPage mainpage;
    LoginAndRegister lr;
    Login login;
    AboutUSPage aboutUS;
    StartAppiumServer startAppiumServer;
    InitSetup initSetup;
    @BeforeMethod
    public  void setUp() throws  Exception {
//        startAppiumServer = new StartAppiumServer();
//        startAppiumServer.startAppium();
//        Thread.sleep(5000);
        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
        initSetup = new InitSetup();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test(description = "测试账号登录",dataProvider = "LoginSucess",dataProviderClass = DataProvid.class)
    public void loginTest(String username, String pwd) throws Exception {
        Thread.sleep(3000);
        mainpage = new MainPage(driver);
        mainpage.mainPage();
        mainpage.aboutButton.click();
        lr = new LoginAndRegister();
        lr.login(driver);
        login = new Login();
        login.login(username,pwd,driver);
        Thread.sleep(2000);
        aboutUS = new AboutUSPage(driver);
        aboutUS.aboutUSPage();
        Assert.assertEquals(aboutUS.username.getText(),"你好");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
