package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static SearchResultPageObject getSearchResultPage(WebDriver driver) {
        return new SearchResultPageObject(driver);
    }

    public static ProductDetailsPageObject getProductDetailsPage(WebDriver driver) {
        return new ProductDetailsPageObject(driver);
    }
    public static CartPageObject getCartPage(WebDriver driver) {
        return new CartPageObject(driver);
    }
    public static CheckoutPageObject getCheckoutPage(WebDriver driver) {
        return new CheckoutPageObject(driver);
    }
    public static CheckoutCompletePageObject getCheckoutCompletePage(WebDriver driver) {
        return new CheckoutCompletePageObject(driver);
    }

}
