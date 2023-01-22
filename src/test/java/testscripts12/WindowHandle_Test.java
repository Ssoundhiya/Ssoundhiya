package testscripts12;

import demopractice.base.BaseClass;
import demopractice.pages.WindowHandle_PageObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WindowHandle_Test extends BaseClass {
    WindowHandle_PageObject windowHandle_pageObject;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName) throws InterruptedException {
        initBrowser(browserName);
        windowHandle_pageObject =new WindowHandle_PageObject(getDriver());
    }
    @Test
    public void windowHandle(){
        windowHandle_pageObject.clickOnFrame();
        windowHandle_pageObject.clickToBrowser();
//        windowHandle_pageObject.goToLinkAndGetText();
//        windowHandle_pageObject.goToNewWindowAndGetText();
        windowHandle_pageObject.goToNewWindowMsgAndGetText();
//
    }
    }
