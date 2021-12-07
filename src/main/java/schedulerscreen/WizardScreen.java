package schedulerscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class WizardScreen extends BaseScreen {


    public WizardScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/wizard_settings_skip_container']")
    MobileElement skippButton;

    public HomeScreen skipWizard() {
        if (isDisplayedWithExp(skippButton)) {
            skippButton.click();}
            return new HomeScreen(driver);
        }
    }
