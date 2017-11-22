package data;

import org.testng.annotations.DataProvider;
import util.ReadExcelPOI;

import java.io.IOException;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class DataProvid {

    @DataProvider(name = "DriverInitialize")
    public static Object[][] driverInitialize() throws IOException {
        return ReadExcelPOI.getTestData("/Users/mff/Documents/TestData/TestingForAiXuepaiData", "TestData.numbers", "data");
    }
    @DataProvider(name = "LoginSucess")
    public static Object[][] loginsucess() {
        return new Object[][] {
                new Object[] { "AXPC100@ett.com", "a11111" }
        };
    }

}
