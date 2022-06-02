package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class PozitifLoginTest extends TestBaseRapor {
    BrcPage brcPage=new BrcPage();

    @Test

    public void positiveLoginTest() {
        extentTest=extentReports.createTest("Pozitif Login","Usable pass must working");
        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("went to Brc  homepage ");
        //		login butonuna bas
        brcPage.ilkLoginButonu.click();
        extentTest.info("login clicked ");

        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Email is ok ");

        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Password is ok ");

        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        extentTest.info("second login buton is ok ");

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);
        extentTest.info("user successfully logged in ");


        Driver.closeDriver();




    }
}
