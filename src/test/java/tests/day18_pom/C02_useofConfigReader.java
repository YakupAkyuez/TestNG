package tests.day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_useofConfigReader {
    @Test
    public void test01() {
        FacebookPage fbPage=new FacebookPage();
        //Facebook a gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        //Cookiesi kabul edin
        fbPage.cookiesButton.click();
        //kullanici ve paswordu rastgele yazdirin

        fbPage.mailBox.sendKeys(ConfigReader.getProperty("fbWrongUserName"));
        //logine tiklayin
        fbPage.passBox.sendKeys(ConfigReader.getProperty("fbWrongPassword"));
        //giris yapilmadi diye test edin
        fbPage.loginButton.click();
        Assert.assertTrue(fbPage.negativeResulteElement.isDisplayed());
        Driver.closeDriver();




    }
}
