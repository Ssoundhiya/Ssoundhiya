package demopractice.pages;

import demopractice.actions.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class WindowHandle_PageObject extends PageActions {

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement optionElement;

    @FindBy(xpath = "//span[text()=\"Frames\"]")
    public WebElement optionFrame;

    @FindBy(xpath = "//*[contains(text(),'Browser Windows')]")
    public WebElement optionWindow;

    @FindBy(xpath = "//button[@id='tabButton']")
    public WebElement newTab;

    @FindBy(xpath = "//button[@id='windowButton']")
    public WebElement newWindow;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    public WebElement newWindowMsgOption;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    public WebElement txtNewTab;

    @FindBy(xpath = "//body[contains(text(),'Knowledge')]")
    public WebElement txtNewWindowMsg;

    public WindowHandle_PageObject(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFrame() {
        scrollIntoElement(optionElement);
        clickOnElement(optionElement);
    }

    public void clickToBrowser() {
        clickOnElement(optionWindow);
    }

    public void goToLinkAndGetText() {
        clickOnElement(newTab);
        switchTOChildWindow(txtNewTab);
    }


    public void goToNewWindowAndGetText(){
        clickOnElement(newWindow);
        switchTOChildWindow(txtNewTab);
    }
    public void goToNewWindowMsgAndGetText(){
        clickOnElement(newWindowMsgOption);
        switchTOChildWindow(txtNewWindowMsg);


    }

}
