<!DOCTYPE html>
<html>
<head>
      <meta charset="UTF-8">
      <title>Games</title>
		
		<script src="https://js.braintreegateway.com/web/3.6.0/js/client.min.js"></script>
		<script src="https://js.braintreegateway.com/web/3.6.0/js/paypal.min.js"></script>
		<script src="script.js"></script>
		<link rel="stylesheet" href="pageStyle.css">
</head>


<body>
	<div class="elements">

		<header>

			<img src="mainimg.png" id="main" />
			<form method="post" action="Servlet">
				<div id="login">
					                     Username: <input type="text" name="user" /> <br />
                      Password: <input type="password" name="passw" /> <br /> <br />
                      <button type="submit" value="logIn" name="logIn">Login</button>
                     <button type="submit" value="logOut" name="logOut">Logout</button><br><br>
                     <a href="Registration.html">Register</a>
                      </form>
 +                    <br>
 +                    ${input! "User: Guest"}
                      
				</div>
			</form>
			<br />
			<form id="cart" method="post" action="Servlet">
                    <a href="#" id="imgCart">
                    	<img  src="cart.png" height="100px" width="100px">
                    	<input type="radio" id="button32" value="goToCart" name="myCart" />
                    </a>
              </form>
		</header>

		<nav>
			<ul>
				<form id="console" method="post" action="Servlet">
					<li><a href="#ps4" onclick="myFunction()">PS4</a></li>
					<li><a href="#news" onclick="myFunction2()">PS3</a><li>
					<li><a href="#news" onclick="myFunction3()">PS2</a><li>
					<li><a href="#news" onclick="myFunction4()">XONE</a></li>
					<li><a href="#news" onclick="myFunction5()">Xbox 360</a></li>
					<li><a href="#news" onclick="myFunction6()">Xbox</a><li>
					<li><a href="#news" onclick="myFunction7()">PC</a></li>
					<li><a href="#news" onclick="myFunction8()">Wii</a><li>
					<li><a href="#news" onclick="myFunction9()">Nintendo DS</a><li>
					<li><a href="#news" onclick="myFunction10()">Nintendo 3DS</a><li>
					<li><a href="#news" onclick="myFunction11()">GameCube</a><li>
					<li><a href="#news" onclick="myFunction12()">GBA</a><li>
					<li><a href="#news" onclick="myFunction13()">GameBoy Color</a><li>
					<li><a href="#news" onclick="myFunction14()">N64</a><li>
                    <input type="radio" id="button" value="Playstation 4" name="myConsole" />
                    <input type="radio" id="button2" value="Playstation 3" name="myConsole" />
                    <input type="radio" id="button3" value="Playstation 2" name="myConsole" />
                    <input type="radio" id="button4" value="Xbox One" name="myConsole" />
                    <input type="radio" id="button5" value="Xbox 360" name="myConsole" />
                    <input type="radio" id="button6" value="Xbox" name="myConsole" />
                    <input type="radio" id="button7" value="PC" name="myConsole" />
                    <input type="radio" id="button8" value="Wii" name="myConsole" />
                    <input type="radio" id="button9" value="Nintendo DS" name="myConsole" />
                    <input type="radio" id="button10" value="Nintendo 3DS" name="myConsole" />
                    <input type="radio" id="button11" value="GameCube" name="myConsole" />
                    <input type="radio" id="button12" value="GBA" name="myConsole" />
                    <input type="radio" id="button13" value="GameBoy Color" name="myConsole" />
                    <input type="radio" id="button14" value="N64" name="myConsole" />
				</form>
			</ul>
		</nav>

		<aside>
			Select By Genre:
			<ul>
				<form id="genre" method="post" action="Servlet">
	                <li><a href="#news" onclick="myFunction15()">Action</a></li>
	                <li><a href="#news" onclick="myFunction16()">Action-Adventure</a></li>
	                <li><a href="#news" onclick="myFunction17()">Action Role Playing</a></li>
	                <li><a href="#news" onclick="myFunction18()">Adventure</a></li>
	                <li><a href="#news" onclick="myFunction19()">Episodic</a></li>
	                <li><a href="#news" onclick="myFunction20()">First-Person Shooter</a></li>
	                <li><a href="#news" onclick="myFunction21()">Horror</a></li>
	                <li><a href="#news" onclick="myFunction22()">Maze</a></li>
	                <li><a href="#news" onclick="myFunction23()">Online Multiplayer</a></li>
	                <li><a href="#news" onclick="myFunction24()">Platform</a></li>
	                <li><a href="#news" onclick="myFunction25()">Puzzle-platform</a></li>
	                <li><a href="#news" onclick="myFunction26()">Racing</a></li>
	                <li><a href="#news" onclick="myFunction27()">Role-Playing Game</a></li>
	                <li><a href="#news" onclick="myFunction28()">Sports</a></li>
	                <li><a href="#news" onclick="myFunction29()">Stealth</a></li>
	                <li><a href="#news" onclick="myFunction30()">Tactical role-playing</a></li>
	                <input type="radio" id="button15" value="Action" name="myGenre" />
	                <input type="radio" id="button16" value="Action-Adventure" name="myGenre" />
	                <input type="radio" id="button17" value="Action Role Playing" name="myGenre" />
	                <input type="radio" id="button18" value="Adventure" name="myGenre" />
	                <input type="radio" id="button19" value="Episodic" name="myGenre" />
	                <input type="radio" id="button20" value="First-Person Shooter" name="myGenre" />
	                <input type="radio" id="button21" value="Horror" name="myGenre" />
	                <input type="radio" id="button22" value="Maze" name="myGenre" />
	                <input type="radio" id="button23" value="Multiplayer Online Battle Arena" name="myGenre" />
	                <input type="radio" id="button24" value="Platform" name="myGenre" />
	                <input type="radio" id="button25" value="Puzzle-platform" name="myGenre" />
	                <input type="radio" id="button26" value="Racing" name="myGenre" />
	                <input type="radio" id="button27" value="Role-Playing Game" name="myGenre" />
	                <input type="radio" id="button28" value="Sports" name="myGenre" />
	                <input type="radio" id="button29" value="Stealth" name="myGenre" />
	                <input type="radio" id="button30" value="Tactical role-playing" name="myGenre" />
                </form>
			</ul>
		</aside>

		<article>
			<h1> All ${genre} games</h1>
	
		<form id="game" method="post" action="Servlet">
			<input type="radio" id="button31"" name="myGame" />
		</form>
		<#list games as game>
				<img src=${game.getImage()} alt=${game.getName()} height="400" width="300" /><br />
					<a href="#" id="gameFontSize" onclick="myFunction31(${game.getId()})"> ${game.getName()} </a> 
					<br /> 
					Publisher: ${game.getPub()} <br /> 
					Developer: ${game.getDev()} <br /> 
					Release Date: ${game.getDate()} <br /> 
					Price: $${game.getPrice()} <br /> 
					Select console:<select>
						<option value="PS4">PS4</option>
						<option value="PS3">PS3</option>
						<option value="XBOXONE">XBOXONE</option>
						<option value="Xbox 360">Xbox 360</option>
						<option value="PC">PC</option>
					</select><br />
					<br />
				
		</#list>
		</article>
		<footer> 
		</footer>
	</div>
	<script>
        document.getElementById("button").style.display = "none";
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
        document.getElementById("button31").style.display = "none";
        
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
		function myFunction31(id) {
            var button = document.getElementById("button31");
			button.checked=true;
			button.value = id;
            document.getElementById("game").submit();
		}
		var elements = document.getElementsByClassName("block");
		for(var i=0; i < elements.length; i++){
			elements[i].disabled=true;
		}
		var cart = document.getElementById("button32");
    	cart.style.display = "none";
    	document.getElementById("imgCart").onclick = function(){
    		cart.checked=true;
    		document.getElementById("cart").submit();
    	}
	</script>
</body>
</html>