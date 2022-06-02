package tests.day21_ReusableMEthods_HTMLReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C01_WindowhandleReusableMethods {
    @Test
    public void test01() {

        //https://www.the-internet.com/windows
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows ");
        String firstPageWH = Driver.getDriver().getWindowHandle();

        //Clickhere buttona basin
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();
        String secondPageWH = "";
        for (String each : windowHandleSet
        ) {
            if (!each.equals(firstPageWH)) {
                secondPageWH = each;
            }
        }
        Driver.getDriver().switchTo().window(secondPageWH);
        System.out.println(Driver.getDriver().getTitle());

        //acilan yeni tabin titleinin "New Window" oldugunu test edin
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();

    }

    @Test
    public void test02() {
        //https://www.the-internet.com/windows
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows ");
        //Clickhere buttona basin
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        //acilan yeni tabin titleinin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");
        Driver.closeDriver();
    }
}
