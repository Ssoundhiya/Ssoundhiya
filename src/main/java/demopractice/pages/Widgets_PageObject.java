package demopractice.pages;

import demopractice.actions.PageActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Widgets_PageObject extends PageActions {
    Logger log = LogManager.getLogger("Widgets_PageObject");
    public WebDriver driver;

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement elementOption;

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement clickElementOption;

    @FindBy(xpath = "//*[contains(text(),'Widgets')]")
    public WebElement widgetsOption;

    @FindBy(xpath = "//*[contains(text(),'Accordian')]")
    public WebElement clickAccordian;

    @FindBy(xpath = "//*[contains(text(),'Auto Complete')]")
    public WebElement clickAuto;

    @FindBy(xpath = "//*[contains(text(),'Date Picker')]")
    public WebElement clickDataPicker;

    @FindBy(xpath = "//*[contains(text(),'Slider')]")
    public WebElement clickSlider;

    @FindBy(xpath = "//*[contains(text(),'Progress Bar')]")
    public WebElement clickProgress;

    @FindBy(xpath = "//*[contains(text(),'Tabs')]")
    public WebElement clickTabs;

    @FindBy(xpath = "//*[contains(text(),'Tool Tips')]")
    public WebElement clickTool;

    @FindBy(xpath = "//*[contains(text(),'Menu')]")
    public WebElement clickMenu;

    @FindBy(xpath = "//*[contains(text(),'Select Menu')]")
    public WebElement clickSelectMenu;

    @FindBy(xpath = "//*[contains(text(),'What is Lorem Ipsum?')]")
    public WebElement ipsumOption;

    @FindBy(xpath = "//*[contains(text(),'printing and typesetting industry')]")
    public WebElement txtIpsum;

    @FindBy(xpath = "//*[contains(text(),'Where does it come from?')]")
    public WebElement comeOption;

    @FindBy(xpath = "//*[contains(text(),'Richard McClintock')]")
    public WebElement txtCome;

    @FindBy(xpath = "//*[contains(text(),'Why do we use it?')]")
    public WebElement useOption;

    @FindBy(xpath = "//*[contains(text(),'long established fact')]")
    public WebElement txtUse;

    @FindBy(xpath = "//span[contains(text(),'Date Picker')]")
    public WebElement datePickerOption;

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement dateInputBox;

    @FindBy(className = "react-datepicker__day react-datepicker__day--016")
    public WebElement dayDate;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement month;

    @FindBy(xpath = "//*[@class=\"react-datepicker__week\"]/div[contains(text(),16)]")
    public WebElement day;

    @FindBy(id = "dateAndTimePickerInput")
    public WebElement timePickerInputBox;

    @FindBy(xpath = "//*[@class='react-datepicker__time-list']/li[contains(text(),'01:00')]")
    public WebElement selectTime;

    public Widgets_PageObject(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnWidgets() throws InterruptedException {
        scrollIntoBottom();
        clickOnElement(clickElementOption);
        clickOnElement(widgetsOption);
        Thread.sleep(2000);
        clickOnElement(clickAccordian);
        clickOnElement(ipsumOption);
    }

    public void getElementText() {
        String text = txtIpsum.getText();
        System.out.println(text);
    }

    public void verifyText() {

        String actualTxt = txtIpsum.getText();
        String expectedTxt = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//
        Assert.assertEquals(actualTxt, expectedTxt);
        System.out.println("Test Is Passed");
    }

    public void datePicker(WebDriver driver,String time) throws InterruptedException {
        clickOnElement(datePickerOption);
        clickOnElement(dateInputBox);
//        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select list = new Select(month);
        list.selectByVisibleText("October");
        List<WebElement> options = list.getOptions();
        System.out.println("Total Month:" + options.size());
        System.out.println("Month List:");

        for (WebElement element : options) {
            System.out.println(element.getText());
        }

        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select list2 = new Select(year);
        list2.selectByValue("1991");
        List<WebElement> options1 = list2.getOptions();
        System.out.println("Total Year:" + options1.size());
        System.out.println("Year List:");

        for (WebElement element1 : options1) {
            System.out.println(element1.getText());
        }
        clickOnElement(day);
        clickOnElement(timePickerInputBox);
        WebElement times=driver.findElement(By.xpath("//*[@class='react-datepicker__time-list']/li[contains(text(),'"+time+"')]"));
        waitForElementVisible(times);
        scrollIntoElement(times);
        Thread.sleep(4000);
        clickOnElement(times);

    }
}
