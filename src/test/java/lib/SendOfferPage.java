package lib;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SendOfferPage extends MainPageObject {

    //Для рандомных имен и чисел
    String[] letter = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ъ", "ё"};
    int letter1 = (int) Math.floor(Math.random() * letter.length);
    int letter2 = (int) Math.floor(Math.random() * letter.length);
    int letter3 = (int) Math.floor(Math.random() * letter.length);
    int letter4 = (int) Math.floor(Math.random() * letter.length);
    int letter5 = (int) Math.floor(Math.random() * letter.length);
    int letter6 = (int) Math.floor(Math.random() * letter.length);
    int letter7 = (int) Math.floor(Math.random() * letter.length);

    String[] figure = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int figure1 = (int) Math.floor(Math.random() * figure.length);
    int figure2 = (int) Math.floor(Math.random() * figure.length);
    int figure3 = (int) Math.floor(Math.random() * figure.length);
    int figure4 = (int) Math.floor(Math.random() * figure.length);
    int figure5 = (int) Math.floor(Math.random() * figure.length);
    int figure6 = (int) Math.floor(Math.random() * figure.length);
    int figure7 = (int) Math.floor(Math.random() * figure.length);

    //Данны для формы заполнения

    private static final String
            CITY_ELEMENT = "(//a[@class='city-glossary__city-link city-glossary__city-link--priority'])[1]",//Санкт-Петербург
            ACCEPT_COOKI = "//button/div",//кнопка "Хорошо"
            SEND_OFFERBUTTON = "Оставить коммерческое предложение",//Кнопка "Оставить коммерческое предложение"
            CHEK_BOX_ACCEPT_CONDITION = "checkbox-field__label",//Я согласен с условиями
            CHEK_BOX_NO = "(//span[@class='radio-button__label'])[2]",//Напрявлялось ли вам ранее
            CHEK_BOX_YES_RESIDENT = "(//span[@class='radio-button__label'])[3]",//Ваша компания является резидентом РФ?
            CHEK_BOX_YES_THIS_OFFER = "(//span[@class='radio-button__label'])[5]",//Напрявлялось ли вам ранее
            BUTTON_NEXT_OFFER = "//button[contains(@class,'supplier-questionary__button button')]",
            COMPANY_NAME = "generalinfo_company",//Имя компании
            WHO_IS = "(//span[@class='radio-button__label'])[1]",//Вы являетесь ? Производитель или димтрибьютер
            INN = "generalinfo_inn",//ИНН
            UR_ADRESS = "generalinfo_legalAddress",//юр адре
            FACT_ADRESS = "generalinfo_physicalAddress",//фактический адрес
            COMPANY_LINK = "generalinfo_link",//сайт компании
            NALOG = "(//button[@class='dropdown__toggle'])[1]",//система налогообложения
            PRODUCTION_ADRESS = "//div[8]/textarea",//адрес производства
            QUALITY_LIST = "generalinfo_qualityList",//лист качества
            EXPIRIENS = "(//button[@class='dropdown__toggle'])[2]",//Опыт работы
            EXPIRIENS_YES = "(//a[@name='generalinfo_plExperience'])[1]",//Да
            IMPLIMINTETION = "(//button[@class='dropdown__toggle'])[3]",//Где реализуете
            IMPLEMINTANION_SZ = "(//a[@name='generalinfo_regions'])[2]",//Северо-Запад
            BUTTON_NEXT_1 = "(//button[contains(@class,'button button--small')])[1]",//Кнопка далее
            CONTACT_PERSON = "contactinfo_contact",//Контактное лицо
            POSITION = "contactinfo_position",//Должность
            EMAIL = "contactinfo_email",
            WORK_TEL = "contactinfo_workNumber",
            USER_TEL = "contactinfo_mobileNumber",
            BUTTON_NEXT_FORM2 = "(//span[@class='button__inner'])[1]",
            SELL_IN_YEAR = "companyinfo_turnover",
            YEAR_BIRTHDAY = "companyinfo_establishDate",
            WHEAR_SELL = "(//span[@class='checkbox-field__label'])[5]",
            ANOTHER = "companyinfo_representationOther",
            WHEAR_SELL_NOW = "//span[text()='Северо-Западный Ф.О.']",
            HOW_SELL = "(//span[@class='radio-button__label'])[1]",
            SELECT_NEW_PRODUCT = "table-field__button",
            PRODUCT_NAME = "commercialofferinfo_name",
            BREND = "commercialofferinfo_brand",
            OUT_NDS = "commercialofferinfo_price",
            METR = "(//button[@class='dropdown__toggle'])[1]",
            METR_KG = "(//a[@name='commercialofferinfo_unit'])[2]",
            DIRECTION = "(//button[@class='dropdown__toggle'])[2]",
            DIRECTION_BAKALEA_ = "(//a[@name='commercialofferinfo_direction'])[3]",
            DIRECTION_CATEGORY = "(//button[@class='dropdown__toggle'])[3]",
            DIRECTION_OIL = "(//a[@name='commercialofferinfo_category'])[3]",
            COUNTRI = "commercialofferinfo_prodCountry",
            WEIGHT = "commercialofferinfo_weight",
            TEMPERATURE = "commercialofferinfo_stocktemp",
            WARANTY = "commercialofferinfo_shelflife",
            NDS = "commercialofferinfo_vat",
            MIN_SELL = "commercialofferinfo_moq",
            POWER_IN_MONTH = "commercialofferinfo_prodCapacityU",
            POWER_METR = "(//button[@class='dropdown__toggle'])[4]",
            POWER_METR_HT = "(//a[@name='commercialofferinfo_prodCapacityUnit'])[2]",
            DONE = "(//button[@class='table-field__button'])[1]";

    public SendOfferPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectCity() {
        this.waitForElementAndCliсk(By.xpath(CITY_ELEMENT), "Не могу найти и нажать CITY_ELEMENT", 5);
    }

    public void acceptCooki() {
        this.waitForElementAndDubleCliсk(By.xpath(ACCEPT_COOKI), "Не могу найти и нажать кнопку 'Хорошо'", 10);
    }

    public void sendOffer() {
        this.waitForElementAndCliсk(By.linkText(SEND_OFFERBUTTON), "Не могу найти и нажать кнопку'Оставить коммерческое предложение'", 5);
        this.waitForElementPresent(By.className(CHEK_BOX_ACCEPT_CONDITION), "Немогу найти отметку 'Я согласен с условиями'", 5);
    }

    public void acceptServices() {
        this.waitForElementAndCliсk(By.className(CHEK_BOX_ACCEPT_CONDITION), "Не могу найти и нажать отметку 'Я согласен с условиями'", 5);
        this.waitForElementPresent(By.xpath(CHEK_BOX_NO), "Немогу найти отметку 'Нет'", 5);
    }

    public void questionsYesNo() {
        this.waitForElementAndCliсk(By.xpath(CHEK_BOX_NO), "Немогу нажать на кнопку 'Нет' Направлялось ли Вами ранее коммерческое предложение?", 5);
        this.waitForElementAndCliсk(By.xpath(CHEK_BOX_YES_RESIDENT), "Не могу нажать кнопку 'Да' Ваша компания является резидентом РФ?", 5);
        this.waitForElementAndCliсk(By.xpath(CHEK_BOX_YES_THIS_OFFER), "Не могу нажать кнопку 'Да' Ваше обращение содержит коммерческое предложение с сотрудничеством по производству собственной товарной марки?", 5);
        this.waitForElementPresent(By.xpath(BUTTON_NEXT_OFFER), "Немогу найти кнопку 'Далее'", 5);
        this.waitForElementAndCliсk(By.xpath(BUTTON_NEXT_OFFER), "Немогу найти кнопку 'Далее'", 5);
    }

    //Страница 1
    public void fillingFormSupplier() {
        this.waitForElementAndSendKeys(By.name(COMPANY_NAME), "TEST", "Немогу найти и отправить 'Имя компании'", 5);
        this.waitForElementAndCliсk(By.xpath(WHO_IS), "Немогу нажать на кнопку 'Производитель' ", 5);
        this.waitForElementAndSendKeys(By.name(INN), "1111111111", "Немогу найти и отправить'ИНН'", 5);
        this.waitForElementAndSendKeys(By.name(UR_ADRESS), "Тестовая улица 123", "Немогу найти и отправить текст 'Тестовая улица 123'", 5);
        this.waitForElementAndSendKeys(By.name(FACT_ADRESS), "Производственная улица", "Немогу найти и отправить текст 'Производственная улица'", 5);
        this.waitForElementAndSendKeys(By.name(COMPANY_LINK), "https://lenta.com/", "Немогу найти и отправить текст 'https://lenta.com/'", 5);
        this.waitForElementAndCliсk(By.xpath(NALOG), "", 5);
        this.waitForElementPresent(By.linkText("ПСН - Патентная система налогооблажения"), "", 5);
        this.waitForElementAndCliсk(By.linkText("ПСН - Патентная система налогооблажения"), "", 5);
        WebElement sendAdress = webDriver.findElement(By.xpath(PRODUCTION_ADRESS));
        sendAdress.sendKeys("Базовая улица 123");
        this.waitForElementAndSendKeys(By.name(QUALITY_LIST), "Тестовый опыт есть", "Немогу найти и отправить текст 'Тестовый опыт есть'", 5);
        this.waitForElementAndCliсk(By.xpath(EXPIRIENS), "Немогу найти и нажать'Опыт сотрудничества'", 5);
        this.waitForElementPresent(By.xpath(EXPIRIENS_YES), "Немогу найти 'Да'", 5);
        this.waitForElementAndCliсk(By.xpath(EXPIRIENS_YES), "Немогу найти и нажать 'Да'", 5);
        this.waitForElementAndCliсk(By.xpath(IMPLIMINTETION), "Немогу найти и нажать 'Регион использования'", 5);
        this.waitForElementPresent(By.xpath(IMPLEMINTANION_SZ), "Немогу найти'Северо-Запад'", 5);
        this.waitForElementAndCliсk(By.xpath(IMPLEMINTANION_SZ), "Немогу найти и нажать'Северо-Запад'", 5);
        this.waitForElementAndCliсk(By.xpath(BUTTON_NEXT_1), "Немогу нажать на кнопку 'Дальше' страница 1", 5);
    }

    //СТраница 2

    public void fillingFormUser() {
        this.waitForElementAndSendKeys(By.name(CONTACT_PERSON), "Тестер", "Немогу найти и отправить 'Имя'", 5);
        this.waitForElementAndSendKeys(By.name(POSITION), "Тестировщик", "Немогу найти и отправить 'Должность'", 5);
        this.waitForElementAndSendKeys(By.name(EMAIL), "romasmirnovmail@gmail.com", "Немогу найти и отправить 'EMAIL'", 5);
        this.waitForElementAndSendKeys(By.name(WORK_TEL), "+79818236205", "Немогу найти и отправить 'Рабочий телефон'", 5);
        this.waitForElementAndSendKeys(By.name(USER_TEL), "+79818236205", "Немогу найти и отправить 'Мобильный телефон'", 5);
        WebElement PERSON = waitForElementPresent(By.name("contactinfo_contact"), "Немогу найти заполненый элемент 'Имя пользователя'", 10);
        String article_person = PERSON.getAttribute("value");
        Assert.assertEquals(
                "Ошибка в веденном тесте",
                "Тестер",
                article_person
        );
        WebElement TEXT_NAME = waitForElementPresent(By.xpath("(//label[@class='form-constructor__label'])[1]"), "Немогу найти заполненый элемент 'Имя пользователя'", 10);
        String article_name_text = TEXT_NAME.getText();
        Assert.assertEquals(
                "Неправильный текст 'Контактное лицо'",
                "Контактное лицо: *",
                article_name_text
        );

        this.waitForElementAndCliсk(By.xpath(BUTTON_NEXT_FORM2), "Немогу найти и нажать кнопку 'Далее'", 6);

    }

    //Страница 3

    public void fillingCompanyInfo() {
        this.waitForElementAndSendKeys(By.name(SELL_IN_YEAR), "10000000000", "Немогу найти и отправить 'Оборот в год'", 5);//годовой оборот
        this.waitForElementAndSendKeys(By.name(YEAR_BIRTHDAY), "2000", "Немогу найти и отправить 'Год создания'", 5);//Год создания
        this.waitForElementAndCliсk(By.xpath(WHEAR_SELL), "Немогу найти и нажать кнопку 'Перекресток'", 6);//Где представлены
        this.waitForElementAndSendKeys(By.name(ANOTHER), "Магазин 24", "Немогу найти и отправить 'Имя'", 5);//Где ще представлены не из списка
        this.waitForElementAndCliсk(By.xpath(WHEAR_SELL_NOW), "Немогу найти и нажать кнопку 'Северо-Запад'", 6);//Северо-Запад
        this.waitForElementAndCliсk(By.xpath(HOW_SELL), "Немогу найти и нажать кнопку 'Распределительный комплекс'", 6);//Способ отправки
        this.waitForElementAndCliсk(By.xpath(BUTTON_NEXT_FORM2), "Немогу найти и нажать кнопку 'Распределительный комплекс'", 6);//Способ отправки
        this.waitForElementPresent(By.className(SELECT_NEW_PRODUCT), "", 5);
    }

    //Страница 4

    public void filingFormProductInfo() {
        this.waitForElementAndCliсk(By.className(SELECT_NEW_PRODUCT), "Немогу найти и нажать кнопку 'Добавить'", 6);//Добавить
        this.waitForElementAndSendKeys(By.name(PRODUCT_NAME), "Тестовый", "Немогу найти и отправить 'Имя продукта'", 5);//Имя продукта
        this.waitForElementAndSendKeys(By.name(BREND), "Тестовый", "Немогу найти и отправить 'Имя продукта'", 5);//Бренд
        this.waitForElementAndSendKeys(By.name(OUT_NDS), "222", "Немогу найти и отправить 'Цену без ндс'", 5);//Цена без ндс
        this.waitForElementAndCliсk(By.xpath(METR), "Немогу найти и нажать 'Ед измерения'", 5);//Ед измерения
        this.waitForElementAndCliсk(By.xpath(METR_KG), "Немогу найти и нажать 'Ед. измерения КГ.'", 5);//Еденица измирения минимального заказа
        this.waitForElementAndCliсk(By.xpath(DIRECTION), "Немогу найти и нажать 'Направление'", 5);//Направление
        this.waitForElementAndCliсk(By.xpath(DIRECTION_BAKALEA_), "Немогу найти и нажать 'Бакалея'", 5);//Направление
        this.waitForElementAndCliсk(By.xpath(DIRECTION_CATEGORY), "Немогу найти и нажать 'Категория'", 5);//Категория
        this.waitForElementAndCliсk(By.xpath(DIRECTION_OIL), "Немогу найти и нажать 'Категория'", 5);//Масло
        this.waitForElementAndSendKeys(By.name(COUNTRI), "Россия", "Немогу найти и отправить 'Имя продукта'", 5);//Страна
        this.waitForElementAndSendKeys(By.name(WEIGHT), "21", "Немогу найти и отправить 'Имя продукта'", 5);//Вес
        this.waitForElementAndSendKeys(By.name(TEMPERATURE), "-1", "Немогу найти и отправить 'Температурный режим'", 5);//Температурный режим
        this.waitForElementAndSendKeys(By.name(WARANTY), "1 год", "Немогу найти и отправить 'Гарантия'", 5);//Гарантия
        this.waitForElementAndSendKeys(By.name(NDS), "21%", "Немогу найти и отправить 'НДС'", 5);//НДС
        this.waitForElementAndSendKeys(By.name(MIN_SELL), "100 шт.", "Немогу найти и отправить 'Минимальная партия'", 5);//Минимальная партия
        this.waitForElementAndSendKeys(By.name(POWER_IN_MONTH), "222", "Немогу найти и отправить 'Ежемесячная мощьность'", 5);//Ежемесячная мощьность
        this.waitForElementAndCliсk(By.xpath(POWER_METR), "Немогу найти и нажать 'Еденица измерения'", 5);//Еденица измерения
        this.waitForElementAndCliсk(By.xpath(POWER_METR_HT), "Немогу найти и нажать 'ШТ'", 5);//ШТ.
        WebElement POWER_HT = waitForElementPresent(By.xpath(POWER_METR), "Немогу найти заполненый элемент 'Имя пользователя'", 10);
        String article_power_text = POWER_HT.getText();
        Assert.assertEquals(
                "Неправильный текст 'ШТ'",
                "Шт",
                article_power_text
        );
    }
}