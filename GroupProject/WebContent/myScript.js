$('.form').find('input, textarea').on('keyup blur focus', function (e) {
  
  var $this = $(this),
      label = $this.prev('label');

	  if (e.type === 'keyup') {
			if ($this.val() === '') {
          label.removeClass('active highlight');
        } else {
          label.addClass('active highlight');
        }
    } else if (e.type === 'blur') {
    	if( $this.val() === '' ) {
    		label.removeClass('active highlight'); 
			} else {
		    label.removeClass('highlight');   
			}   
    } else if (e.type === 'focus') {
      
      if( $this.val() === '' ) {
    		label.removeClass('highlight'); 
			} 
      else if( $this.val() !== '' ) {
		    label.addClass('highlight');
			}
    }

});

$('.tab a').on('click', function (e) {
  
  e.preventDefault();
  
  $(this).parent().addClass('active');
  $(this).parent().siblings().removeClass('active');
  
  target = $(this).attr('href');

  $('.tab-content > div').not(target).hide();
  
  $(target).fadeIn(600);
  
});

$('#purchase').click(function() {
	// Create a Client component
	braintree.client.create({
	  authorization: 'TOKEN'
	}, function (clientErr, clientInstance) {
	  // Create PayPal component
	  braintree.paypal.create({
	    client: clientInstance
	  }, function (err, paypalInstance) {
	    //paypalButton.addEventListener('click', function () {
	      // Tokenize here!
	      paypalInstance.tokenize({
	        flow: 'checkout', // Required
	        amount: 10.00, // Required      TODO CHANGE BASED ON PRODUCT
	        currency: 'USD', // Required
	        locale: 'en_US',
	        enableShippingAddress: true,
	        shippingAddressEditable: false,
	        shippingAddressOverride: {
	          recipientName: 'Scruff McGruff',
	          line1: '1234 Main St.',
	          line2: 'Unit 1',
	          city: 'Chicago',
	          countryCode: 'US',
	          postalCode: '60652',
	          state: 'IL',
	          phone: '123.456.7890'
	        }
	      }, function (err, tokenizationPayload) {
	        // Tokenization complete
	        // Send tokenizationPayload.nonce to server
	      });
	    //});
	  });
	});//paypal button
});
