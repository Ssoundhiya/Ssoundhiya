package testscripts12;

import assign12.base.BassClass;
import assign12.pages.LoginPage;
import org.testng.annotations.*;

public class LoginPageTest extends BassClass {

    private LoginPage loginPage;

    @BeforeTest
    @Parameters({"browserName"})
    public void openBrowser(String browserName){
        initBrowser(browserName);
        loginPage = new LoginPage(getDriver());
    }
    @Test
    public void verifyLogin(){
        loginPage.LoginToApplication(prop.getProperty("username"), prop.getProperty("password") );
    }

//     @AfterTest
    public void TearDown(){
        getDriver().quit();
    }
}
