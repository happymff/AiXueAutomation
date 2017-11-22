package test;

import io.appium.java_client.android.AndroidDriver;
import method.Swip;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SelectWarningPage;
import page.WarningPage;
import page.WelcomePage;
import util.Initial;
import util.IsElementPresent;

import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2017/11/21.
 */
public class WarningMessage {
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
    public void warningAccept() throws Exception {
        Thread.sleep(3000);
        swip = new Swip();
        for (int i = 0; i < 2; i++) {
            swip.swipToLeft(driver);
            Thread.sleep(2000);
        }
        WelcomePage wp = new WelcomePage(driver);
        wp.welcomePage();
        wp.goToLoginpage.click();
        IsElementPresent isElementPresent = new IsElementPresent();
        if (isElementPresent.isElementPresent(By.id("com.etiantian.im:id/positiveButton"),driver)) {
            WarningPage warningPage = new WarningPage(driver);
            warningPage.warningPage();
            Assert.assertEquals("检测到关键权限未打开，将影响爱学的正常使用，如应用崩溃，通知收不到等", warningPage.message.getText());
            warningPage.positiveButton.click();
            SelectWarningPage selectWarningPage = new SelectWarningPage(driver);
            selectWarningPage.selectWarningPage();
            if (isElementPresent.isElementPresent(By.id("com.android.packageinstaller:id/permission_allow_button"),driver)) {
                //允许拨打电话和管理电话
               selectWarningPage.accept.click();
            }
            Thread.sleep(3000);
            if (isElementPresent.isElementPresent(By.id("com.android.packageinstaller:id/permission_allow_button"),driver)) {
                //允许访问SD卡
               selectWarningPage.accept.click();
            }
        }else {
            System.out.println("There is no warning message");
            Assert.assertEquals("登录",driver.findElement(By.id("com.etiantian.im:id/title_text")).getText());
        }

    }
}
