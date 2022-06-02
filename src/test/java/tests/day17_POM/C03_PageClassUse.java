package tests.day17_POM;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassUse {

    @Test
    public void test01() {
        FacebookPage fbPage=new FacebookPage();
        //Facebook a gidin
        Driver.getDriver().get("https://www.facebook.com");
        //Cookiesi kabul edin
        fbPage.cookiesButton.click();
        //kullanici ve paswordu rastgele yazdirin
        Faker faker=new Faker();
        fbPage.mailBox.sendKeys(faker.internet().emailAddress());
        //logine tiklayin
        fbPage.passBox.sendKeys(faker.internet().password());
        //giris yapilmadi diye test edin
        fbPage.loginButton.click();
        Assert.assertTrue(fbPage.negativeResulteElement.isDisplayed());
        Driver.closeDriver();




    }
}
