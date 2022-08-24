package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_Assertions extends TestBase {
    @Test
    public void test01() {

        driver.get("https://www.amazon.com");
        String title=driver.getTitle();
        String actualTitle="Amazon";
        Assert.assertTrue(title.contains(actualTitle));

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYazisi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYazisi.isDisplayed());
        Assert.assertTrue(sonucYazisi.getText().contains("Nutella"));

    }
}
