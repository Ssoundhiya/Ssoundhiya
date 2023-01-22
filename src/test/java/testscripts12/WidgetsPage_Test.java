package testscripts12;

import demopractice.base.BaseClass;
import demopractice.pages.Widgets_PageObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WidgetsPage_Test extends BaseClass {

    Widgets_PageObject widgets_pageObject;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName){
        initBrowser(browserName);
        widgets_pageObject = new Widgets_PageObject(getDriver());
    }
    @Test
    public void handleWidgets() throws InterruptedException {
        widgets_pageObject.clickOnWidgets();
        widgets_pageObject.getElementText();
        widgets_pageObject.verifyText();
        widgets_pageObject.datePicker(getDriver(),"03:32");
//        widgets_pageObject.directSendDate();
    }
  //  @AfterTest
    public void tearDown(){
        driver.close();
    }

}
