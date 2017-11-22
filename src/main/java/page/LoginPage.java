
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class LoginPage {
    AndroidDriver driver ;
    public WebElement register,username,pwd,loginButton,forgetPwd,location,wechat,qq,weibo;
    public LoginPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void loginPage(){
        //注册按钮
        register = driver.findElement(By.id("com.etiantian.im:id/title_finish"));
        //用户名
        username = driver.findElement(By.id("com.etiantian.im:id/et_username"));
        //密码
        pwd = driver.findElement(By.id("com.etiantian.im:id/et_password"));
        //登录按钮
        loginButton = driver.findElement(By.id("com.etiantian.im:id/login_btn"));
        //忘记密码
        forgetPwd = driver.findElement(By.id("com.etiantian.im:id/forget_pwd_bt"));
        //切换城域网
        location = driver.findElement(By.id("com.etiantian.im:id/change_net"));
        //微信登录
        wechat = driver.findElement(By.id("com.etiantian.im:id/login_by_wx"));
        //qq登录
        qq = driver.findElement(By.id("com.etiantian.im:id/login_by_qq"));
        //微博登录
        weibo = driver.findElement(By.id("com.etiantian.im:id/login_by_xl"));
    }
}
