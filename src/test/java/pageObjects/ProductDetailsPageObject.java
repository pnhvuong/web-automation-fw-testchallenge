package pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.ProductDetailsComponent;

public class ProductDetailsPageObject extends BasePage {
    private WebDriver driver;

    public ProductDetailsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductTitle() {
        waitForElementVisible(driver, ProductDetailsComponent.PRODUCT_TITLE);
        return getElementText(driver, ProductDetailsComponent.PRODUCT_TITLE);
    }

    public void selectColor(String value) {
        waitForElementClickable(driver, ProductDetailsComponent.COLOR_DROPDOWN);
        selectItemInCustomDropdownList(driver, ProductDetailsComponent.COLOR_DROPDOWN, ProductDetailsComponent.COLOR_DROPDOWN_VALUE, value);
    }

    public void selectSize(String value) {
        waitForElementClickable(driver, ProductDetailsComponent.SIZE_DROPDOWN);
        selectItemInCustomDropdownList(driver, ProductDetailsComponent.SIZE_DROPDOWN, ProductDetailsComponent.SIZE_DROPDOWN_VALUE, value);
    }

    public CheckoutPageObject clickToAddToCartBtn() {
        waitForElementClickable(driver, ProductDetailsComponent.ADD_TO_CARD_BUTTON);
        clickToElement(driver, ProductDetailsComponent.ADD_TO_CARD_BUTTON);
        return PageGeneratorManager.getCheckoutPage(driver);
    }

    public String getSuccessMessage() {
        waitForElementVisible(driver, ProductDetailsComponent.SUCCESS_MESSAGE);
        return getElementText(driver, ProductDetailsComponent.SUCCESS_MESSAGE);
    }

    public CartPageObject clickToViewCardButton() {
        waitForElementClickable(driver, ProductDetailsComponent.VIEW_CARD_LINK);
        clickToElement(driver, ProductDetailsComponent.VIEW_CARD_LINK);
        return PageGeneratorManager.getCartPage(driver);
    }
}
