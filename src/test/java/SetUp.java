import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SetUp {
    public static ChromeDriver chromeDriver;
    public static WebDriverWait wait;

    @Test(priority = 1)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 60);
        chromeDriver.get("https://www.worldmarket.com/");
    }

}




