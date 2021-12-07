package schedulerscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@resourse-id='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;
    @FindBy(how = How.XPATH, using = "//*[@resourse-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;
    @FindBy(how = How.XPATH, using = "//*[@resourse-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    public LoginScreen fillEmail(String email) {
        should(emailEditText,20);
        type(emailEditText, email);
        return this;
    }

    public LoginScreen fillPassword(String password) {
        type(emailEditText, password);
        return this;

    }
    public WizardScreen clickLoginBtn(){
        hideKeyboard();
        loginButton.click();
        return new WizardScreen(driver);

    }
}