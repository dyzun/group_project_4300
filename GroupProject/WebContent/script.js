window.onload = function() {
	window.document.body.onload = doThis;
};

function doThis(){
	document.getElementById("button").style.display = "none";
    document.getElementById("button2").style.display = "none";
    document.getElementById("button3").style.display = "none";
    document.getElementById("button4").style.display = "none";
    document.getElementById("button5").style.display = "none";
		
	var elements = document.getElementsByClassName("block");
	for(var i=0; i < elements.length; i++){
		elements[i].disabled=true;
	}
	
	
		document.getElementById("ps4").onclick = function() {
            document.getElementById("button").checked=true;
            document.getElementById("console").submit();
		};
        document.getElementById("xone").onclick = function() {
            document.getElementById("button2").checked=true;
            document.getElementById("console").submit();
		};
        document.getElementById("x360").onclick = function() {
            document.getElementById("button3").checked=true;
            document.getElementById("console").submit();
		};
        document.getElementById("pc").onclick = function() {
            document.getElementById("button4").checked=true;
            document.getElementById("console").submit();
		};
        document.getElementById("wii").onclick = function() {
            document.getElementById("button5").checked=true;
            document.getElementById("console").submit();
		};
}