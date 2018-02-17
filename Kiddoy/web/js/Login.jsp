<%-- 
    Document   : Login
    Created on : 16 Feb, 2018, 9:49:01 PM
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
        <form action="/dologin" method="POST"> <div class="container">
      <div class="row">
        <div class="col-sm-12">
          <h4>Login</h4>
        </div>
      </div>
            <div class="row container " style="margin-top: 10px;">
              <div class="col m6 offset-m3">
                <div class="input-field">
                  <i class="material-icons prefix">account_circle</i>
                  <input id="icon_prefix" type="text" class="validate">
                  <label for="icon_prefix">user name/email</label>
                </div>
              </div>
            </div>
            <div class="row container " style="margin-top: 10px;">
              <div class="input-field">
                <div class="col m6 offset-m3">
                  <div class="input-field">
                    <i class="material-icons prefix">lock</i>
                    <input id="icon_prefix" type="password" class="validate">
                    <label for="icon_prefix">password</label>
                  </div>
                  <button class="btn waves-effect waves-light" type="submit" name="action">login
                  <i class="material-icons right">send</i>
                  </button>
                  <a href="#" class="right">forgot password?</a>
                  
                </div></form>
    </body>
</html>
