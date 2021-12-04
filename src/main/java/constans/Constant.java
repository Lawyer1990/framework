package constans;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 10;
        public static final int LOAD_PAGE_WAIT = 5;
        public static final int LOAD_SCRIPT_WAIT = 5;
    }

    public static class Urls {
        public static final String AUTOMATIONPRACTICE_LOGIN_PAGE = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        public static final String AUTOMATIONPRACTICE_HOME_PAGE = "http://automationpractice.com/index.php";

    }

    public static class AccountInformation {
        public static final String EMAIL = "newtest123123@mail.ru";
    }


}
