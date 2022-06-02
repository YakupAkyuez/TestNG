package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {

    @Test
    public void test1() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test2() {
        driver.get("https://www.bestbuy.com");
    }


    @Test
    public void test3() {
        driver.get("https://www.techproeducation.com");
    }
}
