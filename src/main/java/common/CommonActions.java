package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import static common.Config.*;
import static constans.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(String browser) {
        WebDriver driver = null;
        switch (browser) {
            case WIN_CHROME:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case WIN_OPERA:
                System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
                driver = new OperaDriver();
                break;
            case WIN_EDGE:
                System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name:" + browser);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
