package util;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class InitializeDriver {

    String platformName = "ANDROID";
    String apkname = "app.apk";
    String appPackageName = "com.etiantian.im";
    String devicename;
    String platormVersion;
    boolean install = false;

    public InitializeDriver(String devicename, String platormVersion){
        this.devicename = devicename;
        this.platormVersion = platormVersion;

    }
    public DesiredCapabilities driverInitialize() throws Exception {
        // set up appium

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "src/main/resources/");
        File app = new File(appDir, apkname);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("autoAcceptAlerts", true);
        //设置每次运行不重新启动被测试app
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("fullReset","false");

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("deviceName", devicename);
        capabilities.setCapability("platformVersion", platormVersion);
        capabilities.setCapability("clearSystemFiles","True");
        //support Chinese
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");

        //if (install == true) {
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("appPackage", appPackageName);
        //}
        return capabilities;
    }
}
