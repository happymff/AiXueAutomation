package test;

import io.appium.java_client.android.AndroidDriver;
import method.Swip;
import method.WarningHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.WelcomePage;
import util.GetToast;
import util.Initial;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2017/11/21.
 */
public class ThirdPartLogin {
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
    public void loginWithWechatNotInstall() throws Exception {
        Thread.sleep(3000);
        swip = new Swip();
        for (int i = 0; i < 2; i++) {
            swip.swipToLeft(driver);
            Thread.sleep(2000);
        }
        WelcomePage wp = new WelcomePage(driver);
        wp.welcomePage();
        wp.goToLoginpage.click();
        WarningHandle warningHandle = new WarningHandle();
        warningHandle.handleWarning(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPage();
        loginPage.wechat.click();
        GetToast getToast = new GetToast();
        Boolean isgetToast = getToast.getToast(driver, "请先安装微信客户端");
        Assert.assertTrue(isgetToast);
    }

    @Test
    public void loginWithQQNotInstall() throws Exception {
        Thread.sleep(3000);
        swip = new Swip();
        for (int i = 0; i < 2; i++) {
            swip.swipToLeft(driver);
            Thread.sleep(2000);
        }
        WelcomePage wp = new WelcomePage(driver);
        wp.welcomePage();
        wp.goToLoginpage.click();
        WarningHandle warningHandle = new WarningHandle();
        warningHandle.handleWarning(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPage();
        loginPage.qq.click();
        GetToast getToast = new GetToast();
        Boolean isgetToast = getToast.getToast(driver, "请先安装QQ客户端");
        Assert.assertTrue(isgetToast);
    }

    @Test
    public void loginWithWeiBoNotInstall() throws Exception {
        Thread.sleep(3000);
        swip = new Swip();
        for (int i = 0; i < 2; i++) {
            swip.swipToLeft(driver);
            Thread.sleep(2000);
        }
        WelcomePage wp = new WelcomePage(driver);
        wp.welcomePage();
        wp.goToLoginpage.click();
        WarningHandle warningHandle = new WarningHandle();
        warningHandle.handleWarning(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPage();
        loginPage.weibo.click();
        WebElement webElement = null;
        try {
            webElement = (WebElement) driver.findElements(By.className("android.widget.TextView")).get(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("登录 - 新浪微博", webElement.getText());
        String currentHandle = driver.getWindowHandle();
        Set<String> contextNames = driver.getContextHandles();
        Thread.sleep(1000);
        String contextHandle = null;
        for (String contextName : contextNames) {
            System.out.println(contextName);
            if (!contextName.equals(currentHandle)) {
                contextHandle = contextName;
            }
        }
        try {
            driver.context(contextHandle);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        Thread.sleep(3000);
        System.out.println("已经进入WEBVIEW啦");
        driver.findElement(By.id("loginname")).sendKeys("happymff@126.com");
        driver.findElement(By.className("password")).sendKeys("Gao14meng06qi13");
        driver.findElement(By.id("loginButn")).click();
    }
}
