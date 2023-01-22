package demopractice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import demopractice.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class PageActions extends BaseClass {
//    WebDriverWait wait;

    public void type(WebElement locator, String value) {
        locator.sendKeys(value);
    }

    public void clickOnElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnElement(WebElement locator) {
        locator.click();
    }

    public String getElementText(WebDriver driver, WebElement locator) {
        return locator.getText();
    }

    public void scrollIntoBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollIntoElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void switchToFrame(WebElement element){
        driver.switchTo().frame(element);
    }

    public void switchTOChildWindow(WebElement element) {
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        System.out.println("All Window Id:"+windows);
        for (String window : windows) {
            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);
                System.out.println("Child Window Id:"+window);
                // System.out.println("Child Window Url:"+driver.getCurrentUrl());
                waitForElementVisible(element);
                System.out.println("Child Window Text:"+element.getText());
                driver.close();
            }
            driver.switchTo().window(parentWindow);
        }
    }

    public void waitForElementVisible(WebElement element) {
        WebDriverWait  wait= new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void datePicker(String value){
        WebElement dateBox = driver.findElement(By.id("dateOfBirthInput"));
        dateBox.sendKeys(value);
    }
    public void s(){
    }
}
