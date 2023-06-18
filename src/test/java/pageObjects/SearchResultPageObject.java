package pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageUIs.SearchResultComponent;

import java.util.List;

public class SearchResultPageObject extends BasePage {
    private WebDriver driver;

    public SearchResultPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isContainsSearchedValue(String searchText) {
        waitForAllElementVisible(driver, SearchResultComponent.PRODUCT_TITLE_LIST);
        List<WebElement> resultList = getListWebElement(driver, SearchResultComponent.PRODUCT_TITLE_LIST);
        if (resultList.isEmpty()) {
            throw new RuntimeException("No Result found!");
        }
        boolean status = false;
        for (WebElement title : resultList) {
            if (title.getText().contains(searchText)) {
                status = true;
            }
        }
        return status;
    }

    public ProductDetailsPageObject clickToProductLinkByText(String productText) {
        waitForElementClickable(driver, SearchResultComponent.DYNAMIC_PRODUCT_TITLE_BY_TEXT, productText);
        clickToElement(driver, SearchResultComponent.DYNAMIC_PRODUCT_TITLE_BY_TEXT, productText);
        return PageGeneratorManager.getProductDetailsPage(driver);
    }
}
