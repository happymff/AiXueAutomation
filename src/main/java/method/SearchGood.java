package method;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import page.SearchPage;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class SearchGood {
    SearchPage searchPage;
    public void searchGood(AndroidDriver driver) throws Exception {
        searchPage = new SearchPage(driver);
        searchPage.searchPage();
        String s1 = searchPage.searchResult.getText();
        String s2 = searchPage.nearBy.getText();
        if (s1.equals(s2)){
            System.out.println("搜索的热词正确");
        }else {
            System.out.println("不正确");
        }
    }
    public void searchNearby(AndroidDriver driver) throws Exception {
        searchPage = new SearchPage(driver);
        searchPage.searchPage();
        searchPage.nearBy.click();
    }
    public void deleteSearchHistory(AndroidDriver driver) throws Exception {
        searchPage = new SearchPage(driver);
        searchPage.searchPage();
        searchPage.clearHistory.click();
        driver.findElement(By.id("com.moft:id/confirm_delete_text")).click();
    }
    public void cancelDeleteSearchHistory(AndroidDriver driver) throws Exception {
        searchPage = new SearchPage(driver);
        searchPage.searchPage();
        searchPage.clearHistory.click();
        driver.findElement(By.id("com.moft:id/cancel_delete_text")).click();
    }
}
