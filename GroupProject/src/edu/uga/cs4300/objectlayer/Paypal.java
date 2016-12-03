package edu.uga.cs4300.objectlayer;

public class Paypal{
	
	BraintreeGateway gateway = new BraintreeGateway(access_token$sandbox$4j2hmffnr4z4pssv$4146d6a0d65879c42ad9a9979e3480ca);

	TransactionRequest request = new TransactionRequest().
			amount(request.queryParams("amount")).
			paymentMethodNonce(request.queryParams("paymentMethodNonce")).
			orderId("Mapped to PayPal Invoice Number").
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
}