import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductShowTest {


    @Test(priority = 3)
    public void verifyThatHomeOfficeBoxIsDisplayed(){
        WebElement HomeOfficeBox = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[1]/div/div[3]/div[4]/div/a"));
        assertTrue(HomeOfficeBox.isDisplayed());

    }


    @Test(priority = 4)
    public  void verifyThatClickingHomeOfficeBoxOpensThePage() {
        WebElement HomeOfficeBox = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[1]/div/div[3]/div[4]/div/a"));
        HomeOfficeBox.click();
        WebElement HomeOfficePage = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/h1"));
        assertTrue(HomeOfficePage.isDisplayed());
    }

    @Test(priority = 5)
    public void verifyThatBookCasesBoxIsDisplayed(){
        WebElement BookCasesBox = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/div[4]/div/div[1]/div/div[1]/div/ul/li[3]/div[1]/a"));
        assertTrue(BookCasesBox.isDisplayed());
    }

    @Test(priority = 6)
    public void verifyThatClickingBookCasesBoxOpensThePage(){
        WebElement BookCasesBox = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/div[4]/div/div[1]/div/div[1]/div/ul/li[3]/div[1]/a"));
        BookCasesBox.click();
        WebElement BookCasesPage = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/h1"));
        assertTrue(BookCasesPage.isDisplayed());

    }

    @Test(priority = 7)
    public void verifyThatWoodLibraryBoXIsDisplayed(){
        WebElement WoodLibraryBoX = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/div[4]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/a"));
        assertTrue(WoodLibraryBoX.isDisplayed());
    }

    @Test(priority = 8)
    public void verifyThatClickingWoodLibraryBoXOpensThePage(){
        WebElement WoodLibraryBoX = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/div[4]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/a"));
        WoodLibraryBoX.click();
        WebElement WoodLibraryPage = SetUp.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[2]/span/form/div[2]/div/div[2]/h1"));
        assertTrue(WoodLibraryPage.isDisplayed());
    }


}
