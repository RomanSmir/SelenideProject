package lib;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.sun.tools.javac.util.Name;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPageObject {

    protected WebDriver webDriver;

    public MainPageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
    //new WebDriverWait(webDriver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//button/div")));
    //    webDriver.findElement(By.xpath("//button/div")).click();

    public WebElement waitExceptionForElementPresent(By by, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeoutInSeconds);
        new WebDriverWait(webDriver, timeoutInSeconds).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(by));
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }


    public WebElement waitForElementPresent(By by, String error_message) {
        return waitForElementPresent(by, error_message, 5);

    }

    public WebElement waitForElementAndCliсk(By by, String error_message, long timeoutInseconds) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInseconds);
        element.click();
        return element;
    }

    public WebElement Cliсk(By by, String error_message, long timeoutInseconds) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInseconds);
        element.click();
        return element;
    }

    public WebElement waitForElementAndDubleCliсk(By by, String error_message, long timeoutInseconds) {
        WebElement element = waitExceptionForElementPresent(by, error_message, timeoutInseconds);
        WebElement DubleElement = waitExceptionForElementPresent(by, error_message, timeoutInseconds);
        DubleElement.click();
        return element;
    }

    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInseconds) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInseconds);
        element.sendKeys(value);
        return element;
    }


    public boolean waitForElementNotPresent(By by, String error_message, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement waitForElementAndClear(By by, String error_message, long timeotInSeconds) {
        WebElement element = waitForElementPresent(by, error_message, timeotInSeconds);
        element.clear();
        return element;
    }

    public int getAmountOfElement(By by) {
        List elements = webDriver.findElements(by);
        return elements.size();
    }

    public void assertElementPresent(By by, String error_message) {
        int element_title = getAmountOfElement(by);
        if (element_title == 1) {
            String default_message = "'An element '" + by.toString() + "'suporrst not present";
            throw new AssertionError(default_message + " " + error_message);
        }
    }
}
