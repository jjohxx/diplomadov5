package ui;

import org.openqa.selenium.By;

public class FormSignUp {

    public static final By fullName = By.xpath("//input[@id='ctl00_MainContent_SignupControl1_TextBoxFullName']");
    public static final By email =  By.xpath("//input[@id='ctl00_MainContent_SignupControl1_TextBoxEmail']");
    public static final By password = By.xpath("//input[@id='ctl00_MainContent_SignupControl1_TextBoxPassword']");
    public static final By terms = By.xpath("//input[@id='ctl00_MainContent_SignupControl1_CheckBoxTerms']");
    public static final By signUpButton = By.xpath("//input[@id='ctl00_MainContent_SignupControl1_ButtonSignup' and @type='image']");

}
