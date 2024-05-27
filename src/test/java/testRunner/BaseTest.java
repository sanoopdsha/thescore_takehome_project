package test.java.testRunner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class BaseTest {
    public static AppiumDriver driver;
    public static WebDriverWait wait;

@BeforeClass

    public static void setup() throws MalformedURLException {
        // Initialize driver and WebDriverWait here
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("11.0");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UIAutomator2");
        options.setApp(System.getProperty("user.dir") + "/apps/theScore_24.7.0_Apkpure.apk");
        // Set the adbExecTimeout capability
        options.setCapability("adbExecTimeout", 120000); // 120 seconds

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Method to get WebDriverWait
   public static WebDriverWait getWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait;

        }

    public static WebDriverWait getWait(Duration timeout) {
        return new WebDriverWait(driver, timeout);
    }

    }



