package tasks.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;

public class IsLogin {

    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoginPageUI.mainContent);
    }

    public static boolean isLogoVisible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoginPageUI.logoImage);
    }
}
