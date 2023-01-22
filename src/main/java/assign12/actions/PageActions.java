package assign12.actions;

import assign12.base.BassClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageActions extends BassClass {
public Actions actions;

    public void type(WebElement locator, String value) {
        locator.sendKeys(value);
    }

    public void clickOnElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnElement(WebElement locator) {
        locator.click();
    }

    public String getElementText(WebDriver driver,WebElement locator){
        return locator.getText();
    }

    public void scrollIntoElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

}
