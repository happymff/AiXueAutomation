package test;

import io.appium.java_client.android.AndroidDriver;
import method.Swip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.Initial;
import util.InitializeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2017/11/21.
 */
public class GoThroughWelcome {
    AndroidDriver driver;
    InitializeDriver initialize;
    Initial initial;
    Swip swip;
    @BeforeMethod
    public  void setUp() throws  Exception {
//        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver= initial.getDriverWithInstallerRest("192.168.56.101:5555","com.etiantian.im","com.etiantian.im.frame.page.activities.IntroduceActivity");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void welcomeSwip() throws Exception {
        Swip swip = new Swip();
        for (int i =0; i <2; i ++){
            swip.swipToLeft(driver);
        }
    }
}
