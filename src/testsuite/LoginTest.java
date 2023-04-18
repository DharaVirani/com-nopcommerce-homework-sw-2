package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
    openBrowser(baseUrl); //method of Parent class used where browser was setup
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
//    click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click(); //action done on the found loginLink
//    Verify the text ‘Welcome, Please Sign In!’
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Login not successful",expectedMessage,actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
//          click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click(); //action done on the found loginLink
//           Enter valid username
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("priya12jodhani@gmail.com");
//    Enter valid password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("priya123");
//        Click on login Button
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));
        loginButton.click();
//     Verify the ‘Log out’ text is display
         String expectedMessage = "Log out";
         WebElement actualTextLogOut = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
         String actualMessage = actualTextLogOut.getText();
         Assert.assertEquals("Login not successful",expectedMessage,actualMessage);


    }

    @Test
    public void verifyTheErrorMessage(){
//      click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click(); //action done on the found loginLink
//      Find the email field to enter the email
        WebElement emailField = driver.findElement(By.id("Email"));
//        Pass the username
        emailField.sendKeys("dharavirani28@gmail.com");
//        Find the password field
        WebElement passwordField = driver.findElement(By.id("Password"));
//        Pass the password
        passwordField.sendKeys("9081811670Dv");
//        Click on Login button
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));
        loginButton.click();
//        Verifying the error message ‘Login was unsuccessful.
//        Please correct the errors and try again. No customer account found’
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message not displayed",expectedMessage,actualMessage);


    }

    @After
    public  void tearDown(){
    closeBrowser();
    }

}
