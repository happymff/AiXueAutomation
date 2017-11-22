package util;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mengfeifei on 2017/11/22.
 */
public class GetToast {

    public static boolean getToast(AndroidDriver driver, String toast) {
        try {
            final WebDriverWait wait = new WebDriverWait(driver, 6);
            if (wait.until(ExpectedConditions
                    .presenceOfElementLocated(By.xpath(".//*[contains(@text,'" + toast + "')]"))) != null) {
                System.out.println("找到了toast");
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("找不到toast:" + toast);
            return false;
        }
    }
}