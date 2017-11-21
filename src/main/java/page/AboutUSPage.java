
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class AboutUSPage {
    AndroidDriver driver ;
    public WebElement username,headimg,accountManage,noPay,undeliver,deliver,unrate,returnPurcharse,allOrder,zhishu,points,cards,invent,addin,pointMall,aboutus;
    public AboutUSPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void aboutUSPage(){
        //用户名
        username = driver.findElement(By.id("com.moft:id/account_name"));
        //用户头像
        headimg = driver.findElement(By.id("com.moft:id/user_head"));
        //账户管理
        List<WebElement> w1 =driver.findElementById("com.moft:id/account_manage").findElements(By.className("android.widget.TextView"));
        accountManage = w1.get(w1.size()-1);
        //待付款
        noPay = driver.findElement(By.id("com.moft:id/no_payment_orders"));
        //未发货
        undeliver = driver.findElement(By.id("com.moft:id/unfilled_orders"));
        //已发货
        deliver = driver.findElement(By.id("com.moft:id/delivering_order"));
        //待评价
        unrate = driver.findElement(By.id("com.moft:id/unrate_order"));
        //退款售后
        returnPurcharse = driver.findElement(By.id("com.moft:id/return_purchase"));
        //全部订单
        allOrder = driver.findElement(By.id("com.moft:id/all_order_layout"));
        //讲究指数
        zhishu = driver.findElement(By.id("com.moft:id/integral"));
        //讲究积分
        points = driver.findElement(By.id("com.moft:id/points_layout"));
        //讲究卡券
        cards = driver.findElement(By.id("com.moft:id/card_points"));
        //讲究邀请
        invent = driver.findElement(By.id("com.moft:id/invent_friends"));
        //轻加盟
        addin = driver.findElement(By.id("com.moft:id/distribution"));
        //积分商城
        pointMall = driver.findElement(By.id("com.moft:id/integral_mall"));
        //关于我们
        aboutus = driver.findElement(By.id("com.moft:id/about_mind"));
    }


}
