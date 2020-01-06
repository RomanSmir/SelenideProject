package lib;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private String PWR = "180227";
    private String URL = "http://courier-test1.softbalance.ru/courier/";
    private String LOGIN = "rsmirnovv@yandex.ru";


    public void userCanLoginByUsername() {
        Configuration.browser = "chrome";
        Configuration.browserPosition = "1280x0";
        Configuration.browserSize = "1280x800";
        open(URL);
        $(By.id("UserLogin_username")).sendKeys(LOGIN);
        $(By.id("UserLogin_password")).sendKeys(PWR);
        $(byText("Войти")).click();
    }

}
