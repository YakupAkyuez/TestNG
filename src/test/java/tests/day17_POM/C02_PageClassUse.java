package tests.day17_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassUse {



    @Test
    public void test01() {

        AmazonPage amazonPage=new AmazonPage();
        // amazond gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //Nutella arat
        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);


    //sonucun nutella icerdigini test et
        String actual=amazonPage.SearchResultElement.getText();
        String search="Nutella";
        Assert.assertTrue(actual.contains(search));
        Driver.closeDriver();
}
}
