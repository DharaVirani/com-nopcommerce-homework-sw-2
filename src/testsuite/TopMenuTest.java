package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
//        Click on the 'Computers' Tab
        WebElement computersLink= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
//        Action performed on that element
        computersLink.click();
//        Verify the text ‘Computers’
        String expectedMessage = "Computers";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
//        Click on the 'Electronics' Tab
        WebElement electronicsLink= driver.findElement(By.xpath("//ul[contains(@class,'top-menu notmobile')]//a[text()='Electronics ']"));
//        Action performed on that element
        electronicsLink.click();
//        Verify the text ‘Electronics’
        String expectedMessage = "Electronics";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
//        Click on the 'Apparel' Tab
        WebElement electronicsLink= driver.findElement(By.xpath("//ul[contains(@class,'top-menu notmobile')]//a[contains(text(),'Apparel ')]"));
//        Action performed on that element
        electronicsLink.click();
//        Verify the text ‘Apparel’
        String expectedMessage = "Apparel";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Apparel']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
//        Click on the 'Digital downloads' Tab
        WebElement electronicsLink= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
//        Action performed on that element
        electronicsLink.click();
//        Verify the text ‘Digital downloads’
        String expectedMessage = "Digital downloads";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Digital downloads']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
//        Click on the 'Books' Tab
        WebElement electronicsLink= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
//        Action performed on that element
        electronicsLink.click();
//        Verify the text ‘Books’
        String expectedMessage = "Books";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Books']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldNavigateToJeweleryPageSuccessfully(){
//        Click on the 'Jewelry' Tab
        WebElement electronicsLink= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
//        Action performed on that element
        electronicsLink.click();
//        Verify the text ‘Jewelry’
        String expectedMessage = "Jewelry";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Jewelry']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
//        Click on the 'Gift Cards' Tab
        WebElement electronicsLink= driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
//        Action performed on that element
        electronicsLink.click();
//        Verify the text ‘Gift Cards’
        String expectedMessage = "Gift Cards";
//       Checking actual element text
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Gift Cards']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
