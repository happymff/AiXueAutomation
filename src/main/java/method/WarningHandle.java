package method;

import io.appium.java_client.android.AndroidDriver;
import page.SelectWarningPage;
import page.WarningPage;

import java.util.NoSuchElementException;

/**
 * Created by mengfeifei on 2017/11/22.
 */
public class WarningHandle {
    public void handleWarning(AndroidDriver driver) {
        try
        {
            WarningPage warningPage = new WarningPage(driver);
            warningPage.warningPage();
            warningPage.positiveButton.click();
            SelectWarningPage selectWarningPage = new SelectWarningPage(driver);
            selectWarningPage.selectWarningPage();
            selectWarningPage.accept.click();
            selectWarningPage.accept.click();
        } catch (
                NoSuchElementException e)

        {
            e.printStackTrace();
        }
    }
}
