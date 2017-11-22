
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class WelcomePage {
    AndroidDriver driver ;
    public WebElement goToLoginpage;
    public WelcomePage(AndroidDriver driver){
        this.driver = driver;
    }
    public void welcomePage(){
        //进入登录页前的按钮
        goToLoginpage = driver.findElement(By.id("com.etiantian.im:id/go_bt"));
    }
}
