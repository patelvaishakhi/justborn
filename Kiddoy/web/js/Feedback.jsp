<%-- 
    Document   : feedback
    Created on : 16 Feb, 2018, 9:29:27 PM
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
        <forma action="/do Feedback" method="POST" >
        <div class="container">
							
							<div class="row">
								<div class="col-sm-12" style="text-align: center;">
									<h4><B>Feedback</B></h4>
								</div>
							</div>
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
							
							<div class="container" style="margin-top: 10px">
								<div class="row">
									<div class="col s10 offset-s1">
										<div class="row">
											<div class="input-field col s12">
												<input id="first_name" type="text" class="validate" name="F_name">
												<label for="first_name">Name</label>
											</div>
											
										</div>
										<div class="row">
											<div class="input-field col s12">
												<input id="email" type="email" class="validate" name="email">
												<label for="email">Email</label>
											</div>
										</div>
										<div class="row">
											<form class="col s12">
												<div class="row">
													<div class="input-field col s12">
                                                                                                            <textarea id="textarea1" class="materialize-textarea" name="message"></textarea>
														<label for="textarea1">Message</label>
													</div>
												</div>
											</form>
										</div>
										<div class="container" style="margin-top: 20px">
											`					<div class="row">
												<div class="col s10 offset-s3">
													<div style="margin-top: 10px">
														<button class="btn waves-effect waves-light" type="submit" name="action">Submit
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
    </form>
    </body>
</html>
