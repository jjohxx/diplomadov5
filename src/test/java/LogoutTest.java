import base.BaseTest;
import org.testng.annotations.Test;
import tasks.tasking.Login;
import tasks.tasking.Logout;
import tasks.validations.IsLogout;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {
        Login.as(webDriver, "jhonatan.mamani@gmail.com", "Password123");
        Logout.logout(webDriver);

        assertTrue(IsLogout.isLogout(webDriver));
        assertFalse(IsLogout.isVisible(webDriver));
    }
}
