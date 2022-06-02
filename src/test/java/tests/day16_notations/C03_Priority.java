package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    /*
    TestNG test methodlarini isim sirasina gore calistirir
    eger isim siralamasinin disida bir siralama ile calismasini isterseniz
    o zaman test methodlarini oncelik (priority) tanimlayabiliriz.
    Priority kücükten büyüge göre calisir

    egr bir test methoduna priority degeri atanmamissa default degeri 0 olarak belirlenir
     */

    @Test(priority = 5)
    public void test1() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test2() {
        driver.get("https://www.bestbuy.com");
    }


    @Test(groups = "grup1")
    public void test3() {
        driver.get("https://www.techproeducation.com");
    }
}
