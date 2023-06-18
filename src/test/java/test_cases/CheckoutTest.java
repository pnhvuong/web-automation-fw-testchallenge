package test_cases;

import actions.commons.BaseTest;
import pageObjects.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.DataHelperFaker;

public class CheckoutTest extends BaseTest {
    WebDriver driver;

    ProductDetailsPageObject productDetailsPage;
    CartPageObject cartPage;
    CheckoutPageObject checkoutPage;
    CheckoutCompletePageObject checkoutCompletePage;
    DataHelperFaker dataFaker;

    HomePageObject homepage;
    SearchResultPageObject searchResultPage;

    String searchValue, product, color, size, firstName, lastName, region, address, city, state, zipCode, phone, email;

    @Parameters({"browser", "appUrl"})
    @BeforeClass
    public void openBrowser(String browserName, String appUrl) {
        driver = this.getBrowserDriver(browserName, appUrl);
        homepage = PageGeneratorManager.getHomePage(driver);

        searchValue = "Mini Dress";
        color = "White";
        size = "Large";
        dataFaker = DataHelperFaker.getData();
        firstName = dataFaker.getFirstName();
        lastName = dataFaker.getLastName();
        region = "India";
        address = dataFaker.getAddress();
        city = dataFaker.getCity();
        state = "Delhi";
        zipCode = dataFaker.getZipCode();
        phone = dataFaker.getPhone();
        email = dataFaker.getEmail();
        product = "white bandage cut out bodycon mini dress";
    }

    @Test
    public void Checkout_01_Search_And_Checkout() {
        homepage.clickToSearchTxt();
        homepage.inputTextInSearchTxt(searchValue);
        searchResultPage = homepage.pressEnterToSearch();

        Assert.assertTrue(searchResultPage.isContainsSearchedValue(searchValue.toUpperCase()));

        productDetailsPage = searchResultPage.clickToProductLinkByText(product);

        Assert.assertEquals(productDetailsPage.getProductTitle(), product.toUpperCase());

        productDetailsPage.selectColor(color);
        productDetailsPage.selectSize(size);

        productDetailsPage.clickToAddToCartBtn();

        Assert.assertTrue(productDetailsPage.getSuccessMessage().contains(product));


        cartPage = productDetailsPage.clickToViewCardButton();

       String nameAndColor = product + " - " + color;

        Assert.assertEquals(cartPage.getCartProductNameText(),nameAndColor.toUpperCase());
        Assert.assertEquals(cartPage.getCartSizeText(),size.toUpperCase());
        Assert.assertEquals(cartPage.GetProductQuantityText(),"1");
        Assert.assertEquals(cartPage.GetProductTotalPriceText(),"₹37.00");

        checkoutPage = cartPage.clickToCheckoutButton();

        checkoutPage.inputToFirstNameTxt(firstName);
        checkoutPage.inputToLastNameTxt(lastName);
        checkoutPage.selectRegion(region);
        checkoutPage.inputToAddressTxt(address);
        checkoutPage.inputToCityTxt(city);
        checkoutPage.inputToZipCodeTxt("110001");
        checkoutPage.inputToPhoneTxt(phone);
        checkoutPage.inputToEmailTxt(email);
        checkoutPage.clickToTermConditionCheckbox();

        checkoutCompletePage = checkoutPage.clickToPlaceOrderBtn();

        Assert.assertEquals(checkoutCompletePage.getOrderedProductName(), product + " - " + color);
        Assert.assertEquals(checkoutCompletePage.getOrderColor(), color);
        Assert.assertEquals(checkoutCompletePage.getOrderSize(), size);
        Assert.assertEquals(checkoutCompletePage.getOrderSubTotalPrice(), "₹37.00");
        Assert.assertEquals(checkoutCompletePage.getOrderTotalPrice(), "₹37.00");

    }

    @AfterClass(alwaysRun = true)
    public void quitBrowser() {
        driver.close();
        driver.quit();
    }
}
