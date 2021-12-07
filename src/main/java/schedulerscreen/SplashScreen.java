package schedulerscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends BaseScreen {

    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resourse-id ='com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;

    public String getCurrencyVersion(){
        return versionTextView.getText();
    }
    public LoginScreen checkVersion(String text){
        shouldHave(versionTextView,text,20);
        return new LoginScreen(driver);



    }




}
