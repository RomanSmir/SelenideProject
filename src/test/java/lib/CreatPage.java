package lib;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CreatPage {

    private String NAME = "VasiaTesterhh";
    private String FAMILY = "testhh";

    public void creatCourier() {

        $(By.id("userMenuItem")).click();
        $(By.id("courierMenuChildItem")).click();
        $(By.id("createCourier")).click();
        $(By.id("UserRegistrationForm_firstname")).sendKeys(NAME);
        $(By.id("UserRegistrationForm_lastname")).sendKeys(FAMILY);
        $(By.id("UserRegistrationForm_email")).sendKeys("testw1@wwww.ru");
        $(By.id("UserRegistrationForm_phone")).sendKeys("3252342323");
        $(By.id("UserRegistrationForm_source_password")).clear();
        $(By.id("UserRegistrationForm_source_password")).sendKeys("3333");
        $(By.id("createCourier")).click();
        $(byText(NAME+" "+FAMILY)).equals(NAME+" "+FAMILY);
    }
}
