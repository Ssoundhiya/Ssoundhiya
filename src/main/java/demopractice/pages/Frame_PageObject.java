package demopractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demopractice.actions.PageActions;

import java.util.concurrent.TimeUnit;

public class Frame_PageObject extends PageActions {
    // WebDriver driver;

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement optionElement;

    @FindBy(xpath = "//span[text()=\"Frames\"]")
    public WebElement optionFrame;

    @FindBy(xpath = "//iframe[@id='frame1']")
    public WebElement frame;

    @FindBy(xpath = "//*[contains(text(),'HTML source.')]")
    public WebElement defaultText;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    public WebElement optionNestedF;

    public Frame_PageObject(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFrame() throws InterruptedException {
        // scrollIntoBottom();
        scrollIntoElement(optionElement);
        clickOnElement(optionElement);
        scrollIntoElement(optionFrame);
        clickOnElement(optionFrame);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.switchTo().frame(frame);
    }

    public void getElement() {
        WebElement txt = driver.findElement(By.xpath("(//*[text()='This is a sample page'])[1]"));
        String elementText = txt.getText();
        System.out.println("Element Text  :" + elementText);
    }

    public void getDefaultText() {
        System.out.println("Default Page Text:" + defaultText.getText());
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

}
