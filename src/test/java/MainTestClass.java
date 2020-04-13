import lib.CoreTestCase;
import lib.MainPageObject;
import lib.SendOfferPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainTestClass extends CoreTestCase {

    private MainPageObject MainPageObject;


    protected void setUp() throws Exception {
        super.setUp();

        MainPageObject = new MainPageObject(webDriver);

    }

    @Test
    public void testSendOffer() {
        SendOfferPage SendOfferPage = new SendOfferPage(webDriver);
        SendOfferPage.selectCity();
        SendOfferPage.acceptCooki();
        SendOfferPage.sendOffer();
        SendOfferPage.acceptServices();
        SendOfferPage.questionsYesNo();
        SendOfferPage.fillingFormSupplier();
        SendOfferPage.fillingFormUser();
        SendOfferPage.fillingCompanyInfo();
        SendOfferPage.filingFormProductInfo();
    }

}