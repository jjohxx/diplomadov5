package ui;

import org.openqa.selenium.By;

public class LoginPageUI {

    public static final By emailInput = By.xpath("//input[@id='ctl00_MainContent_LoginControl1_TextBoxEmail']");
    public static final By passwordInput = By.xpath("//input[@id='ctl00_MainContent_LoginControl1_TextBoxPassword']");
    public static final By loginButton = By.xpath("//input[@id='ctl00_MainContent_LoginControl1_ButtonLogin' and @type='image']");
    public static final By mainContent = By.xpath("//div[@id='ctl00_MainContent_PanelAuth']");
    public static final By logoImage = By.xpath("//img[@src='/Images/logo2.png']");

    public static final By newTodoText = By.id("NewItemContentInput");
    public static final By addTodo = By.id("NewItemAddButton");

}
