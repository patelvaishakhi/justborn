<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<link rel="stylesheet" type="text/css" href="./css/materialize.css">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="./js/materialize.js"></script>
	</head>
	<body>
            <form> action="/do addProduct" method="POST"
		<nav id="navbar">
			<div class="nav-wrapper">
				<a href="#!" class="brand-logo">KiDoyy</a>
				<a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
				<ul class="right hide-on-med-and-down">
					<li><a href="#" id="search-button"><i class="material-icons">search</i></a></li>
					<li><a href="index.html">Home</a></li>
					<li><a href="category.html">Category</a></li>
					<li><a href="contact us.html">Contact Us</a></li>
					<li><a href="Feedback.html">Feedback</a></li>
					<li><a href="Login.html"><i class="material-icons">account_circle</i></a></li>
				</ul>
				<ul class="side-nav" id="mobile-demo">
					<li><a href="index.html">Home</a></li>
					<li><a href="Category.html">Category</a></li>
					<li><a href="Contact Us.html">Contact Us</a></li>
					<li><a href="Feedback.html">Feedback</a></li>
					<li><a href="Login.html"><i class="material-icons">account_circle</i>Sign In / Sign up</a></li>
				</ul>
			</div>
		</nav>
		<nav id="search-bar" style="display:none">
			<div class="nav-wrapper">
				<form>
					<div class="input-field">
						<input id="search" type="search" required>
						<label class="label-icon" for="search"><i class="material-icons">search</i></label>
						<i class="material-icons" id="search-close">close</i>
					</div>
				</form>
			</div>
		</nav>
		<div class="container">
			<div class="row">
				<h4>Add Product</h4>
			</div>
                    <form action="/toaddproduct" method="post">			<div class="row">
				<div class="input-field col s12">
					<input placeholder="Product Title" id="p_title" type="text" class="validate">
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
							<input class="file-path validate" type="text" >
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
					<input placeholder="category" id="p_category" type="text" class="validate" name="category">
					<label for="p_category">category</label>
				</div>
				<div class="input-field col s12 m6">
					<input placeholder="sub category" id="p_sub category" type="text" class="validate" name="sub category">
					<label for="p_sub category">sub category</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input placeholder="price" id="p_price" type="number" class="validate" name="price">
					<label for="p_price">price</label>
				</div>
			</div>
                    </form>
			<div class="row">
				<div class="input-field col s12">
          <textarea id="p_discription" class="materialize-textarea"></textarea>
          <label for="textarea1">discription</label>
        </div>
        <button class="btn waves-effect waves-light" type="submit" name="action">Submit
    <i class="material-icons right">send</i>
  </button>
        
			</div>
		</div>
        </form>
	</body>
</html>