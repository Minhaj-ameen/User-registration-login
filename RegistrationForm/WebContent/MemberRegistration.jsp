<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>


    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
</head>

<body>

<div class="container">
  <div class="row" >
    <form class="col s12" action="s1" method="post">
      <div class="row">
        <div class="input-field col s6">
          <input placeholder="Enter first name" id="first_name" type="text" class="validate" name="fName">
          <label for="first_name">First Name</label>
        </div>
        <div class="input-field col s6">
          <input id="last_name" type="text" class="validate" placeholder="Enter last name" name="lName">
          <label for="last_name">Last Name</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="disabled" type="text" placeholder="Enter username" class="validate" name="username">
          <label for="user_name">User Name</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="password" placeholder="Enter password" type="password" class="validate" name="password">
          <label for="password">Password</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="address" type="text" name="address" placeholder="Enter City" class="validate">
          <label for="city">City</label>
        </div>
      </div>
      
      <div class="row">
        <div class="input-field col s12">
          <input id="contact" type="text" placeholder="Enter Mobile number" name="contact" class="validate">
          <label for="contact">Mobile No</label>
        </div>
      </div>
   		
	  <button class="btn waves-effect waves-light" type="submit" >Register
	    <i class="material-icons right"></i>
	  </button>
	        
    </form>
  </div>
 </div>
        

</body>
</html>