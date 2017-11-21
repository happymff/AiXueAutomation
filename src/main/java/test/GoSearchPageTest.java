package test;

import io.appium.java_client.android.AndroidDriver;
import method.SearchGood;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MainPage;
import util.InitializeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class GoSearchPageTest {
    AndroidDriver driver;
    InitializeDriver initialize;
    MainPage mainPage;
    SearchGood searchGood;
    @BeforeMethod
    public  void setUp() throws  Exception {
        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void goThroughGirlClothTest() throws Exception {
        Thread.sleep(3000);
        mainPage = new MainPage(driver);
        mainPage.mainPage();
        mainPage.searchButton.click();
        searchGood = new SearchGood();
        searchGood.searchGood(driver);
        Thread.sleep(2000);
        searchGood.searchNearby(driver);
        driver.findElement(By.className("android.widget.ImageView")).click();
        Thread.sleep(2000);
        searchGood.cancelDeleteSearchHistory(driver);
        Thread.sleep(2000);
        searchGood.deleteSearchHistory(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
