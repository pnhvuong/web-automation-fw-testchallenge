package pageObjects;

import actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.CheckoutComponent;


public class CheckoutPageObject extends BasePage {
    private WebDriver driver;

    public CheckoutPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToFirstNameTxt(String firstName) {
        waitForElementVisible(driver, CheckoutComponent.FIRSTNAME_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.FIRSTNAME_TEXTBOX, firstName);
    }

    public void inputToLastNameTxt(String lastName) {
        waitForElementVisible(driver, CheckoutComponent.LASTNAME_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.LASTNAME_TEXTBOX, lastName);
    }

    public void selectRegion(String regionvalue) {
        waitForElementClickable(driver, CheckoutComponent.REGION_DROPDOWN);
        selectItemInCustomDropdownList(driver, CheckoutComponent.REGION_DROPDOWN, CheckoutComponent.REGION_DROPDOWN_VALUE, regionvalue);
    }

    public void inputToAddressTxt(String address) {
        waitForElementVisible(driver, CheckoutComponent.ADDRESS_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.ADDRESS_TEXTBOX, address);
    }

    public void inputToCityTxt(String city) {
        waitForElementVisible(driver, CheckoutComponent.CITY_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.CITY_TEXTBOX, city);
    }

    public void selectState(String stateValue) {
        waitForElementClickable(driver, CheckoutComponent.STATE_DROPDOWN);
        selectItemInCustomDropdownList(driver, CheckoutComponent.STATE_DROPDOWN, CheckoutComponent.STATE_DROPDOWN_VALUE, stateValue);
    }

    public void inputToZipCodeTxt(String zipCode) {
        waitForElementVisible(driver, CheckoutComponent.ZIPCODE_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.ZIPCODE_TEXTBOX, zipCode);
    }

    public void inputToPhoneTxt(String phone) {
        waitForElementVisible(driver, CheckoutComponent.PHONE_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.PHONE_TEXTBOX, phone);
    }

    public void inputToEmailTxt(String emailAddress) {
        waitForElementVisible(driver, CheckoutComponent.EMAIL_TEXTBOX);
        sendKeysToElement(driver, CheckoutComponent.EMAIL_TEXTBOX, emailAddress);
    }

    public String getCartProductNameText() {
        waitForElementVisible(driver, CheckoutComponent.PRODUCT_NAME_TEXT);
        return getElementText(driver, CheckoutComponent.PRODUCT_NAME_TEXT);
    }

    public String getCartQuantityText() {
        waitForElementVisible(driver, CheckoutComponent.QUANTITY_TEXT);
        return getElementText(driver, CheckoutComponent.QUANTITY_TEXT);
    }

    public String getCartSizeText() {
        waitForElementVisible(driver, CheckoutComponent.SIZE_NAME_TEXT);
        return getElementText(driver, CheckoutComponent.SIZE_NAME_TEXT);
    }

    public String getSubTotalPrice() {
        waitForElementVisible(driver, CheckoutComponent.SUBTOTAL_TEXT);
        return getElementText(driver, CheckoutComponent.SUBTOTAL_TEXT);
    }

    public String getTotalPrice() {
        waitForElementVisible(driver, CheckoutComponent.TOTAL_TEXT);
        return getElementText(driver, CheckoutComponent.TOTAL_TEXT);
    }

    public void clickToTermConditionCheckbox() {
        waitForElementClickable(driver, CheckoutComponent.TERM_AND_CONDITION_CHECKBOX);
        clickToElement(driver, CheckoutComponent.TERM_AND_CONDITION_CHECKBOX);
    }

    public CheckoutCompletePageObject clickToPlaceOrderBtn() {
        waitForElementClickable(driver, CheckoutComponent.PALCE_ORDER_BUTTON);
        clickToElement(driver, CheckoutComponent.PALCE_ORDER_BUTTON);
        return PageGeneratorManager.getCheckoutCompletePage(driver);
    }
}
