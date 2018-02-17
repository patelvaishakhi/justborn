<%-- 
    Document   : Payment
    Created on : 16 Feb, 2018, 10:02:02 PM
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
        <form action="Topayment" method="post">
            <div class="row">
									<div class="col s12 m8">
										<div class="input-field ">
											<select>
												<option value="" disabled selected>Choose Card Type</option>
												<option value="1">Visa</option>
												<option value="2">Master</option>
												<option value="3">Maestro</option>
											</select>
											<label>Card Type</label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m8">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">Card number</label>
										</div>
									</div>
									<div class="col s12 m4">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">CSV number</label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m4">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">expiry date</label>											
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m4">
										<button class="btn waves-effect waves-light" type="submit" name="action">Submit
											<i class="material-icons right">send</i>
											</button>
									</div>
								</div>
							</div>
						</div>
						<div id="test2" class="col s12">
							<div class="container">
								<div class="row">
									<div class="col s12 m8">
										<div class="input-field ">
											<select>
												<option value="" disabled selected>Choose Card Type</option>
												<option value="1">Visa</option>
												<option value="2">Master</option>
												<option value="3">Maestro</option>
											</select>
											<label>Card Type</label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m8">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">Card number</label>
										</div>
									</div>
									<div class="col s12 m4">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">CSV number</label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m4">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">expiry date</label>											
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m4">
										<button class="btn waves-effect waves-light" type="submit" name="action">Submit
											<i class="material-icons right">send</i>
											</button>
									</div>
								</div>
							</div>
						</div>
						</div>
						<div id="test3" class="col s12">
							<div class="container">
								<div class="row">
									<div class="col s12 m8">
										<div class="input-field ">
											<select>
												<option value="" disabled selected>Choose Card Type</option>
												<option value="1">Visa</option>
												<option value="2">Master</option>
												<option value="3">Maestro</option>
											</select>
											<label>Card Type</label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m8">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">Card number</label>
										</div>
									</div>
									<div class="col s12 m4">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">CSV number</label>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m4">
										<div class="input-field">
											<input id="input_text" type="text" data-length="10">
											<label for="input_text">expiry date</label>											
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col s12 m4">
										<button class="btn waves-effect waves-light" type="submit" name="action">Submit
											<i class="material-icons right">send</i>
											</button>
									</div>
								</div>
							</div>
						</div>
						</div>
						<div id="test4" class="col s12">
							<h4>pay when you get your product</h4>
							<div class="row">
									<div class="col s12 m4">
										<button class="btn waves-effect waves-light" type="submit" name="action">confirm order
											<i class="material-icons right">send</i>
											</button>
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
