package pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.CheckoutCompleteComponent;


public class CheckoutCompletePageObject extends BasePage {
    private WebDriver driver;

    public CheckoutCompletePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getCheckoutCompleteHeader() {
        waitForElementVisible(driver, CheckoutCompleteComponent.CHECKOUT_COMPLETE_HEADER);
        return getElementText(driver, CheckoutCompleteComponent.CHECKOUT_COMPLETE_HEADER);
    }

    public String getOrderedProductName() {
        waitForElementVisible(driver, CheckoutCompleteComponent.ORDERED_PRODUCT_NAME);
        return getElementText(driver, CheckoutCompleteComponent.ORDERED_PRODUCT_NAME);
    }

    public String getOrderedQuantity() {
        waitForElementVisible(driver, CheckoutCompleteComponent.ORDERED_QUANTITY);
        return getElementText(driver, CheckoutCompleteComponent.ORDERED_QUANTITY);
    }

    public String getOrderColor() {
        waitForElementVisible(driver, CheckoutCompleteComponent.ORDERED_COLOR);
        return getElementText(driver, CheckoutCompleteComponent.ORDERED_COLOR);
    }

    public String getOrderSize() {
        waitForElementVisible(driver, CheckoutCompleteComponent.ORDERED_SIZE);
        return getElementText(driver, CheckoutCompleteComponent.ORDERED_SIZE);
    }

    public String getOrderSubTotalPrice() {
        waitForElementVisible(driver, CheckoutCompleteComponent.SUBTOTAL_TEXT);
        return getElementText(driver, CheckoutCompleteComponent.SUBTOTAL_TEXT);
    }

    public String getOrderTotalPrice() {
        waitForElementVisible(driver, CheckoutCompleteComponent.TOTAL_TEXT);
        return getElementText(driver, CheckoutCompleteComponent.TOTAL_TEXT);
    }
}
