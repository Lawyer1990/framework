package pages.webpage_login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.List;

import static constans.Constant.AccountInformation.EMAIL;

public class AutomationpracticeLoginPage extends BasePage {
    private static int countOfEmail = 0;
    private final By inputEmailCreate = By.id("email_create");
    private final By buttonCreateAnAccount = By.id("SubmitCreate");
    private final By alertError = By.id("create_account_error");
    private final By elements = By.cssSelector("a[href]");

    public AutomationpracticeLoginPage(WebDriver driver) {
        super(driver);
    }

    public AutomationpracticeLoginPage changeColorJs() {
        List<WebElement> elements12 = driver.findElements(elements);
        for (int i = 0; i < elements12.size(); i++) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'", elements12.get(i));
        }
        return this;
    }

    public AutomationpracticeLoginPage enterLoginNewAccount() {
        driver.findElement(inputEmailCreate).sendKeys(countOfEmail + EMAIL);
        countOfEmail++;
        return this;
    }

    public AutomationpracticeLoginPage clickButtonCreateAnAccount() {
        driver.findElement(buttonCreateAnAccount).click();
        return this;
    }

    public AutomationpracticeLoginPage findErrorMessage() {
        try {
            WebElement element = driver.findElement(alertError);
            Assert.assertFalse(waitElementIsVisible(element).isDisplayed(), "Error message has appeared");
        } catch (Exception e) {
            logger.error("Error message didn't appear");
        }
        return this;
    }
}
