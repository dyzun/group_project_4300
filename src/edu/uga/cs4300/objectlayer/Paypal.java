package edu.uga.cs4300.objectlayer;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Result;
import com.braintreegateway.Transaction;
import com.braintreegateway.TransactionRequest;

public class Paypal{

	BraintreeGateway gateway = new BraintreeGateway("access_token$sandbox$4j2hmffnr4z4pssv$4146d6a0d65879c42ad9a9979e3480ca");

	TransactionRequest request = new TransactionRequest().
			amount(request.queryParams("amount")).
			merchantAccountId("USD").
			paymentMethodNonce(request.queryParams("paymentMethodNonce")).
			orderId("Mapped to PayPal Invoice Number").
			descriptor().
			name("GamesFromHSARO").
			//done();
			/*shippingAddress().
        .firstName("Jen")//TODO CHANGE BASED ON USER
        .lastName("Smith")
        .company("Braintree")
        .streetAddress("1 E 1st St")
        .extendedAddress("Suite 403")
        .locality("Bartlett")
        .region("IL")
        .postalCode("60103")
        .countryCodeAlpha2("US")
        .done();*/
			options().
			paypal().
			customField("PayPal custom field").
			description("Description for PayPal email receipt").
			done();

	Result<Transaction> saleResult = gateway.transaction().sale(request);

	if (result.isSuccess()) {
		Transaction transaction = result.getTarget();
		System.out.println("Success ID: " + transaction.getId());
	} else {
		System.out.println("Message: " + result.getMessage());
	}
}
}