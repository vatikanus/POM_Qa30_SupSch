package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

public class ConfigurationScheduler1 {

        protected static AppiumDriver<MobileElement>driver;

   /* {
        "platformName": "Android",
            "deviceName": "Nexus",
            "platformVersion": "8.0",
            "appPackage": "com.example.svetlana.scheduler",
            "appActivity": ".presentation.splashScreen.SplashScreenActivity"
    }*/
        @SneakyThrows
        @BeforeMethod
    public void setUp(){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("deviceName", "Nexus");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
            capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
            capabilities.setCapability("appActivity", ".presentation.splashScreen.SplashScreenActivity");
            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("app","C:\\Users\\Evgeniy\\Desktop\\v.0.0.3.apk");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);




        }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
