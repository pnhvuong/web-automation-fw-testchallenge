package pageUIs;

public class CheckoutComponent {
    public static final String FIRSTNAME_TEXTBOX = "id=billing_first_name";
    public static final String LASTNAME_TEXTBOX = "id=billing_last_name";
    public static final String REGION_DROPDOWN = "xpath=//span[@aria-label='Country / Region']";
    public static final String REGION_DROPDOWN_VALUE = "xpath=//ul[@id='select2-billing_country-results']/li";
    public static final String ADDRESS_TEXTBOX = "id=billing_address_1";
    public static final String CITY_TEXTBOX = "id=billing_city";
    public static final String STATE_DROPDOWN = "xpath=//span[@aria-label='State']";
    public static final String STATE_DROPDOWN_VALUE = "xpath=//ul[@id='select2-billing_state-results']/li";
    public static final String ZIPCODE_TEXTBOX = "id=billing_postcode";
    public static final String PHONE_TEXTBOX = "id=billing_phone";
    public static final String EMAIL_TEXTBOX = "id=billing_email";
    public static final String PRODUCT_NAME_TEXT = "xpath=//tr[@class='cart_item']/td[@class='product-name']";
    public static final String QUANTITY_TEXT = "xpath=//tr[@class='cart_item']//strong[@class='product-quantity']";
    public static final String SIZE_NAME_TEXT = "xpath=//tr[@class='cart_item']//dd[@class='variation-Size']";
    public static final String SUBTOTAL_TEXT = "xpath=//tr[@class='cart-subtotal']//span";
    public static final String TOTAL_TEXT = "xpath=//tr[@class='order-total']//span";
    public static final String TERM_AND_CONDITION_CHECKBOX = "css=.woocommerce-terms-and-conditions-checkbox-text";
    public static final String PALCE_ORDER_BUTTON = "id=place_order";

}
