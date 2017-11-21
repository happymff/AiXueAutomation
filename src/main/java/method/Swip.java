package method;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class Swip {

    public void swipToLeft(AndroidDriver driver) throws Exception {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        // perform Drag and Drop
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction dragNDrop = new TouchAction(driver);
        dragNDrop.longPress(width * 14 / 15, height / 2).moveTo(width / 15, height / 2).release().perform();
    }
    public void swipToRight(AndroidDriver driver) throws Exception {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        // perform Drag and Drop
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction dragNDrop = new TouchAction(driver);
        dragNDrop.longPress(width  / 15, height / 2).moveTo(width *14/ 15, height / 2).release().perform();
    }
    public void swipToDown(AndroidDriver driver) throws Exception {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        // perform Drag and Drop
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction dragNDrop = new TouchAction(driver);
        dragNDrop.longPress(width  / 2, height *14/ 15).moveTo(width / 2, height / 15).release().perform();
    }
    public void swipToUp(AndroidDriver driver) throws Exception {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        // perform Drag and Drop
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction dragNDrop = new TouchAction(driver);
        dragNDrop.longPress(width  / 2, height / 15).moveTo(width / 2, height*14 / 15).release().perform();
    }
}
