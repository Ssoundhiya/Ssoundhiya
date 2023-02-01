package demopractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demopractice.actions.PageActions;

public class NestedFrame_PageObject extends PageActions {

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement optionElement;

    @FindBy(xpath = "//span[text()=\"Frames\"]")
    public WebElement optionFrame;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    public WebElement optionNestedF;

    @FindBy(xpath = "//iframe[@id='frame1']")
    public WebElement parentFrameId;

    @FindBy(xpath = "//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")
    WebElement childFrameId;

    @FindBy(xpath = "//html/body[contains(text(),'Parent frame')]")
    WebElement parentFText;

    @FindBy(xpath = "//*[contains(text(),'Child Iframe')]")
    public WebElement childFText;

    public NestedFrame_PageObject(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToFrameOption(){
        scrollIntoElement(optionElement);
        clickOnElement(optionElement);
        scrollIntoElement(optionFrame);
        clickOnElement(optionFrame);
    }

    public void clickOnNestedF(){
        scrollIntoElement(optionNestedF);
        clickOnElement(optionNestedF);
    }
    public void switchToNestedF(){
//        driver.switchTo().frame(parentF);
        switchToFrame(parentFrameId);
    }
    public void getElementText(){
//        WebElement txt = driver.findElement(By.xpath("//html/body[contains(text(),'Parent frame')]"));
        System.out.println("Parent Text:" +parentFText.getText());
    }

    public void gettextChildF(){
        switchToFrame(childFrameId);
        System.out.println("Child Text:" +childFText.getText());
    }


}
