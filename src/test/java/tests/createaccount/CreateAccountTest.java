package tests.createaccount;

import common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.AUTOMATIONPRACTICE_LOGIN_PAGE;

public class CreateAccountTest extends BaseTest {
    @Parameters("browser")
    @Test
    public void checkCreateAccount(String browser) {
        setDriver(browser);
        basePage.open(AUTOMATIONPRACTICE_LOGIN_PAGE);
        automationpracticeLoginPage
                .enterLoginNewAccount()
                .clickButtonCreateAnAccount()
                .findErrorMessage();
    }
    @Test
    public void checkFillOutFields(){
        automationpracticeRegistrationPage.clickGender();
    }
}
