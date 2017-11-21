package test;

import com.oracle.tools.packager.Log;
import io.appium.java_client.android.AndroidDriver;
import method.GoThroughMainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.InitializeDriver;
import util.IsElementPresent;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class GoThroughMainPageTest {
    AndroidDriver driver;
    InitializeDriver initialize;
    GoThroughMainPage goThroughMainPage;
    IsElementPresent isElementPresent;
    @BeforeMethod
    public  void setUp() throws  Exception {
        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void goThroughMainPageTest() throws Exception {
        Log.info("This is a log message");
        goThroughMainPage = new GoThroughMainPage();
        goThroughMainPage.swipMainPage(driver);
        Thread.sleep(2000);
        String s1 = driver.getPageSource();
        System.out.println(s1);
        Assert.assertTrue(s1.contains("皮质与金属的摩擦"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
