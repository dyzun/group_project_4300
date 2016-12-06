$(document).ready(function(){
    
        $("#paypal-button").click(function() {
            $.ajax({
                type: "POST",
                url: "Servlet",
                data: "purchase=true",
                success: function() {
                },
                error: function()
                {
                    alert("Error");
                }
            });
        });
         $("#allgames").load(function() {
            $.ajax({
                type: "POST",
                url: "Servlet",
                data: "console=all",
                success: function(output) {
                    $("#allgames").html(output);
                },
                error: function()
                {
                    alert("Error");
                }
            });
        });
    
   
    $("#button").style.display = "none";
    $("#button2").style.display = "none";
    $("#button3").style.display = "none";
    $("#button4").style.display = "none";
    $("#button5").style.display = "none";
    $("#button6").style.display = "none";
    $("#button7").style.display = "none";
    $("#button8").style.display = "none";
    $("#button9").style.display = "none";
    $("#button10").style.display = "none";
    $("#button11").style.display = "none";
    $("#button12").style.display = "none";
    $("#button13").style.display = "none";
    $("#button14").style.display = "none";
    $("#button15").style.display = "none";
    $("#button16").style.display = "none";
    $("#button17").style.display = "none";
    $("#button18").style.display = "none";
    $("#button19").style.display = "none";
    $("#button20").style.display = "none";
    $("#button21").style.display = "none";
    $("#button22").style.display = "none";
    $("#button23").style.display = "none";
    $("#button24").style.display = "none";
    $("#button25").style.display = "none";
    $("#button26").style.display = "none";
    $("#button27").style.display = "none";
    $("#button28").style.display = "none";
    $("#button29").style.display = "none";
    $("#button30").style.display = "none";
    
	function myFunction() {
        $("#button").checked=true;
        $("#console").submit();
	}
    function myFunction2() {
        $("#button2").checked=true;
        $("#console").submit();
	}
    function myFunction3() {
        $("#button3").checked=true;
        $("#console").submit();
	}
    function myFunction4() {
        $("#button4").checked=true;
        $("#console").submit();
	}
    function myFunction5() {
        $("#button5").checked=true;
        $("#console").submit();
	}
    function myFunction6() {
        $("#button6").checked=true;
        $("#console").submit();
	}
    function myFunction7() {
        $("#button7").checked=true;
        $("#console").submit();
	}
    function myFunction8() {
        $("#button8").checked=true;
        $("#console").submit();
	}
    function myFunction9() {
        $("#button9").checked=true;
        $("#console").submit();
	}
    function myFunction10() {
        $("#button10").checked=true;
        $("#console").submit();
	}
    function myFunction11() {
        $("#button11").checked=true;
        $("#console").submit();
	}
    function myFunction12() {
        $("#button12").checked=true;
        $("#console").submit();
	}
    function myFunction13() {
        $("#button13").checked=true;
        $("#console").submit();
	}
    function myFunction14() {
        $("#button14").checked=true;
        $("#console").submit();
	}
    function myFunction15() {
        $("#button15").checked=true;
        $("#genre").submit();
	}
    function myFunction16() {
        $("#button16").checked=true;
        $("#genre").submit();
	}
    function myFunction17() {
        $("#button17").checked=true;
        $("#genre").submit();
	}
    function myFunction18() {
        $("#button18").checked=true;
        $("#genre").submit();
	}
    function myFunction19() {
        $("#button19").checked=true;
        $("#genre").submit();
	}
    function myFunction20() {
        $("#button20").checked=true;
        $("#genre").submit();
	}
    function myFunction21() {
        $("#button21").checked=true;
        $("#genre").submit();
	}
    function myFunction22() {
        $("#button22").checked=true;
        $("#genre").submit();
	}
    function myFunction23() {
        $("#butto23").checked=true;
        $("#genre").submit();
	}
    function myFunction24() {
        $("#button24").checked=true;
        $("#genre").submit();
	}
    function myFunction25() {
        $("#button25").checked=true;
        $("#genre").submit();
	}
    function myFunction26() {
        $("#button26").checked=true;
        $("#genre").submit();
	}
    function myFunction27() {
        $("#button27").checked=true;
        $("#genre").submit();
	}
    function myFunction28() {
        $("#button28").checked=true;
        $("#genre").submit();
	}
    function myFunction29() {
        $("#button29").checked=true;
        $("#genre").submit();
	}
    function myFunction30() {
        $("#button30").checked=true;
        $("#genre").submit();
	}
	
    var cart = $("#button32");
	cart.style.display = "none";
	$("#imgCart").onclick = function(){
		cart.checked=true;
		$("#cart").submit();
	};
});
