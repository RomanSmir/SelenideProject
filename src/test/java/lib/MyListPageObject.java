package lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyListPageObject extends MainPageObject {


        public static final String
                FOLDER_BY_NAME_TPL = "//*[@text='{FOLDER_NAME}']",
                ARTICLE_BY_TITLE_TPL = "//*[@text='{TITLE}']";

        private static String getFolderXpathByName(String name_of_folder) {
            return FOLDER_BY_NAME_TPL.replace("{FOLDER_NAME}", name_of_folder);
        }

        public MyListPageObject(WebDriver webDriver) {
            super(webDriver);
        }

        public void openFolderByName(String name_of_folder) {

            String folder_name_xpath = getFolderXpathByName(name_of_folder);
            this.waitForElementAndCliсk(
                    By.xpath(folder_name_xpath),
                    "Cannot find created folder" + name_of_folder,
                    5
            );
        }


    }

