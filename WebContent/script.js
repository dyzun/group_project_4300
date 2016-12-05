window.onload = function() {
	var elements = document.getElementsByClassName("block");
	for(var i=0; i < elements.length; i++){
		elements[i].disabled=true;
	}
};