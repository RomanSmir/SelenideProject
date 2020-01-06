import lib.CreatPage;
import lib.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainTestClass {
    CreatPage CreatPage = new CreatPage();
    LoginPage LoginPage = new LoginPage();

    @Test
    public void testLogin(){
        LoginPage.userCanLoginByUsername();
    }


    @Test
    public void testCreatCourier(){
        LoginPage.userCanLoginByUsername();
        CreatPage.creatCourier();

    }

}
