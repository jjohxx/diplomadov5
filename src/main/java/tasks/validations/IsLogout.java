package tasks.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LogoutPageUI;
import ui.MainPageUI;

public class IsLogout {

    public static boolean isVisible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LogoutPageUI.logoutButton);
    }

    public static boolean isLogout(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, MainPageUI.mainContent);
    }
}
