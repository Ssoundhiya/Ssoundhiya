package assign12.base;

import assign12.actions.PageActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Utility extends BassClass {

    public void clickOnElement(WebElement locator) {
        locator.click();
    }
    public void type(WebElement locator, String value) {
        locator.sendKeys(value);
    }

    public void scrollIntoElement(){
//          js =(JavascriptExecutor)driver;
       // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
//        js.executeScript("arguments[0].scrollIntoView(true);",element);
     //   WebElement element = driver.findElement(By.xpath("//*[text()='OrangeHRM OS 5.1']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
}
