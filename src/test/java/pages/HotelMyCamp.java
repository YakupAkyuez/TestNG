package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {

    public HotelMyCamp(){
        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "//*[@id='navLogon']")
   public WebElement loginButton;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userName;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passWord;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement resultTrueElement;
}
