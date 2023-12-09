package tasks.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.FormSignUp;
import ui.HomePageUI;

public class SignUp {

    public static void register(WebDriver webDriver, String fullName, String pass, String email) {
        Click.on(webDriver, HomePageUI.signUp);
        Enter.text(webDriver, FormSignUp.fullName, fullName);
        Enter.text(webDriver, FormSignUp.email, email);
        Enter.text(webDriver, FormSignUp.password, pass);
        Click.on(webDriver, FormSignUp.terms);
        Click.on(webDriver, FormSignUp.signUpButton);
    }
}
