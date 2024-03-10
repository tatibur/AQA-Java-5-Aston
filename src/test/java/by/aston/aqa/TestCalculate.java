package by.aston.aqa;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculate {
    static AndroidDriver<AndroidElement> driver = null;

    @BeforeEach
    public void initialize() throws InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Medium_Phone_API_30");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.miui.calculator");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "cal.CalculatorActivity");

        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        try {
            driver = new AndroidDriver<>(new URL("http://192.168.1.70:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        Thread.sleep(2000);
    }

    @AfterAll
    public static void exitCalc() {
        driver.quit();
    }

    @Test
    public void checkPlus() {
        driver.findElementById("com.miui.calculator:id/btn_3_s").click();
        driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
        driver.findElementById("com.miui.calculator:id/btn_9_s").click();
        driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
        AndroidElement result = driver.findElementById("com.miui.calculator:id/result");
        String resultText = result.getText();
        assertEquals("= 12", resultText);
    }

    @Test
    public void checkMinus() {
        driver.findElementById("com.miui.calculator:id/btn_9_s").click();
        driver.findElementById("com.miui.calculator:id/btn_minus_s").click();
        driver.findElementById("com.miui.calculator:id/btn_3_s").click();
        driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
        AndroidElement result = driver.findElementById("com.miui.calculator:id/result");
        String resultText = result.getText();
        assertEquals("= 6", resultText);
    }

    @Test
    public void checkDivizion() {
        driver.findElementById("com.miui.calculator:id/btn_9_s").click();
        driver.findElementById("com.miui.calculator:id/btn_div_s").click();
        driver.findElementById("com.miui.calculator:id/btn_3_s").click();
        driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
        AndroidElement result = driver.findElementById("com.miui.calculator:id/result");
        String resultText = result.getText();
        assertEquals("= 3", resultText);
    }

    @Test
    public void checkMultiply() {
        driver.findElementById("com.miui.calculator:id/btn_9_s").click();
        driver.findElementById("com.miui.calculator:id/btn_mul_s").click();
        driver.findElementById("com.miui.calculator:id/btn_3_s").click();
        driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
        AndroidElement result = driver.findElementById("com.miui.calculator:id/result");
        String resultText = result.getText();
        assertEquals("= 27", resultText);
    }
}