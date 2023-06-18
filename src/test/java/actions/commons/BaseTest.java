package actions.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Random;

public class BaseTest {

    protected WebDriver driver;

    protected WebDriver getBrowserDriver(String browserName, String appUrl) {
        if (browserName == null) {
            throw new IllegalArgumentException("[ERR] Browser name can not be null!");
        }
        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException(browserName + " is not supported so far!");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.get(appUrl);
        return driver;
    }

    protected int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(999);
    }

    protected void sleepInSecond(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
