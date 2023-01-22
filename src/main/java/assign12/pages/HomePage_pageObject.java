package assign12.pages;

import assign12.base.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_pageObject extends Utility {
    public WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement shirtSauceLabsAddToCart;

    @FindBy(id = "checkout")
    public WebElement clickCheckout;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement goToCartLink;

    @FindBy(name = "firstName")
    private WebElement txtFirstName;

    @FindBy(name = "lastName")
    private WebElement txtLastName;

    @FindBy(name = "postalCode")
    private WebElement postalCode;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement continueBtn;

    public HomePage_pageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //utility=new Utility();
    }

    public void addToCart() {
        clickOnElement(shirtSauceLabsAddToCart);
    }

    public void goToCart() {
        clickOnElement(goToCartLink);
    }

    public void goToCheckout() {
        clickOnElement(clickCheckout);
    }

    public void enterInformation() {
        type(txtFirstName, prop.getProperty("firstName"));
        type(txtLastName, prop.getProperty("lastName"));
        type(postalCode, prop.getProperty("postCode"));
//        moveToElement(continueBtn);
        scrollIntoElement();
    }

}
