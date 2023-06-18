package pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.global.HeaderComponent;

public class HomePageObject extends BasePage {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToSearchTxt() {
        waitForElementClickable(driver, HeaderComponent.SEARCH_SECTION);
        clickToElement(driver, HeaderComponent.SEARCH_SECTION);
    }

    public void inputTextInSearchTxt(String searchText) {
        waitForElementClickable(driver, HeaderComponent.SEARCH_TEXTBOX);
        sendKeysToElement(driver, HeaderComponent.SEARCH_TEXTBOX, searchText);
    }

    public SearchResultPageObject pressEnterToSearch() {
        pressEnterKey(driver, HeaderComponent.SEARCH_TEXTBOX);
        return PageGeneratorManager.getSearchResultPage(driver);
    }
}
