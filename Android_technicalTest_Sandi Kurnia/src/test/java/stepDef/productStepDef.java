package stepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.page.productPage;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productStepDef extends testBase {

    productPage product;
    static String username, password, fullname, Address1, Address2, city, stateOrregion, zipcode, country, cardnumber, expirationdate, securitycode, fullnameCC;

    @Given("Navigate user to product page")
    public void navigateUserToProductPage() {
        setUp();
        product = new productPage();
    }

    @When("User tap sauce lab back packs product")
    public void userTapSauceLabBackPacksProduct() {
        product.tapSauceLabBackPacksProduct();
    }

    @And("User tap blue color button")
    public void userTapAColorButton() throws Exception {
        product.tapAColor();
    }

    @And("User tap plus button to input quantity of product")
    public void userTapPlusButtonToInputQuantityOfProduct() {
        product.tapPlusButtonToAddItems();
    }

    @And("User tap add to cart button")
    public void userTapAddToCartButton() {
        product.tapAddToCartButton();
    }

    @Then("Users can view that the shopping cart is filled according to the total products added")
    public void usersCanViewThatTheShoppingCartIsFilledAccordingToTheTotalProductsAdded() {
        product.notifSuccessAddProductToShoppingCart();
    }

    @And("User tap shopping cart button on the upper right side")
    public void userTapShoppingCartButtonOnTheUpperRightSide() {
        product.tapShoppingCartButton();
    }

    @Then("User can view total of items and price")
    public void userCanViewTotalOfItemsAndPrice() {
        product.removeItemButton();
        product.socialMedia();
        product.totalItems();
        product.totalPrice();

    }

    @When("User tap proceed to checkout button")
    public void userTapProceedToCheckoutButton() {
        product.tapProceedToCheckoutButton();
    }

    // LOGIN PAGE
    @Then("User can view that user should be login to checkout product")
    public void userCanViewThatUserShouldBeLoginToCheckoutProduct() throws Exception {
        product.loginPageView();
    }

    @When("User input username as {string}")
    public void userInput(String username) {
        this.username = username;
        product.inputUsername(username);
    }

    @And("User input password as {string}")
    public void userInputPassword(String password) {
        this.password = password;
        product.inputPassword(password);
    }

    @And("User tap login button")
    public void userTapLoginButton() {
        product.tapLoginButton();
    }

    //SHIPPING ADDRESS PAGE
    @Then("Users can view that an address with an * icon is a required field")
    public void usersCanViewThatAnAddressWithAnIconIsARequiredField() throws Exception {
        product.shippingAddressView();

    }

    @When("User input full name as {string}")
    public void userInputFullNameAs(String fullname) {
        this.fullname = fullname;
        product.inputFullName(fullname);

    }

    @And("User input first address line as {string}")
    public void userInputFirstAddressLineAs(String Address1) {
        this.Address1 = Address1;
        product.inputAddressLine1(Address1);
    }

    @And("User input second address line as {string}")
    public void userInputSecondAddressLineAs(String Address2) {
        this.Address2 = Address2;
        product.inputAddressLine2(Address2);
    }

    @And("User input city as {string}")
    public void userInputCityAs(String city) {
        this.city = city;
        product.inputCity(city);
    }

    @And("User input state or region as {string}")
    public void userInputStateOrRegionAs(String stateOrregion) {
        this.stateOrregion = stateOrregion;
        product.inoutStateOrregion(stateOrregion);
    }

    @And("User input zip code as {string}")
    public void userInputZipCodeAsZipCode(String zipcode)  {
        this.zipcode = zipcode;
        product.inputZipCode(zipcode);
    }

    @And("User input country as {string}")
    public void userInputCountryAs(String country) {
        this.country = country;
        product.inputCountry(country);
    }


    @And("User tap to payment button")
    public void userTapToPaymentButton() {
        product.tapPaymentButton();
    }
//
    @Then("User can view that an payment method with an * icon is a required field")
    public void userCanViewThatAnPaymentMethodWithAnIconIsARequiredField() throws Exception {
        product.paymentMethodPage();
    }

    @And("User input card number as {string}")
    public void userInputCardNumberAs(String cardnumber) {
        this.cardnumber = cardnumber;
        product.inputCardNumber(cardnumber);
        driver.hideKeyboard();
    }

    @And("User input expiration date as {string}")
    public void userInputExpirationDateAs(String expirationdate) {
        this.expirationdate = expirationdate;
        product.inputExpirationDate(expirationdate);
    }

    @And("User input security date as {string}")
    public void userInputSecurityDateAs(String securitycode) {
        this.securitycode = securitycode;
        product.inputSecurityCode(securitycode);
        driver.hideKeyboard();
    }

    @And("User tap review order button")
    public void userTapReviewOrderButton() {
        product.tapReviewOrderButton();
    }

    @Then("User can review the product ordered")
    public void userCanReviewTheProductOrdered() throws Exception{
        product.reviewMyOrderPage();

    }

    @When("User tap place order button")
    public void userTapPlaceOrderButton() {
        product.tapPlaceOrderButton();
    }

    @Then("User success to order product")
    public void userSuccessToOrderProduct() throws Exception{
        product.checkOutComplete();
    }

    @When("User input full name in payment method as {string}")
    public void userInputFullNameInPaymentMethodAs(String fullNameCC) {
        this.fullnameCC = fullNameCC;
        product.inputFullNameCC(fullNameCC);
    }

    @Then("User get alert username is required")
    public void userGetAlertUsernameIsRequired() {
        product.alertUsernameIsRequired();
    }

    @Then("User get alert enter a password")
    public void userGetAlertEnterAPassword() {
        product.alertEnterAPassword();
    }
}