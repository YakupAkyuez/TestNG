package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {
    /*
     POM'de Driver icin TestBase class'ina extends etmek yerine
     Driver class'indan static method'lar kullanarak
     driver olusturup, ilgili ayarlarin yapilmasi
     ve en sonda driver'in kapatilmasi tercih edilmistir.
      */
    static WebDriver driver;
    public static WebDriver getDriver(String browser){
        browser = browser == null ? ConfigReader.getProperty("browser") : browser;

        if (driver==null) {
            switch (browser){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){ // driver'a deger atanmissa
            driver.close();
            driver=null;
        }
}
}