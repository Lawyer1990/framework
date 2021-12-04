package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.registration_page.AutomationpracticeRegistrationPage;
import pages.webpage_home.AutomationpracticeHomePage;
import pages.webpage_login.AutomationpracticeLoginPage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected AutomationpracticeHomePage automationpracticeHomePage;
    protected AutomationpracticeLoginPage automationpracticeLoginPage;
    protected AutomationpracticeRegistrationPage automationpracticeRegistrationPage;

    public void setDriver(String browser) {
        driver = CommonActions.createDriver(browser);
        basePage = new BasePage(driver);
        automationpracticeHomePage = new AutomationpracticeHomePage(driver);
        automationpracticeLoginPage = new AutomationpracticeLoginPage(driver);
        automationpracticeRegistrationPage = new AutomationpracticeRegistrationPage(driver);
    }

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }

    }

    @AfterTest(dependsOnMethods = "clearCookiesAndLocalStorage", alwaysRun = true)
    public void tearDown() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
