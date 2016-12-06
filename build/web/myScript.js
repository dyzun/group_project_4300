
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
        document.getElementById("button").style.visibility = "hidden";
    document.getElementById("button2").style.display = "none";
    document.getElementById("button3").style.display = "none";
    document.getElementById("button4").style.display = "none";
    document.getElementById("button5").style.display = "none";
    document.getElementById("button6").style.display = "none";
    document.getElementById("button7").style.display = "none";
    document.getElementById("button8").style.display = "none";
    document.getElementById("button9").style.display = "none";
    document.getElementById("button10").style.display = "none";
    document.getElementById("button11").style.display = "none";
    document.getElementById("button12").style.display = "none";
    document.getElementById("button13").style.display = "none";
    document.getElementById("button14").style.display = "none";
    document.getElementById("button15").style.display = "none";
    document.getElementById("button16").style.display = "none";
    document.getElementById("button17").style.display = "none";
    document.getElementById("button18").style.display = "none";
    document.getElementById("button19").style.display = "none";
    document.getElementById("button20").style.display = "none";
    document.getElementById("button21").style.display = "none";
    document.getElementById("button22").style.display = "none";
    document.getElementById("button23").style.display = "none";
    document.getElementById("button24").style.display = "none";
    document.getElementById("button25").style.display = "none";
    document.getElementById("button26").style.display = "none";
    document.getElementById("button27").style.display = "none";
    document.getElementById("button28").style.display = "none";
    document.getElementById("button29").style.display = "none";
    document.getElementById("button30").style.display = "none";
    
	function myFunction() {
        document.getElementById("button").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction2() {
        document.getElementById("button2").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction3() {
        document.getElementById("button3").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction4() {
        document.getElementById("button4").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction5() {
        document.getElementById("button5").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction6() {
        document.getElementById("button6").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction7() {
        document.getElementById("button7").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction8() {
        document.getElementById("button8").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction9() {
        document.getElementById("button9").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction10() {
        document.getElementById("button10").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction11() {
        document.getElementById("button11").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction12() {
        document.getElementById("button12").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction13() {
        document.getElementById("button13").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction14() {
        document.getElementById("button14").checked=true;
        document.getElementById("console").submit();
	}
    function myFunction15() {
        document.getElementById("button15").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction16() {
        document.getElementById("button16").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction17() {
        document.getElementById("button17").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction18() {
        document.getElementById("button18").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction19() {
        document.getElementById("button19").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction20() {
        document.getElementById("button20").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction21() {
        document.getElementById("button21").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction22() {
        document.getElementById("button22").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction23() {
        document.getElementById("butto23").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction24() {
        document.getElementById("button24").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction25() {
        document.getElementById("button25").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction26() {
        document.getElementById("button26").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction27() {
        document.getElementById("button27").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction28() {
        document.getElementById("button28").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction29() {
        document.getElementById("button29").checked=true;
        document.getElementById("genre").submit();
	}
    function myFunction30() {
        document.getElementById("button30").checked=true;
        document.getElementById("genre").submit();
	}
	
    var cart = document.getElementById("button32");
	cart.style.display = "none";
	document.getElementById("imgCart").onclick = function(){
		cart.checked=true;
		document.getElementById("cart").submit();
	}
	