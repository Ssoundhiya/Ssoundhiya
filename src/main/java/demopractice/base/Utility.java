package demopractice.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utility extends BaseClass {

    public void clickOnElement(WebElement locator) {
        locator.click();
    }
    public void type(WebElement locator, String value) {
        locator.sendKeys(value);
    }

    public void scrollIntoElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
}
