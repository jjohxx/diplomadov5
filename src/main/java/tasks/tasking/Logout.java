package tasks.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginPageUI;
import ui.LogoutPageUI;

public class Logout {

    public static void logout(WebDriver webDriver) {
        Click.on(webDriver, LogoutPageUI.logoutButton);
    }

}
