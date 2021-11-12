package pages.registration_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class AutomationpracticeRegistrationPage extends BasePage {
    private final By genderButton = By.id("id_gender1");

    public AutomationpracticeRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickGender(){
        driver.findElement(genderButton).click();
    }
}
