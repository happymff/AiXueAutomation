
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class SelectWarningPage {
    AndroidDriver driver ;
    public WebElement rejectButton,accept,message;
    public SelectWarningPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void selectWarningPage(){
        //允许权限
        accept = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
        //禁止权限
        rejectButton = driver.findElement(By.id("com.android.packageinstaller:id/permission_deny_button"));
        //提示信息
        message = driver.findElement(By.id("com.android.packageinstaller:id/permission_message"));
    }
}
