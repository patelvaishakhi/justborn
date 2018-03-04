<%-- 
    Document   : addproduct
    Created on : 3 Mar, 2018, 7:50:29 PM
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
        <form action="/do addproduct" method="post">
            		<div class="container">
			<div class="row">
				<h4>Add Product</h4>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<input placeholder="Product Title" id="p_title" type="text" class="validate" name="producttitle">
					<label for="p_title">Product Title</label>
				</div>
			</div>
			<div class="row">
				<div class="col s12 m3">
					<div class="file-field input-field">
						<div class="btn">
							<span>Product Image 1</span>
							<input type="file">
						</div>
						<div class="file-path-wrapper">
							<input class="file-path validate" type="text">
						</div>
					</div>
				</div>
				<div class="col s12 m3">
					<div class="file-field input-field">
						<div class="btn">
							<span>Product Image 2</span>
							<input type="file">
						</div>
						<div class="file-path-wrapper">
							<input class="file-path validate" type="text">
						</div>
					</div>
				</div>
				<div class="col s12 m3">
					<div class="file-field input-field">
						<div class="btn">
							<span>Product Image 3</span>
							<input type="file">
						</div>
						<div class="file-path-wrapper">
							<input class="file-path validate" type="text">
						</div>
					</div>
				</div>
				<div class="col s12 m3">
					<div class="file-field input-field">
						<div class="btn">
							<span>Product Image 4</span>
							<input type="file">
						</div>
						<div class="file-path-wrapper">
							<input class="file-path validate" type="text">
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input placeholder="category" id="p_category" type="text" class="validate" name="cat">
					<label for="p_category">category</label>
				</div>
				<div class="input-field col s12 m6">
					<input placeholder="sub category" id="p_sub category" type="text" class="validate" name="subcat">
					<label for="p_sub category">sub category</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input placeholder="price" id="p_price" type="number" class="validate" name="price">
					<label for="p_price">price</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
          <textarea id="p_discription" class="materialize-textarea" name="dis"></textarea>
          <label for="textarea1">discription</label>
        </div>
            
        </form>
    </body>
</html>
