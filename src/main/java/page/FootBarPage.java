
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class FootBarPage {
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
    public FootBarPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void footbarPage(){
        //主页按钮
        mainButton = driver.findElement(By.id("com.moft:id/buttom_one"));
        //分类按钮
        sortButton = driver.findElement(By.id("com.moft:id/buttom_two"));
        //购物车按钮
        shoppingButton = driver.findElement(By.id("com.moft:id/buttom_three"));
        //关于我们按钮
        aboutButton = driver.findElement(By.id("com.moft:id/buttom_four"));
    }


}
