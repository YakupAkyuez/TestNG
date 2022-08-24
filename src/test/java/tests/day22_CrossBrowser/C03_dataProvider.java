package tests.day22_CrossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_dataProvider {

    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);

        String expected="Nutella";

        String actual=amazonPage.SearchResultElement.getText();
        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();

    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] arananKelimeArr={{"Nutella"}, {"Java"}, {"Yakup"}, {"Netherlands"}};
        return  arananKelimeArr;
    }


    @Test(dataProvider = "AranacakKelimeler")
    public void C03_dataProvider(String arananKelime) {
        //arayacagimiz kelimleri bir liste gibi tutup
        //bana yollayacak bir veri saglayicisi olusturacagiz

        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Nutella,Java,Yakup,Netherlands icin arama yapalim
        amazonPage.searchBox.sendKeys(arananKelime+ Keys.ENTER);
        //aradigimiz kelimeyi icerdigini test edelim
        String expected=arananKelime;

        String actual=amazonPage.SearchResultElement.getText();
        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();

        //sayfayi kapatalim
    }
}
