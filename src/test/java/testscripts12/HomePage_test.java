package testscripts12;

import assign12.base.BassClass;
import assign12.pages.HomePage_pageObject;
import assign12.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage_test extends BassClass {
    private LoginPage loginPage;
    private HomePage_pageObject homePagePageObject;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName) {
        initBrowser(browserName);
        loginPage = new LoginPage(getDriver());
        homePagePageObject = new HomePage_pageObject(getDriver());

    }

    @Test(priority = 1)
    public void addItemsToCart() throws InterruptedException {
        loginPage.LoginToApplication(prop.getProperty("username"), prop.getProperty("password"));
        homePagePageObject.addToCart();
        homePagePageObject.goToCart();
        homePagePageObject.goToCheckout();
        homePagePageObject.enterInformation();
//        homePagePageObject.scrollIntoElement();
    }

//    @Test(priority = 2)
//    public void fillInformation() {
//        homePagePageObject.enterInformation();
//    }


    //  @AfterTest
    public void TearDown() {
        getDriver().quit();
    }
}
