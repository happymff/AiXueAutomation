package method;

import io.appium.java_client.android.AndroidDriver;
import page.FootBarPage;
import page.MainPage;

import java.util.Random;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class GoThroughMainPage {
    FootBarPage footBarPage;
    MainPage mainPage;
    Swip swip;
    public void swipMainPage(AndroidDriver driver) throws Exception {
      footBarPage = new FootBarPage(driver);
      footBarPage.footbarPage();
      footBarPage.mainButton.click();
      mainPage = new MainPage(driver);
      mainPage.mainPage();
      swip = new Swip();
      Random random = new Random();
      int count = random.nextInt(5)+5;
      for (int i =0 ; i <count; i++){
          swip.swipToDown(driver);
      }
    }
}
