package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="email")
    public WebElement mailBox;

    @FindBy(id="pass")
    public WebElement passBox;

    @FindBy(name="login")
    public WebElement loginButton;

    @FindBy(className = "_9ay7")
    public WebElement negativeResulteElement;

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
    public WebElement cookiesButton;



}
