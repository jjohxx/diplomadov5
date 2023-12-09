package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By signUp = By.xpath("//a[contains(@href, 'javascript:ShowSignup()') and img[contains(@src, '/Images/design/pagesignup.png')]]\n");
    public static By login = By.xpath("//a[contains(@href, 'javascript:ShowLogin()') and img[contains(@src, '/Images/design/pagelogin.png')]]");
}
