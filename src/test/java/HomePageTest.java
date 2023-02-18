import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest {
    SetUp newTest = new SetUp();


    @Test(priority = 2)
    public void verifyThatHomeScreenIsDisplayedSuccessfully(){
        WebElement heroSection = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[1]/div/div[1]/div/div/div/div/div"));
        assertTrue(heroSection.isDisplayed());

    }
}
