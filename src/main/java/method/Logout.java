package method;

import io.appium.java_client.android.AndroidDriver;
import page.AboutUSPage;
import page.personalSettingPage;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class Logout {
    AboutUSPage aboutUSPage;
    page.personalSettingPage personalSettingPage;
    public void logout(AndroidDriver driver) throws Exception {
        aboutUSPage = new AboutUSPage(driver);
        aboutUSPage.aboutUSPage();
        aboutUSPage.accountManage.click();
        personalSettingPage = new personalSettingPage(driver);
        personalSettingPage.personalSettingPage();
        personalSettingPage.exit.click();
    }
}