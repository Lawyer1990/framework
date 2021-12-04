package common;

public class Config {

    public static final String WIN_CHROME = "win_chrome";
    public static final String WIN_OPERA = "win_opera";
    public static final String WIN_EDGE = "win_edge";
    public static final String HEADLESS_CHROME = "headless";
    /**
     * Clear browser cookies after each iteration
     * if true = clear cookies
     */
    public static final boolean CLEAR_COOKIES_AND_STORAGE = true;

    /**
     * if true = driver.quit
     */
    public static final boolean HOLD_BROWSER_OPEN = true;

    public static final String HEADLESS_ATTRIBUTE = "--headless";
}
