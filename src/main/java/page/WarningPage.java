
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class WarningPage {
    AndroidDriver driver ;
    public WebElement negativeButton,positiveButton,message;
    public WarningPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void warningPage(){
        //打开权限
        positiveButton = driver.findElement(By.id("com.etiantian.im:id/positiveButton"));
        //关闭应用
        negativeButton = driver.findElement(By.id("com.etiantian.im:id/negativeButton"));
        //提示信息
        message = driver.findElement(By.id("com.etiantian.im:id/message"));
    }
}
