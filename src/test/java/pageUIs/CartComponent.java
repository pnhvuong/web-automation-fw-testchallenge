package pageUIs;

public class CartComponent {
    public static final String PRODUCT_NAME_TEXT = "xpath=//td[@class='product-name']/a";
    public static final String SIZE_TEXT = "xpath=//dd[@class='variation-Size']/p";
    public static final String PRODUCT_PRICE_TEXT = "xpath=//td[@class='product-price']//span";
    public static final String PRODUCT_QUANTITY_TEXT = "xpath=//input[@title='Qty']";
    public static final String ITEM_TOTAL_PRICE_TEXT = "xpath=//td[@class='product-subtotal']//bdi";
    public static final String SUB_TOTAL_PRICE_TEXT = "xpath=//td[@data-title='Subtotal']//bdi";
    public static final String CART_TOTAL_PRICE_TEXT = "xpath=//td[@data-title='Total']//bdi";
    public static final String CHECKOUT_BUTTON = "xpath=//a[contains(text(),'Proceed to checkout')]";

}
