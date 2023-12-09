package tasks.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;

public class Todo {

    public static void createNewTodo(WebDriver webDriver, String todoText) {
        Enter.text(webDriver, LoginPageUI.newTodoText, todoText);
        Click.on(webDriver, LoginPageUI.addTodo);
    }
}
