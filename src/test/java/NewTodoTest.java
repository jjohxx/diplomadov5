import base.BaseTest;
import org.testng.annotations.Test;
import tasks.tasking.Login;
import tasks.tasking.Todo;
import tasks.validations.IsTodoMessage;

import static org.testng.Assert.assertEquals;

public class NewTodoTest extends BaseTest {

    @Test
    public void addNewTodoTest() {
        Login.as(webDriver, "jhonatan.mamani@gmail.com", "Password123");
        Todo.createNewTodo(webDriver, "Completed Task.");

        assertEquals("Completed Task.", IsTodoMessage.getLastTodoText(webDriver));
    }

}
