package pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.CartComponent;

public class CartPageObject extends BasePage {
    private WebDriver driver;

    public CartPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutPageObject clickToCheckoutButton() {
        waitForElementClickable(driver, CartComponent.CHECKOUT_BUTTON);
        clickToElement(driver, CartComponent.CHECKOUT_BUTTON);
        return PageGeneratorManager.getCheckoutPage(driver);
    }

    public String getCartProductNameText() {
        waitForElementVisible(driver,CartComponent.PRODUCT_NAME_TEXT);
        return getElementText(driver,CartComponent.PRODUCT_NAME_TEXT);
    }

    public String getCartSizeText() {
        waitForElementVisible(driver,CartComponent.SIZE_TEXT);
        return getElementText(driver,CartComponent.SIZE_TEXT);
    }

    public String GetProductPriceText() {
        waitForElementVisible(driver,CartComponent.PRODUCT_PRICE_TEXT);
        return getElementText(driver,CartComponent.PRODUCT_PRICE_TEXT);
    }
    public String GetProductQuantityText() {
        waitForElementVisible(driver,CartComponent.PRODUCT_QUANTITY_TEXT);
        return getElementAttribute(driver,CartComponent.PRODUCT_QUANTITY_TEXT,"value");
    }

    public String GetProductTotalPriceText() {
        waitForElementVisible(driver,CartComponent.ITEM_TOTAL_PRICE_TEXT);
        return getElementText(driver,CartComponent.ITEM_TOTAL_PRICE_TEXT);
    }

    public String GetSubTotalPriceText() {
        waitForElementVisible(driver,CartComponent.SUB_TOTAL_PRICE_TEXT);
        return getElementText(driver,CartComponent.SUB_TOTAL_PRICE_TEXT);
    }
    public String GetCartTotalPriceTExt() {
        waitForElementVisible(driver,CartComponent.CART_TOTAL_PRICE_TEXT);
        return getElementText(driver,CartComponent.CART_TOTAL_PRICE_TEXT);
    }
}
