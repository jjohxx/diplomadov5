package tasks.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginPageUI;

public class Login {

    public static void as(WebDriver webDriver, String user, String pass) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginPageUI.emailInput, user);
        Enter.text(webDriver, LoginPageUI.passwordInput, pass);
        Click.on(webDriver, LoginPageUI.loginButton);
    }

    public enum Status {
        SUCCESS("success"), FAILED("error");

        private final String statusValue;

        Status(String statusValue) {
            this.statusValue = statusValue;
        }

        public String getValue() {
            return this.statusValue;
        }
    }
}
