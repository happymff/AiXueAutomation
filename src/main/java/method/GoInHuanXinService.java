package method;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.FootBarPage;
import page.MainPage;

import java.util.List;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class GoInHuanXinService {
    FootBarPage footBarPage;
    MainPage mainPage;
    Swip swip;
    public void enter(AndroidDriver driver) throws Exception {
      footBarPage = new FootBarPage(driver);
      footBarPage.footbarPage();
      footBarPage.mainButton.click();
      mainPage = new MainPage(driver);
      mainPage.mainPage();
      swip = new Swip();
      for (int i =0 ; i <5; i++){
          swip.swipToDown(driver);
      }
      List<WebElement> l1 = driver.findElements(By.id("com.moft:id/product_image"));
        l1.get(l1.size()-1).click();
        driver.findElement(By.id("com.moft:id/custom_service_button")).click();

    }
}
