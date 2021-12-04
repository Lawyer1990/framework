package pages.webpage_home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
public class AutomationpracticeHomePage extends BasePage {
    By singInButton = By.cssSelector("a.login");

    public AutomationpracticeHomePage(WebDriver driver) {
        super(driver);

    }

    public AutomationpracticeHomePage enterSingIn() {
        driver.findElement(singInButton).click();
        return this;
    }
}
