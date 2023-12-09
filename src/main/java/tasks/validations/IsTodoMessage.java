package tasks.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsTodoMessage {

    public static String getLastTodoText(WebDriver webDriver) {
        WebElement ulElement = webDriver.findElement(By.id("mainItemList"));
        WebElement lastLiElement = ulElement.findElement(By.xpath("(//ul[@id='mainItemList']/li)[last()]"));
        WebElement lastItemContentDiv = lastLiElement.findElement(By.cssSelector("div.ItemContentDiv"));
        return lastItemContentDiv.getText();
    }
}
