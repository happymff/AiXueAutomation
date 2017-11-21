
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class personalSettingPage {
    AndroidDriver driver ;
    public WebElement back,headimg,username,useraccount,changePwd,manageAdds,exit,messageCenter,personSetting;
    public personalSettingPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void personalSettingPage(){
        //用户名
        back = driver.findElement(By.id("com.moft:id/back"));
        //用户头像
        headimg = driver.findElement(By.id("com.moft:id/user_head"));
        //个人设置文案
        List<WebElement> w1 =driver.findElementByClassName("android.widget.FrameLayout").findElements(By.className("android.widget.TextView"));
        personSetting = w1.get(0);
        //昵称
        username = driver.findElement(By.id("com.moft:id/edit_user_name"));
        //账户
        useraccount = driver.findElement(By.id("com.moft:id/user_account"));
        //修改密码
        changePwd = driver.findElement(By.id("com.moft:id/revision_password"));
        //地址管理
        manageAdds = driver.findElement(By.id("com.moft:id/address_manage"));
        //退出
        exit = driver.findElement(By.id("com.moft:id/exit"));
        //消息中心按钮
        messageCenter = driver.findElement(By.id("com.moft:id/message_center"));
    }


}
