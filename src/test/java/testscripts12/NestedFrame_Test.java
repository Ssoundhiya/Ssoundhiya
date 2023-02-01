package testscripts12;

import org.testng.annotations.*;
import demopractice.base.BaseClass;
import demopractice.pages.NestedFrame_PageObject;

public class NestedFrame_Test extends BaseClass {

    NestedFrame_PageObject nestedFrame_pageObject;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName) throws InterruptedException {
        initBrowser(browserName);
        nestedFrame_pageObject = new NestedFrame_PageObject(getDriver());
    }
    @Test
    public void getNestedFText() throws InterruptedException{
        nestedFrame_pageObject.goToFrameOption();
        nestedFrame_pageObject.clickOnNestedF();
        nestedFrame_pageObject.switchToNestedF();
        nestedFrame_pageObject.getElementText();
        nestedFrame_pageObject.gettextChildF();
    }
    //@AfterTest
    public void tearDown(){
        closeDriver();
    }
}
