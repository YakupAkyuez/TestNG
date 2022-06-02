package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    @BeforeClass
    public void BeforeClassMethod(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void AfterClassMethod(){
        System.out.println("AfterrClass");
    }


    @Test
    public void test1() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void test2() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }


    @Test
    public void test3() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
