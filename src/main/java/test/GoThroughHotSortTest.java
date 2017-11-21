package test;

import io.appium.java_client.android.AndroidDriver;
import method.GoThroughPageInMain;
import method.Swip;
import org.openqa.selenium.By;
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
public class GoThroughHotSortTest {
    AndroidDriver driver;
    InitializeDriver initialize;
    GoThroughPageInMain goThroughPageInMain;
    Swip swip;
    IsElementPresent isElementPresent;
    @BeforeMethod
    public  void setUp() throws  Exception {
        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void goThroughHotSortTest() throws Exception {
        goThroughPageInMain = new GoThroughPageInMain();
        goThroughPageInMain.gointo(0,driver);
        Assert.assertEquals("HOT",driver.findElement(By.id("com.moft:id/category_name")).getText());
        isElementPresent = new IsElementPresent();
        swip = new Swip();
        int i =0;
        do {
            swip.swipToDown(driver);
            //Boolean elementpresent = isElementPresent.isElementPresent(By.className("android.widget.FrameLayout"),driver);
            if (i>10){
                break;
            }
            i++;
        }while(true);
        Thread.sleep(2000);
        //Assert.assertEquals("没有更多了",driver.findElement(By.className("android.widget.FrameLayout")).getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
