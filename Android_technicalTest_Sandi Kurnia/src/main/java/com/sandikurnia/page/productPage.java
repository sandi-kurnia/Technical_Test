package com.sandikurnia.page;

import com.sandikurnia.base.testBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertEquals;

public class productPage extends testBase {

    String textLoginPage = "Select a username and password from the list below, or click on the username to automatically populate the username and password.";
    String fullname ="Full Name*";
    String address1 ="Address Line 1*";
    String city ="City*";
    String zipcode ="Zip Code*";
    String country ="Country*";
    String cardnumber ="Card Number*";
    String expirationdate ="Expiration Date*";
    String securitycode ="Security Code*";
    String items ="2 Items";
    String price ="$ 65.97";
    String completechekcout = "Checkout Complete";
    String thankyouforoder = "Thank you for your order";
    String yournewswag = "Your new swag is on its way";
    String yourOderHasbeendispatched ="Your order has been dispatched and will arrive as fast as the pony gallops!";
    String usernameIsRequired = "Username is required";

    String enterAPassword = "Enter Password";


    public void tapSauceLabBackPacksProduct(){
        MobileElement sauceLabBackPackButton = driver.findElementByXPath("(//*[@class = 'android.widget.ImageView'])[5]");
        sauceLabBackPackButton.click();
    }

    public void tapAColor() throws Exception{

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(115, 650)).waitAction(WaitOptions.waitOptions(ofSeconds(1)))
                .moveTo(PointOption.point(115, 350)).release().perform();

        Thread.sleep(3000);
        By colorButton = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
        for (int i = 0; i < 2; i++)
        {
            driver.findElements(colorButton).get(i).click();
        }

    }
    public void tapPlusButtonToAddItems(){
        By plusButton = By.xpath("//android.widget.ImageView[@content-desc=\"Increase item quantity\"]");
        for (int i = 0; i < 1; i++)
        {
            driver.findElement(plusButton).click();
        }
    }


    public void tapAddToCartButton(){
        MobileElement addToCartButton = driver.findElementByAccessibilityId("Tap to add product to cart");
        addToCartButton.click();
    }

    public void tapShoppingCartButton(){
        MobileElement shoppingCartButton = driver.findElementById("com.saucelabs.mydemoapp.android:id/cartIV");
        shoppingCartButton.click();
    }

    public void tapProceedToCheckoutButton(){
        MobileElement proceedToCheckoutButton = driver.findElementById("com.saucelabs.mydemoapp.android:id/cartBt");
        proceedToCheckoutButton.click();
    }

// LOGIN PAGE

    public void inputUsername(String username){
        MobileElement usernameField = driver.findElementById("com.saucelabs.mydemoapp.android:id/nameET");
        usernameField.sendKeys(""+username);
    }

    public void inputPassword(String password){
        MobileElement passwordField = driver.findElementById("com.saucelabs.mydemoapp.android:id/passwordET");
        passwordField.sendKeys(""+password);
    }

    public void tapLoginButton(){
        MobileElement loginButton = driver.findElementById("com.saucelabs.mydemoapp.android:id/loginBtn");
        loginButton.click();
    }

// SHIPPING ADDESS

    public void inputFullName(String fullname){
        MobileElement fullNameField = driver.findElementById("com.saucelabs.mydemoapp.android:id/fullNameET");
        fullNameField.sendKeys(""+fullname);
    }

    public void inputAddressLine1(String Address1){
        MobileElement address1Field = driver.findElementById("com.saucelabs.mydemoapp.android:id/address1ET");
        address1Field.sendKeys(""+Address1);
    }
    public void inputAddressLine2(String Address2){
        MobileElement address2Field = driver.findElementById("com.saucelabs.mydemoapp.android:id/address2ET");
        address2Field.sendKeys(""+Address2);
    }
    public void inputCity(String city){
        MobileElement cityField = driver.findElementById("com.saucelabs.mydemoapp.android:id/cityET");
        cityField.sendKeys(""+city);
    }
    public void inoutStateOrregion(String stateOrregion){
        MobileElement stateOrregionField = driver.findElementById("com.saucelabs.mydemoapp.android:id/stateET");
        stateOrregionField.sendKeys(""+stateOrregion);
    }

    public void inputZipCode(String zipcode){
        MobileElement zipcodeField = driver.findElementById("com.saucelabs.mydemoapp.android:id/zipET");
        zipcodeField.sendKeys(""+zipcode);
    }

    public void inputCountry(String country){
        MobileElement countryField = driver.findElementById("com.saucelabs.mydemoapp.android:id/countryET");
        countryField.sendKeys(""+country);
    }

    public void tapPaymentButton(){
        MobileElement paymentButton = driver.findElementById("com.saucelabs.mydemoapp.android:id/paymentBtn");
        paymentButton.click();
    }

