
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class SearchPage {
    AndroidDriver driver ;
    public WebElement searchResult,nearBy,clearHistory,lastHistory,serchButton,back;
    public List <WebElement> serchItem;
    public SearchPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void searchPage() {
        //用搜索结果
        searchResult = driver.findElement(By.id("com.moft:id/result_search_bar"));
        //所有搜索结果
        serchItem = driver.findElements(By.id("com.moft:id/text"));
        //最近的搜索
        nearBy = serchItem.get(0);
        //清空搜索
        clearHistory = driver.findElement(By.id("com.moft:id/clear_history"));
        //最后一条搜索
        lastHistory = serchItem.get(serchItem.size() - 1);
        //搜索button
        serchButton = driver.findElement(By.id("com.moft:id/search_bar"));
        //返回button
        back = driver.findElement(By.className("android.widget.ImageView"));
    }
}