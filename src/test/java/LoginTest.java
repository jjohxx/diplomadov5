import base.BaseTest;
import org.testng.annotations.Test;
import tasks.tasking.Login;
import tasks.validations.IsLogin;
import tasks.validations.IsLogout;

import static org.testng.Assert.assertTrue;

public class LoginTest  extends BaseTest {

    @Test
    public void loginTest() {
        Login.as(webDriver, "jhonatan.mamani@gmail.com", "Password123");

        assertTrue(IsLogout.isVisible(webDriver));
        assertTrue(IsLogin.visible(webDriver));
        assertTrue(IsLogin.isLogoVisible(webDriver));
    }
}
