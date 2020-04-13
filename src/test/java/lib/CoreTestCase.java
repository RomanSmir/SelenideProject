package lib;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CoreTestCase extends TestCase {
    protected WebDriver webDriver;
    private static String WEB_BASE_URL = "https://lenta.com/postavshchikam/";

    @Override

    protected void setUp() throws Exception {
        super.setUp();
        System.setProperty("webdriver.chrome.driver", "/Users/roma/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get(WEB_BASE_URL);
    }

    @Override
    protected void tearDown() throws Exception {
webDriver.quit();
        super.tearDown();
    }

}

