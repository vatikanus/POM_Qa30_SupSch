package scheduler;

import config.ConfigurationScheduler1;
import org.testng.Assert;
import org.testng.annotations.Test;
import schedulerscreen.LoginScreen;
import schedulerscreen.SplashScreen;


//import java.awt.*;
public class LoginTest extends ConfigurationScheduler1 {

    @Test

    public void loginSuccessTest(){

        boolean isFabPresent = new SplashScreen(driver).checkVersion("0.0.3")
                .fillEmail("noa@gmail.com")
                .fillPassword("Nnoa12345$")
                .clickLoginBtn()
                .skipWizard()
                .isFabAddPresent();

        Assert.assertTrue(isFabPresent);}

        @Test
    public void loginStartLoginScreen(){

        boolean isFabPresent = new LoginScreen(driver)
                .fillEmail("your2@gmail.com")
                .fillPassword("Yy123456$")
                .clickLoginBtn()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabPresent);
        }
    }

