<%-- 
    Document   : productdetails
    Created on : 3 Mar, 2018, 7:26:03 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/do productdetails" method="post">
            <div class="container">
			<div class="row">
				<div class="col-sm-12">
					<h4>Shoes</h4>
				</div>
			</div>
			<div class="row">
				<div class="carousel">
					<a class="carousel-item" href="#one!"><img src="./images/banner/s5.jpg"></a>
					<a class="carousel-item" href="#two!"><img src="./images/banner/s6.jpg"></a>
					<a class="carousel-item" href="#three!"><img src="./images/banner/s7.jpg"></a>
					<a class="carousel-item" href="#four!"><img src="./images/banner/s8.jpg"></a>
					<a class="carousel-item" href="#five!"><img src="./images/banner/s9.jpg"></a>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<a class="waves-effect waves-light btn"><i class="material-icons right">add_shopping_cart</i>Add To Cart</a>
				</div>
				<div class="col">
					<a class="waves-effect waves-light btn"><i class="material-icons right">chevron_right</i>Buy Now</a>
				</div>	
				<div class="col right">
					<h5><blockquote>1000 RS.</blockquote></h5>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<h5>Description</h5>
					<p class="flow-text" style="text-align: justify; font-size: 20px;">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam risus sapien, venenatis et posuere ut, pellentesque dignissim est. Donec faucibus nibh a justo vestibulum, id mattis ligula interdum. Aenean aliquam non elit et congue. Fusce non fermentum nisl. Fusce odio odio, dapibus id sodales sed, ultrices sed erat. Aliquam tempus mattis tincidunt. Sed tristique suscipit fermentum. Pellentesque neque dolor, dapibus eget ullamcorper non, pellentesque eget est. Maecenas ac nunc quam.</p>
				</div>
			</div>
        </form>
    </body>
</html>
