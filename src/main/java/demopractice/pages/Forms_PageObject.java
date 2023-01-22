package demopractice.pages;

import demopractice.actions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Forms_PageObject extends PageActions {
    public WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'Forms')]")
    public WebElement formsOption;

    @FindBy(xpath = "//*[contains(text(),'Practice Form')]")
    public WebElement practiceFormOption;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement emailId;

    @FindBy(xpath = "//*[contains(text(),'Male')]")
    public WebElement btnGender;

    @FindBy(id = "userNumber")
    public WebElement mobNumber;

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement elementOption;

    @FindBy(xpath = "//h5[text()=\"Alerts, Frame & Windows\"]")
    public WebElement clickElementOption;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement inputSub;

    @FindBy(xpath = "//*[contains(text(),'Sports')]")
    public WebElement btnHobbies;

    @FindBy(id = "currentAddress")
    public WebElement inputAdd;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement clickFile;

//    @FindBy(xpath = "//div[@id='state']")
    @FindBy(xpath = "//*[@id=\"close-fixedban\"]")
    public WebElement btnState;

    @FindBy(xpath = "//*[contains(text(),'Rajasthan')]")
    public WebElement txtState;

    public Forms_PageObject(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnForms() throws InterruptedException {
        scrollIntoElement(elementOption);
        clickOnElement(clickElementOption);
        Thread.sleep(3000);
        clickOnElement(formsOption);
        Thread.sleep(3000);
        clickOnElement(practiceFormOption);
    }

    public void enterInformation() throws InterruptedException {
        type(firstName, prop.getProperty("firstName"));
        type(lastName, prop.getProperty("lastName"));
        type(emailId, prop.getProperty("email"));
        clickOnElement(btnGender);
        type(mobNumber, prop.getProperty("mobile"));
        scrollIntoBottom();
        //  datePicker("16101991");
        type(inputSub, prop.getProperty("subject"));
        clickOnElement(btnHobbies);
        type(inputAdd, prop.getProperty("address"));
        clickOnElement(btnState);

    }

    public void uploadFile() {

//        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//        chooseFile.sendKeys("Users/rojis/Downloads/Shailendra cv.docx");
    }

    public void selectElement() {
        List<WebElement> element = driver.findElements(By.xpath("//div[@id='state']"));
      //  Select dropDown = new Select(element);
        System.out.println("Total Text:" +element.get(1));
        System.out.println("Total Options:" + element.size());
        //  dropDown.selectByVisibleText("Rajasthan");
    }

}
