<%-- 
    Document   : registration
    Created on : 3 Mar, 2018, 7:28:50 PM
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
        <form action="/do register" method="post">
          <div class="container" style="margin-top: 10px">
  	<div class="row">
  		<div class="col s10 offset-s1">
  			<div class="row">
  				<div class="input-field col s6">
                                    <input placeholder="Placeholder" id="first_name" type="text" class="validate" name="f_name">
		          <label for="first_name">First Name</label>
		        </div>
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate" name="l_name">
		          <label for="last_name">Last Name</label>
		        </div>
  			</div>
  			<div class="row">
  				<div class="input-field col s12">
                                    <input id="email" type="email" class="validate" name="email">
		          <label for="email">Email</label>
		        </div>
  			</div>
  			<div class="row">
		        <div class="input-field col s12">
                            <input id="password" type="password" class="validate" name="pwd">
			           <label for="password">Password</label>
			    </div>
			</div>
			<div class="row">
  				<div class="input-field col s12">
		          <input  id="Address" type="text" class="validate">
		          <label for="Address">Address</label>
		        </div>
		    </div>
		    	<div class="container" style="margin-top: 20px">
  	`					<div class="row">
  							<div class="col s10 offset-s3">
								<div style="margin-top: 10px">
							    	<button class="btn waves-effect waves-light" type="submit" name="action">Submit
				    				<i class="material-icons right">send</i>
				 					</button>
 				 					
				    				<button class="btn waves-effect waves-light" type="reset" name="action">Reset
	   								<i class="material-icons right">send</i>
	  								</button>
  								</div>
  							</div>
  						</div>
  					</div>
  			    </div>
		    </div>	
  		</div>
  	</div>
  </div> 
        </form>
    </body>
</html>
