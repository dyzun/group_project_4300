BraintreeGateway gateway = new BraintreeGateway(useYourAccessToken);

TransactionRequest request = new TransactionRequest().
    amount(request.queryParams("amount")).
    merchantAccountId("USD").
    paymentMethodNonce(request.queryParams("paymentMethodNonce")).
    orderId("Mapped to PayPal Invoice Number").
    descriptor().
      name("Descriptor displayed in customer CC statements. 22 char max").
      done();
    shippingAddress().
        .firstName("Jen")//TODO CHANGE BASED ON USER
        .lastName("Smith")
        .company("Braintree")
        .streetAddress("1 E 1st St")
        .extendedAddress("Suite 403")
        .locality("Bartlett")
        .region("IL")
        .postalCode("60103")
        .countryCodeAlpha2("US")
        .done();
    options().
      paypal().
        customField("PayPal custom field").
        description("Description for PayPal email receipt").
        done();
      storeInVaultOnSuccess(true).
      done();

Result<Transaction> saleResult = gateway.transaction().sale(request);

if (result.isSuccess()) {
  Transaction transaction = result.getTarget();
  System.out.println("Success ID: " + transaction.getId());
} else {
  System.out.println("Message: " + result.getMessage());
}