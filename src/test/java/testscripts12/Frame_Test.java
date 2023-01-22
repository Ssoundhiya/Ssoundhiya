package testscripts12;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import demopractice.base.BaseClass;
import demopractice.pages.Frame_PageObject;

public class Frame_Test extends BaseClass {
    //  public WebDriver driver;
    Frame_PageObject frame_pageObject;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName) throws InterruptedException {
        initBrowser(browserName);
        frame_pageObject = new Frame_PageObject(getDriver());
    }
    @Test
    public void getFrameText() throws InterruptedException {

        frame_pageObject.clickOnFrame();
        frame_pageObject.getElement();
        frame_pageObject.switchToDefaultContent();
        frame_pageObject.getDefaultText();
    }
    @AfterTest
    public void tearDown() {
        closeDriver();
    }

}
