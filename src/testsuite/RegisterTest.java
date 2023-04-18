package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
     WebElement registerLink = driver.findElement(By.linkText("Register"));
     registerLink.click();
     String expectedMessage = "Register";
     WebElement actualTextElement = driver.findElement(By.linkText("Register"));
     String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Invalid Text",expectedMessage,actualMessage);
    }

    @Test
    public  void userShouldRegisterAccountSuccessfully(){

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
//        Selecting gender radio button
        WebElement genderRadioButton = driver.findElement(By.id("gender-female"));
        genderRadioButton.click();

//        Enter first name
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Priya");

//        Enter last name
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Jodhani");

//        Date of birth
       WebElement dayOfBirth= driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
       dayOfBirth.sendKeys("28");
        WebElement monthOfBirth= driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        monthOfBirth.sendKeys("June");
        WebElement yearOfBirth= driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        yearOfBirth.sendKeys("1999");

//        Email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("priya12jodhani@gmail.com");

//      Enter password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("priya123");
//      Enter Confirm Password
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("priya123");

//     Click on REGISTER button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

//     Verify the text 'Your registration completed’
        String expectedMessage = "Your registration completed";
       WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
       String actualMessage = actualTextElement.getText();
       Assert.assertEquals("Message not displayed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
