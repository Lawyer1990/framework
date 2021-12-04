package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.*;
import static constans.Constant.TimeoutVariable.*;

public class CommonActions {
    private static WebDriver driver;

    public static WebDriver createDriver(String browser) {
        switch (browser) {
            case WIN_CHROME:
                System.setProperty("webdriver.chrome.driver", "c:/WebDriver/chrome/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case WIN_OPERA:
                System.setProperty("webdriver.opera.driver", "c:/WebDriver/operadriver_win64/operadriver.exe");
                driver = new OperaDriver();
                break;
            case WIN_EDGE:
                System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case HEADLESS_CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(HEADLESS_ATTRIBUTE);
                System.setProperty("webdriver.chrome.driver", "c:/WebDriver/chrome/chromedriver.exe");
                driver = new ChromeDriver(chromeOptions);
                break;
            default:
                Assert.fail("Incorrect platform or browser name:" + browser);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(LOAD_PAGE_WAIT,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(LOAD_SCRIPT_WAIT,TimeUnit.SECONDS);
        return driver;

    }
}
