package pageUIs;

public class CheckoutCompleteComponent {
    public static final String CHECKOUT_COMPLETE_HEADER = "xpath=//p[text()='Thank you. Your order has been received.']";
    public static final String ORDERED_PRODUCT_NAME = "css=.product-name a";
    public static final String ORDERED_QUANTITY = "css=.product-name strong";
    public static final String ORDERED_COLOR = "xpath=//strong[text()='Color:']/following-sibling::p";
    public static final String ORDERED_SIZE = "xpath=//strong[text()='Size:']/following-sibling::p";
    public static final String SUBTOTAL_TEXT = "xpath=//th[text()='Subtotal:']/following-sibling::td/span";
    public static final String TOTAL_TEXT = "xpath=//th[text()='Total:']/following-sibling::td/span";
}
