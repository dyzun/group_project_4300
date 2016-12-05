<!DOCTYPE html>
<html>
<head>
      <meta charset="UTF-8">
      <title>Games</title>
		<style>
      		body{
      			padding:80px;
      			font-size:18px;
      		}
		</style>
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
					Username: <input type="text" name="username"> <br />
					Password: <input type="text" name="password"><br /> 
					<input type="submit" value="Login" />
				</div>
			</form>

		</header>

		<nav>
			<ul>
				<li><a href="#news">PS4</a></li>
				<li><a href="#news">XONE</a></li>
				<li><a href="#news">Xbox 360</a></li>
				<li><a href="#news">PC</a></li>
				<li><a href="#news">Wii U</a>
				<li>
			</ul>
		</nav>

		<aside>
			Select By Genre:
			<ul>
				<li><a href="#news">Action</a></li>
				<li><a href="#news">Adventure</a></li>
				<li><a href="#news">RPG</a></li>
				<li><a href="#news">Shooter</a></li>
				<li><a href="#news">Strategy</a></li>
			</ul>
		</aside>

		<article>
		<h1> Games on ${console}</h1>
		<#list games as game>
				<img src=${game.getImage()} alt=${game.getName()} height="400" width="300" /><br />
					${game.getName()} <br /> 
					Publisher: ${game.getPub()} <br /> 
					Developer: ${game.getDev()} <br /> 
					Release Date: ${game.getDate()} <br /> 
					Price: ${game.getPrice()} <br /> 
					Select console:<select>
						<option value="PS4">PS4</option>
						<option value="PS3">PS3</option>
						<option value="XBOXONE">XBOXONE</option>
						<option value="Xbox 360">Xbox 360</option>
						<option value="PC">PC</option>
					</select> <br />
					
					<#if game.getStock() < 6>
						<button type="button" class ="block">Out of Stock</button>
					<#else>
  						<button type="button" id="purchase">Add to Cart</button>
					</#if>
					
					<br />
					<script src="https://www.paypalobjects.com/api/button.js?"
						data-merchant="braintree" data-id="paypal-button"
						data-button="checkout" data-color="gold" data-size="medium"
						data-shape="pill" data-button_type="submit"
						data-button_disabled="false"></script>
					<br />
					<!-- Configuration options:
						data-color: "blue", "gold", "silver"
						data-size: "tiny", "small", "medium"
						data-shape: "pill", "rect"
						data-button_disabled: "false", "true"
						data-button_type: "submit", "button"
					--->
					<br />
				
		</#list>
		</article>
		<footer> 
		</footer>
	</div>
</body>
</html>