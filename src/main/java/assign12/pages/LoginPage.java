package assign12.pages;

import assign12.actions.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageActions {

     public WebDriver driver;

     @FindBy(name = "user-name")
     private WebElement txtUserName;

     @FindBy(name = "password")
     private WebElement txtPassword;

     @FindBy(name = "login-button")
     private WebElement btnLogin;

     public LoginPage(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver,this);
     }
     public void LoginToApplication(String username,String password){
         type(txtUserName,username);
         type(txtPassword,password);
         clickOnElement(btnLogin);

     }
}
