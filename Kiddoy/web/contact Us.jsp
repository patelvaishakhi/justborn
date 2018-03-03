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
            <form action="/docontect US" method="POST">
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
				<div class="col-sm-12" style="text-align: center;">
					<h4><B>Contact Us</B></h4>
				</div>
			</div>
		</div>
		 <div class="row">
                     <form class="col s12 m6 offset-m3" action="/submitMessage" method="POST ">
		     <div class="row">
		        <div class="input-field col s12">
		          <i class="material-icons prefix">account_circle</i>
		          <input id="icon_prefix" type="text" class="validate" name="emailaddress">
		          <label for="icon_prefix">Email Address</label>
		        </div>
		        <div class="input-field col s12">
		          <i class="material-icons prefix">phone</i>
		          <input id="icon_telephone" type="tel" class="validate" name="mobileno">
		          <label for="icon_telephone">Mobile No</label>
		        </div>
		        <div class="input-field col s12">
		          <i class="material-icons prefix">subject</i>
		          <input id="icon_telephone" type="tel" class="validate" name="subject">
		          <label for="icon_telephone">Subject</label>
		        </div>
		        <div class="input-field col s12">
		          <i class="material-icons prefix">message</i>
                          <textarea id="textarea1" class="materialize-textarea" name="message"></textarea>
				  <label for="textarea1">Message</label>
				</div>
		          
		         <button class="btn waves-effect waves-light" type="submit" name="action">Submit
			   		 <i class="material-icons right">send</i>
				</button>
		     </div>
                        		    </form>

		 </div>
		  </div>
        </form>
        
        

		</body>
	</html>