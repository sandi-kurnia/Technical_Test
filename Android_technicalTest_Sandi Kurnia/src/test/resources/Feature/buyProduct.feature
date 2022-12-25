@BuyProductFeature
Feature: Functional testing Buy Product

  Background:1. SauceLab demo app already installed on phone
             2. User should to open saucelab demo app

  @Positive-01
  Scenario Outline: User buy product sauce lab back packs with blue color and 2 items
    Given Navigate user to product page
      When User tap sauce lab back packs product
        And User tap blue color button
        And User tap plus button to input quantity of product
        And User tap add to cart button
          Then Users can view that the shopping cart is filled according to the total products added
      When User tap shopping cart button on the upper right side
          Then User can view total of items and price
      When User tap proceed to checkout button
          Then User can view that user should be login to checkout product
      When User input username as "<username>"
        And User input password as "<password>"
        And User tap login button
          Then Users can view that an address with an * icon is a required field
      When User input full name as "<fullname>"
        And User input first address line as "<Address1>"
        And User input second address line as "<Address2>"
        And User input city as "<city>"
        And User input state or region as "<stateOrregion>"
        And User input zip code as "<zipcode>"
        And User input country as "<country>"
        And User tap to payment button
          Then User can view that an payment method with an * icon is a required field
      When User input full name in payment method as "<fullnameCC>"
        And User input card number as "<cardnumber>"
        And User input expiration date as "<expirationdate>"
        And User input security date as "<securitycode>"
        And User tap review order button
          Then User can review the product ordered
      When User tap place order button
          Then User success to order product

      Examples:
        |username       |password| fullname  |Address1|Address2|city   |stateOrregion |zipcode|country   |fullnameCC|cardnumber|expirationdate|securitycode |
        |bod@example.com|10203040| Sandi Test|Jl. Dago|Jl. MCD |Bandung|Jawa Barat    |40134  |Indonesian|sandi CC  |23456789x |12/25         |121          |



#MyAdditionalTesting
  @Negative-02
  Scenario Outline: User buy product sauce lab back packs with blue color and 2 items without input username
    Given Navigate user to product page
      When User tap sauce lab back packs product
        And User tap blue color button
        And User tap plus button to input quantity of product
        And User tap add to cart button
          Then Users can view that the shopping cart is filled according to the total products added
      When User tap shopping cart button on the upper right side
          Then User can view total of items and price
      When User tap proceed to checkout button
          Then User can view that user should be login to checkout product
        And User input password as "<password>"
        And User tap login button
          Then User get alert username is required

      Examples:
       | password |
       | 10203040 |

  @Negative-03
  Scenario Outline: User buy product sauce lab back packs with blue color and 2 items without input password
    Given Navigate user to product page
      When User tap sauce lab back packs product
        And User tap blue color button
        And User tap plus button to input quantity of product
        And User tap add to cart button
          Then Users can view that the shopping cart is filled according to the total products added
      When User tap shopping cart button on the upper right side
          Then User can view total of items and price
      When User tap proceed to checkout button
          Then User can view that user should be login to checkout product
      When User input username as "<username>"
        And User tap login button
          Then User get alert enter a password

      Examples:
        | username        |
        | bod@example.com |






