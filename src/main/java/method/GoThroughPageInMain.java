package method;

import io.appium.java_client.android.AndroidDriver;
import page.FootBarPage;
import page.MainPage;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class GoThroughPageInMain {
    FootBarPage footBarPage;
    MainPage mainPage;
    public void gointo(int x, AndroidDriver driver) throws Exception {
      footBarPage = new FootBarPage(driver);
      footBarPage.footbarPage();
      footBarPage.mainButton.click();
      mainPage = new MainPage(driver);
      mainPage.mainPage();
      mainPage.sortMain.get(x).click();
    }
}
