
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class LoginPage {
    AndroidDriver driver ;
    public WebElement backButton,username,pwd,loginButton,forgetPwd;
    public LoginPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void loginPage(){
        //返回按钮
        backButton = driver.findElement(By.id("com.moft:id/back"));
        //用户名
        username = driver.findElement(By.id("com.moft:id/username_text"));
        //密码
        pwd = driver.findElement(By.id("com.moft:id/password_text"));
        //登录按钮
        List<WebElement> w1 = driver.findElements(By.className("android.widget.LinearLayout"));
        loginButton = w1.get(w1.size()-1);
        //忘记密码
        forgetPwd = driver.findElement(By.id("com.moft:id/forger_password"));
    }
}
