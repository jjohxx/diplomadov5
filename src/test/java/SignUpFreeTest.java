import actions.WaitUntilElement;
import base.BaseTest;
import org.testng.annotations.Test;
import tasks.tasking.SignUp;
import ui.MainPageUI;

import static org.testng.AssertJUnit.assertTrue;

public class SignUpFreeTest extends BaseTest {

    @Test
    public void signUpFreeTest() {
        SignUp.register(webDriver,
                "Jhonatan Mamani",
                "Password123",
                "jhonatan.mamani8@postgrado.umss.edu");

        assertTrue(WaitUntilElement.isPresent(webDriver, MainPageUI.projectTitle));
        assertTrue(WaitUntilElement.isVisible(webDriver, MainPageUI.logoutLink));
    }
}
