package scheduler;

import config.ConfigurationScheduler1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class LoginTest extends ConfigurationScheduler1 {

    @Test

    public void loginSuccessTest(){

        boolean isFabPresent = new SplashScreen(driver).checkVersion("0.0.3")
                 .fillEmail("noa@gmail.com")
                 .fillPassword("Nnoa12345$")
                 .clickLoginBtn()
                 .skipWizard()
                 .isFabAddPresent();

        Assert.assertTrue(isFabPresent);
    }
}
