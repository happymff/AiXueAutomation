
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class MainPage {
    AndroidDriver driver ;
    public WebElement searchButton;
    public WebElement messageButton;
    public WebElement banner;
    public List< WebElement> sortUnderBanner;
    public List< WebElement> sortMain;
    public WebElement mainButton;
    public WebElement sortButton;
    public WebElement shoppingButton;
    public WebElement aboutButton;
    public List< WebElement> banner_list;
    public MainPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void mainPage(){
        //搜索按钮
        searchButton = driver.findElement(By.id("com.moft:id/custom_service_layout"));
        //消息中心
        messageButton = driver.findElement(By.id("com.moft:id/message_center"));
        //Banner
        //banner = (WebElement) driver.findElements(By.id("android.widget.ImageView")).get(2);
        //Banner下分类共6个
        sortUnderBanner = driver.findElements(By.className("android.widget.RelativeLayout"));
        //主页分类共8个
        sortMain = driver.findElements(By.id("com.moft:id/main_linearlayout"));
        //主页按钮
        mainButton = driver.findElement(By.id("com.moft:id/buttom_one"));
        //品牌分类按钮
        sortButton = driver.findElement(By.id("com.moft:id/buttom_two"));
        //购物车按钮
        shoppingButton = driver.findElement(By.id("com.moft:id/buttom_three"));
        //关于我们按钮
        aboutButton = driver.findElement(By.id("com.moft:id/buttom_four"));
        //分类下面的list
        banner_list = driver.findElements(By.className("android.widget.LinearLayout"));
    }


}
