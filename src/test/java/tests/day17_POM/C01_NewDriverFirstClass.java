package tests.day17_POM;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_NewDriverFirstClass {

    @Test(groups = "grup1")
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");

        /*
        Bugüne kadar Testbasden extends yaptigimiz driver yerine
         YUKARIDAKI Gibi driver classindan kullanacagimiz get driver
        static methodunu kullanacagiz

         */
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
