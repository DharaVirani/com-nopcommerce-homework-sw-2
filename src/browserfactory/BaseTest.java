package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

public static WebDriver driver;

//Setting up browser by opening browser and doing necessary things to setup the browser
    public void openBrowser(String baseUrl){
//     Creating object for ChromeDriver() class
        driver = new ChromeDriver();
//    Launch the URL
        driver.get(baseUrl);
//    Maximising the window
        driver.manage().window().maximize();
//    Providing Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){
//   Closing all the browser instance opened by Selenium and sessions
    driver.quit();
    }
}
