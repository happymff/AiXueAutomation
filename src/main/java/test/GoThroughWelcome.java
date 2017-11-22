package test;

import io.appium.java_client.android.AndroidDriver;
import method.Swip;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.Initial;

import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2017/11/21.
 */
public class GoThroughWelcome {
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

    @Test
    public void welcomeSwip() throws Exception {
        Thread.sleep(3000);
        swip = new Swip();
        for (int i = 0; i < 2; i++) {
            swip.swipToLeft(driver);
            Thread.sleep(2000);
        }
        Assert.assertEquals("立即体验", driver.findElement(By.id("com.etiantian.im:id/go_bt")).getText());
    }
}