//PAYMENT PAGE

    public void inputFullNameCC(String fullnameCC){
        MobileElement fullNameCCField = driver.findElementById("com.saucelabs.mydemoapp.android:id/nameET");
        fullNameCCField.sendKeys(""+fullnameCC);
    }

    public void inputCardNumber(String cardnumber){
        MobileElement cardnumberField = driver.findElementById("com.saucelabs.mydemoapp.android:id/cardNumberET");
        cardnumberField.click();
        cardnumberField.sendKeys(""+cardnumber);
    }

    public void inputExpirationDate(String expirationdate){
        MobileElement expirationDateField = driver.findElementById("com.saucelabs.mydemoapp.android:id/expirationDateET");
        expirationDateField.click();
        expirationDateField.sendKeys(""+expirationdate);
    }

    public void inputSecurityCode(String securitycode){
        MobileElement securityCodeField = driver.findElementById("com.saucelabs.mydemoapp.android:id/securityCodeET");
        securityCodeField.click();
        securityCodeField.sendKeys(""+securitycode);
    }

    public void tapReviewOrderButton(){
        MobileElement reviewOrderButton = driver.findElementById("com.saucelabs.mydemoapp.android:id/paymentBtn");
        reviewOrderButton.click();
    }

    public void tapPlaceOrderButton(){
        MobileElement orderPlaceButton = driver.findElementById("com.saucelabs.mydemoapp.android:id/paymentBtn");
        orderPlaceButton.click();
    }




                                        // -------------------- ASSERTION ---------------------- \\

//product page
    public void notifSuccessAddProductToShoppingCart(){
        MobileElement notifAddProductToShoppingCart = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]/android.widget.TextView");
        notifAddProductToShoppingCart.isDisplayed();
    }

//My cart detail page

    public void removeItemButton(){
        MobileElement totalAmountOfItems = driver.findElementById("com.saucelabs.mydemoapp.android:id/removeBt");
        totalAmountOfItems.isDisplayed();
    }
    public void socialMedia(){
        MobileElement socialMedia = driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.view.ViewGroup/android.widget.LinearLayout");
        socialMedia.isDisplayed();
    }
    public void totalPrice(){
        MobileElement totalPrice = driver.findElementById("com.saucelabs.mydemoapp.android:id/totalPriceTV");
        totalPrice.isDisplayed();
    }
    public void totalItems(){
        MobileElement totalItems = driver.findElementById("com.saucelabs.mydemoapp.android:id/itemsTV");
        totalItems.isDisplayed();
    }

// LOGIN

    public void loginPageView()throws Exception{
        Thread.sleep(3000);
        assertEquals("Select a username and password from the list below, or click on the username to automatically populate the username and password.", textLoginPage.substring(textLoginPage.length()-"Select a username and password from the list below, or click on the username to automatically populate the username and password.".length()));
    }

//SHIPPING ADDRESS

    public void shippingAddressView()throws Exception{
        Thread.sleep(3000);
        assertEquals("Full Name*", fullname.substring(fullname.length()-"Full Name*".length()));
        assertEquals("Address Line 1*", address1.substring(address1.length()-"Address Line 1*".length()));
        assertEquals("City*", city.substring(city.length()-"City*".length()));
        assertEquals("Zip Code*", zipcode.substring(zipcode.length()-"Zip Code*".length()));
        assertEquals("Country*", country.substring(country.length()-"Country*".length()));
    }
//PAYMENT METHOD
    public void paymentMethodPage() throws Exception{
        Thread.sleep(3000);
        assertEquals("Full Name*", fullname.substring(fullname.length()-"Full Name*".length()));
        assertEquals("Card Number*", cardnumber.substring(cardnumber.length()-"Card Number*".length()));
        assertEquals("Expiration Date*", expirationdate.substring(expirationdate.length()-"Expiration Date*".length()));
        assertEquals("Security Code*", securitycode.substring(securitycode.length()-"Security Code*".length()));
    }

//REVIEW YOUR ORDER
    public void reviewMyOrderPage()throws Exception{
        Thread.sleep(3000);
        assertEquals("2 Items", items.substring(items.length()-"2 Items".length()));
        assertEquals("$ 65.97", price.substring(price.length()-"$ 65.97".length()));
    }

    public void checkOutComplete() throws Exception{
        Thread.sleep(3000);
        assertEquals("Checkout Complete", completechekcout.substring(completechekcout.length()-"Checkout Complete".length()));
        assertEquals("Thank you for your order", thankyouforoder.substring(thankyouforoder.length()-"Thank you for your order".length()));
        assertEquals("Your new swag is on its way", yournewswag.substring(yournewswag.length()-"Your new swag is on its way".length()));
        assertEquals("Your order has been dispatched and will arrive as fast as the pony gallops!", yourOderHasbeendispatched.substring(yourOderHasbeendispatched.length()-"Your order has been dispatched and will arrive as fast as the pony gallops!".length()));
    }


    public void alertUsernameIsRequired(){
        assertEquals("Username is required", usernameIsRequired.substring(usernameIsRequired.length()-"Username is required".length()));
    }

    public void alertEnterAPassword(){
        assertEquals("Enter Password", enterAPassword.substring(enterAPassword.length()-"Enter Password".length()));
    }

}
