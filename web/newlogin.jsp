<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Elastic Login Form</title> 
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>

    <!--Google Font - Work Sans-->
<link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,700' rel='stylesheet' type='text/css'>

<div class="container">
  <div class="profile">
    <button id="toggleProfile">
        <img src="loginani.jpg">
    </button>
        
      <div class="profile__form" style="margin-bottom: -100px ; margin-top: 100px;">
          
      <div class="profile__fields">
      <form action="loginUser" method="post">
    
          <div class="field">
            
              <input  type="email" name="user_id" id="fieldUser" class="input" required pattern=.*\S.* />
          <label for="fieldUser" class="label">Username</label>
        </div>
        <div class="field">
            <input type="password"  name="password" id="fieldPassword" class="input" required pattern=.*\S.* />
          <label for="fieldPassword" class="label">Password</label>
        </div>
          <div class="field">
              <a href = "ForgotPassword.jsp" id = "forgotanchor" >Forgot Password</a>
          </div>
          
        <div class="profile__footer">
            <input type="submit" class="btn">
        </div>
          </form>
      </div>
     </div>
  </div>
    
</div>
    
        <script src="js/index.js"></script>

    
    
    
  </body>
</html>
