package tests.Practice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.Driver;

public class HotelTest {

    @Test
    public void test01() {
        HotelMyCamp hotel=new HotelMyCamp();

        Driver.getDriver().get("https://www.hotelmycamp.com/");

        hotel.loginButton.click();

        hotel.userName.sendKeys("manager");
        hotel.passWord.sendKeys("Manager1!"+Keys.ENTER);

        Assert.assertTrue(hotel.resultTrueElement.isDisplayed());
        Driver.closeDriver();


    }
}
