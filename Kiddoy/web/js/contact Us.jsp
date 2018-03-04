<%-- 
    Document   : contact Us
    Created on : 3 Mar, 2018, 8:01:05 PM
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
        <form action="/do contact" method="post">
            	<div class="container">
			<div class="row">
				<div class="col-sm-12" style="text-align: center;">
					<h4><B>Contact Us</B></h4>
				</div>
			</div>
		</div>
		 <div class="row">
		    <form class="col s12 m6 offset-m3">
		     <div class="row">
		        <div class="input-field col s12">
		          <i class="material-icons prefix">account_circle</i>
		          <input id="icon_prefix" type="text" class="validate" name="email">
		          <label for="icon_prefix">Email Address</label>
		        </div>
		        <div class="input-field col s12">
		          <i class="material-icons prefix">phone</i>
		          <input id="icon_telephone" type="tel" class="validate"name="mobileno">
		          <label for="icon_telephone">Mobile No</label>
		        </div>
		        <div class="input-field col s12">
		          <i class="material-icons prefix">subject</i>
		          <input id="icon_telephone" type="tel" class="validate" name="sub">
		          <label for="icon_telephone">Subject</label>
		        </div>
		        <div class="input-field col s12">
		          <i class="material-icons prefix">message</i>
		          <textarea id="textarea1" class="materialize-textarea" name="msg"></textarea>
				  <label for="textarea1">Message</label>
				</div>
		          
		         <button class="btn waves-effect waves-light" type="submit" name="action">Submit
			   		 <i class="material-icons right">send</i>
				</button>
		     </div>
		 </div>
		    </form>
		  </div>
        </form>
    </body>
</html>
