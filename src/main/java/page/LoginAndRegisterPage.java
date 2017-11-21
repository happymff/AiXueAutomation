
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class LoginAndRegisterPage {
    AndroidDriver driver ;
    public WebElement backButton,loginButton,regButton;
    public LoginAndRegisterPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void loginAndRegpage(){
        //返回按钮
        backButton = driver.findElement(By.id("com.moft:id/back_button"));
        //登录按钮
        loginButton = (WebElement) driver.findElements(By.className("android.widget.RelativeLayout")).get(1);
        //注册按钮
        regButton = (WebElement) driver.findElements(By.className("android.widget.RelativeLayout")).get(2);
    }


}
