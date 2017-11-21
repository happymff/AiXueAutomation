package test;

import io.appium.java_client.android.AndroidDriver;
import method.EnterIntoSomeGoodPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.InitializeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class EnterEndGoodPage {
    AndroidDriver driver;
    InitializeDriver initialize;
    EnterIntoSomeGoodPage enter;
    @BeforeMethod
    public  void setUp() throws  Exception {
        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void goGoodPage() throws Exception {
       enter = new EnterIntoSomeGoodPage();
       enter.enter(driver);
       Assert.assertEquals("加入购物车",driver.findElement(By.id("com.moft:id/join_shoppingcart_btn")).getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
