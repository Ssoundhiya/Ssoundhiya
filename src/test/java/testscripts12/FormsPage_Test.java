package testscripts12;

import demopractice.base.BaseClass;
import demopractice.pages.Forms_PageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.text.StyledEditorKit;

public class FormsPage_Test extends BaseClass {

    Forms_PageObject forms_pageObject;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName){
        initBrowser(browserName);
        forms_pageObject = new Forms_PageObject(getDriver());
    }
    @Test
    public void submitForm() throws InterruptedException {
        forms_pageObject.clickOnForms();
        forms_pageObject.enterInformation();
      //  forms_pageObject.uploadFile();
      //  forms_pageObject.selectElement();
    }

}
