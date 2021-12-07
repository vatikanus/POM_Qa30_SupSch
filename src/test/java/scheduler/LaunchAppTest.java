package scheduler;

import config.ConfigurationScheduler1;
import org.testng.Assert;
import org.testng.annotations.Test;
import schedulerscreen.SplashScreen;

public class LaunchAppTest extends ConfigurationScheduler1 {

    @Test
    public void launchTest()
    {
        String version = new SplashScreen(driver).getCurrencyVersion();
        Assert.assertEquals(version,"0.0.3");
    }
}
